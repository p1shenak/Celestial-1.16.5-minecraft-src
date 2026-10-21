package celestial.module.combat;

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

public class Velocity extends celestial.module.Module {
   public Object[] id_break;

   public Velocity() {
      super("Velocity", "Редактирует ваше откидывание", Category.COMBAT);
      rrIQ var5 = (rrIQ)((rrIQ)this.id_class(new rrIQ("Режим", "Vanilla", "Vanilla", "Custom", "Jump", "JumpReset"))).id_class("change_mode", (var1, var2) -> {
         this.id_continue();
         if ((rrTF)this.id_break[5] != null && this.aJ_()) {
            ((rrTF)this.id_break[5]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1618295391:
               if (var3.equals("JumpReset")) {
                  var4 = 3;
               }
               break;
            case 2320462:
               if (var3.equals("Jump")) {
                  var4 = 1;
               }
               break;
            case 1897755483:
               if (var3.equals("Vanilla")) {
                  var4 = 0;
               }
               break;
            case 2029746065:
               if (var3.equals("Custom")) {
                  var4 = 2;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCf_1)this.id_break[1];
            case 1 -> (rrCI)this.id_break[3];
            case 2 -> (rrCt_1)this.id_break[2];
            case 3 -> (rrCw_1)this.id_break[4];
            default -> null;
         };
         this.id_break[5] = var9x;
         if ((rrTF)this.id_break[5] != null && this.aJ_()) {
            ((rrTF)this.id_break[5]).aI_();
         }
      });
      this.id_break[0] = var5;
      rrCf_1 var6 = new rrCf_1(this);
      this.id_break[1] = var6;
      rrCt_1 var7 = new rrCt_1(this);
      this.id_break[2] = var7;
      rrCI var8 = new rrCI(this);
      this.id_break[3] = var8;
      rrCw_1 var9 = new rrCw_1(this);
      this.id_break[4] = var9;
      rrCf_1 var10 = (rrCf_1)this.id_break[1];
      this.id_break[5] = var10;
   }

   

   

   

   

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }
   }

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   

   public rrTF<celestial.module.combat.Velocity> id_new() {
      this.id_continue();
      return (rrTF<celestial.module.combat.Velocity>)this.id_break[5];
   }

   

   
}
