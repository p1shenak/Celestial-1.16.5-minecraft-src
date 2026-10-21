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
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.IntSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class BlockEsp extends celestial.module.Module implements rrqe_3 {
   public Object[] id_break;
   public static Object[] id_byte;

   public BlockEsp() {
      super("Block ESP", "WallHack на блоки", Category.RENDER);
      this.id_super();
      CopyOnWriteArraySet var5 = new CopyOnWriteArraySet();
      this.id_break[1] = var5;
      HashSet var6 = new HashSet();
      this.id_break[2] = var6;
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_class(this);
      this.id_class(
         (rrIk_1)id_byte[0],
         (rrIz_1)id_byte[7],
         (rrIk_1)id_byte[1],
         (rrIz_1)id_byte[8],
         (rrIk_1)id_byte[2],
         (rrIz_1)id_byte[9],
         (rrIk_1)id_byte[3],
         (rrIz_1)id_byte[10],
         (rrIk_1)id_byte[4],
         (rrIz_1)id_byte[11],
         (rrIk_1)id_byte[5],
         (rrIz_1)id_byte[12],
         (rrIk_1)id_byte[6],
         (rrIz_1)id_byte[13]
      );
   }

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((Set)this.id_break[1]).isEmpty()) {
            return;
         }

         ((Set<rrqD_2>)this.id_break[1]).removeIf(var0 -> ((gm_3)id_import.id_class[56]).id_byte(var0.id_protected()).id_break() != var0.id_break().id_break()
                  ? true
                  : false
            );
      }
   }

   @celestial.event.EventTarget
   public void id_class(celestial.event.RenderEvent var1) {
      this.id_super();
      Ml_1 var2 = var1.id_class();
      float var3 = var1.id_byte();
      var2.id_class();
      GL11.glEnable(2848);
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableBlend();
      RenderSystem.lineWidth(1.5F);
      RenderSystem.disableTexture();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      id_strictfp.id_class(1, ju_3.id_this);
      double var4 = id_void.id_case();
      double var6 = id_void.id_catch();
      double var8 = id_void.id_private();
      ObjectSet var10 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet();
      ObjectIterator var11 = var10.iterator();

      while (var11.hasNext()) {
         Entry var12 = (Entry)var11.next();
         an_3 var13 = (an_3)var12.getValue();
         rfH_2 var14 = var13.Bs();
         if (this.id_class(var13) && this.id_class(var13.rN())) {
            IntSupplier var15 = ((rrqK_2)this.id_break[0]).id_class();
            rrfD_2.id_class(var2, (float)(var14.b_() - var4), (float)(var14.c_() - var6), (float)(var14.d_() - var8), var15.getAsInt());
         }
      }

      for (ryO_2 var26 : ((gm_3)id_import.id_class[56]).id_case) {
         rfH_2 var28 = var26.id_char();
         double var30 = var28.b_();
         double var16 = var28.c_();
         double var18 = var28.d_();
         if (this.id_class(var26)) {
            xc_3 var20 = var26.id_abstract();
            rjC_2 var21 = rrjc_3.id_class(var26, var28, var20, var3);
            if (var21 != null) {
               rfl_3 var22 = var21.id_class().id_protected(var30, var16, var18);
               if (this.id_class(var22)) {
                  IntSupplier var23 = ((rrqK_2)this.id_break[0]).id_class();
                  rrfD_2.id_class(var2, var22.id_protected(-var4, -var6, -var8), var23.getAsInt());
               }
            }
         }
      }

      for (rrqD_2 var27 : (Set<rrqD_2>)this.id_break[1]) {
         rjU_2 var29 = var27.id_byte();
         double var31 = var29.id_class();
         double var32 = var29.id_break();
         double var33 = var29.id_byte();
         rfl_3 var34 = null;
         xd_3 var35 = var27.id_break().id_break();
         if (var35 == xu_3.bD) {
            if (((gm_3)id_import.id_class[56]).id_class(var27.id_protected()) instanceof ryr_3 var37) {
               var34 = var37.id_class(var37.id_abstract(), var3).id_protected(var31, var32, var33);
            }
         } else {
            var34 = rrjc_3.id_class(var35.id_continue(), var27.id_protected()).id_protected(var31, var32, var33);
         }

         if (var34 != null && this.id_class(var34)) {
            rrfD_2.id_class(var2, var34.id_protected(-var4, -var6, -var8), var27.id_break().id_class());
         }
      }

      id_default.id_break();
      RenderSystem.enableTexture();
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      GL11.glDisable(2848);
      var2.id_break();
   }

   public void id_class(rrqU_2 var1, boolean var2) {
      this.id_super();
      if (var2) {
         ((Set)this.id_break[1]).clear();
      }
   }

   

   private boolean id_class(ao_3 var1) {
      this.id_super();
      if (((rrIk_1)id_byte[0]).id_class() && var1 instanceof rHU) {
         rrqK_2 var8 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[0];
         this.id_break[0] = var8;
         return true;
      } else if (((rrIk_1)id_byte[1]).id_class() && var1 instanceof ryr_3) {
         rrqK_2 var9 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[1];
         this.id_break[0] = var9;
         return true;
      } else if (((rrIk_1)id_byte[2]).id_class() && var1 instanceof rHw_1) {
         rrqK_2 var10 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[2];
         this.id_break[0] = var10;
         return true;
      } else if (((rrIk_1)id_byte[3]).id_class() && var1 instanceof rHM) {
         rrqK_2 var11 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[6];
         this.id_break[0] = var11;
         return true;
      } else if (((rrIk_1)id_byte[4]).id_class() && var1 instanceof rsJ_2) {
         rrqK_2 var12 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[3];
         this.id_break[0] = var12;
         return true;
      } else if (((rrIk_1)id_byte[5]).id_class() && var1 instanceof jz_3) {
         rrqK_2 var13 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[4];
         this.id_break[0] = var13;
         return true;
      } else {
         if (((rrIk_1)id_byte[6]).id_class() && var1 instanceof rys_3 var2) {
            rfH_2 var3 = var2.id_char();
            if (!((Set)this.id_break[2]).contains(var3) && rrjQ_2.id_class(var3)) {
               rrqK_2 var14 = (rrqK_2)rrqK_2.staticFields052c2fa722bb33cbaa8dc8a4acf6b5f3[5];
               this.id_break[0] = var14;
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      ((yX_2)id_import.id_class[8]).id_throws();
      if (var1) {
         rrfu_3.id_byte(
            rrfu_3.id_class(this)
               + "Вы можете добавить свой блок через команду '"
               + (String)C_class.id_instanceof().id_protected.id_class[0]
               + "blockesp'"
         );
      }
   }

   private boolean id_class(rfl_3 var1) {
      return ((yX_2)id_import.id_class[8]).id_static().id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(rrLp_1 var1) {
      this.id_super();
      if (var1.id_case() == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) {
         rfH_2 var2 = var1.id_class();
         if (rrjQ_2.id_class(var2)) {
            ((Set)this.id_break[2]).add(var2);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnW_2 var1) {
      this.id_super();

      for (rrqU_2 var3 : ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_byte()) {
         if (var1.id_class() == var3.id_break()) {
            ((Set)this.id_break[1]).add(new rrqD_2(var3, var1.id_break(), var1.id_byte()));
            break;
         }
      }
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      ((Set)this.id_break[1]).clear();
      ((Set)this.id_break[2]).clear();
   }

   

   

   

   public void id_new() {
      this.id_super();
      ((Set)this.id_break[1]).clear();
   }

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   

      static {
      Object[] var0 = new Object[14];
      var0[0] = new rrIk_1("Спавнера", true);
      var0[1] = new rrIk_1("Шалкеры", false);
      var0[2] = new rrIk_1("Сундуки", false);
      var0[3] = new rrIk_1("Бочки", false);
      var0[4] = new rrIk_1("Вагонетки", false);
      var0[5] = new rrIk_1("Диспенсеры", false);
      var0[6] = new rrIk_1("Подарки", false);
      var0[7] = new rrIz_1("Цвет спавнеров", -65281);
      var0[8] = ((celestial.setting.Setting)(new rrIz_1("Цвет шалкеров", -65281))).id_class(((rrIk_1)var0[1])::id_class);
      var0[9] = ((celestial.setting.Setting)(new rrIz_1("Цвет сундуков", -65281))).id_class(((rrIk_1)var0[2])::id_class);
      var0[10] = ((celestial.setting.Setting)(new rrIz_1("Цвет бочек", -65281))).id_class(((rrIk_1)var0[3])::id_class);
      var0[11] = ((celestial.setting.Setting)(new rrIz_1("Цвет вагонеток", -65281))).id_class(((rrIk_1)var0[4])::id_class);
      var0[12] = ((celestial.setting.Setting)(new rrIz_1("Цвет диспенсеров", -65281))).id_class(((rrIk_1)var0[5])::id_class);
      var0[13] = ((celestial.setting.Setting)(new rrIz_1("Цвет подарков", -65281))).id_class(((rrIk_1)var0[6])::id_class);
      id_byte = var0;
   }
}
