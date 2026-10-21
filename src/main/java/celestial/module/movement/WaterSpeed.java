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

public class WaterSpeed extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public WaterSpeed() {
      super("Water Speed", "Увеличивает скорость в воде", Category.MOVEMENT);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Vulcan");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
      rrlx_3 var6 = new rrlx_3(this);
      this.id_break[1] = var6;
      rrld_3 var7 = new rrld_3(this);
      this.id_break[2] = var7;
      rrlx_3 var8 = (rrlx_3)this.id_break[1];
      this.id_break[3] = var8;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_this();
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1721492669:
               if (var3.equals("Vulcan")) {
                  var4 = 1;
               }
               break;
            case 1155506348:
               if (var3.equals("Funtime")) {
                  var4 = 0;
               }
         }
         Object var9 = switch (var4) {
            case 0 -> (rrlx_3)this.id_break[1];
            case 1 -> (rrld_3)this.id_break[2];
            default -> null;
         };
         this.id_break[3] = var9;
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aI_();
         }
      });
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   public void id_class() {
      this.id_byte(false);
      this.id_new().id_super();
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

   

   

   public rrTF<celestial.module.movement.WaterSpeed> id_new() {
      this.id_this();
      return (rrTF<celestial.module.movement.WaterSpeed>)this.id_break[3];
   }

   

   
}
