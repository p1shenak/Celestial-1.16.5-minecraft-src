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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Nuker extends celestial.module.Module implements rrnF_2 {
   public Object[] id_break;

   public Nuker() {
      super("Nuker", "Автоматически ломает блоки\nвокруг вас", Category.PLAYER);
      this.id_return();
      rrIk_1 var5 = new rrIk_1("Смотреть на блоки", true);
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Радиус по XZ", 3.0F, 1.0F, 6.0F, 1.0F);
      this.id_break[1] = var6;
      rrIm_1 var7 = new rrIm_1("Радиус по Y", 3.0F, 1.0F, 6.0F, 1.0F);
      this.id_break[2] = var7;
      rrIm_1 var8 = (rrIm_1)new rrIm_1("Задержка", 150.0F, 0.0F, 2000.0F, 10.0F).id_class(() -> {
         this.id_return();
         return !((rrIk_1)this.id_break[0]).id_class() ? true : false;
      });
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Оптимизировать копание", true);
      this.id_break[4] = var9;
      rrTT var10 = new rrTT(this);
      this.id_break[5] = var10;
      ArrayList var11 = new ArrayList();
      this.id_break[6] = var11;
      rrfw_3 var12 = new rrfw_3();
      this.id_break[7] = var12;
      this.id_class(
         (rrIk_1)this.id_break[0],
         (rrIm_1)this.id_break[1],
         (rrIm_1)this.id_break[2],
         (rrIm_1)this.id_break[3],
         (rrIk_1)this.id_break[4]
      );
   }

   

   private List<rrHJ> id_class(Ps_1 var1, rrHM var2, rfl_3 var3, int var4, int var5, boolean var6) {
      ArrayList var7 = new ArrayList();
      roE_2 var8 = ((gm_3)id_import.id_class[56]).id_instanceof();
      rfH_2 var9 = ((cb_3)id_import.id_class[57]).Bs();
      switch (((int[])rrHb_1.id_class[0])[var2.ordinal()]) {
         case 1:
            for (int var15 = -var4; var15 <= var4; var15++) {
               for (int var17 = 0; var17 <= var5; var17++) {
                  for (int var19 = -var4; var19 <= var4; var19++) {
                     rfH_2 var21 = var9.id_break(var15, var17, var19);
      this.id_class(var1, var7, var21, var8, var3, var6);
                  }
               }
            }
            break;
         case 2:
            for (int var14 = -var4; var14 <= var4; var14++) {
               for (int var16 = 2; var16 <= var5 + 1; var16++) {
                  for (int var18 = -var4; var18 <= var4; var18++) {
                     rfH_2 var20 = var9.id_break(var14, var16, var18);
      this.id_class(var1, var7, var20, var8, var3, var6);
                  }
               }
            }
            break;
         case 3:
            for (int var10 = -var4; var10 <= var4; var10++) {
               for (int var11 = -var5; var11 <= -1; var11++) {
                  for (int var12 = -var4; var12 <= var4; var12++) {
                     rfH_2 var13 = var9.id_break(var10, var11, var12);
      this.id_class(var1, var7, var13, var8, var3, var6);
                  }
               }
            }
      }

      return var7;
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLp_1 var1) {
      this.id_return();
      rfH_2 var2 = var1.id_class();
      rrLq_1 var3 = var1.id_case();
      if (var3 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) {
         for (rrHJ var5 : (List<rrHJ>)this.id_break[6]) {
            if (var5.id_break().equals(var2)) {
               ((List)this.id_break[6]).remove(var5);
               break;
            }
         }
      }
   }

   private rrHM id_class(double var1) {
      return (rrHM)rrHM.staticFields6335874c02e73489a27afe393d14ab7b[0];
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrTT)this.id_break[5]).id_final();
         if (((Ax_1)id_import.id_class[55]).id_native() == rRl_1.ADVENTURE) {
            ((List)this.id_break[6]).clear();
            Object var22 = null;
            this.id_break[8] = var22;
            return;
         }

         Ps_1 var2 = C_throws.id_byte().id_throw();
         rrHM var3 = this.id_class((double)((cb_3)id_import.id_class[57]).id_goto().id_protected());
         boolean var4 = ((rrIk_1)this.id_break[0]).id_class();
         int var5 = ((Float)((rrIm_1)this.id_break[1]).id_byte()).intValue();
         int var6 = ((Float)((rrIm_1)this.id_break[2]).id_byte()).intValue();
         boolean var7 = !var4 ? true : false;
         Object var23 = null;
         this.id_break[8] = var23;
         rfl_3 var8 = this.id_public();
         List var9 = this.id_class(var2, var3, var8, var5, var6, var7);
         if (var9.isEmpty()) {
            ((List)this.id_break[6]).clear();
            return;
         }

         for (rrHJ var11 : (List<rrHJ>)var9) {
            if (!((List)this.id_break[6]).contains(var11)) {
               ((List)this.id_break[6]).add(var11);
            }
         }

         ((List)this.id_break[6]).removeIf(var1x -> !var9.contains(var1x) ? true : false);
         if (((List)this.id_break[6]).isEmpty()) {
            return;
         }

         ArrayList var25 = new ArrayList();
         if (var8 != null) {
            var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[0]);
         }

         var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[1]);
         var25.add((rrHX)rrHX.staticFieldsf71f99cac23234318e24f4e142924a57[2]);
         ((List)this.id_break[6]).sort(new rrHO(var25));
         rrHJ var26 = (rrHJ)((List)this.id_break[6]).get(0);
         rfH_2 var12 = var26.id_break();
         xc_3 var13 = var26.id_byte().id_continue();
         this.id_break[8] = var26;
         if (((gm_3)id_import.id_class[56]).id_finally(var12)) {
            return;
         }

         if (var4) {
            Optional<Px_1> var14 = PJ.id_class(var2, var12);
            var14.ifPresent(var1x -> {
               this.id_return();
               rjG_2 var2x = var1x.id_break();
               PX var3x = var1x.id_class();
               if (var2x instanceof rff_3 var4x) {
                  rfH_2 var5x = var4x.id_class();
                  xc_3 var6x = ((gm_3)id_import.id_class[56]).id_byte(var5x);
                  if (!var6x.id_catch()) {
                     ((rrTT)this.id_break[5]).id_class((rrTg_1)() -> var3x, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
                     this.id_break(var5x, var6x);
      this.id_class(var4x);
      this.id_class(var5x, var6x);
                  }
               }
            });
         } else {
            this.id_break(var12, var13);
            boolean var28 = !((Ax_1)id_import.id_class[55]).id_native().id_throws()
                  && var13.id_class((cb_3)id_import.id_class[57], (rYB)((cb_3)id_import.id_class[57]).id_throws[7], var12)
                     < 1.0F
               ? true
               : false;
            if (var28) {
               rff_3 var29 = new rff_3(rjU_2.id_class, rpr_3.UP, var12, false);
      this.id_class(var29);
            } else if (((rrfw_3)this.id_break[7]).id_class(((Float)((rrIm_1)this.id_break[3]).id_byte()).floatValue())) {
               int var16 = var9.size();

               for (int var17 = 0; var17 < var16 && !((List)this.id_break[6]).isEmpty(); var17++) {
                  var26 = (rrHJ)((List)this.id_break[6]).remove(0);
                  rff_3 var15 = new rff_3(rjU_2.id_class, rpr_3.UP, var26.id_break(), false);
      this.id_class(var15);
               }

               ((rrfw_3)this.id_break[7]).id_class();
            }

      this.id_class(var12, var13);
         }
      }
   }

   

   private void id_class(rfH_2 var1, xc_3 var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(rrLH.id_class(var1, var2, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1]));
   }

   private boolean id_class(xd_3 var1, xc_3 var2, rfH_2 var3) {
      if (var1 instanceof kX_2) {
         return true;
      } else if (var2.id_private((gm_3)id_import.id_class[56], var3) < 0.0F) {
         return false;
      } else if (var2.id_finally((gm_3)id_import.id_class[56], var3).id_break()) {
         return false;
      } else {
         return var2.id_class((gm_3)id_import.id_class[56], var3, rLT.LAND) ? false : true;
      }
   }

   private void id_class(rff_3 var1) {
      this.id_return();
      if (((Ax_1)id_import.id_class[55])
         .id_break(var1.id_class(), var1.id_break(), !((rrIk_1)this.id_break[4]).id_class() ? true : false)) {
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND, false);
      }
   }

   private void id_class(Ps_1 var1, List<rrHJ> var2, rfH_2 var3, roE_2 var4, rfl_3 var5, boolean var6) {
      if (var4.id_class(var3)) {
         if (var5 == null || var5.id_break(var3)) {
            xd_3 var7 = rrjc_3.id_protected(var3);
            if (((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).id_byte().isEmpty()
               || ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).id_class(var7)) {
               xc_3 var8 = var7.id_continue();
               if (this.id_class(var7, var8, var3)) {
                  if (!(((cb_3)id_import.id_class[57]).id_break(var3) > ((Ax_1)id_import.id_class[55]).id_byte())) {
                     Optional var9 = PJ.id_class(var1, var3, var2x -> {
                        if (!var6) {
                           return true;
                        } else {
                           return var2x.id_break() == var7 ? true : false;
                        }
                     });
                     if (!var9.isEmpty()) {
                        var2.add(new rrHJ(var7, var8, var3));
                     }
                  }
               }
            }
         }
      }
   }

   public float id_break() {
      return -1.0F;
   }

   private void id_break(rfH_2 var1, xc_3 var2) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(rrLH.id_class(var1, var2, (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]));
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      ((rrTT)this.id_break[5]).id_final();
      ((List)this.id_break[6]).clear();
      Object var6 = null;
      this.id_break[8] = var6;
      ((rrfw_3)this.id_break[7]).id_class();
   }

   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   

   

   

   

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
      }
   }

   

   private rfl_3 id_public() {
      rfl_3 var1 = null;
      if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] && rrjS_2.id_break() != null) {
         var1 = (rfl_3)rrjS_2.id_class[1];
      }

      return var1;
   }

   public float id_private() {
      return -1.0F;
   }
}
