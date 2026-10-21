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

public class Timer extends celestial.module.Module implements rrnZ_2 {
   public static Object[] id_break;
   private static double[] id_protected = new double[4];
   public Object[] id_byte;

   public Timer() {
      super("Timer", "Ускоряет время игры", Category.MOVEMENT);
      this.id_goto();
      rrIm_1 var5 = new rrIm_1("Скорость", 1.8F, 1.1F, 10.0F, 0.1F);
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Умный режим", true);
      this.id_byte[1] = var6;
      rrIm_1 var7 = (rrIm_1)new rrIm_1("Скорость убывания", 1.0F, 0.5F, 3.0F, 0.1F)
         .id_class(() -> ((rrIk_1)this.id_byte[1]).id_class());
      this.id_byte[2] = var7;
      rrIm_1 var8 = (rrIm_1)new rrIm_1("Добавлять в движении", 0.0F, 0.0F, 1.0F, 0.05F)
         .id_class(() -> ((rrIk_1)this.id_byte[1]).id_class());
      this.id_byte[3] = var8;
      this.id_class(true, false);
      this.id_class(
         (rrIm_1)this.id_byte[0],
         (rrIk_1)this.id_byte[1],
         (rrIm_1)this.id_byte[2],
         (rrIm_1)this.id_byte[3]
      );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new OH(rrAy_1.class, var1 -> this.id_class((rrAy_1)var1)));
   }

   

   private static void id_this() {
      id_protected = new double[4];
   }

   public void id_class(rrAy_1 var1) {
      this.id_class(
         ((cb_3)id_import.id_class[57]).N(),
         ((cb_3)id_import.id_class[57]).b(),
         ((cb_3)id_import.id_class[57]).id_for(),
         ((cb_3)id_import.id_class[57]).O(),
         ((cb_3)id_import.id_class[57]).id_static()
      );
   }

   

   

   public void id_class(float var1, float var2, double var3, double var5, double var7) {
      this.id_goto();
      if (this.id_continue()) {
         Float var13 = (Float)this.id_byte[4] - ((Float)((rrIm_1)this.id_byte[2]).id_byte() + 0.4F);
         this.id_byte[4] = var13;
      } else {
         Float var14 = (Float)this.id_byte[4] - (Float)((rrIm_1)this.id_byte[3]).id_byte() / 10.0F;
         this.id_byte[4] = var14;
      }

      Float var15 = (float)rfU_2.id_class(
         ((Float)this.id_byte[4]).floatValue(), id_protected[0], Math.floor(100.0F / ((rqw_3)id_import.id_class[6]).id_class())
      );
      this.id_byte[4] = var15;
      Double var16 = var3;
      this.id_byte[5] = var16;
      Double var17 = var5;
      this.id_byte[6] = var17;
      Double var18 = var7;
      this.id_byte[7] = var18;
      Float var19 = var1;
      this.id_byte[8] = var19;
      Float var20 = var2;
      this.id_byte[9] = var20;
   }

   public void id_class() {
      this.id_byte(false);
   }

   @celestial.event.EventTarget(
      id_class = -200
   )
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rqw_3)id_import.id_class[6]).id_class((Float)((rrIm_1)this.id_byte[0]).id_byte());
         if (!((rrIk_1)this.id_byte[1]).id_class() || ((rqw_3)id_import.id_class[6]).id_class() <= 1.0F) {
            return;
         }

         if ((Float)this.id_byte[4] < 90.0F / (Float)((rrIm_1)this.id_byte[0]).id_byte()) {
            Float var6 = (Float)this.id_byte[4] + (Float)((rrIm_1)this.id_byte[2]).id_byte();
            this.id_byte[4] = var6;
            Float var7 = rfU_2.id_class((Float)this.id_byte[4], 0.0F, 100.0F / (Float)((rrIm_1)this.id_byte[0]).id_byte());
            this.id_byte[4] = var7;
         } else {
            this.aw_();
         }
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      ((rqw_3)id_import.id_class[6]).id_class(1.0F);
   }

   private void id_goto() {
      if (this.id_byte == null) {
         this.id_byte = new Object[10];
         this.id_byte[4] = 0.0F;
         this.id_byte[5] = 0.0;
         this.id_byte[6] = 0.0;
         this.id_byte[7] = 0.0;
         this.id_byte[8] = 0.0F;
         this.id_byte[9] = 0.0F;
      }
   }

   private boolean id_continue() {
      this.id_goto();
      return (Double)this.id_byte[5] == ((cb_3)id_import.id_class[57]).rx()
            && (Double)this.id_byte[6] == ((cb_3)id_import.id_class[57]).re()
            && (Double)this.id_byte[7] == ((cb_3)id_import.id_class[57]).BO()
            && this.id_byte[8] == ((cb_3)id_import.id_class[57]).id_throws[15]
            && this.id_byte[9] == ((cb_3)id_import.id_class[57]).id_throws[16]
         ? true
         : false;
   }

   

   public float id_new() {
      this.id_goto();
      return 1.0F - (Float)this.id_byte[4] / (100.0F / (Float)((rrIm_1)this.id_byte[0]).id_byte());
   }

   

   

      static {
      Object[] var0 = new Object[]{0.0F};
      id_break = var0;
   }

   

   
}
