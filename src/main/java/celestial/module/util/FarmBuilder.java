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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FarmBuilder extends celestial.module.Module {
   public Object[] id_break;

   public boolean id_byte(String var1) {
      this.id_goto();
      bW_2 var2 = C_throws.id_byte().id_abstract();
      String var3 = rrfu_3.id_class(this);
      if ((rY_2)this.id_break[1] == null) {
         String var10001 = "Необходимо установить область фермы криперов. Используйте команду %sfb";
         String var6 = var3 + var10001.formatted(new Object[]{C_throws.id_break().id_protected.id_class[0]});
         rrfu_3.id_byte(var6);
         return false;
      } else {
         bc_3 var4 = this.id_protected(var1);
         if (var4 == null) {
            String var5 = var3 + "Неверный режим: " + (String)((rrIQ)this.id_break[0]).id_byte();
            rrfu_3.id_byte(var5);
            return false;
         } else {
            var2.id_class(var4, (rY_2)this.id_break[1]);
            return true;
         }
      }
   }

   public FarmBuilder() {
      super("Farm Builder", "Помогает в постройке фермы\nкриперов", Category.UTIL);
      this.id_goto();
      rrIQ var5 = (rrIQ)new rrIQ("Режим", "Люки", "Люки", "Полублоки").id_class("onChangeMode", (var1, var2) -> {
         if (this.aJ_()) {
            String var3 = (String)var1.id_byte();
            if (!this.id_byte(var3)) {
               this.id_byte(true);
            }
         }
      });
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
   }

   

   private void id_this() {
      this.id_super().id_protected();
   }

   public void id_class(rY_2 var1) {
      this.id_goto();
      this.id_break[1] = var1;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      if (!this.id_byte((String)((rrIQ)this.id_break[0]).id_byte())) {
         this.id_byte(true);
      } else {
         super.id_class(var1);
      }
   }

   

   

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_this();
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   

   

   public rY_2 id_new() {
      this.id_goto();
      return (rY_2)this.id_break[1];
   }

   

   private bW_2 id_super() {
      return C_throws.id_byte().id_abstract();
   }

   

   private bc_3 id_protected(String var1) {
      byte var3 = -1;
      switch (var1.hashCode()) {
         case 192075:
            if (var1.equals("Полублоки")) {
               var3 = 1;
            }
            break;
         case 32403985:
            if (var1.equals("Люки")) {
               var3 = 0;
            }
      }
      return switch (var3) {
         case 0 -> (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[0];
         case 1 -> (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[1];
         default -> null;
      };
   }
}
