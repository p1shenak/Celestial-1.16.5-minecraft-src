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

public class XRay<T extends rrqN_2> extends celestial.module.Module implements rrqd_3 {
   public Object[] id_break;

   

   public XRay() {
      super("X-Ray", "WallHack на блоки для серверов с\nсильным античитом", Category.UTIL);
      this.id_goto();
      rrIQ var5 = new rrIQ("Режим", "Default", "Default", "Ancient");
      this.id_break[3] = var5;
      rrIm_1 var6 = new rrIm_1("Радиус сканирования", 16.0F, 6.0F, 64.0F, 1.0F);
      this.id_break[4] = var6;
      rrIm_1 var7 = new rrIm_1("Скорость сканирования", 20.0F, 1.0F, 30.0F, 1.0F);
      this.id_break[5] = var7;
      this.id_break[6] = true;
      rrqm_3 var9 = new rrqm_3(this);
      this.id_break[0] = var9;
      rrqZ_2 var10 = new rrqZ_2(this);
      this.id_break[1] = var10;
      rrqm_3 var11 = (rrqm_3)this.id_break[0];
      this.id_break[2] = var11;
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break(this);
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break((rrqN_2)this.id_break[2]);
      ((rrIQ)this.id_break[3]).id_class("change_mode", (var1, var2) -> {
         this.id_goto();
         if ((rrqN_2)this.id_break[2] != null && this.aJ_()) {
            ((rrqN_2)this.id_break[2]).aK_();
         }

         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_class((rrqN_2)this.id_break[2]);
         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1085510111:
               if (var3.equals("Default")) {
                  var4 = 0;
               }
               break;
            case 802060952:
               if (var3.equals("Ancient")) {
                  var4 = 1;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrqm_3)this.id_break[0];
            case 1 -> (rrqZ_2)this.id_break[1];
            default -> null;
         };
         this.id_break[2] = var9x;
         if ((rrqN_2)this.id_break[2] != null && this.aJ_()) {
            ((rrqN_2)this.id_break[2]).aI_();
         }

         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).id_break((rrqN_2)this.id_break[2]);
      });
      ((rrIm_1)this.id_break[4]).id_class(() -> {
         this.id_goto();
         return (rrqN_2)this.id_break[2] == (rrqm_3)this.id_break[0] ? true : false;
      });
      ((rrIm_1)this.id_break[5]).id_class(() -> {
         this.id_goto();
         return (rrqN_2)this.id_break[2] == (rrqm_3)this.id_break[0] ? true : false;
      });
      this.id_class(
         (rrIQ)this.id_break[3],
         (rrIm_1)this.id_break[4],
         (rrIm_1)this.id_break[5]
      );
   }

   

   public rrIQ id_this() {
      this.id_goto();
      return (rrIQ)this.id_break[3];
   }

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      if (((rrqN_2)this.id_break[2]).aI_()) {
         super.id_class(var1);
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_goto();
      super.id_throws(var1);
      ((rrqN_2)this.id_break[2]).aK_();
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         this.id_break[6] = false;
      }
   }

   public void id_case(boolean var1) {
      this.id_goto();
      this.id_break[6] = var1;
   }

   public boolean id_continue() {
      this.id_goto();
      return (Boolean)this.id_break[6];
   }

   public rrIm_1 id_else() {
      this.id_goto();
      return (rrIm_1)this.id_break[4];
   }

   

   public rrIm_1 id_new() {
      this.id_goto();
      return (rrIm_1)this.id_break[5];
   }

   public rrqZ_2 id_return() {
      this.id_goto();
      return (rrqZ_2)this.id_break[1];
   }

   public T id_super() {
      this.id_goto();
      return (T)this.id_break[2];
   }

   

   

   

   public rrqm_3 id_public() {
      this.id_goto();
      return (rrqm_3)this.id_break[0];
   }

   
}
