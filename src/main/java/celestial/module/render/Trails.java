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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Trails extends celestial.module.Module {
   public Object[] id_break;

   public Trails() {
      super("Trails", "Оставляет след за вами", Category.RENDER);
      this.id_this();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(celestial.event.RenderEvent var1) {
      this.id_this();
      boolean var2 = ((Qw_1)id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON ? true : false;
      if (!var2) {
         Ml_1 var3 = var1.id_class();
         float var4 = var1.id_byte();
         double var5 = (Double)((cb_3)id_import.id_class[57]).id_throws[34]
            + (((cb_3)id_import.id_class[57]).rx() - (Double)((cb_3)id_import.id_class[57]).id_throws[34]) * var4;
         double var7 = (Double)((cb_3)id_import.id_class[57]).id_throws[35]
            + (((cb_3)id_import.id_class[57]).re() - (Double)((cb_3)id_import.id_class[57]).id_throws[35]) * var4
            + 0.05;
         double var9 = (Double)((cb_3)id_import.id_class[57]).id_throws[36]
            + (((cb_3)id_import.id_class[57]).BO() - (Double)((cb_3)id_import.id_class[57]).id_throws[36]) * var4;
         ((List)this.id_break[0]).add(new rrqR_2(var5, var7, var9));
         rrqR_2 var13 = null;
         boolean var14 = true;
         int var16 = 0;
         var3.id_class();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.disableAlphaTest();
         RenderSystem.depthMask(false);
         RenderSystem.disableTexture();
         rjV_2 var17 = var3.id_byte().id_class();
         id_strictfp.id_class(7, ju_3.id_this);
         Iterator var18 = ((List)this.id_break[0]).iterator();
         long var19 = rqR_2.id_break();
         float var21 = ((cb_3)id_import.id_class[57]).Bm();
         if (((cb_3)id_import.id_class[57]).x() && !((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
            var21 *= 0.8F;
         }

         float var22 = var21 * 0.01F;
         double var23 = id_void.id_case();
         double var25 = id_void.id_catch();
         double var27 = id_void.id_private();

         while (var18.hasNext()) {
            rrqR_2 var29 = (rrqR_2)var18.next();
            if (var19 - (Long)var29.id_class[4] > 300L) {
               var18.remove();
            } else {
               int var15 = celestial.util.ColorHelper.id_class(
                  (Float)var29.id_class[3], (int)(255 * (255 - Math.round((Float)var29.id_class[3])) / 220.0F)
               );
               float var30 = (float)((Double)var29.id_class[0] - var23);
               float var31 = (float)((Double)var29.id_class[1] - var25);
               float var32 = (float)((Double)var29.id_class[2] - var27);
               float var33 = var14 ? 0.0F : (float)((Double)var13.id_class[0] - var23);
               float var34 = var14 ? 0.0F : (float)((Double)var13.id_class[1] - var25);
               float var35 = var14 ? 0.0F : (float)((Double)var13.id_class[2] - var27);
               if (var14) {
                  id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                  id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
               } else {
                  id_strictfp.id_class(var17, var33, var34, var35).id_class(var16).id_class();
                  id_strictfp.id_class(var17, var33, var34 + var21, var35).id_class(var16).id_class();
               }

               id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
               id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
               if (var14) {
                  id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
                  id_strictfp.id_class(var17, var30, var31 + var22, var32).id_class(var15).id_class();
               } else {
                  id_strictfp.id_class(var17, var33, var34, var35).id_class(var16).id_class();
                  id_strictfp.id_class(var17, var33, var34 + var22, var35).id_class(var16).id_class();
               }

               id_strictfp.id_class(var17, var30, var31 + var22, var32).id_class(var15).id_class();
               id_strictfp.id_class(var17, var30, var31, var32).id_class(var15).id_class();
               double var11 = var31 + var21 - var22;
               if (var14) {
                  id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
                  id_strictfp.id_class(var17, var30, (float)var11, var32).id_class(var15).id_class();
               } else {
                  id_strictfp.id_class(var17, var33, var34 + var21, var35).id_class(var16).id_class();
                  id_strictfp.id_class(var17, var33, var34 + var21 - var22, var35).id_class(var16).id_class();
               }

               id_strictfp.id_class(var17, var30, (float)var11, var32).id_class(var15).id_class();
               id_strictfp.id_class(var17, var30, var31 + var21, var32).id_class(var15).id_class();
               var14 = false;
               var13 = var29;
               var16 = var15;
               Float var40 = rfU_2.id_class((float)(var19 - (Long)var29.id_class[4]) / 250.0F, 0.0F, 1.0F) * 255.0F;
               var29.id_class[3] = var40;
            }
         }

         id_default.id_break();
         RenderSystem.enableAlphaTest();
         RenderSystem.enableCull();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         var3.id_break();
         rrfa_3.id_class();
      }
   }

   

   

   

   

   

   

   

   

   
}
