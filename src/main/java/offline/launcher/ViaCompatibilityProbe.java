package offline.launcher;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.stream.Stream;

public final class ViaCompatibilityProbe {
   private ViaCompatibilityProbe() {
   }

   public static void main(String[] arguments) throws Exception {
      if (arguments.length != 1) {
         throw new IllegalArgumentException("Expected offline-overrides.jar path");
      }

      Path expectedOverride = Path.of(arguments[0]).toRealPath();
      ClassLoader loader = ViaCompatibilityProbe.class.getClassLoader();
      String[] patchedClasses = new String[]{
         "celestial.Aq_1",
         "celestial.rrQV",
         "celestial.rrjg_3",
         "celestial.rrjY_2",
         "celestial.rrjf_3",
         "celestial.rrjR_2",
         "celestial.rrjy_3",
         "celestial.rrjI_2",
         "celestial.rrjV_2",
         "celestial.rrjw_3"
      };

      for (String className : patchedClasses) {
         Class<?> type = Class.forName(className, true, loader);
         URI sourceUri = type.getProtectionDomain().getCodeSource().getLocation().toURI();
         Path actualSource = Path.of(sourceUri).toRealPath();
         if (!actualSource.equals(expectedOverride)) {
            throw new IllegalStateException(className + " loaded from " + actualSource);
         }
      }

      String[] patchedUiClasses = new String[]{
         "celestial.BG",
         "celestial.rrvL",
         "celestial.CrackLinkButton",
         "celestial.rrQX",
         "celestial.rrwl_3",
         "celestial.rruc_1",
         "celestial.rruN",
         "celestial.rrwq_3",
         "celestial.rrQT",
         "celestial.AttackAura"
      };

      for (String className : patchedUiClasses) {
         Class<?> type = Class.forName(className, false, loader);
         type.getDeclaredMethods();
         URI sourceUri = type.getProtectionDomain().getCodeSource().getLocation().toURI();
         Path actualSource = Path.of(sourceUri).toRealPath();
         if (!actualSource.equals(expectedOverride)) {
            throw new IllegalStateException(className + " loaded from " + actualSource);
         }
      }

      Class<?> protocolVersion = Class.forName("com.viaversion.viaversion.api.protocol.version.ProtocolVersion", true, loader);
      Object latest = protocolVersion.getField("v1_21_11").get(null);
      int latestId = (Integer)protocolVersion.getMethod("getVersion").invoke(latest);
      Class<?> injectorType = Class.forName("celestial.rrjg_3", true, loader);
      Object injector = injectorType.getConstructor().newInstance();
      Method versionsMethod = injectorType.getMethod("getServerProtocolVersions");
      Object versionsValue = versionsMethod.invoke(injector);
      if (versionsValue instanceof SortedSet<?> versions && versions.contains(latest)) {
         Object primaryVersion = injectorType.getMethod("getServerProtocolVersion").invoke(injector);
         if (!protocolVersion.isInstance(primaryVersion)) {
            throw new IllegalStateException("Via injector returned a primitive/invalid protocol version");
         }

         Class<?> customProtocolType = Class.forName("celestial.rrjy_3", true, loader);
         Object customProtocol = customProtocolType.getConstructor(int.class, String.class, int.class).newInstance(754, "1.16.5", 0);
         int customId = (Integer)protocolVersion.getMethod("getVersion").invoke(customProtocol);
         if (customId != 754) {
            throw new IllegalStateException("Custom protocol constructor changed id: " + customId);
         }

         Class<?> baseVersionProvider = Class.forName("com.viaversion.viaversion.protocol.version.BaseVersionProvider", true, loader);
         Object versionProvider = Class.forName("celestial.rrjY_2", true, loader).getConstructor().newInstance();
         if (!baseVersionProvider.isInstance(versionProvider)) {
            throw new IllegalStateException("rrjY does not extend the 5.11 BaseVersionProvider");
         }

         Class<?> movementProvider = Class.forName("com.viaversion.viaversion.protocols.v1_8to1_9.provider.MovementTransmitterProvider", true, loader);
         Object movement = Class.forName("celestial.rrjf_3", true, loader).getConstructor().newInstance();
         if (!movementProvider.isInstance(movement)) {
            throw new IllegalStateException("rrjf does not use the 5.11 movement provider");
         }

         Class.forName("celestial.rrjR_2", true, loader).getConstructor().newInstance();
         Class<?> userConnection = Class.forName("com.viaversion.viaversion.api.connection.UserConnection", false, loader);
         Method kickBridge = Class.forName("celestial.rrjI_2", true, loader).getMethod("kickPlayer", userConnection, String.class);
         if (!kickBridge.getDeclaringClass().getName().equals("celestial.rrjI_2")) {
            throw new IllegalStateException("rrjI does not provide the Via 5.11 kickPlayer bridge");
         }

         Path probeDirectory = Files.createTempDirectory("celestial-via-5.11-probe-").toRealPath();

         try {
            Constructor<?> configConstructor = Class.forName("celestial.rrjV_2", true, loader).getConstructor(File.class);
            configConstructor.newInstance(probeDirectory.resolve("viaversion.yml").toFile());
         } finally {
            try (Stream<Path> paths = Files.walk(probeDirectory)) {
               paths.sorted(Comparator.reverseOrder()).forEach(path -> {
                  try {
                     Files.deleteIfExists(path);
                  } catch (Exception error) {
                     throw new RuntimeException(error);
                  }
               });
            }
         }

         assertMissing(loader, "com.viaversion.viaversion.protocols.protocol1_9to1_8.providers.MovementTransmitterProvider");
         assertMissing(loader, "com.viaversion.viaversion.protocols.base.BaseVersionProvider");
         Path viaSource = Path.of(protocolVersion.getProtectionDomain().getCodeSource().getLocation().toURI());
         Class<?> backwardsPlatform = Class.forName("com.viaversion.viabackwards.api.ViaBackwardsPlatform", false, loader);
         Path backwardsSource = Path.of(backwardsPlatform.getProtectionDomain().getCodeSource().getLocation().toURI());
         if (viaSource.getFileName().toString().equals("viaversion-5.11.0.jar") && backwardsSource.getFileName().toString().equals("viabackwards-5.11.0.jar")) {
            System.out
               .println("via_runtime_ok version=5.11.0 latest=1.21.11 protocol_id=" + latestId + " injector_versions=" + ((SortedSet)versionsValue).size());
         } else {
            throw new IllegalStateException("Unexpected Via artifacts: " + viaSource + ", " + backwardsSource);
         }
      } else {
         throw new IllegalStateException("Via injector does not expose ProtocolVersion.v1_21_11");
      }
   }

   private static void assertMissing(ClassLoader loader, String className) throws Exception {
      try {
         Class.forName(className, false, loader);
         throw new IllegalStateException("Legacy Via class is still loadable: " + className);
      } catch (ClassNotFoundException var3) {
      }
   }
}
