package celestial.module.render;

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
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ShulkerPreview extends celestial.module.Module {
   private static double[] id_catch = new double[1];
   public Object[] id_break;
   public static Object[] id_byte;

   public ShulkerPreview() {
      super("Shulker Preview", "Отображает содержимое шалкера\nпри наведении на него", Category.RENDER);
      this.id_while();
      rrIF var5 = new rrIF("Открыть меню", KeyBind.get(3));
      this.id_break[1] = var5;
      this.id_class((rrIF)this.id_break[1]);
   }

   

   private static void id_this() {
      id_catch = new double[1];
   }

   public static void id_class(Ml_1 var0, List<rdn_3> var1, float var2, float var3, float[] var4) {
      id_class(var0, var1, var2, var3, var4, 1.0F);
   }

   private void id_class(List<rdn_3> var1, vm_3 var2, rdn_3 var3, float[] var4) {
      this.id_while();
      Runnable var9 = () -> {
         try {
            rJr_1 var4x = (rJr_1)((cb_3)id_import.id_class[57]).id_implements[4];
            rrTN var5 = new rrTN(var1);
            ((cb_3)id_import.id_class[57]).id_implements[4] = var5;
            id_import.id_break(new rrTW(var2, var4x, var5, var3.id_continue(), var4));
         } catch (Exception var11) {
            var11.printStackTrace();
            System.out.println("Failed to open Shulker Preview screen: " + var11.getMessage());
         }
      };
      this.id_break[0] = var9;
   }

   private static void id_class(List<rdn_3> var0) {
      int var1 = Math.min(var0.size(), 27);
      if (var1 != 0) {
         QY var2 = QY.id_instanceof();
         Hz_1 var3 = var2.id_float();
         float var4 = var3.id_break;
         var3.id_break = 300.0F;
         byte var5 = 7;
         byte var6 = 7;

         for (int var7 = 0; var7 < var1; var7++) {
            rdn_3 var8 = (rdn_3)var0.get(var7);
            if (var8 != null && !var8.id_class()) {
               int var9 = var7 / 9;
               int var10 = var7 % 9;
               int var11 = var5 + var10 * 18 + 1;
               int var12 = var6 + var9 * 18 + 1;
               var3.id_class(var8, var11, var12);
               var3.id_class((cm_3)var2.id_class[15], var8, var11, var12, null);
            }
         }

         var3.id_break = var4;
      }
   }

   public static void id_class(Ml_1 var0, List<? extends rrTu_1> var1) {
      if (!var1.isEmpty()) {
         QY var2 = QY.id_instanceof();
         Hz_1 var3 = var2.id_float();
         var2.A().id_class(fJ_2.id_class);
         var2.A().id_break(fJ_2.id_class).id_class(false, false);
         RenderSystem.enableRescaleNormal();
         RenderSystem.enableAlphaTest();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         Hd_1 var4 = var2.id_interface().id_break();
         Ml_1 var5 = (Ml_1)id_byte[10];
         int var6 = var1.size();
         if (((boolean[])id_byte[12]).length < var6) {
            boolean[] var23 = new boolean[var6];
            id_byte[12] = var23;
            boolean[] var24 = new boolean[var6];
            id_byte[13] = var24;
         }

         boolean var7 = false;
         boolean var8 = false;
         boolean var9 = false;

         for (int var10 = 0; var10 < var6; var10++) {
            rrTu_1 var11 = (rrTu_1)var1.get(var10);
            float var12 = 250.0F + var10 * 25.0F;
            var0.id_class();
            var0.id_class(var11.id_private(), var11.id_break(), var12);
            if (var11.id_class() != 1.0F) {
               var0.id_class(var11.id_class(), var11.id_class(), 1.0F);
            }

            id_class(var0, var11.id_throws(), true);
            if (var11.id_byte() != null) {
               ((cm_3)var2.id_class[15]).id_class(var11.id_byte().id_catch(), 8.0F, 6.0F, 4210752, false, var0.id_byte().id_class(), (Hx_1)var4, true, 0, 15728880);
               var9 = true;
            }

            var0.id_break();
            IJ[] var13 = var11.id_catch();
            int var14 = Math.min(var11.id_protected().size(), 27);
            boolean var15 = false;
            boolean var16 = false;

            for (int var17 = 0; var17 < var14; var17++) {
               IJ var18 = var13[var17];
               if (var18 != null) {
                  if (var18.id_byte()) {
                     var15 = true;
                  } else {
                     var16 = true;
                  }

                  if (var15 && var16) {
                     break;
                  }
               }
            }

            ((boolean[])id_byte[12])[var10] = var15;
            ((boolean[])id_byte[13])[var10] = var16;
            var7 |= var15;
            var8 |= var16;
         }

         if (var9) {
            var4.id_break();
         }

         if (var7) {
            for (int var25 = 0; var25 < var6; var25++) {
               if (((boolean[])id_byte[12])[var25]) {
                  id_class(var3, var4, var5, (rrTu_1)var1.get(var25), true, 250.0F + var25 * 25.0F);
               }
            }

            var4.id_break();
         }

         if (var8) {
            HF.id_byte();

            for (int var26 = 0; var26 < var6; var26++) {
               if (((boolean[])id_byte[13])[var26]) {
                  id_class(var3, var4, var5, (rrTu_1)var1.get(var26), false, 250.0F + var26 * 25.0F);
               }
            }

            var4.id_break();
            HF.id_protected();
         }

         boolean var27 = false;

         for (int var28 = 0; var28 < var6; var28++) {
            if (id_class((cm_3)var2.id_class[15], var4, (rrTu_1)var1.get(var28), 250.0F + var28 * 25.0F)) {
               var27 = true;
            }
         }

         if (var27) {
            var4.id_break();
         }

         HF.id_break();
         RenderSystem.disableLighting();
         RenderSystem.disableRescaleNormal();
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.depthFunc(515);
         RenderSystem.enableDepthTest();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         HF.id_protected();
      }
   }

   public static void id_class(Ml_1 var0, List<rdn_3> var1, float var2, float var3, float[] var4, float var5) {
      var0.id_class();
      var0.id_class(var2, var3, id_catch[0]);
      if (var5 != 1.0F) {
         var0.id_class(var5, var5, 1.0F);
      }

      id_class(var0, var4, false);
      var0.id_break();
      RenderSystem.pushMatrix();
      RenderSystem.translatef(var2, var3, 32.0F);
      if (var5 != 1.0F) {
         RenderSystem.scalef(var5, var5, 1.0F);
      }

      id_class(var1);
      RenderSystem.popMatrix();
   }

   

   

   public static float[] id_class(rxL_2 var0) {
      return (float[])((Map)id_byte[14]).getOrDefault(var0, (float[])((Map)id_byte[14]).get(null));
   }

   @celestial.event.EventTarget
   public void id_class(j_1 var1) {
      this.id_while();
      Object var6 = null;
      this.id_break[0] = var6;
   }

   private static void id_class(Hz_1 var0, Hx_1 var1, Ml_1 var2, rrTu_1 var3, boolean var4, float var5) {
      List var6 = var3.id_protected();
      IJ[] var7 = var3.id_catch();
      int var8 = Math.min(var6.size(), 27);
      float var9 = var3.id_class();
      float var10 = var3.id_private();
      float var11 = var3.id_break();

      for (int var12 = 0; var12 < var8; var12++) {
         rdn_3 var13 = (rdn_3)var6.get(var12);
         if (var13 != null && !var13.id_class()) {
            IJ var14 = var7[var12];
            if (var14 != null && var14.id_byte() == var4) {
               int var15 = var12 / 9;
               int var16 = var12 % 9;
               float var17 = var10 + (7 + var16 * 18 + 1) * var9;
               float var18 = var11 + (17 + var15 * 18 + 1) * var9;
               var2.id_class();
               var2.id_class(var17 + 8.0F * var9, var18 + 8.0F * var9, var5 + 10.0F);
               var2.id_class(16.0F * var9, -16.0F * var9, 16.0F * var9);
               var0.id_class(var13, IQ.GUI, false, var2, var1, 15728880, fZ_2.id_class, var14);
               var2.id_break();
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnS_2 var1) {
      vm_3 var2 = var1.id_break();
      if (var2 instanceof Fu_1 var3) {
         rJY var4 = var3.id_int();
         vZ_2 var5 = var3.id_instanceof();
         if (var4 == null || var5 == null) {
            return;
         }

         Ml_1 var6 = var1.id_throws();
         rdn_3 var7 = var4.id_class();
         if (var7.id_break() instanceof rxJ_2 var8 && var8.id_catch() instanceof Wp_1 var9) {
            rxL_2 var16 = var9.id_break();
            List var11 = rrjm_3.id_class(var7);
            float[] var12 = this.id_break(var16);
            if (!var11.isEmpty()) {
               int var13 = (int)var5.id_class();
               int var14 = (int)(var5.id_break() + var5.id_protected() + 2.0F);
      this.id_class(var2, var11, var13, var14, var12, var6);
      this.id_class(var11, var2, var7, var12);
               var2.id_this = 70;
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLs_1 var1) {
      this.id_while();
      if (var1.id_protected() == ((rrIF)this.id_break[1]).id_finally().id_byte() && (Runnable)this.id_break[0] != null) {
         var1.id_class(true);
         ((Runnable)this.id_break[0]).run();
      }
   }

   public void id_class(vm_3 var1, List<rdn_3> var2, int var3, int var4, float[] var5, Ml_1 var6) {
      if (var1 != null) {
         var1.id_class(200);
      }

      id_class(var6, var2, var3, var4, var5);
      if (var1 != null) {
         var1.id_class(false);
      }
   }

   private static void id_class(Ml_1 var0, float[] var1, boolean var2) {
      QY var3 = QY.id_instanceof();
      var3.A().id_class(var2 ? (rqO_2)id_byte[0] : (rqO_2)id_byte[1]);
      RenderSystem.color4f(var1[0], var1[1], var1[2], 1.0F);
      byte var4 = (byte)(var2 ? 78 : 68);
      ch_3.id_class(var0, 0, 0, 0.0F, 0.0F, 176, var4, 256, 256);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private static boolean id_class(cm_3 var0, Hx_1 var1, rrTu_1 var2, float var3) {
      List var4 = var2.id_protected();
      int var5 = Math.min(var4.size(), 27);
      float var6 = var2.id_class();
      Ml_1 var7 = (Ml_1)id_byte[11];
      var7.id_class();
      var7.id_class(var2.id_private(), var2.id_break(), var3 + 20.0F);
      if (var6 != 1.0F) {
         var7.id_class(var6, var6, 1.0F);
      }

      boolean var8 = false;

      for (int var9 = 0; var9 < var5; var9++) {
         rdn_3 var10 = (rdn_3)var4.get(var9);
         if (var10 != null && !var10.id_class() && var10.id_char() >= 2) {
            int var11 = var9 / 9;
            int var12 = var9 % 9;
            String var13 = String.valueOf(var10.id_char());
            float var14 = 7 + var12 * 18 + 1;
            float var15 = 17 + var11 * 18 + 1;
            float var16 = var14 + 19.0F - 2.0F - var0.id_break(var13);
            float var17 = var15 + 6.0F + 3.0F;
            var0.id_class(var13, var16, var17, 16777215, true, var7.id_byte().id_class(), (Hx_1)var1, false, 0, 15728880);
            var8 = true;
         }
      }

      var7.id_break();
      return var8;
   }

   

   private float[] id_break(rxL_2 var1) {
      return id_class(var1);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_while();
      super.id_throws(var1);
      Object var6 = null;
      this.id_break[0] = var6;
   }

   

   

      static {
      Object[] var0 = new Object[]{
         new rqO_2("celestial/images/shulker_preview/container_with_title.png"),
         new rqO_2("celestial/images/shulker_preview/container.png"),
         18,
         9,
         3,
         10,
         176,
         78,
         68,
         0.0F,
         new Ml_1(),
         new Ml_1(),
         new boolean[0],
         new boolean[0],
         new rrTQ()
      };
      id_byte = var0;
   }

   

   

   

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   
}
