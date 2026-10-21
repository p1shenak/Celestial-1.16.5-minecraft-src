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
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.awt.Color;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class Pointers extends celestial.module.Module {
   public Object[] id_break;
   public static Object[] id_byte;

   private rrZO id_byte(String var1) {
      return var1.equals("Пиксельный")
         ? ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break()
         : ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_implements();
   }

   public Pointers() {
      super("Pointers", "Рисует стрелки к сущностям", Category.RENDER);
      this.id_else();
      celestial.setting.CheckGroup var5 = new celestial.setting.CheckGroup()
         .id_catch(true)
         .id_case(false)
         .id_throws(true)
         .id_private(true)
         .id_break(false)
         .id_implements(false)
         .id_byte(false)
         .id_protected(false)
         .id_class(true);
      this.id_break[0] = var5;
      rrIQ var6 = new rrIQ("Режим", "Клиентский", "Клиентский", "Индикатор");
      this.id_break[1] = var6;
      rrIz_1 var7 = (rrIz_1)new rrIz_1("Цвет друзей", Color.GREEN.getRGB()).id_break().id_class(() -> {
         this.id_else();
         return ((celestial.setting.CheckGroup)this.id_break[0]).id_implements();
      });
      this.id_break[2] = var7;
      rrIQ var8 = new rrIQ("Режим", "Обычный", "Обычный", "Пиксельный");
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Здоровье", true);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Дистанцию", true);
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Ник", true);
      this.id_break[6] = var11;
      rrIm_1 var12 = new rrIm_1("Размер", 7.0F, 5.0F, 10.0F, 1.0F);
      this.id_break[7] = var12;
      rrIm_1 var13 = new rrIm_1("Радиус", 100.0F, 50.0F, 150.0F, 5.0F);
      this.id_break[8] = var13;
      rrIk_1 var14 = new rrIk_1("Свечение", true);
      this.id_break[9] = var14;
      ObjectOpenHashSet var15 = new ObjectOpenHashSet();
      this.id_break[10] = var15;
      celestial.util.AnimValue var16 = new celestial.util.AnimValue(0.5F, false);
      this.id_break[11] = var16;
      this.id_class(
         new celestial.setting.GroupSetting("Цели", new rrIc_1("Выбор", ((celestial.setting.CheckGroup)this.id_break[0]).id_byte())),
         new celestial.setting.GroupSetting("Дополнения", new rrIc_1("Отображать", (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[6], (rrIk_1)this.id_break[5])),
         new celestial.setting.GroupSetting("Цвета", (rrIQ)this.id_break[1], (rrIz_1)this.id_break[2]),
         new celestial.setting.GroupSetting("Шрифты", (rrIQ)this.id_break[3]),
         new celestial.setting.GroupSetting("Другое", (rrIm_1)this.id_break[7], (rrIm_1)this.id_break[8], (rrIk_1)this.id_break[9])
      );
   }

   

   private float id_this() {
      this.id_else();
      vm_3 var2 = (vm_3)id_import.id_class[74];
      if (var2 instanceof Fu_1 var1) {
         int var5 = var1.id_synchronized;
         int var3 = var1.id_return;
         int var4 = (int)id_import.id_else().id_return();
         return Math.max(var5, var3) + (var4 - 1) * 100.0F;
      } else {
         return (Float)((rrIm_1)this.id_break[8]).id_byte();
      }
   }

   private rVr_1 id_class(an_3 var1) {
      this.id_else();
      if (var1 instanceof cG_2 var2 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var2)) {
         int var3 = (Integer)((rrIz_1)this.id_break[2]).id_byte();
         return new rVr_1(var3, var3, var3, var3);
      } else if (((String)((rrIQ)this.id_break[1]).id_byte()).equals("Индикатор")) {
         int var4 = celestial.util.ColorHelper.id_break(celestial.util.ColorHelper.id_class(var1), 0.5F);
         return var1 instanceof rSi_1 ? new rVr_1(-6606593, -6606593, -6606593, -6606593) : new rVr_1(var4, var4, var4, var4);
      } else {
         return new rVr_1(
            celestial.util.ColorHelper.id_class(0.0F),
            celestial.util.ColorHelper.id_class(90.0F),
            celestial.util.ColorHelper.id_class(180.0F),
            celestial.util.ColorHelper.id_class(270.0F)
         );
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Set)this.id_break[10]).clear();
         ObjectSet var2 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet();
         ObjectIterator var3 = var2.iterator();

         while (var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            an_3 var5 = (an_3)var4.getValue();
            if (this.id_class(var5, (celestial.setting.CheckGroup)this.id_break[0])) {
               ((Set)this.id_break[10]).add(var5);
            }
         }

         this.id_break[12] = this.id_this();
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, an_3 var3, float var4, float var5, float var6) {
      this.id_else();
      float var7 = var4 / 2.0F;
      if (((rrIk_1)this.id_break[5]).id_class()) {
         String var8 = (int)Math.abs(((cb_3)id_import.id_class[57]).id_implements(var3)) + "m";
         var2.id_class(var1, id_strictfp, var8, var5, var6 + var7 + 5.0F, rrZF.d_);
      }

      if (((rrIk_1)this.id_break[6]).id_class()) {
         var2.id_class(
            var1,
            id_strictfp,
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_break(var3.id_extends()),
            var5,
            var6 - var7 - 6.0F,
            rrZF.d_
         );
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_else();
      if (!((Set)this.id_break[10]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         float var3 = var1.id_break();
         ((celestial.util.AnimValue)this.id_break[11]).id_break((Float)this.id_break[12]);
         float var4 = ((celestial.util.AnimValue)this.id_break[11]).id_byte();
         float var5 = (Float)((rrIm_1)this.id_break[7]).id_byte();
         float var6 = id_const.id_extends() / 4.0F;
         float var7 = id_const.id_native() / 4.0F;
         rrZO var8 = this.id_byte((String)((rrIQ)this.id_break[3]).id_byte());
         rrfD_2.id_byte((lD_2)rrfD_2.id_class[7]);
         rrfD_2.id_throws((lD_2)rrfD_2.id_class[8]);
         var8.id_break(id_strictfp);
         id_import.A().id_class((rqO_2)id_byte[0]);
         float var9 = (Float)((cb_3)id_import.id_class[57]).id_throws[15] * (float) (Math.PI / 180.0);
         float var10 = rfU_2.id_break(var9);
         float var11 = rfU_2.id_class(var9);
         float var12 = -var5 / 2.0F;

         for (an_3 var14 : (Set<an_3>)this.id_break[10]) {
            float var15 = (float)(rrjZ_2.id_protected(var14, var3) - rrjZ_2.id_protected((cb_3)id_import.id_class[57], var3));
            float var16 = (float)(rrjZ_2.id_byte(var14, var3) - rrjZ_2.id_byte((cb_3)id_import.id_class[57], var3));
            float var17 = -(var16 * var10 - var15 * var11);
            float var18 = -(var15 * var10 + var16 * var11);
            float var19 = (float)(Math.atan2(var17, var18) * (float) (180.0 / Math.PI));
            float var20 = (float)Math.toRadians(var19);
            float var21 = var4 / 2.0F;
            float var22 = var21 * rfU_2.id_break(var20) + var6;
            float var23 = var21 * rfU_2.id_class(var20) + var7;
            var2.id_class();
            var2.id_class(var22, var23, 0.0);
      this.id_class(var2, var8, var14, var5, 0.0F, 0.0F);
            if (var14 instanceof iB_2 var24 && ((rrIk_1)this.id_break[4]).id_class()) {
      this.id_class(var2, var24, var5, 0.0F, var12);
            }

            var2.id_class(rje_3.id_case.id_byte(var19 + 90.0F));
      this.id_class(var2, var14, var5);
            var2.id_break();
         }

         boolean var25 = ((rrIk_1)this.id_break[9]).id_class();
         if (var25) {
            GL11.glBlendFunc(770, 1);
         }

         rrfD_2.id_catch((lD_2)rrfD_2.id_class[7]);
         if (var25) {
            GL11.glBlendFunc(770, 771);
         }

         rrfD_2.id_private((lD_2)rrfD_2.id_class[8]);
         var8.id_byte(id_strictfp);
      }
   }

   

   private void id_class(Ml_1 var1, an_3 var2, float var3) {
      rVr_1 var4 = this.id_class(var2);
      rrfD_2.id_break(var1, (lD_2)rrfD_2.id_class[7], var3, var4.id_class(), var4.id_break(), var4.id_byte(), var4.id_byte());
   }

   private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5) {
      float var6 = rrjZ_2.id_class(var2);
      float var7 = var3 / 2.0F;
      float var8 = var4 - var7 - 5.0F;
      float var9 = 1.0F;
      float var10 = var3 + 2.0F;
      float var11 = var10 * var6;
      rrfD_2.id_class(
         var1,
         (lD_2)rrfD_2.id_class[8],
         var8 - 0.5F,
         var5 - 0.5F,
         var9 + 1.0F,
         var10 + 1.0F,
         celestial.util.ColorHelper.id_break(rrZF.e_, Math.min(225, 80))
      );
      rrfD_2.id_class(
         var1,
         (lD_2)rrfD_2.id_class[8],
         var8,
         var5 + var10 - var11,
         var9,
         var11,
         celestial.util.ColorHelper.id_break(celestial.util.ColorHelper.id_class(var2), 0.5F)
      );
   }

   private boolean id_class(an_3 var1, celestial.setting.CheckGroup var2) {
      return var1 != null && var1 != (cb_3)id_import.id_class[57] && var1.Pu() ? rrff_3.id_class(var1, var2) : false;
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);
      ((Set)this.id_break[10]).clear();
   }

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[13];
         this.id_break[12] = 0.0F;
      }
   }

   

   

   

      static {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/pointer.png")};
      id_byte = var0;
   }

   

   

   
}
