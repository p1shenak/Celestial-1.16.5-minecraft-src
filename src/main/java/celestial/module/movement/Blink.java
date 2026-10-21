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
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class Blink extends celestial.module.Module {
   private static double[] id_catch = new double[3];
   public Object[] id_break;

   public Blink() {
      super("Blink", "Замедляет пакеты отправляемые\nна сервер", Category.PLAYER);
      this.id_else();
      ArrayDeque var5 = new ArrayDeque();
      this.id_break[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[1] = var6;
      rrIQ var7 = new rrIQ("Режим замедления", "Normal", "Normal", "Delay");
      this.id_break[3] = var7;
      rrIm_1 var8 = (rrIm_1)new rrIm_1("Длительность", 0.5F, 0.1F, 5.0F, 0.1F).id_class(() -> {
         this.id_else();
         return ((String)((rrIQ)this.id_break[3]).id_byte()).equals("Delay");
      });
      this.id_break[4] = var8;
      rrIk_1 var9 = new rrIk_1("Отображать настоящую\nпозицию", true);
      this.id_break[5] = var9;
      this.id_class(
         (rrIQ)this.id_break[3],
         (rrIm_1)this.id_break[4],
         (rrIk_1)this.id_break[5]
      );
   }

   

   

   @celestial.event.EventTarget
   public void id_class(celestial.event.RenderEvent var1) {
      this.id_else();
      if (((rrIk_1)this.id_break[5]).id_class()
         && (rjU_2)this.id_break[2] != null
         && ((Qw_1)id_import.id_class[20]).id_volatile() != VZ.FIRST_PERSON) {
         Ml_1 var2 = var1.id_class();
         rfl_3 var3 = ((cb_3)id_import.id_class[57])
            .a_(((cb_3)id_import.id_class[57]).Pb())
            .id_class((rjU_2)this.id_break[2]);
         double var4 = id_void.id_case();
         double var6 = id_void.id_catch();
         double var8 = id_void.id_private();
         var2.id_class();
         GL11.glEnable(2848);
         RenderSystem.disableDepthTest();
         RenderSystem.disableTexture();
         RenderSystem.disableLighting();
         RenderSystem.depthMask(false);
         RenderSystem.disableAlphaTest();
         RenderSystem.blendFunc(770, 771);
         RenderSystem.enableBlend();
         RenderSystem.lineWidth(1.5F);
         id_strictfp.id_class(1, ju_3.id_this);
         yX_2.id_class(var2, id_strictfp, var3.id_protected(-var4, -var6, -var8), 1.0F, 1.0F, 1.0F, 1.0F);
         id_default.id_break();
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.enableDepthTest();
         RenderSystem.enableAlphaTest();
         GL11.glDisable(2848);
         rrfa_3.id_class();
         var2.id_break();
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((String)((rrIQ)this.id_break[3]).id_byte()).equals("Delay")
         && ((rrfw_3)this.id_break[1]).id_class((Float)((rrIm_1)this.id_break[4]).id_byte() * 1000.0F)) {
         this.id_continue();
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_else();
      rjU_2 var6 = new rjU_2(var1.id_break(), var1.id_extends(), var1.id_catch());
      this.id_break[2] = var6;
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_continue();
   }

   @celestial.event.EventTarget
   public void id_class(rrLZ var1) {
      this.id_else();
      ruS_2 var2 = var1.id_class();
      if (var2 != null
         && !(var2 instanceof rmT_2)
         && !(var2 instanceof rmV_2)
         && !(var2 instanceof rZr_1)
         && !(var2 instanceof rZL)
         && !(var2 instanceof rmJ_2)
         && !(var2 instanceof rLS)
         && !(var2 instanceof rmu_3)
         && !(var2 instanceof rmI_2)
         && !var2.getClass().getSimpleName().startsWith("S")) {
         ((Queue)this.id_break[0]).add(var2);
         var1.id_class(true);
      }
   }

   

   @Override
   public void id_class(boolean var1) {
      this.id_else();
      super.id_class(var1);
      if ((cb_3)id_import.id_class[57] != null) {
         rjU_2 var6 = ((cb_3)id_import.id_class[57]).Ps();
         this.id_break[2] = var6;
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_continue();
   }

   

   private void id_continue() {
      this.id_else();
      ((rrfw_3)this.id_break[1]).id_class();

      while (!((Queue)this.id_break[0]).isEmpty()) {
         ruS_2 var1 = (ruS_2)((Queue)this.id_break[0]).poll();
         if (var1 instanceof rZO var2 && var2.id_byte()) {
            rjU_2 var7 = new rjU_2(var2.id_class(id_catch[0]), var2.id_break(id_catch[1]), var2.id_byte(id_catch[2]));
            this.id_break[2] = var7;
         }

         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(var1);
      }
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   

   

   

   private static void id_public() {
      id_catch = new double[3];
   }
}
