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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TriggerBot extends celestial.module.Module implements rrnL_2 {
   public static Object[] id_break;
   public Object[] id_byte;

   private void id_char() {
      if (this.id_byte == null) {
         this.id_byte = new Object[18];
         this.id_byte[9] = 0L;
         this.id_byte[10] = false;
         this.id_byte[11] = 0L;
         this.id_byte[12] = 0;
         this.id_byte[13] = 0;
         this.id_byte[14] = 0;
         this.id_byte[15] = 0;
         this.id_byte[16] = false;
         this.id_byte[17] = 0.0F;
      }
   }

   private void id_byte(iB_2 var1) {
      this.id_char();
      if (var1 != null) {
         this.id_byte[8] = var1;
         Long var7 = System.currentTimeMillis();
         this.id_byte[9] = var7;
      }

      this.id_byte[7] = var1;
   }

   

   

   public TriggerBot() {
      super("Trigger Bot", "Автоматически бьет существо\nесли оно на прицеле", Category.COMBAT);
      this.id_char();
      celestial.setting.CheckGroup var5 = new celestial.setting.CheckGroup()
         .id_catch(true)
         .id_case(true)
         .id_throws(false)
         .id_implements(false)
         .id_byte(false)
         .id_protected(false)
         .id_class(true);
      this.id_byte[0] = var5;
      rrIQ var6 = (rrIQ)new rrIQ("Обход спринта", "Funtime", "Funtime", "Legit").id_class("change_mode", (var1, var2) -> {
         this.id_char();
         Integer var7x = Integer.valueOf(0);
         this.id_byte[12] = var7x;
         Integer var8x = Integer.valueOf(0);
         this.id_byte[14] = var8x;
         Integer var9x = Integer.valueOf(0);
         this.id_byte[15] = var9x;
         Boolean var10x = false;
         this.id_byte[16] = var10x;
         Float var11x = -1.0F;
         this.id_byte[17] = var11x;
      });
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Только криты", true);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Останавливать при\nиспользовании предмета", false);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Останавливать при\nоткрытом контейнере", false);
      this.id_byte[4] = var9;
      rrIk_1 var10 = (rrIk_1)new rrIk_1("Только с пробелом", false).id_class(() -> {
         this.id_char();
         return ((rrIk_1)this.id_byte[2]).id_class();
      });
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1("Таргет-HUD", true);
      this.id_byte[6] = var11;
      Float var12 = -1.0F;
      this.id_byte[17] = var12;
      this.id_class(
         new celestial.setting.GroupSetting("Цели", new rrIc_1("Выбор", ((celestial.setting.CheckGroup)this.id_byte[0]).id_byte())),
         new celestial.setting.GroupSetting("Обходы", (rrIQ)this.id_byte[1]),
         new celestial.setting.GroupSetting("Визуалы", new rrIc_1("Отображать", (rrIk_1)this.id_byte[6])),
         new celestial.setting.GroupSetting("Удары", (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4]),
         new celestial.setting.GroupSetting("Криты", (rrIk_1)this.id_byte[5])
      );
   }

   

   public Y id_this() {
      return (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0];
   }

   

   public boolean id_class(an_3 var1) {
      this.id_char();
      if (var1 == ((cb_3)id_import.id_class[57]).ra()) {
         return false;
      } else if (var1 == (cb_3)id_import.id_class[57]) {
         return false;
      } else if (var1 instanceof rSY) {
         return false;
      } else {
         return !var1.Pu() ? false : rrff_3.id_class(var1, (celestial.setting.CheckGroup)this.id_byte[0]);
      }
   }

   public boolean id_class(float var1, int var2, boolean var3, boolean var4, int var5) {
      this.id_char();
      if (this.id_new() == null) {
         return false;
      } else if (((rrIk_1)this.id_byte[3]).id_class() && ((cb_3)id_import.id_class[57]).sL()) {
         return false;
      } else if (!((rrIk_1)this.id_byte[4]).id_class()
         || (vm_3)id_import.id_class[73] == null && !C_throws.id_byte().id_return().id_class()) {
         if (!this.id_class(var1, var2)) {
            return false;
         } else {
            return ((rrIk_1)this.id_byte[2]).id_class() ? this.id_class(var3, var4, var5) : true;
         }
      } else {
         return false;
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_char();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)this.id_byte[13] > 0 && ((cb_3)id_import.id_class[57]).BL()) {
            Integer var9 = (Integer)this.id_byte[13] - 1;
            this.id_byte[13] = var9;
         }

         if ((Integer)this.id_byte[12] > 0) {
            Integer var10 = (Integer)this.id_byte[12] - 1;
            this.id_byte[12] = var10;
         }

         this.id_byte(null);
         if (((Ax_1)id_import.id_class[55]).id_finally()) {
            return;
         }

         rjG_2 var3 = (rjG_2)id_import.id_class[64];
         if (var3 instanceof rfo_3 var2) {
            an_3 var11 = var2.id_class();
            if (var11 instanceof iB_2 var4 && this.id_class(var11)) {
               this.id_byte(var4);
      this.id_class((iB_2)this.id_byte[7]);
               if (this.id_goto()) {
                  this.id_break(var4);
               }
            }
         }
      }

      this.id_break(var1);
   }

   public void id_class(iB_2 var1) {
      this.id_char();
      if (var1 != null && rmD_2.id_break && ((String)((rrIQ)this.id_byte[1]).id_byte()).equals("Legit")) {
         if (this.id_throw() && this.id_class(2.0F, 50, false, false, 1)) {
            ((cb_3)id_import.id_class[57]).c_(false);
            Integer var6 = Integer.valueOf(1);
            this.id_byte[12] = var6;
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAS var1) {
      this.id_char();
      if ((Integer)this.id_byte[13] > 0) {
         var1.id_class(true);
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAF var1) {
      this.id_char();
      if ((Integer)this.id_byte[12] > 0) {
         var1.id_class(false);
      }
   }

   public boolean id_class(boolean var1, boolean var2, int var3) {
      this.id_char();
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().t().id_new()) {
         return true;
      } else if (var1 && !this.id_throw()) {
         return true;
      } else {
         if (var2) {
            double var4 = Math.abs((int)((cb_3)id_import.id_class[57]).re() - ((cb_3)id_import.id_class[57]).re());
            if (var4 == 0.43152384527073195) {
               Integer var12 = Integer.valueOf(2);
               this.id_byte[13] = var12;
            } else if (var4 == 0.0548933470320776) {
               Integer var13 = Integer.valueOf(3);
               this.id_byte[13] = var13;
            }
         }

         float var5;
         boolean var14;
         if (var3 > 0) {
            rrvy_1 var6 = new rrvy_1((cb_3)id_import.id_class[57]);
            var6.id_class(var3);
            var14 = !var6.BL() && (Float)var6.id_throws[31] > 0.0F ? true : false;
            var5 = (Float)var6.id_throws[31];
         } else {
            var14 = !((cb_3)id_import.id_class[57]).BL() && (Float)((cb_3)id_import.id_class[57]).id_throws[31] > 0.0F
               ? true
               : false;
            var5 = (Float)((cb_3)id_import.id_class[57]).id_throws[31];
         }

         if (((String)((rrIQ)this.id_byte[1]).id_byte()).equals("Legit")
            && (Boolean)this.id_byte[16]
            && (Float)this.id_byte[17] == var5) {
            rrvy_1 var15 = new rrvy_1((cb_3)id_import.id_class[57]);
            List var7 = var15.id_else();
            if (var7.size() > 1) {
               return false;
            }
         }

         return var14;
      }
   }

   

   public boolean id_class(float var1, int var2) {
      this.id_char();
      if (!rrfo_3.id_class(var1)) {
         return false;
      } else {
         return (float)(System.currentTimeMillis() - (Long)this.id_byte[11]) >= 500.0F - var2 ? true : false;
      }
   }

   

   public boolean id_break(iB_2 var1) {
      this.id_char();
      boolean var2 = ((String)((rrIQ)this.id_byte[1]).id_byte()).equals("Legit");
      if (this.id_throw() && rmD_2.id_break) {
         if (var2) {
            ((cb_3)id_import.id_class[57]).c_(false);
            if ((Integer)this.id_byte[12] == 0) {
               Integer var7 = Integer.valueOf(1);
               this.id_byte[12] = var7;
            }

            return false;
         }

         ((cb_3)id_import.id_class[57]).c_(false);
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
            .id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.STOP_SPRINTING));
         Boolean var8 = true;
         this.id_byte[10] = var8;
      }

      ((Ax_1)id_import.id_class[55]).id_class((cb_3)id_import.id_class[57], var1, true);
      if (var2) {
         int var10002 = (Integer)this.id_byte[14] + 1;
         Integer var9 = var10002;
         this.id_byte[14] = var9;
         if (var10002 >= 2) {
            Integer var10 = Integer.valueOf(0);
            this.id_byte[14] = var10;
            Integer var11 = Integer.valueOf(1);
            this.id_byte[12] = var11;
         }

         var10002 = (Integer)this.id_byte[15] + 1;
         Integer var12 = var10002;
         this.id_byte[15] = var12;
         if (var10002 >= 14) {
            Boolean var13 = true;
            this.id_byte[16] = var13;
            Float var14 = (Float)((cb_3)id_import.id_class[57]).id_throws[31];
            this.id_byte[17] = var14;
         }

         if ((Integer)this.id_byte[15] >= 15) {
            Integer var15 = Integer.valueOf(0);
            this.id_byte[15] = var15;
            Boolean var16 = false;
            this.id_byte[16] = var16;
            Float var17 = -1.0F;
            this.id_byte[17] = var17;
         }
      }

      Long var18 = System.currentTimeMillis();
      this.id_byte[11] = var18;
      return true;
   }

   public void id_break(q_1 var1) {
      this.id_char();
      if (var1.id_class() == this.id_this() && (Boolean)this.id_byte[10]) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
            .id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.START_SPRINTING));
         ((cb_3)id_import.id_class[57]).c_(true);
         Boolean var6 = false;
         this.id_byte[10] = var6;
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_char();
      super.id_throws(var1);
      this.id_byte(null);
      Integer var6 = Integer.valueOf(0);
      this.id_byte[13] = var6;
      Integer var7 = Integer.valueOf(0);
      this.id_byte[12] = var7;
      Float var8 = -1.0F;
      this.id_byte[17] = var8;
   }

   public boolean id_goto() {
      return this.id_class(0.5F, 0, true, true, 0);
   }

   public rrIk_1 id_continue() {
      this.id_char();
      return (rrIk_1)this.id_byte[4];
   }

   public boolean id_else() {
      if (this.id_while().id_class()) {
         return true;
      } else {
         return ((cb_3)id_import.id_class[57]).id_break(rLD.id_private) ? true : false;
      }
   }

   

   

   public iB_2 id_new() {
      this.id_char();
      return (iB_2)this.id_byte[7];
   }

   public rrIk_1 id_return() {
      this.id_char();
      return (rrIk_1)this.id_byte[3];
   }

   public rrIk_1 id_super() {
      this.id_char();
      return (rrIk_1)this.id_byte[2];
   }

   private boolean id_throw() {
      boolean var1 = ((cb_3)id_import.id_class[57]).BL();
      if (this.id_else() && !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private && var1) {
         return false;
      } else {
         float var2 = 0.8F;
         boolean var3 = ((cb_3)id_import.id_class[57]).PZ() && !((cb_3)id_import.id_class[57]).id_catch(var2)
            ? true
            : false;
         boolean var4 = ((gm_3)id_import.id_class[56])
            .id_break(((cb_3)id_import.id_class[57]).rN().id_protected(0.0, 0.1, 0.0));
         double var5 = Math.abs((int)((cb_3)id_import.id_class[57]).re() - ((cb_3)id_import.id_class[57]).re());
         boolean var7 = (var5 == 0.125 || var5 == 0.1875) && !var4 ? true : false;
         boolean var8 = ((cb_3)id_import.id_class[57]).id_throws(iM_2.STANDING) && var1 ? true : false;
         boolean var9 = !var4 && var1 ? true : false;
         return !((cb_3)id_import.id_class[57]).Sy()
               && !((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_goto)
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_package)
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_instanceof)
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_protected)
               && !((cb_3)id_import.id_class[57]).Pm()
               && !((cb_3)id_import.id_class[57]).o_()
               && !((cb_3)id_import.id_class[57]).Y()
               && !((cb_3)id_import.id_class[57]).Pe()
               && !((cb_3)id_import.id_class[57]).Py()
               && !var3
               && !var7
               && !var8
               && !var9
            ? true
            : false;
      }
   }

   public rrIQ id_try() {
      this.id_char();
      return (rrIQ)this.id_byte[1];
   }

   public rrIk_1 id_while() {
      this.id_char();
      return (rrIk_1)this.id_byte[5];
   }

   

   public rrIk_1 id_public() {
      this.id_char();
      return (rrIk_1)this.id_byte[6];
   }

      static {
      Object[] var0 = new Object[]{2, 14, 15};
      id_break = var0;
   }

   public iB_2 id_native() {
      this.id_char();
      if (!((rrIk_1)this.id_byte[6]).id_class()) {
         return null;
      } else {
         iB_2 var1 = this.id_new();
         return var1 == null && (iB_2)this.id_byte[8] != null && System.currentTimeMillis() - (Long)this.id_byte[9] < 1000L
            ? (iB_2)this.id_byte[8]
            : var1;
      }
   }
}
