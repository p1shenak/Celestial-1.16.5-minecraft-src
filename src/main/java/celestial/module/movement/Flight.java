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

public class Flight extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public Flight() {
      super("Flight", "Позволяет летать без креатив\nрежима", Category.MOVEMENT);
      this.id_throw();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "���I�\t�u�]\u0006F�ڗ", "Jump");
      this.id_break[1] = var5;
      rrIm_1 var6 = (rrIm_1)new rrIm_1("Скорость", 2.0F, 0.5F, 10.0F, 0.1F).id_class(() -> {
         this.id_throw();
         return this.id_new() == (rrCD)this.id_break[4] ? true : false;
      });
      this.id_break[2] = var6;
      rrIm_1 var7 = (rrIm_1)new rrIm_1("Скорость", 1.0F, 0.6F, 5.0F, 0.1F).id_class(() -> {
         this.id_throw();
         return this.id_new() == (rrCK)this.id_break[5] ? true : false;
      });
      this.id_break[3] = var7;
      rrCD var8 = new rrCD(this);
      this.id_break[4] = var8;
      rrCK var9 = new rrCK(this);
      this.id_break[5] = var9;
      rrCo_1 var10 = new rrCo_1(this);
      this.id_break[6] = var10;
      this.id_class(
         (rrIQ)this.id_break[1],
         (rrIm_1)this.id_break[2],
         (rrIm_1)this.id_break[3]
      );
      rrCD var11 = (rrCD)this.id_break[4];
      this.id_break[0] = var11;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_throw();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1017640528:
               if (var3.equals("���I�\t�u�]\u0006F�ڗ")) {
                  var4 = 1;
               }
               break;
            case 2320462:
               if (var3.equals("Jump")) {
                  var4 = 2;
               }
               break;
            case 1897755483:
               if (var3.equals("Vanilla")) {
                  var4 = 0;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCD)this.id_break[4];
            case 1 -> (rrCK)this.id_break[5];
            case 2 -> (rrCo_1)this.id_break[6];
            default -> null;
         };
         this.id_break[0] = var9x;
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aI_();
         }
      });
   }

   

   public rrIm_1 id_this() {
      this.id_throw();
      return (rrIm_1)this.id_break[2];
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

   

   public rrIQ id_continue() {
      this.id_throw();
      return (rrIQ)this.id_break[1];
   }

   

   

   public rrTF<celestial.module.movement.Flight> id_new() {
      this.id_throw();
      return (rrTF<celestial.module.movement.Flight>)this.id_break[0];
   }

   public rrIm_1 id_super() {
      this.id_throw();
      return (rrIm_1)this.id_break[3];
   }

   private void id_throw() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   

   
}
