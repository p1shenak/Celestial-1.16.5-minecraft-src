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

public class AutoGApple extends celestial.module.Module {
   public Object[] id_break;

   public AutoGApple() {
      super("Auto GApple", "Автоматически ест золотое яблоко\nпри определённом здоровье", Category.COMBAT);
      this.id_new();
      rrIm_1 var5 = new rrIm_1("Здоровье", 15.0F, 5.0F, 20.0F, 0.5F);
      this.id_break[2] = var5;
      this.id_class((rrIm_1)this.id_break[2]);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrAm_1 var1) {
      this.id_new();
      if ((Boolean)this.id_break[0] || (Boolean)this.id_break[1]) {
         var1.id_class(true);
      }
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrAR var1) {
      this.id_new();
      if ((Boolean)this.id_break[0]) {
         var1.id_class(true);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAC var1) {
      this.id_new();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[0]) {
         var1.id_class(true);
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.id_break[1] = false;
         if (((cb_3)id_import.id_class[57]).Ss() <= (Float)((rrIm_1)this.id_break[2]).id_byte()) {
            rpD_2 var10000 = ((cb_3)id_import.id_class[57]).sK();
            rdb_3[] items = new rdb_3[]{rdy_3.hy, rdy_3.hp};
            if (!var10000.id_class(items)) {
               cb_3 var10 = (cb_3)id_import.id_class[57];
               if (rrfH_2.id_class(var10, items) != null) {
                  ((Qw_1)id_import.id_class[20]).u.id_class(true);
                  this.id_break[0] = true;
                  return;
               }
            }
         }

         if ((Boolean)this.id_break[0]) {
            ((Qw_1)id_import.id_class[20]).u.id_class(false);
            this.id_break[0] = false;
            this.id_break[1] = true;
         }
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      this.id_break[1] = false;
      if ((Boolean)this.id_break[0]) {
         if (((Qw_1)id_import.id_class[20]).u.id_protected()) {
            ((Qw_1)id_import.id_class[20]).u.id_class(false);
         }

         this.id_break[0] = false;
      }
   }

   

   

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[0] = false;
         this.id_break[1] = false;
      }
   }

   

   
}
