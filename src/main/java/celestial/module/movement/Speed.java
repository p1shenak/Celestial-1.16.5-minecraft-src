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

public class Speed extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public Speed() {
      super("Speed", "Увеличивает скорость игрока", Category.MOVEMENT);
      this.id_continue();
      String var10004 = "Режим";
      String var10005 = "Vanilla";
      rrIQ var5 = (rrIQ)this.id_class(new rrIQ(var10004, var10005, new String[]{"Vanilla", "Collision", "Matrix", "Grim"}));
      this.id_break[1] = var5;
      rrlB_2 var6 = new rrlB_2(this);
      this.id_break[2] = var6;
      rrls_3 var7 = new rrls_3(this);
      this.id_break[3] = var7;
      rrlS_2 var8 = new rrlS_2(this);
      this.id_break[4] = var8;
      rrlE_2 var9 = new rrlE_2(this);
      this.id_break[5] = var9;
      rrlE_2 var10 = (rrlE_2)this.id_break[5];
      this.id_break[0] = var10;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_continue();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1997372447:
               if (var3.equals("Matrix")) {
                  var4 = 2;
               }
               break;
            case -403347694:
               if (var3.equals("Collision")) {
                  var4 = 1;
               }
               break;
            case 2228079:
               if (var3.equals("Grim")) {
                  var4 = 3;
               }
               break;
            case 1897755483:
               if (var3.equals("Vanilla")) {
                  var4 = 0;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrlE_2)this.id_break[5];
            case 1 -> (rrlB_2)this.id_break[2];
            case 2 -> (rrls_3)this.id_break[3];
            case 3 -> (rrlS_2)this.id_break[4];
            default -> null;
         };
         this.id_break[0] = var9x;
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aI_();
         }
      });
   }

   

   

   public void id_class() {
      this.id_byte(false);
      rrTF var1 = this.id_new();
      var1.aK_();
      var1.id_super();
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

   

   public rrTF<celestial.module.movement.Speed> id_new() {
      this.id_continue();
      return (rrTF<celestial.module.movement.Speed>)this.id_break[0];
   }

   

   
}
