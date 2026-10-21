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
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class Esp2D extends celestial.module.Module {
   public Object[] id_break;
   public static Object[] id_byte;

   public Esp2D() {
      super("2D ESP", "WallHack на сущностей", Category.RENDER);
      this.id_while();
      rrIk_1 var5 = new rrIk_1("Бокс", false);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Здоровье", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Предмет", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Неймтег", true);
      this.id_break[3] = var8;
      rrIk_1 var9 = (rrIk_1)new rrIk_1("Пинг", false).id_class(() -> ((rrIk_1)this.id_break[3]).id_class());
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Броню", true);
      this.id_break[5] = var10;
      rrIk_1 var11 = (rrIk_1)new rrIk_1("Зачарования", true).id_class(() -> ((rrIk_1)this.id_break[5]).id_class());
      this.id_break[6] = var11;
      rrIk_1 var12 = new rrIk_1("Эффекты", true);
      this.id_break[7] = var12;
      rrIk_1 var13 = new rrIk_1("Превью шалкера", true);
      this.id_break[8] = var13;
      rrIm_1 var14 = (rrIm_1)new rrIm_1("Ширина", 1.0F, 0.5F, 2.0F, 0.5F)
         .id_class(
            () -> {
               this.id_while();
               return !((rrIk_1)this.id_break[0]).id_class() && !((rrIk_1)this.id_break[1]).id_class()
                  ? false
                  : true;
            }
         );
      this.id_break[9] = var14;
      celestial.setting.CheckGroup var15 = new celestial.setting.CheckGroup()
         .id_catch(true)
         .id_case(true)
         .id_throws(true)
         .id_private(true)
         .id_break(true)
         .id_implements(false)
         .id_byte(false)
         .id_protected(false)
         .id_class(true);
      this.id_break[10] = var15;
      rrfL_2 var10001 = new rrfL_2();
      rrfL_2 var16 = var10001.id_class(new ev_3[]{eY_2.id_class, eY_2.id_volatile, eY_2.id_new, eY_2.id_public, eY_2.id_this, eY_2.id_synchronized, eY_2.id_continue, eY_2.id_import, eY_2.id_implements});
      this.id_break[11] = var16;
      Int2ObjectOpenHashMap var17 = new Int2ObjectOpenHashMap();
      this.id_break[12] = var17;
      rrTr_1 var18 = new rrTr_1();
      this.id_break[13] = var18;
      celestial.setting.Setting[] var19 = new celestial.setting.Setting[3];
      var19[0] = new rrIc_1("Выбор целей", ((celestial.setting.CheckGroup)this.id_break[10]).id_byte());
      byte var10003 = 1;
      String var10006 = "Отображать";
      var19[var10003] = new rrIc_1(var10006, new rrIk_1[]{(rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[6], (rrIk_1)this.id_break[7], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[8]});
      var19[2] = (rrIm_1)this.id_break[9];
      this.id_class(var19);
   }

   

   

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var2, var3, var4, var5, var6, var7);
   }

   

   

   private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      String var12 = rrjZ_2.id_class(var8);
      float var13 = 0.5F;
      this.id_class(var1, var4 - var13, var5 - var13, var6 + var13 * 2.0F, var7 + var13 * 2.0F, var11, var11);
      this.id_class(var1, var4, var5 + var7 - var7 * var8, var6, var7 * var8, var9, var10);
      boolean var14 = var2.u_() < var2.SK() * 0.9F ? true : false;
      boolean var15 = var2 != (cb_3)id_import.id_class[57] && !(((cb_3)id_import.id_class[57]).id_int(var2) < 900.0)
         ? false
         : true;
      if (var14 && var15) {
         var3.id_byte(
            var1, id_strictfp, var12, var4 + var6 / 2.0F, var5 + var7 - var7 * var8 - 3.0F, rrZF.d_, false, false
         );
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, rgP_2 var3, float var4, float var5, float var6, float var7, int var8) {
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var4, var5, var6, var7, var8);
      var2.id_break(var1, var3, var4 + 1.0F, var5 + 2.0F, rrZF.d_, 255);
   }

   @celestial.event.EventTarget(
      id_class = -200
   )
   public void id_class(rrnE_2 var1) {
      this.id_while();
      ((rrTr_1)this.id_break[13]).id_class();
      boolean var2 = ((rrIk_1)this.id_break[8]).id_class();
      if (!((Int2ObjectMap)this.id_break[12]).isEmpty() || var2 && ((rrTr_1)this.id_break[13]).id_throws()) {
         Ml_1 var3 = var1.id_class();
         rrZO var4 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_break();
         rjV_2 var5 = ((Hh_1)id_import.id_class[16]).id_volatile();
         float var6 = var1.id_break();
         if (var2 && ((rrTr_1)this.id_break[13]).id_throws()) {
            ((rrTr_1)this.id_break[13]).id_class(var5, var6);
         }

         int var7 = celestial.util.ColorHelper.id_class(0.0F);
         int var8 = celestial.util.ColorHelper.id_class(90.0F);
         int var9 = celestial.util.ColorHelper.id_class(180.0F);
         int var10 = celestial.util.ColorHelper.id_class(270.0F);
         float var11 = (Float)((rrIm_1)this.id_break[9]).id_byte();
         var3.id_class();
         var4.id_break(id_strictfp);
         rrfD_2.id_throws((lD_2)rrfD_2.id_class[7]);
         boolean var12 = ((rrIk_1)this.id_break[0]).id_class();
         boolean var13 = ((rrIk_1)this.id_break[3]).id_class();
         boolean var14 = ((rrIk_1)this.id_break[4]).id_class();
         boolean var15 = ((rrIk_1)this.id_break[5]).id_class();
         boolean var16 = ((rrIk_1)this.id_break[7]).id_class();
         boolean var17 = ((rrIk_1)this.id_break[1]).id_class();
         boolean var18 = ((rrIk_1)this.id_break[2]).id_class();
         ObjectIterator var19 = ((Int2ObjectMap)this.id_break[12]).values().iterator();

         while (var19.hasNext()) {
            an_3 var20 = (an_3)var19.next();
            rji_3 var21 = rrfa_3.id_class(var5, var20, var6);
            float var22 = var21.id_class();
            float var23 = var21.id_break();
            float var24 = var21.id_byte();
            float var25 = var21.id_protected();
            float var26 = var24 - var22;
            float var27 = var25 - var23;
            float var28 = 0.0F;
            float var29 = 0.0F;
            float var30 = 0.0F;
            float var31 = 0.0F;
            float var32 = 0.0F;
            rgN_2 var33 = null;
            if (rrff_3.id_class(var20)) {
               var33 = new rgN_2("");
               var33.id_class(rrjZ_2.id_byte(var20));
               if (var13) {
                  var29 = var4.id_class() + 2;
               }

               if (var20 instanceof iB_2 var34) {
                  float var35 = var34.Sd();
                  var32 = rrjZ_2.id_class(var34);
                  String var36 = rgF_2.GRAY + " | " + rgF_2.RED + (int)var34.u_() + "ø";
                  String var37 = "";
                  if (var35 > 0.0F) {
                     var37 = rgF_2.GRAY + " | " + rgF_2.YELLOW + (int)var35 + "ù";
                  }

                  var33.id_break(var36 + var37);
               }

               if (var14 && var20 instanceof cG_2 var38) {
                  Aw_1 var40 = var38.id_continue();
                  if (var40 != null) {
                     var33.id_break(rgF_2.GRAY + " | " + rgF_2.WHITE + var40.id_byte() + "ms");
                  }
               }

               var28 = var4.id_break(var33.getString()) + 2.0F;
               var30 = var22 + var26 / 2.0F - var28 / 2.0F - 1.0F;
               var31 = var23 - var29 - 1.5F;
            }

            if (var12) {
      this.id_class(var3, var22, var23, var24, var25, var26, var27, var11, var7, var8, var9, var10, (Integer)id_byte[0]);
            }

            if (var33 != null && var13 && !((rrTr_1)this.id_break[13]).id_class(var20.V())) {
      this.id_class(var3, var4, var33, var30, var31, var28, var29, (Integer)id_byte[0]);
            }

            if (var20 instanceof iB_2 var39) {
               if (var18) {
      this.id_class(var3, var39, var4, rpm_3.values(), var22, var24, var25);
               }

               if (var15) {
                  this.id_break(var3, var39, var4, var22, var24, var31);
               }

               if (var16) {
      this.id_class(var3, var39, var4, var22, var23, var24);
               }

               if (var17) {
      this.id_class(
                     var3, var39, var4, var22 - var11 - 1.5F, var23, var11, var27, var32, var7, var10, (Integer)id_byte[0]
                  );
               }
            }
         }

         rrfD_2.id_private((lD_2)rrfD_2.id_class[7]);
         var4.id_byte(id_strictfp);
         ((rrTr_1)this.id_break[13]).id_class(var3);
         var3.id_break();
      }
   }

   public boolean id_class(an_3 var1) {
      this.id_while();
      aI_2 var2 = var1.BC();
      if (var2 != aI_2.id_break && var2 != aI_2.Q) {
         return this.aJ_() && ((rrIk_1)this.id_break[3]).id_class() && ((Int2ObjectMap)this.id_break[12]).containsKey(var1.V())
            ? false
            : true;
      } else {
         return true;
      }
   }

   private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, rpm_3[] var4, float var5, float var6, float var7) {
      float var8 = var5 + (var6 - var5) / 2.0F;
      float var9 = var7 + 3.0F;
      rpm_3[] var10 = var4;
      int var11 = var4.length;

      for (int var12 = 0; var12 < var11; var12++) {
         rpm_3 var13 = var10[var12];
         rdn_3 var14 = var2.id_protected(var13);
         if (!var14.id_class()) {
            StringBuilder var15 = new StringBuilder(var14.id_continue().id_byte());
            if (var14.id_char() > 1) {
               var15.append(" ").append(rgF_2.RED).append("x").append(var14.id_char());
            }

            var3.id_byte(var1, id_strictfp, var15.toString(), var8, var9, rrZF.d_, false, false);
            var9 += 6.0F;
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Int2ObjectMap)this.id_break[12]).clear();
         ((rrTr_1)this.id_break[13]).id_break();
         ObjectIterator var2 = ((gm_3)id_import.id_class[56]).id_return().int2ObjectEntrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            an_3 var4 = (an_3)var3.getValue();
            int var5 = var3.getIntKey();
            if (this.id_break(var4)) {
               ((Int2ObjectMap)this.id_break[12]).put(var5, var4);
            }

            if (var4 instanceof rsE_2 var6 && var6.id_protected().id_break() instanceof rxJ_2 var7 && var7.id_catch() instanceof Wp_1) {
               ((rrTr_1)this.id_break[13]).id_class(var6);
            }
         }

         ((rrTr_1)this.id_break[13]).id_byte();
      }
   }

   private void id_class(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
      Collection var7 = var2.So();
      if (!var7.isEmpty()) {
         String var8 = rAB.id_break(var7);
         float var9 = var4 + (var6 - var4) + 2.0F;
         float var10 = var5 + 1.0F;
         var3.id_class(var1, var8, var9, var10, rrZF.d_, 10, false, false);
      }
   }

   private void id_class(
      Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      rrfD_2.id_byte(var1, (lD_2)rrfD_2.id_class[7], var2 + var8, var3, var6 - var8 * 2.0F, var8, var9, var10);
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var2, var3, var8, var7, var9, var12);
      rrfD_2.id_byte(var1, (lD_2)rrfD_2.id_class[7], var2 + var8, var5 - var8, var6 - var8 * 2.0F, var8, var12, var11);
      rrfD_2.id_class(var1, (lD_2)rrfD_2.id_class[7], var4 - var8, var3, var8, var7, var10, var11);
   }

   private void id_class(
      Ml_1 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13
   ) {
      float var14 = 0.5F;
      this.id_class(
         var1,
         var2 - var14,
         var3 - var14,
         var4 + var14,
         var5 + var14,
         var6 + var14 * 2.0F,
         var7 + var14 * 2.0F,
         var8 + var14 * 2.0F,
         var13,
         var13,
         var13,
         var13
      );
      this.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   private void id_break(Ml_1 var1, iB_2 var2, rrZO var3, float var4, float var5, float var6) {
      this.id_while();
      ArrayList var7 = new ArrayList();
      rdn_3 var8 = var2.ss();
      rdn_3 var9 = var2.Sn();
      if (!var8.id_class()) {
         var7.add(var8);
      }

      for (rdn_3 var11 : var2.PV()) {
         if (!var11.id_class()) {
            var7.add(var11);
         }
      }

      if (!var9.id_class()) {
         var7.add(var9);
      }

      int var23 = var7.size();
      byte var24 = 10;
      float var12 = var4 + (var5 - var4) / 2.0F - var24 * (var23 - 1) / 2.0F - 4.5F;
      float var13 = var12 + var24 * (var23 - 1) + 5.0F;

      for (int var14 = 0; var14 < var7.size(); var14++) {
         rdn_3 var15 = (rdn_3)var7.get(var14);
         rdb_3 var16 = var15.id_break();
         float var17 = var12 + var14 * var24;
         float var18 = var6 - 9.0F;
         rrfD_2.id_class(
            var1,
            (lD_2)rrfD_2.id_class[7],
            var15,
            var17,
            var18,
            var16 == rdy_3.kL ? true : false,
            (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[3]
               ? true
               : false,
            0.5F,
            6.5F,
            8
         );
         if (((rrIk_1)this.id_break[6]).id_class()
            && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[3]) {
            Pair var19 = ((rrfL_2)this.id_break[11]).id_class(var15);
            String var20 = (String)var19.getLeft();
            int var21 = (Integer)var19.getRight();
            float var22 = var18 - var21 * 5 + 1.0F;
            var3.id_class(var1, var20, var17 + 0.5F, var22, rrZF.d_, 10, false, false);
         }

         if (var8.id_char() > 1) {
            var3.id_byte(var1, id_strictfp, "x" + var8.id_char(), var12 + 5.0F, var18 + 5.0F, rrZF.d_, false, false);
         }

         if (var9.id_char() > 1) {
            var3.id_byte(var1, id_strictfp, "x" + var9.id_char(), var13, var18 + 5.0F, rrZF.d_, false, false);
         }
      }
   }

   

   private boolean id_break(an_3 var1) {
      this.id_while();
      if (var1 == null) {
         return false;
      } else if (var1 == (cb_3)id_import.id_class[57] && ((Qw_1)id_import.id_class[20]).id_volatile() == VZ.FIRST_PERSON) {
         return false;
      } else if (!var1.Pu()) {
         return false;
      } else {
         aI_2 var2 = var1.BC();
         if (var2 == aI_2.id_break || var2 == aI_2.Q) {
            return false;
         } else if (!rrff_3.id_class(var1, (celestial.setting.CheckGroup)this.id_break[10])) {
            return false;
         } else {
            return !rrfo_3.id_class(var1) ? false : true;
         }
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_while();
      super.id_throws(var1);
      ((Int2ObjectMap)this.id_break[12]).clear();
      ((rrTr_1)this.id_break[13]).id_protected();
   }

      static {
      Object[] var0 = new Object[]{-1275068416};
      id_byte = var0;
   }

   

   

   

   

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[14];
      }
   }

   
}
