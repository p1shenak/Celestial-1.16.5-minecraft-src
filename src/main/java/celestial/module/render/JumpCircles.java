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
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class JumpCircles extends celestial.module.Module {
   public Object[] id_break;

   public JumpCircles() {
      super("Jump Circles", "Добавляет анимацию прыжка под\nвами", Category.RENDER);
      this.id_continue();
      rrIm_1 var5 = (rrIm_1)this.id_class(new rrIm_1("Радиус", 1.5F, 1.0F, 2.0F, 0.1F));
      this.id_break[0] = var5;
      rrIm_1 var6 = (rrIm_1)this.id_class(new rrIm_1("Радиус свечения", 1.0F, 1.0F, 2.0F, 0.1F));
      this.id_break[1] = var6;
      rrIm_1 var7 = (rrIm_1)this.id_class(new rrIm_1("Скорость", 0.3F, 0.3F, 1.0F, 0.1F));
      this.id_break[2] = var7;
      rrvH var8 = new rrvH(20);
      this.id_break[3] = var8;
   }

   

   

   private void id_class(Ml_1 var1, rrqT_2 var2, float var3, float var4, float var5) {
      int var7 = celestial.util.ColorHelper.id_class(0.0F);
      double var8 = (Double)var2.id_class[0] - id_void.id_case();
      double var10 = (Double)var2.id_class[1] - id_void.id_catch();
      double var12 = (Double)var2.id_class[2] - id_void.id_private();
      if (var4 <= 0.0F) {
         var4 = 0.0F;
      }

      float var14 = rfU_2.id_throws;

      for (float var25 = 0.0F; var25 < 360.0F; var25 += 8.0F) {
         double var21 = Math.sin((var25 - 8.0F) * var14);
         double var23 = Math.cos((var25 - 8.0F) * var14);
         double var17 = Math.sin(var25 * var14);
         double var19 = Math.cos(var25 * var14);
         double var15 = var3 - var3 / 100.0F * var5;
         int var6 = celestial.util.ColorHelper.id_class(var25);
      this.id_class(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
         var15 = var3 + var3 / 100.0F * var5;
      this.id_class(var1, var3, (int)var4, var6, var7, var15, var17, var19, var21, var23, var8, var10, var12);
      this.id_class(var1, var3, (int)var4, var6, var7, var3 + (var3 - var15) / 8.0, var17, var19, var21, var23, var8, var10, var12);
         var7 = var6;
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(celestial.event.RenderEvent var1) {
      this.id_continue();
      if (!((List)this.id_break[3]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         RenderSystem.depthMask(false);
         RenderSystem.disableTexture();
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(770, 1);
         RenderSystem.enableSmoothShadeModel();
         GL11.glDisable(2884);
         id_strictfp.id_class(7, ju_3.id_this);
         float var3 = (Float)((rrIm_1)this.id_break[0]).id_byte();
         float var4 = (Float)((rrIm_1)this.id_break[1]).id_byte();
         short var5 = 255;
         Iterator var6 = ((List)this.id_break[3]).iterator();

         while (var6.hasNext()) {
            rrqT_2 var7 = (rrqT_2)var6.next();
            if (var7.id_class()) {
               var6.remove();
            } else {
               Float var13 = rfU_2.id_class(
                  rrQo_1.id_class(
                     (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0],
                     ((Float)var7.id_class[3]).floatValue(),
                     var3,
                     (Float)((rrIm_1)this.id_break[2]).id_byte() / 10.0F
                  ),
                  0.0F,
                  var3
               );
               var7.id_class[3] = var13;
               float var8 = 0.0F;
               if ((Float)var7.id_class[3] > (Float)var7.id_class[3] / 6.0F) {
                  var8 = (Float)var7.id_class[3] / 6.0F;
               }

      this.id_class(var2, var7, (Float)var7.id_class[3], var5 - var8 * 2000.0F / var3, var4 * 20.0F);
            }
         }

         id_default.id_break();
         GL11.glEnable(2884);
         RenderSystem.disableSmoothShadeModel();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableTexture();
         RenderSystem.depthMask(true);
      }
   }

   private void id_class(
      Ml_1 var1,
      float var2,
      int var3,
      int var4,
      int var5,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20
   ) {
      rjV_2 var22 = var1.id_byte().id_class();
      id_strictfp.id_class(var22, (float)(var16 + var12 * var6), (float)var18, (float)(var20 + var14 * var6)).id_class(var5, 0).id_class();
      id_strictfp.id_class(var22, (float)(var16 + var12 * var2), (float)var18, (float)(var20 + var14 * var2)).id_class(var5, var3).id_class();
      id_strictfp.id_class(var22, (float)(var16 + var8 * var2), (float)var18, (float)(var20 + var10 * var2)).id_class(var4, var3).id_class();
      id_strictfp.id_class(var22, (float)(var16 + var8 * var6), (float)var18, (float)(var20 + var10 * var6)).id_class(var4, 0).id_class();
   }

   @celestial.event.EventTarget
   public void id_class(rrAS var1) {
      this.id_continue();
      rfl_3 var2 = rrjc_3.id_break(((cb_3)id_import.id_class[57]).Bs());
      double var3 = ((cb_3)id_import.id_class[57]).re();
      var3 = Math.min(var3 + var2.id_throws + 0.05, var3 + 0.15);
      ((List)this.id_break[3])
         .add(new rrqT_2(this, ((cb_3)id_import.id_class[57]).rx(), var3, ((cb_3)id_import.id_class[57]).BO()));
   }

   

   

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   

   

   

   

   
}
