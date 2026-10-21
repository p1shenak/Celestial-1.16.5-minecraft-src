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

public class AutoExplosion extends celestial.module.Module implements rrnF_2 {
   private static long[] id_byte;
   public Object[] id_break;

   private rSa_1 id_byte(rfH_2 var1) {
      return var1 == null
         ? null
         : this.id_class(var1.b_(), var1.c_(), var1.d_()).stream().filter(var0 -> var0 instanceof rSa_1).map(var0 -> (rSa_1)var0).findFirst().orElse(null);
   }

   public AutoExplosion() {
      super("Auto Explosion", "Автоматически взрывает кристалл\nпосле установки обсидиана", Category.COMBAT);
      this.id_return();
      rrIk_1 var5 = new rrIk_1("Смотреть на кристалл", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = (rrIk_1)new rrIk_1("Коррекция движения", true).id_class(() -> ((rrIk_1)this.id_break[0]).id_class());
      this.id_break[1] = var6;
      rrTT var7 = new rrTT(this);
      this.id_break[8] = var7;
      rrnn_3 var8 = new rrnn_3(this);
      this.id_break[9] = var8;
      this.id_class(
         (rrIk_1)this.id_break[0],
         (rrIk_1)this.id_break[1]
      );
   }

   

   private boolean id_this() {
      rLY var1 = ((cb_3)id_import.id_class[57]).id_byte(rLD.id_continue);
      rLY var2 = ((cb_3)id_import.id_class[57]).id_byte(rLD.id_throws);
      return var1 == null || var2 != null && var2.id_byte() > var1.id_byte() ? true : false;
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAE var1) {
      this.id_return();
      rfH_2 var6 = var1.id_break();
      this.id_break[3] = var6;
   }

   private void id_class(rvG_2 var1) {
      this.id_return();
      int[] var2 = var1.id_break();
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var2[var4];
         if ((rSa_1)this.id_break[2] != null && ((rSa_1)this.id_break[2]).V() == var5) {
            this.id_new();
            break;
         }
      }
   }

   private List<an_3> id_class(double var1, double var3, double var5) {
      return ((gm_3)id_import.id_class[56])
         .id_class((an_3)null, new rfl_3(var1, var3, var5, var1 + 1.0, var3 + 2.0, var5 + 1.0));
   }

   @celestial.event.EventTarget
   public void id_class(rrAf_1 var1) {
      this.id_return();
      rjG_2 var3 = (rjG_2)id_import.id_class[64];
      if (var3 instanceof rff_3 var2 && !var1.id_byte().id_class()) {
         rfH_2 var8 = var2.id_class();
         this.id_break[3] = var8;
      }
   }

