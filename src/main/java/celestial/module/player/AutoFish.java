package celestial.module.player;

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

public class AutoFish extends celestial.module.Module {
   public Object[] id_break;

   private void id_byte(rpm_3 var1) {
      this.id_this();
      if (this.id_return()) {
         if (!(Boolean)this.id_break[0]
            && (rhp_3)((cb_3)id_import.id_class[57]).id_implements[29] != null
            && ((rhp_3)((cb_3)id_import.id_class[57]).id_implements[29]).id_implements()) {
      this.id_class(var1);
            this.id_break[0] = true;
         }
      }
   }

   public AutoFish() {
      super("Auto Fish", "Автоматически ловит рыбу за вас", Category.UTIL);
      this.id_this();
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         this.id_break[0] = false;
         this.id_break[1] = 0;
      }
   }

   private void id_class(rpm_3 var1) {
      ryZ_2 var2 = ((Ax_1)id_import.id_class[55]).id_class(var1);
      if (var2 == ryZ_2.SUCCESS) {
         ((cb_3)id_import.id_class[57]).id_class(var1);
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rpm_3 var2 = rrfH_2.id_class((cb_3)id_import.id_class[57], rdy_3.Xd);
         if (var2 != null) {
            this.id_byte(var2);
            this.id_break(var2);
         }
      }
   }

   

   

   private void id_break(rpm_3 var1) {
      this.id_this();
      if (this.id_return()) {
         if ((Boolean)this.id_break[0]) {
            this.id_break[1] = (Integer)this.id_break[1] + 1;
            if ((Integer)this.id_break[1] >= 5) {
      this.id_class(var1);
               this.id_goto();
            }
         }
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_goto();
   }

   private void id_goto() {
      this.id_this();
      this.id_break[1] = Integer.valueOf(0);
      this.id_break[0] = false;
   }

   

   

   

   private boolean id_return() {
      an_3 var1 = Ph_1.id_class(((cb_3)id_import.id_class[57]).rO(), 20.0F, false, null);
      return var1 != null ? false : true;
   }

   

   
}
