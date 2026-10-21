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

public class AutoExp extends celestial.module.Module implements rrnF_2 {
   public Object[] id_break;

   public AutoExp() {
      super("Auto Exp", "Автоматически кидает пузырьки\nс опытом под ноги", Category.PLAYER);
      this.id_return();
      rrIF var5 = new rrIF("Кидать на", KeyBind.NONE);
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Задержка", 0.0F, 0.0F, 100.0F, 10.0F);
      this.id_break[1] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_break[2] = var7;
      rrTT var8 = new rrTT(this);
      this.id_break[3] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.id_break[4] = var9;
      this.id_break[6] = Integer.valueOf(-1);
      this.id_break[7] = Integer.valueOf(-1);
      this.id_class(
         (rrIF)this.id_break[0],
         (rrIm_1)this.id_break[1]
      );
   }

   

   

   @celestial.event.EventTarget(
      id_class = -100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_break[2])
            .id_class(
               (Integer)this.id_break[7] == -1 && rqR_2.id_break() - (Long)this.id_break[5] > 200L
                  ? true
                  : false
            );
         if (((rrIF)this.id_break[0]).id_break()) {
            int var2 = rrfY_2.id_class(rdy_3.xe, false, true);
            if (var2 == -1) {
               this.id_new();
               return;
            }

            rrTg_1 var3 = () -> ((cb_3)id_import.id_class[57]).id_goto().id_case(90.0F);
            ((rrTT)this.id_break[3]).id_class(var3, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
            if (!((cb_3)id_import.id_class[57]).z().id_break(var3.getNeedRotation(), 3.0F)) {
               return;
            }

            if (((rrfw_3)this.id_break[4]).id_class(((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue())) {
               int var4 = this.id_class(var2);
               if (var4 > 8 && (Integer)this.id_break[7] == -1) {
                  this.id_break[7] = var4;
               }

               ((rrfw_3)this.id_break[4]).id_class();
            }
         } else {
            this.id_new();
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_return();
      ((rrfP_2)this.id_break[2]).id_class(var1);
   }

   private int id_class(int var1) {
      this.id_return();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         this.id_break[6] = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected;
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((Ax_1)id_import.id_class[55]).id_break = (Integer)this.id_break[6];
         return var1;
      } else if (var1 >= 9 && var1 <= 36 && rqR_2.id_break() - (Long)this.id_break[5] > 300L) {
         ((rrfP_2)this.id_break[2]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         this.id_break[5] = rqR_2.id_break();
         return var1;
      } else {
         return -1;
      }
   }

   

   public float id_break() {
      return -1.0F;
   }

   

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 573967953;
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   

   

   

   public void id_new() {
      this.id_return();
      ((rrTT)this.id_break[3]).id_final();
      ((rrTT)this.id_break[3]).id_finally();
      ((rrfw_3)this.id_break[4]).id_class();
      if ((Integer)this.id_break[7] != -1) {
         ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_break[7]);
         this.id_break[5] = rqR_2.id_break();
         this.id_break[7] = Integer.valueOf(-1);
      }

      if ((Integer)this.id_break[6] != -1) {
         rrfo_3.id_class((Integer)this.id_break[6]);
         this.id_break[6] = Integer.valueOf(-1);
      }
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[8];
         this.id_break[5] = 0L;
         this.id_break[6] = 0;
         this.id_break[7] = 0;
      }
   }

   

   

   public float id_private() {
      return -1.0F;
   }

   public rrTq_1 aB_() {
      return new rrTq_1(rjG_2.id_catch(), ((cb_3)id_import.id_class[57]).id_goto());
   }
}
