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

public class Crosshair extends celestial.module.Module {
   public Object[] id_break;

   public Crosshair() {
      super("Crosshair", "Позволяет кастомизировать ваш\nприцел", Category.RENDER);
      this.id_new();
      rrIz_1 var5 = new rrIz_1("Цвет прицела", -1).id_break();
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Подсветка энтити", false);
      this.id_break[1] = var6;
      rrIz_1 var7 = (rrIz_1)new rrIz_1("Цвет подсветки", -65536).id_break().id_class(() -> {
         this.id_new();
         return ((rrIk_1)this.id_break[1]).id_class();
      });
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Учитывать кулдаун", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Точка по середине", false);
      this.id_break[4] = var9;
      rrIm_1 var10 = new rrIm_1("Радиус", 0.0F, 0.0F, 6.0F, 0.5F);
      this.id_break[5] = var10;
      rrIm_1 var11 = new rrIm_1("Длина", 4.0F, 0.5F, 6.0F, 0.5F);
      this.id_break[6] = var11;
      this.id_class(
         (rrIz_1)this.id_break[0],
         (rrIk_1)this.id_break[1],
         (rrIz_1)this.id_break[2],
         (rrIk_1)this.id_break[4],
         (rrIk_1)this.id_break[3],
         (rrIm_1)this.id_break[5],
         (rrIm_1)this.id_break[6]
      );
   }

   

   

   @celestial.event.EventTarget(
      id_class = -100
   )
   public void id_class(rrnB_2 var1) {
      this.id_new();
      Ml_1 var2 = var1.id_class();
      if (!((Qw_1)id_import.id_class[20]).R
         && (
            ((Qw_1)id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON
               || ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()
         )) {
         float var3 = id_const.id_volatile() / 2.0F;
         float var4 = id_const.id_final() / 2.0F;
         float var5 = (Float)((rrIm_1)this.id_break[5]).id_byte();
         boolean var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().a().aJ_();
         float var7 = var5
            + (
               ((rrIk_1)this.id_break[3]).id_class()
                  ? (1.0F - ((cb_3)id_import.id_class[57]).id_class(0.5F, var6)) * 10.0F
                  : 0.0F
            );
         float var8 = (Float)((rrIm_1)this.id_break[6]).id_byte();
         int var9 = (Integer)((rrIz_1)this.id_break[0]).id_byte();
         int var10 = rrZF.e_;
         if (((rrIk_1)this.id_break[1]).id_class()) {
            rjG_2 var12 = (rjG_2)id_import.id_class[64];
            if (var12 instanceof rfo_3 var11) {
               an_3 var14 = var11.id_class();
               if (var14 instanceof iB_2) {
                  var9 = (Integer)((rrIz_1)this.id_break[2]).id_byte();
               }
            }
         }

         var2.id_class();
         RenderSystem.disableTexture();
         RenderSystem.enableSmoothShadeModel();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         id_strictfp.id_class(7, ju_3.id_this);
         float var13 = 0.5F;
         if (((rrIk_1)this.id_break[4]).id_class()) {
            rrfD_2.id_class(var2, var3 - var13, var4 - var13, 1.0F + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
            rrfD_2.id_class(var2, var3, var4, 1.0F, 1.0F, var9);
         }

         rrfD_2.id_class(var2, var3 - (var7 + var8 - 1.0F) - var13, var4 - var13, var8 + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 - var13, var4 - (var7 + var8 - 1.0F) - var13, 1.0F + var13 * 2.0F, var8 + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 + var7 - var13, var4 - var13, var8 + var13 * 2.0F, 1.0F + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 - var13, var4 + var7 - var13, 1.0F + var13 * 2.0F, var8 + var13 * 2.0F, var10);
         rrfD_2.id_class(var2, var3 - (var7 + var8 - 1.0F), var4, var8, 1.0F, var9);
         rrfD_2.id_class(var2, var3, var4 - (var7 + var8 - 1.0F), 1.0F, var8, var9);
         rrfD_2.id_class(var2, var3 + var7, var4, var8, 1.0F, var9);
         rrfD_2.id_class(var2, var3, var4 + var7, 1.0F, var8, var9);
         id_default.id_break();
         RenderSystem.disableBlend();
         RenderSystem.disableSmoothShadeModel();
         RenderSystem.enableTexture();
         var2.id_break();
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAa_1 var1) {
      var1.id_class(true);
   }

   

   

   

   

   

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   

   
}
