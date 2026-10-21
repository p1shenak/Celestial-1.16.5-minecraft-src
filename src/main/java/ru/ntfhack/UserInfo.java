package ru.ntfhack;



public class UserInfo {
   static {
      String javaLibraryPath = System.getProperty("java.library.path");
      if (javaLibraryPath != null && !javaLibraryPath.isBlank()) {
         System.setProperty("jna.library.path", javaLibraryPath);
      }
   }

   public static String getUsername() {
      return "@CollapseLoader";
   }

   public static int getUID() {
      return 2;
   }
}
