package celestial.module.movement;

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

public class NoSlow extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public NoSlow() {
      super("No Slow", "Убирает замедление при\nиспользовании предмета", Category.MOVEMENT);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "SpookyTime", "ReallyWorld", "Vanilla");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
      rrlr_3 var6 = new rrlr_3(this);
      this.id_break[2] = var6;
      rrCe_1 var7 = new rrCe_1(this);
      this.id_break[3] = var7;
      rrCi_1 var8 = new rrCi_1(this);
      this.id_break[4] = var8;
      rrCa_1 var9 = new rrCa_1(this);
      this.id_break[5] = var9;
      rrCe_1 var10 = (rrCe_1)this.id_break[3];
      this.id_break[1] = var10;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_this();
         if ((rrTF)this.id_break[1] != null && this.aJ_()) {
            ((rrTF)this.id_break[1]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -912404296:
               if (var3.equals("SpookyTime")) {
                  var4 = 2;
               }
               break;
            case 935423623:
               if (var3.equals("ReallyWorld")) {
                  var4 = 3;
               }
               break;
            case 1155506348:
               if (var3.equals("Funtime")) {
                  var4 = 0;
               }
               break;
            case 1897755483:
               if (var3.equals("Vanilla")) {
                  var4 = 1;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCe_1)this.id_break[3];
            case 1 -> (rrlr_3)this.id_break[2];
            case 2 -> (rrCi_1)this.id_break[4];
            case 3 -> (rrCa_1)this.id_break[5];
            default -> null;
         };
         this.id_break[1] = var9x;
         if ((rrTF)this.id_break[1] != null && this.aJ_()) {
            ((rrTF)this.id_break[1]).aI_();
         }
      });
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   

   public void id_class() {
      this.id_byte(false);
      this.id_new().id_super();
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new().aK_();
   }

   

   

   public rrTF<celestial.module.movement.NoSlow> id_new() {
      this.id_this();
      return (rrTF<celestial.module.movement.NoSlow>)this.id_break[1];
   }

   

   
}
