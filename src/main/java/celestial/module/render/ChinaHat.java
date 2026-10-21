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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class ChinaHat extends celestial.module.Module {
   public static Object[] id_break;
   private static double[] id_implements = new double[2];

   public ChinaHat() {
      super("China Hat", "Китайская шляпка над головой", Category.RENDER);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrAV var1) {
      if (var1.id_class() instanceof wh_3 var2) {
         Ml_1 var19 = var1.id_break();
         an_3 var4 = var1.id_protected();
         rfl_3 var5 = var4.rN();
         double var6 = var5.id_protected - var5.id_class;
         float var8 = this.id_class(var4);
         var19.id_class();
         var2.id_class.id_class(var19);
         rrxL_2.id_break();
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.lineWidth(2.0F);
         GL11.glEnable(2848);
         GL11.glHint(3154, 4354);
         var19.id_class(id_implements[0], var8, id_implements[1]);
         var19.id_class(rje_3.id_throws.id_byte(180.0F));
         var19.id_class(rje_3.id_protected.id_byte(90.0F));
         rjV_2 var9 = var19.id_byte().id_class();
         ((lD_2)rrfD_2.id_class[7]).id_class(5, ju_3.id_this);
         ((lD_2)rrfD_2.id_class[8]).id_class(2, ju_3.id_this);
         int var17 = celestial.util.ColorHelper.id_class(0.0F);

         for (int var18 = 0; var18 <= 180; var18++) {
            float var10 = var18 * (Float)id_break[0];
            int var11 = var18 * 4;
            float var12 = (float)(rfU_2.id_class(var10) * var6);
            float var13 = 0.0F;
            float var14 = (float)(rfU_2.id_break(var10) * var6);
            int var15 = celestial.util.ColorHelper.id_class((float)var11, 100);
            ((lD_2)rrfD_2.id_class[7]).id_class(var9, var12, var13, var14).id_class(var15).id_class();
            ((lD_2)rrfD_2.id_class[7]).id_class(var9, 0.0F, 0.3F, 0.0F).id_class(var17).id_class();
            int var16 = celestial.util.ColorHelper.id_class((float)var11, 255);
            ((lD_2)rrfD_2.id_class[8]).id_class(var9, var12, var13, var14).id_class(var16).id_class();
         }

         id_default.id_class((lD_2)rrfD_2.id_class[7]);
         RenderSystem.depthMask(false);
         id_default.id_class((lD_2)rrfD_2.id_class[8]);
         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.disableSmoothShadeModel();
         GL11.glDisable(2848);
         var19.id_break();
      }
   }

   private float id_class(an_3 var1) {
      float var2 = -0.38F;
      if (var1 instanceof iB_2 var3 && var3.id_class(rXQ.HEAD).id_break() instanceof rxS_2) {
         var2 -= 0.11F;
      }

      if (((Qw_1)id_import.id_class[20]).id_break(rhQ_2.HAT)) {
         var2 -= 0.025F;
      }

      return var2;
   }

   

   

   

   

   private static void id_else() {
      id_implements = new double[2];
   }

   

   

      static {
      Object[] var0 = new Object[]{-1.0842022E-19F};
      id_break = var0;
   }

   
}
