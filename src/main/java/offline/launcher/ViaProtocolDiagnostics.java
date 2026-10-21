package offline.launcher;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public final class ViaProtocolDiagnostics {
   private static final Map<Integer, UserConnection> OUTGOING = new ConcurrentHashMap<>();
   private static final Set<Long> RECIPE_SKIP_LOGGED = ConcurrentHashMap.newKeySet();

   private ViaProtocolDiagnostics() {
   }

   static void start() {
      Thread monitor = new Thread(ViaProtocolDiagnostics::monitor, "Via protocol diagnostics");
      monitor.setDaemon(true);
      monitor.start();
   }

   public static UserConnection traceOutgoingBefore(UserConnection connection, ByteBuf buffer) {
      OUTGOING.put(System.identityHashCode(buffer), connection);
      traceOutgoing("before", connection, buffer);
      return connection;
   }

   public static void traceOutgoingAfter(ByteBuf buffer) {
      UserConnection connection = OUTGOING.remove(System.identityHashCode(buffer));
      if (connection != null) {
         traceOutgoing("after", connection, buffer);
      }
   }

   public static void recipeSynthesisSkipped(UserConnection connection) {
      if (RECIPE_SKIP_LOGGED.add(connection.getId())) {
         System.out.println("via_recipe_synthesis_skipped connection=" + connection.getId() + " gameplay_crafting=server-authoritative");
      }
   }

   private static void traceOutgoing(String stage, UserConnection connection, ByteBuf buffer) {
      try {
         ProtocolInfo info = connection.getProtocolInfo();
         if (info == null || info.getClientState().name().equals("PLAY") && info.getServerState().name().equals("PLAY")) {
            return;
         }

         ByteBuf duplicate = buffer.duplicate();
         int packetId = readVarInt(duplicate);
         int payloadLength = duplicate.readableBytes();
         int shown = Math.min(payloadLength, 32);
         StringBuilder hex = new StringBuilder(shown * 2);

         for (int i = 0; i < shown; i++) {
            hex.append(String.format("%02x", duplicate.getUnsignedByte(duplicate.readerIndex() + i)));
         }

         System.out
            .println(
               "via_out stage="
                  + stage
                  + " connection="
                  + connection.getId()
                  + " client_state="
                  + info.getClientState()
                  + " server_state="
                  + info.getServerState()
                  + " packet_id="
                  + packetId
                  + " payload_bytes="
                  + payloadLength
                  + " payload_hex="
                  + hex
            );
      } catch (Throwable error) {
         System.out.println("via_out_trace_error=" + error.getClass().getName() + ":" + error.getMessage());
      }
   }

   private static int readVarInt(ByteBuf buffer) {
      int value = 0;
      int position = 0;

      byte current;
      do {
         current = buffer.readByte();
         value |= (current & 127) << position;
         position += 7;
         if (position >= 35) {
            throw new IllegalArgumentException("VarInt too large");
         }
      } while ((current & 128) != 0);

      return value;
   }

   private static void monitor() {
      Set<String> emitted = ConcurrentHashMap.newKeySet();

      while (!Thread.currentThread().isInterrupted()) {
         try {
            if (Via.getManager() != null && Via.getManager().isInitialized()) {
               for (UserConnection connection : Via.getManager().getConnectionManager().getConnections()) {
                  ProtocolInfo info = connection.getProtocolInfo();
                  if (info != null) {
                     ProtocolVersion client = info.protocolVersion();
                     ProtocolVersion server = info.serverProtocolVersion();
                     List<Protocol> pipes = info.getPipeline() == null ? List.of() : info.getPipeline().pipes();
                     String line = "via_connection_protocol side="
                        + (connection.isClientSide() ? "client" : "server")
                        + " active="
                        + connection.isActive()
                        + " client="
                        + describe(client)
                        + " server="
                        + describe(server)
                        + " pipes="
                        + pipes.stream().map(pipe -> pipe.getClass().getSimpleName()).collect(Collectors.joining(","));
                     if (emitted.add(line)) {
                        System.out.println(line);
                     }
                  }
               }
            }

            Thread.sleep(250L);
         } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
         } catch (Throwable ignoredUntilViaIsReady) {
            try {
               Thread.sleep(250L);
            } catch (InterruptedException interrupted) {
               Thread.currentThread().interrupt();
            }
         }
      }
   }

   private static String describe(ProtocolVersion version) {
      return version == null ? "null" : version.getName() + "(" + version.getVersion() + ")";
   }
}
