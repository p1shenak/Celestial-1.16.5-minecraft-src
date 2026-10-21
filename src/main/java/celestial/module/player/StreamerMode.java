package celestial.module.player;

import java.nio.charset.StandardCharsets;
import celestial.*;
import celestial.module.Module;
import celestial.module.Category;
import celestial.module.ModuleManager;
import celestial.setting.Setting;
import celestial.setting.KeyBind;
import celestial.setting.CheckGroup;
import celestial.setting.GroupSetting;
import celestial.setting.ButtonSetting;
import celestial.event.EventTarget;
import celestial.event.PacketEvent;
import celestial.event.RenderEvent;
import celestial.util.MinecraftAccessor;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.event.*;
import celestial.setting.*;
import celestial.module.*;
import celestial.module.combat.*;
import celestial.module.movement.*;
import celestial.module.render.*;
import celestial.module.player.*;
import celestial.module.util.*;
import celestial.ui.clickgui.*;
import celestial.ui.hud.*;
import celestial.manager.*;
import celestial.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StreamerMode extends celestial.module.Module {
   public static Object[] id_break;
   public Object[] id_byte;

   

   public StreamerMode() {
      super("Streamer Mode", "Скрывает некоторые элементы\nигры", Category.PLAYER);
      this.id_this();
      rrIk_1 var5 = new rrIk_1("Скрывать свой", true);
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Скрывать друзей", false);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Скрывать информацию", false);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Скрывать анархию/гриф", false);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Скрывать координаты", false);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1("Режим ютубера", false);
      this.id_byte[5] = var10;
      this.id_class(
         new celestial.setting.GroupSetting("Никнеймы", (rrIk_1)this.id_byte[0], (rrIk_1)this.id_byte[1]),
         new celestial.setting.GroupSetting("Чат", (rrIk_1)this.id_byte[2]),
         new celestial.setting.GroupSetting("Разное", (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[5])
      );
   }

   

   private void id_this() {
      if (this.id_byte == null) {
         this.id_byte = new Object[6];
      }
   }

   public static void id_class(rVi_1 var0, String var1, Map<Integer, String> var2) {
      List var3 = var0.id_protected();
      if (!var3.isEmpty()) {
         StringBuilder var4 = new StringBuilder();

         for (rgP_2 var6 : (List<rgP_2>)var3) {
            var4.append(var6.getString());
         }

         String var20 = var4.toString().toLowerCase();
         int var21 = var20.indexOf(var1.toLowerCase());
         if (var21 != -1) {
            int var7 = var21 + var1.length();
            ArrayList var8 = new ArrayList(var3.size());
            int var9 = 0;

            for (rgP_2 var11 : (List<rgP_2>)var3) {
               String var12 = var11.getString();
               int var13 = var12.length();
               int var14 = var9 + var13;
               if (var14 > var21 && var9 < var7) {
                  StringBuilder var15 = new StringBuilder(var13);

                  for (int var16 = 0; var16 < var13; var16++) {
                     int var17 = var9 + var16;
                     if (var17 >= var21 && var17 < var7) {
                        int var18 = var17 - var21;
                        String var19 = var2.getOrDefault(var18, String.valueOf(var12.charAt(var16)));
                        var15.append(var19);
                     } else {
                        var15.append(var12.charAt(var16));
                     }
                  }

                  rgN_2 var22 = new rgN_2(var15.toString());
                  var22.id_class(var11.id_class());
                  var8.add(var22);
               } else {
                  var8.add(var11);
               }

               var9 = var14;
            }

            var0.id_protected().clear();
            var0.id_protected().addAll(var8);
         }
      }
   }

   

   public rgP_2 id_class(rgP_2 var1) {
      this.id_this();
      if (!this.aJ_()) {
         return var1;
      } else {
         boolean var2 = ((rrIk_1)this.id_byte[1]).id_class();
         boolean var3 = ((rrIk_1)this.id_byte[0]).id_class();
         if (!var2 && !var3) {
            return var1;
         } else {
            String var4 = var1.getString();
            String var5 = var4.toLowerCase();
            if (var2) {
               Map var6 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class();
               if (!var6.isEmpty()) {
                  for (String var8 : ((Map<String, ?>)var6).keySet()) {
                     if (var5.contains(var8)) {
                        return var1.id_case().id_class(var8, (String)id_break[2], false);
                     }
                  }
               }
            }

            if (var3) {
               String var9 = id_import.id_while().id_byte();
               String var10 = var9.toLowerCase();
               if (var5.contains(var10)) {
                  return var1.id_case().id_class(var10, (String)id_break[2], false);
               }
            }

            return var1;
         }
      }
   }

   public static boolean id_class(int var0) {
      int var1 = var0 >> 16 & 255;
      int var2 = var0 >> 8 & 255;
      int var3 = var0 & 255;
      return var1 > var2 && var1 > var3 && var1 >= 80 ? true : false;
   }

   @celestial.event.EventTarget
   public void id_class(rrnb_3 var1) {
      this.id_this();
      if (var1.id_class() instanceof rsG_2 var3
         && ((rrIk_1)this.id_byte[5]).id_class()
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && (int)var3.BO() == -29) {
         var1.id_class(true);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLb_1 var1) {
      String var2 = var1.id_class();
      if (var2 != null) {
         var1.id_break(this.id_break(var2));
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 228195096;
   }

   public String id_break(String var1) {
      this.id_this();
      if (!this.aJ_()) {
         return var1;
      } else {
         boolean var2 = ((rrIk_1)this.id_byte[1]).id_class();
         boolean var3 = ((rrIk_1)this.id_byte[0]).id_class();
         if (!var2 && !var3) {
            return var1;
         } else {
            String var4 = var1.toLowerCase();
            if (var2) {
               Map var5 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class();
               if (!var5.isEmpty()) {
                  for (String var7 : ((Map<String, ?>)var5).keySet()) {
                     if (var4.contains(var7)) {
                        return var4.replace(var7, (String)id_break[2]);
                     }
                  }
               }
            }

            if (var3) {
               String var8 = id_import.id_while().id_byte();
               String var9 = var8.toLowerCase();
               if (var4.contains(var9)) {
                  return var4.replace(var9, (String)id_break[2]);
               }
            }

            return var1;
         }
      }
   }

   

   public boolean id_continue() {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[3]).id_class() ? true : false;
   }

   

   public boolean id_new() {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[4]).id_class() ? true : false;
   }

      static {
      Object[] var0 = new Object[8];
      String[] var2 = new String[]{
         "warp",
         "call",
         "tpa",
         "tp",
         "l",
         "login",
         "register",
         "reg",
         "cp",
         "an",
         "gr",
         "changepass",
         "cpass",
         "changepassword"
      };
      var0[0] = var2;
      var0[1] = new rgN_2("Protected");
      var0[2] = new String("Protected");
      var0[3] = Pattern.compile("(funtime|фантайм)", 2);
      var0[4] = Pattern.compile("funac", 2);
      Entry[] var3 = new Entry[]{
         Map.entry((Integer)0, "c"),
         Map.entry((Integer)1, "e"),
         Map.entry((Integer)2, "l"),
         Map.entry((Integer)3, "e"),
         Map.entry((Integer)4, "s"),
         Map.entry((Integer)5, "t"),
         Map.entry((Integer)6, "ial")
      };
      var0[5] = Map.ofEntries(var3);
      Entry[] var4 = new Entry[]{
         Map.entry((Integer)0, "C"),
         Map.entry((Integer)1, "e"),
         Map.entry((Integer)2, "l"),
         Map.entry((Integer)3, "A"),
         Map.entry((Integer)4, "C")
      };
      var0[6] = Map.ofEntries(var4);
      var0[7] = rVa_1.id_class(16738740);
      id_break = var0;
   }

   public boolean id_super() {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[5]).id_class() ? true : false;
   }

   

   

   

   public boolean id_protected(String var1) {
      this.id_this();
      return this.aJ_() && ((rrIk_1)this.id_byte[2]).id_class()
         ? Arrays.<String>stream((String[])id_break[0]).anyMatch(var1x -> var1.startsWith("/" + var1x))
         : false;
   }
}
