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

public class Spider extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public Spider() {
      super("Spider", "Позволяет взбираться по стенам", Category.MOVEMENT);
      this.id_else();
      rrIQ var5 = new rrIQ("Режим", "Grim", "Grim", "Matrix", "Funtime");
      this.id_break[1] = var5;
      this.id_class(
         (rrIQ)this.id_break[1]
      );
      rrlM_2 var6 = new rrlM_2(this);
      this.id_break[2] = var6;
      rrlO_2 var7 = new rrlO_2(this);
      this.id_break[3] = var7;
      rrlb_3 var8 = new rrlb_3(this);
      this.id_break[4] = var8;
      rrlM_2 var9 = (rrlM_2)this.id_break[2];
      this.id_break[0] = var9;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_else();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1997372447:
               if (var3.equals("Matrix")) {
                  var4 = 1;
               }
               break;
            case 2228079:
               if (var3.equals("Grim")) {
                  var4 = 0;
               }
               break;
            case 1155506348:
               if (var3.equals("Funtime")) {
                  var4 = 2;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrlM_2)this.id_break[2];
            case 1 -> (rrlO_2)this.id_break[3];
            case 2 -> (rrlb_3)this.id_break[4];
            default -> null;
         };
         this.id_break[0] = var9x;
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aI_();
         }
      });
   }

   

   

   

   

   public void id_class() {
      this.id_protected(false);
      this.id_new().aK_();
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

   public rrlM_2 id_continue() {
      this.id_else();
      return (rrlM_2)this.id_break[2];
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
      }
   }

   public rrTF<celestial.module.movement.Spider> id_new() {
      this.id_else();
      return (rrTF<celestial.module.movement.Spider>)this.id_break[0];
   }

   

   

   
}
