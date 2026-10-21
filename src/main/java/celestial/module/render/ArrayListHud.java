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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ArrayListHud extends celestial.module.Module {
   public static Object[] id_break;
   public Object[] id_byte;

   public ArrayListHud() {
      super("Array List", "Отображает список включенных\nмодулей", Category.RENDER);
      this.id_continue();
      ArrayList var5 = new ArrayList();
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Combat", true);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Movement", true);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Render", false);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Player", true);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1("Util", true);
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1("Свечение", true);
      this.id_byte[6] = var11;
      rrIk_1 var12 = (rrIk_1)new rrIk_1("Маленькие буквы", false).id_class("lowercase", (var1, var2) -> {
         this.id_continue();
         Boolean var3 = (Boolean)var2.getLeft();
         ((List<rrqA_2>)this.id_byte[0]).forEach(var1x -> var1x.id_break(var3));
         this.id_else();
      });
      this.id_byte[7] = var12;
      rrIm_1 var13 = new rrIm_1("Смещение", 2.0F, 0.0F, 10.0F, 1.0F);
      this.id_byte[8] = var13;
      this.id_class(
         new rrIc_1("Категории", (rrIk_1)this.id_byte[1], (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[5]),
         (rrIk_1)this.id_byte[7],
         (rrIk_1)this.id_byte[6],
         (rrIm_1)this.id_byte[8]
      );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new OH(rrLP.class, var1 -> this.id_class((rrLP)var1)));
   }

   

   

   

   public void id_class(rrLP var1) {
      this.id_continue();

      for (celestial.module.Module var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g()) {
         ((List)this.id_byte[0]).add(new rrqA_2(this, var3));
      }

      this.id_else();
   }

   @celestial.event.EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_continue();
      if (!((Qw_1)id_import.id_class[20]).R && !((List)this.id_byte[0]).isEmpty()) {
         float var2 = 10.0F;
         float var3 = (Float)((rrIm_1)this.id_byte[8]).id_byte();
         float var4 = (Float)((rrIm_1)this.id_byte[8]).id_byte() + 5.0F;
         Ml_1 var5 = var1.id_class();
         float var6 = id_const.id_volatile();
         float var10 = var2 / 2.5F;
         int var12 = celestial.util.ColorHelper.id_class(0.0F);
         ArrayList var13 = new ArrayList();

         for (rrqA_2 var15 : (List<rrqA_2>)this.id_byte[0]) {
            var15.id_class(this.id_class((celestial.module.Module)var15.id_class[0]));
            if (((celestial.util.AnimValue)var15.id_class[1]).id_case()) {
               var13.add(var15);
            }
         }

         var5.id_class();
         if (((rrIk_1)this.id_byte[6]).id_class()) {
            for (rrqA_2 var24 : (List<rrqA_2>)var13) {
               float var8 = (Float)var24.id_class[3];
               float var7 = var6 + 120.0F - var8 - var4;
               var7 -= 120.0F * var24.id_byte();
               int var11 = celestial.util.ColorHelper.id_class(-var3);
               float var9 = var8 + 4.0F;
               rrfD_2.id_class(var5, var7, var3, var9 + 2.0F, var2 + 1.0F, 12, var11);
               var3 += var2 * var24.id_byte();
            }

            var3 = (Float)((rrIm_1)this.id_byte[8]).id_byte();
         }

         rrfD_2.id_throws((lD_2)id_break[0]);
         ((rrZO)id_break[1]).id_break(id_strictfp);

         for (rrqA_2 var25 : (List<rrqA_2>)var13) {
            float var19 = (Float)var25.id_class[3];
            float var17 = var6 + 120.0F - var19 - var4;
            var17 -= 120.0F * var25.id_byte();
            int var21 = celestial.util.ColorHelper.id_class(-var3);
            float var20 = var19 + 4.0F;
            rrfD_2.id_class(
               var5,
               (lD_2)id_break[0],
               var17,
               var3,
               var20,
               var2,
               celestial.util.ColorHelper.id_break(rrZF.n_, (int)(225.0F * var25.id_byte()))
            );
            rrfD_2.id_class(var5, (lD_2)id_break[0], var17 + var20, var3, 0.5F, var2, var12, var21);
            var12 = var21;
            ((rrZO)id_break[1])
               .id_break(
                  var5, id_strictfp, (String)var25.id_class[2], var17 + 2.0F, var3 + var10, var21, false, false
               );
            var3 += var2 * var25.id_byte();
         }

         rrfD_2.id_private((lD_2)id_break[0]);
         ((rrZO)id_break[1]).id_byte(id_strictfp);
         var5.id_break();
      }
   }

   private boolean id_class(celestial.module.Module var1) {
      this.id_continue();
      if (!var1.aJ_()) {
         return false;
      } else {
         switch (((int[])rrqL_2.id_class[0])[var1.id_int().ordinal()]) {
            case 1:
               return ((rrIk_1)this.id_byte[1]).id_class();
            case 2:
               return ((rrIk_1)this.id_byte[2]).id_class();
            case 3:
               return !((rrIk_1)this.id_byte[3]).id_class() && !(var1 instanceof celestial.module.render.Hud) && !(var1 instanceof celestial.module.render.Esp2D)
                  ? false
                  : true;
            case 4:
               return ((rrIk_1)this.id_byte[4]).id_class();
            case 5:
               return ((rrIk_1)this.id_byte[5]).id_class();
            default:
               return false;
         }
      }
   }

   

   

   

   private void id_continue() {
      if (this.id_byte == null) {
         this.id_byte = new Object[9];
      }
   }

   private void id_else() {
      this.id_continue();
      ((List<rrqA_2>)this.id_byte[0]).sort(Comparator.comparingDouble(var0 -> -var0.id_protected()));
   }

   

      static {
      Object[] var0 = new Object[]{new lD_2(256), celestial.manager.FontManager.id_class("montserrat", 13.0F, false), -1.0842022E-19F, 120};
      id_break = var0;
   }

   

   
}
