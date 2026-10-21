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

public class ClickPearl extends celestial.module.Module {
   public Object[] id_break;

   public ClickPearl() {
      super("Click Pearl", "Бросает эндер-пёрл на клавишу", Category.UTIL);
      this.id_return();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "HolyWorld");
      this.id_break[0] = var5;
      rrIF var6 = new rrIF("Клавиша", KeyBind.get(3));
      this.id_break[1] = var6;
      this.id_class(
         (rrIQ)this.id_break[0],
         (rrIF)this.id_break[1]
      );
      rryy_1 var7 = new rryy_1(this);
      this.id_break[3] = var7;
      rryC var8 = new rryC(this);
      this.id_break[4] = var8;
      rryy_1 var9 = (rryy_1)this.id_break[3];
      this.id_break[2] = var9;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_return();
         if ((rrTF)this.id_break[2] != null && this.aJ_()) {
            ((rrTF)this.id_break[2]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -495240450:
               if (var3.equals("HolyWorld")) {
                  var4 = 1;
               }
               break;
            case 1897755483:
               if (var3.equals("Vanilla")) {
                  var4 = 0;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rryy_1)this.id_break[3];
            case 1 -> (rryC)this.id_break[4];
            default -> null;
         };
         this.id_break[2] = var9x;
         if ((rrTF)this.id_break[2] != null && this.aJ_()) {
            ((rrTF)this.id_break[2]).aI_();
         }
      });
   }

   

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_return();
      super.id_class(var1);
      ((rrTF)this.id_break[2]).aI_();
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      ((rrTF)this.id_break[2]).aK_();
   }

   public rrIF id_continue() {
      this.id_return();
      return (rrIF)this.id_break[1];
   }

   

   public rrTF<celestial.module.util.ClickPearl> id_new() {
      this.id_return();
      return (rrTF<celestial.module.util.ClickPearl>)this.id_break[2];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
      }
   }

   

   
}
