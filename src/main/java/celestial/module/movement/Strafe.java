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

public class Strafe extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public Strafe() {
      super("Strafe", "Позволяет не замедляться при\nдвижении в стороны", Category.MOVEMENT);
      this.id_while();
      rrlX_2 var5 = new rrlX_2(this);
      this.id_break[0] = var5;
   }

   

   public boolean id_this() {
      this.id_while();
      return (Boolean)this.id_break[3];
   }

   @celestial.event.EventTarget
   public void id_class(rrLW var1) {
      this.id_while();
      ((rrlX_2)this.id_break[0]).id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_while();
      if (var1.id_class() < 10.0F) {
         this.id_break[3] = true;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_while();
      if ((Boolean)this.id_break[2] && rmD_2.id_break != (Boolean)this.id_break[1]) {
         var1.id_protected(!rmD_2.id_break ? true : false);
      }

      ((rrlX_2)this.id_break[0]).id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(rrAB var1) {
      this.id_while();
      if ((Boolean)this.id_break[2]) {
         var1.id_class(true);
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Qw_1)id_import.id_class[20]).Pr = false;
         this.id_break[2] = this.id_throw();
         if ((Boolean)this.id_break[3]
            && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 6 == 0) {
            this.id_break[3] = false;
            ((rrlX_2)this.id_break[0]).id_class(0.0);
         }
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_while();
      super.id_class(var1);
      ((rrlX_2)this.id_break[0]).id_class(0.15F);
   }

   public void id_class() {
      this.id_byte(false);
   }

   @celestial.event.EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_while();
      if ((Boolean)this.id_break[2]) {
         var1.id_class(((rrlX_2)this.id_break[0]).id_class(var1));
      } else {
         ((rrlX_2)this.id_break[0]).id_class(0.0);
      }
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      if ((cb_3)id_import.id_class[57] != null) {
         rjU_2 var2 = ((cb_3)id_import.id_class[57]).rv();
         var2.id_break = var2.id_break * 0.7;
         var2.id_protected = var2.id_protected * 0.7;
      }
   }

   

   public void id_case(boolean var1) {
      this.id_while();
      this.id_break[1] = var1;
   }

   public boolean id_continue() {
      this.id_while();
      return (Boolean)this.id_break[1];
   }

   

   

   public boolean id_new() {
      this.id_while();
      return (Boolean)this.id_break[2];
   }

   

   public rrlX_2 id_super() {
      this.id_while();
      return (rrlX_2)this.id_break[0];
   }

   private boolean id_throw() {
      this.id_while();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
      if ((cb_3)id_import.id_class[57] == null || (gm_3)id_import.id_class[56] == null) {
         return false;
      } else if ((Boolean)this.id_break[3]) {
         return false;
      } else if (var1.id_strictfp().aJ_() || var1.K().aJ_()) {
         return false;
      } else if (var1.B().aJ_() && (Boolean)((cb_3)id_import.id_class[57]).id_throws[23]) {
         return false;
      } else if (rrfZ_2.id_protected()) {
         return false;
      } else if (((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
         return false;
      } else if (((cb_3)id_import.id_class[57]).id_break(rLD.id_goto)) {
         return false;
      } else if (((cb_3)id_import.id_class[57]).h()) {
         return false;
      } else if (((cb_3)id_import.id_class[57]).Sy()) {
         return false;
      } else {
         return ((cb_3)id_import.id_class[57]).PZ() ? false : true;
      }
   }

   

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         this.id_break[1] = false;
         this.id_break[2] = false;
         this.id_break[3] = false;
      }
   }

   
}
