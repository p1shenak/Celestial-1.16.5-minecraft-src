package offline.launcher;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.SubVersionRange;

public final class ViaProtocolCompat {
   private ViaProtocolCompat() {
   }

   public static SubVersionRange subVersionRange(int protocolId) {
      String canonicalName = ProtocolVersion.getProtocol(protocolId).getName();
      if (canonicalName.endsWith(".x")) {
         String base = canonicalName.substring(0, canonicalName.length() - 2);
         int highest = ProtocolVersion.getProtocol(protocolId)
            .getIncludedVersions()
            .stream()
            .mapToInt(version -> subVersion(base, version))
            .max()
            .orElseThrow();
         return new SubVersionRange(base, 0, highest);
      } else {
         int separator = canonicalName.indexOf(45);
         if (separator < 0) {
            return null;
         } else {
            String first = canonicalName.substring(0, separator);
            String last = canonicalName.substring(separator + 1);
            if (last.startsWith(first + ".")) {
               return new SubVersionRange(first, 0, Integer.parseInt(last.substring(first.length() + 1)));
            } else {
               int patchSeparator = first.lastIndexOf(46);
               if (patchSeparator < 0) {
                  throw new IllegalArgumentException("Unsupported Via protocol range: " + canonicalName);
               } else {
                  String base = first.substring(0, patchSeparator);
                  if (!last.startsWith(base + ".")) {
                     throw new IllegalArgumentException("Mismatched Via protocol range: " + canonicalName);
                  } else {
                     return new SubVersionRange(
                        base, Integer.parseInt(first.substring(patchSeparator + 1)), Integer.parseInt(last.substring(base.length() + 1))
                     );
                  }
               }
            }
         }
      }
   }

   public static ProtocolVersion logHandshakeTarget(ProtocolVersion version) {
      System.out.println("via_handshake_target=" + version.getName() + " protocol_id=" + version.getVersion());
      return version;
   }

   private static int subVersion(String base, String version) {
      if (version.equals(base)) {
         return 0;
      } else {
         String prefix = base + ".";
         if (!version.startsWith(prefix)) {
            throw new IllegalArgumentException("Version " + version + " is outside Via range " + base);
         } else {
            return Integer.parseInt(version.substring(prefix.length()));
         }
      }
   }
}
