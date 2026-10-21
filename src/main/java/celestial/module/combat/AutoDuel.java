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

public class AutoDuel extends celestial.module.Module {
   public Object[] id_break;

   public AutoDuel() {
      super("Auto Duel", "Автоматически находит дуэли", Category.UTIL);
      this.id_return();
      rrIQ var5 = new rrIQ("Сервер", "Funtime", "Funtime", "ReallyWorld");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
      rryQ var6 = new rryQ(this);
      this.id_break[1] = var6;
      rryA var7 = new rryA(this);
      this.id_break[2] = var7;
      rryQ var8 = (rryQ)this.id_break[1];
      this.id_break[3] = var8;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_return();
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case 935423623:
               if (var3.equals("ReallyWorld")) {
                  var4 = 1;
               }
               break;
            case 1155506348:
               if (var3.equals("Funtime")) {
                  var4 = 0;
               }
         }
         Object var9 = switch (var4) {
            case 0 -> (rryQ)this.id_break[1];
            case 1 -> (rryA)this.id_break[2];
            default -> null;
         };
         this.id_break[3] = var9;
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aI_();
         }
      });
   }

   

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(false);
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

   

   

   public rrTF<celestial.module.combat.AutoDuel> id_new() {
      this.id_return();
      return (rrTF<celestial.module.combat.AutoDuel>)this.id_break[3];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   
}