   private void id_class(rSa_1 var1) {
      this.id_return();
      if (var1 != null) {
         this.id_break[2] = var1;
         if (((rrIk_1)this.id_break[0]).id_class()) {
            ((rrTT)this.id_break[8]).id_class(var1, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         }

         this.id_break(var1);
      }
   }

   @celestial.event.EventTarget(
      id_class = 100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         rfH_2 var2 = (rfH_2)this.id_break[4];
         if (var2 != null) {
            rSa_1 var3 = this.id_byte(var2);
            if (((gm_3)id_import.id_class[56]).id_finally(var2) && var3 == null) {
               this.id_new();
               return;
            }

            if (((cb_3)id_import.id_class[57]).id_break(var2.b_(), var2.c_(), var2.d_()) > 6.0F) {
               this.id_new();
               return;
            }

            if (!this.id_this()) {
               this.id_new();
               return;
            }

            if (var3 == null) {
               int var10002 = (Integer)this.id_break[7] + 1;
               this.id_break[7] = var10002;
               if (var10002 > 10) {
                  this.id_new();
                  this.id_break[7] = Integer.valueOf(0);
                  return;
               }

               ((rrTT)this.id_break[8]).id_class(var2, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
            } else {
               this.id_break[7] = Integer.valueOf(0);
               this.id_break[5] = false;
            }

            if ((Boolean)this.id_break[5]) {
               ryZ_2 var4 = this.id_continue();
               if (var4 == ryZ_2.SUCCESS) {
                  this.id_break[5] = false;
               }
            }

      this.id_class(var3);
         } else {
            this.id_new();
         }

         if ((rfH_2)this.id_break[3] != null) {
      this.id_class((rfH_2)this.id_break[3]);
            Object var14 = null;
            this.id_break[3] = var14;
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvG_2 var3) {
      this.id_class(var3);
      }
   }

   private boolean id_class(xd_3 var1) {
      return !(var1 instanceof kY_2) && var1 != xd_3.id_break(25) ? false : true;
   }

   @celestial.event.EventTarget
   public void id_class(rrAI var1) {
      this.id_return();
      rdn_3 var2 = var1.id_protected();
      rfH_2 var3 = var1.id_class();
      xd_3 var4 = var1.id_byte();
      ryZ_2 var5 = var1.id_break();
      if (var5.id_break()) {
         if (this.id_class(var4)) {
            if (var2.id_break() == rdy_3.kM) {
               this.id_break[4] = var3;
            }
         }
      }
   }

   private void id_class(rfH_2 var1) {
      this.id_return();
      xd_3 var2 = rrjc_3.id_protected(var1);
      if (this.id_class(var2)) {
         if (rrfY_2.id_break(rdy_3.kM) != -1) {
            if (this.id_break(var1)) {
               this.id_break[4] = var1;
               this.id_break[5] = true;
            }
         }
      }
   }

   

   

   private boolean id_break(rfH_2 var1) {
      rfH_2 var2 = var1.id_final();
      if (!((gm_3)id_import.id_class[56]).id_finally(var2)) {
         return false;
      } else {
         double var3 = var2.b_();
         double var5 = var2.c_();
         double var7 = var2.d_();
         List var9 = this.id_class(var3, var5, var7);
         return var9.isEmpty();
      }
   }

   private void id_break(rSa_1 var1) {
      this.id_return();
      if (this.id_super()) {
         an_3 var2 = Ph_1.id_class(
            (rSa_1)this.id_break[2],
            ((cb_3)id_import.id_class[57]).id_new(1.0F),
            ((rrTT)this.id_break[8]).id_throws(),
            3.0F,
            false
         );
         if (((rrIk_1)this.id_break[0]).id_class() && var2 != (rSa_1)this.id_break[2]) {
            return;
         }

         ((Ax_1)id_import.id_class[55]).id_class((cb_3)id_import.id_class[57], var1, true);
         this.id_break[6] = System.currentTimeMillis();
      }
   }

   public float id_break() {
      return -1.0F;
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   public rrTp_1 id_catch() {
      this.id_return();
      return ((rrIk_1)this.id_break[1]).id_class()
         ? (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0]
         : (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   

   private ryZ_2 id_continue() {
      this.id_return();
      rfH_2 var1 = (rfH_2)this.id_break[4];
      if (var1 != null) {
         rjG_2 var3 = (rjG_2)id_import.id_class[64];
         if (var3 instanceof rff_3 var2) {
            if (!var2.id_class().equals(var1)) {
               return ryZ_2.FAIL;
            }

            int var7 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected;
            int var4 = rrfY_2.id_break(rdy_3.kM);
            if (var4 >= 0) {
               ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var4;
            }

            rpm_3 var5 = var4 == -3 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
            ryZ_2 var6 = ((Ax_1)id_import.id_class[55])
               .id_class((cb_3)id_import.id_class[57], (gm_3)id_import.id_class[56], var5, var2);
            if (var6 == ryZ_2.SUCCESS) {
               ((cb_3)id_import.id_class[57]).id_class(var5);
            }

            ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var7;
            return var6;
         }
      }

      return ryZ_2.FAIL;
   }

   

   

   public void id_new() {
      this.id_return();
      Object var5 = null;
      this.id_break[2] = var5;
      Object var6 = null;
      this.id_break[4] = var6;
      this.id_break[5] = false;
      this.id_break[7] = Integer.valueOf(0);
      ((rrTT)this.id_break[8]).id_final();
      ((rrTT)this.id_break[8]).id_finally();
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[10];
         this.id_break[5] = false;
         this.id_break[6] = 0L;
         this.id_break[7] = 0;
      }
   }

   private boolean id_super() {
      this.id_return();
      rSa_1 var1 = (rSa_1)this.id_break[2];
      if (var1 == null) {
         return false;
      } else {
         return (float)(System.currentTimeMillis() - (Long)this.id_break[6]) >= 500.0F && rrfo_3.id_protected() ? true : false;
      }
   }

   

   

   

   private static void id_public() {
      id_byte = new long[1];
   }

   public float id_private() {
      return -1.0F;
   }

   public rrTf_1 aL_() {
      this.id_return();
      return (rrTf_1)this.id_break[9];
   }
}
