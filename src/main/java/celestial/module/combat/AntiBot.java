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

public class AntiBot extends celestial.module.Module {
   public Object[] id_break;

   public AntiBot() {
      super("Anti Bot", "Детектит НПС/ботов от античита", Category.COMBAT);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Matrix", "Matrix", "ReallyWorld");
      this.id_break[1] = var5;
      this.id_class(
         (rrIQ)this.id_break[1]
      );
      rrnR_2 var6 = new rrnR_2(this);
      this.id_break[3] = var6;
      rrnY_2 var7 = new rrnY_2(this);
      this.id_break[2] = var7;
      rrnR_2 var8 = (rrnR_2)this.id_break[3];
      this.id_break[0] = var8;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_this();
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
            case 935423623:
               if (var3.equals("ReallyWorld")) {
                  var4 = 0;
               }
         }
         Object var9 = switch (var4) {
            case 0 -> (rrnY_2)this.id_break[2];
            case 1 -> (rrnR_2)this.id_break[3];
            default -> null;
         };
         this.id_break[0] = var9;
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aI_();
         }
      });
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new().aK_();
   }

   

   

   public rrTF<celestial.module.combat.AntiBot> id_new() {
      this.id_this();
      return (rrTF<celestial.module.combat.AntiBot>)this.id_break[0];
   }

   

   
}
