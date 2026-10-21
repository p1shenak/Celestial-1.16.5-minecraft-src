package celestial.module.util;

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
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoAuth extends celestial.module.Module {
   public static Object[] id_break;
   public Object[] id_byte;

   private void id_byte(String var1) {
      String[] var2 = var1.split(" ");
      String[] var3 = var2;
      int var4 = var2.length;

      for (int var5 = 0; var5 < var4; var5++) {
         String var6 = var3[var5];
         if (((Set)id_break[2]).contains(var6)) {
            this.id_super();
            break;
         }

         if (((Set)id_break[1]).contains(var6)) {
            this.id_return();
            break;
         }
      }
   }

   public AutoAuth() {
      super("Auto Auth", "Автоматически регистрируется\nи авторизируется на сервере", Category.UTIL);
      this.id_else();
      rrIv_1 var5 = new rrIv_1("Пароль", "qwerty123", rrte_3.id_class((Pattern)rrtR_2.id_class[8])).id_class(80.0F);
      this.id_byte[0] = var5;
      this.id_class((rrIv_1)this.id_byte[0]);
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rFu_1 var2) {
         rFm_1 var5 = var2.id_break();
         rgP_2 var4 = var2.id_byte();
         if (var4 == null) {
            return;
         }

         if ((cb_3)id_import.id_class[57] == null || id_import.id_finally() || id_import.S() == null) {
            return;
         }

         if (var5 == rFm_1.TITLE || var5 == rFm_1.SUBTITLE || var5 == rFm_1.ACTIONBAR) {
            this.id_byte(var4.id_byte().toLowerCase());
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLO var1) {
      String var2 = var1.id_protected().toLowerCase();
      if (!id_import.id_finally() && id_import.S() != null) {
         this.id_byte(var2);
      }
   }

   

   

   

   private void id_else() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
      }
   }

      static {
      Object[] var0 = new Object[]{new HashSet(), Set.of("/register", "/reg"), Set.of("/login", "/l")};
      id_break = var0;
   }

   private void id_return() {
      this.id_else();
      String var1 = ((rrIv_1)this.id_byte[0]).id_extends();
      if (var1.isEmpty()) {
         var1 = ((rrIv_1)this.id_byte[0]).id_final();
      }

      ((cb_3)id_import.id_class[57]).id_case("/register " + var1 + " " + var1);
      ((Set)id_break[0]).add(new rrHc_1(id_import.id_while().id_byte(), id_import.S().id_break, var1));
   }

   private void id_super() {
      this.id_else();

      for (rrHc_1 var2 : (Set<rrHc_1>)id_break[0]) {
         String var3 = var2.id_byte();
         String var4 = var2.id_break();
         if (id_import.id_while().id_byte().equalsIgnoreCase(var3) && var4.equals(id_import.S().id_break)) {
            String var5 = var2.id_class();
            if (!rql_3.id_break(var5)) {
               ((cb_3)id_import.id_class[57]).id_case("/login " + var5);
            }

            return;
         }
      }

      ((cb_3)id_import.id_class[57]).id_case("/login " + ((rrIv_1)this.id_byte[0]).id_extends());
   }

   

   
}
