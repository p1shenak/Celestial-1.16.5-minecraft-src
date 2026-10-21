package offline.launcher;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class OfflineLauncher {
   static {
      if (System.getProperty("org.lwjgl.librarypath") == null) {
         File natives = findDirectory("natives", "Celestial-Sources/natives", "../natives", "Celestial/versions/Beta 1.16.5/natives", "../Celestial/versions/Beta 1.16.5/natives");
         if (natives.exists()) {
            System.setProperty("org.lwjgl.librarypath", natives.getAbsolutePath());
            System.setProperty("java.library.path", natives.getAbsolutePath());
            System.setProperty("jna.tmpdir", natives.getAbsolutePath());
         }
      }
   }

   private OfflineLauncher() {
   }

   public static void main(String[] gameArguments) throws Throwable {
      System.setProperty("sun.net.client.defaultConnectTimeout", "1500");
      System.setProperty("sun.net.client.defaultReadTimeout", "1500");
      System.setProperty("sun.net.http.errorstream.enableBuffering", "true");
      System.out.println("Network policy: ALLOW ALL (Discord webhooks disabled in bytecode, socket timeouts set to 1500ms)");
      ViaProtocolDiagnostics.start();

      String[] effectiveArgs = prepareArguments(gameArguments);

      try {
         Class<?> launcher = Class.forName("ru.argentoz.launcher.Launcher", true, OfflineLauncher.class.getClassLoader());
         Method main = launcher.getMethod("main", String[].class);
         main.invoke(null, (Object)effectiveArgs);
      } catch (InvocationTargetException error) {
         throw error.getCause();
      }
   }

   private static String[] prepareArguments(String[] args) {
      if (args != null && args.length > 0) {
         return args;
      }

      File gameDir = findDirectory("Celestial/Beta 1.16.5", "../Celestial/Beta 1.16.5", "Beta 1.16.5");
      File assetsDir = findDirectory("Celestial/assets", "../Celestial/assets", "assets");

      List<String> list = new ArrayList<>();
      list.addAll(Arrays.asList(
         "--username", "Player",
         "--version", "Beta 1.16.5",
         "--gameDir", gameDir.getAbsolutePath(),
         "--assetsDir", assetsDir.getAbsolutePath(),
         "--assetIndex", "1.16",
         "--uuid", "bd346dd5-ac1c-427d-87e8-73bdd4bf3e13",
         "--accessToken", "0",
         "--userType", "legacy",
         "--versionType", "release",
         "--userProperties", "{}",
         "--width", "1280",
         "--height", "720"
      ));
      return list.toArray(new String[0]);
   }

   private static File findDirectory(String... candidates) {
      for (String candidate : candidates) {
         File f = new File(candidate);
         if (f.exists() && f.isDirectory()) {
            return f.getAbsoluteFile();
         }
      }
      return new File(candidates[0]).getAbsoluteFile();
   }
}
