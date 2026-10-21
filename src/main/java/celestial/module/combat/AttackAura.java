package celestial.module.combat;

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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AttackAura extends celestial.module.Module implements rrnF_2, rrnL_2 {
   public Object[] id_break;
   private rrIk_1 celestialSilentRotation;

   public rrIk_1 id_boolean() {
      this.u();
      return (rrIk_1)this.id_break[29];
   }

   public boolean id_char() {
      return false;
   }

   public rrnD_2 id_long() {
      this.u();
      return (rrnD_2)this.id_break[8];
   }

   public boolean id_float() {
      this.u();
      return !((String)this.S().id_byte()).equals("Legit") && (rrnK_2)this.id_break[5] != (rrCs_1)this.id_break[3]
         ? false
         : true;
   }

   public rrIk_1 id_double() {
      this.u();
      return (rrIk_1)this.id_break[22];
   }

   public AttackAura() {
      super("Attack Aura", "Автоматически бьет окружающих\nвас существ", Category.COMBAT);
      this.u();
      rqO_2 var5 = new rqO_2("celestial/images/glow.png");
      this.id_break[4] = var5;
      rrfP_2 var6 = new rrfP_2();
      this.id_break[6] = var6;
      celestial.setting.CheckGroup var7 = new celestial.setting.CheckGroup()
         .id_catch(true)
         .id_case(true)
         .id_throws(false)
         .id_implements(false)
         .id_byte(false)
         .id_protected(false)
         .id_class(true);
      this.id_break[7] = var7;
      rrnD_2 var8 = new rrnD_2(this);
      this.id_break[8] = var8;
      rrIQ var9 = new rrIQ("Сортировка", "Умная", "Умная", "Поле зрения", "Дистанция", "Здоровье");
      this.id_break[9] = var9;
      rrIQ var10 = new rrIQ("Режим", "Funtime", "Funtime", "Matrix", "Snap", "SpookyTime");
      this.id_break[10] = var10;
      rrIQ var11 = (rrIQ)new rrIQ("Обход спринта", "Funtime", "Funtime", "Legit").id_class("change_mode", (var1, var2) -> {
         this.u();
         rrnD_2 var10000 = (rrnD_2)this.id_break[8];
         Integer var7x = Integer.valueOf(0);
         var10000.id_break[6] = var7x;
         var10000 = (rrnD_2)this.id_break[8];
         Integer var8x = Integer.valueOf(0);
         var10000.id_break[7] = var8x;
      });
      this.id_break[11] = var11;
      rrIQ var12 = new rrIQ("Режим", "Незаметный", "Незаметный", "Строгий", "Таргет", "Свободный");
      this.id_break[12] = var12;
      rrIk_1 var13 = (rrIk_1)new rrIk_1("Таргетить если у цели\nлук, арбалет или трезубец", false).id_class(() -> {
         this.u();
         return !((String)((rrIQ)this.id_break[12]).id_byte()).equals("Таргет") ? true : false;
      });
      this.id_break[13] = var13;
      rrIk_1 var14 = (rrIk_1)new rrIk_1("Заходить за спину цели", true)
         .id_class(
            () -> {
               this.u();
               return !((String)((rrIQ)this.id_break[12]).id_byte()).equals("Таргет")
                     && !((rrIk_1)this.id_break[13]).id_class()
                  ? false
                  : true;
            }
         );
      this.id_break[14] = var14;
      rrIm_1 var15 = (rrIm_1)new rrIm_1("Дистанция за спиной", 1.0F, 0.5F, 2.5F, 0.1F)
         .id_class(() -> ((rrIk_1)this.id_break[14]).id_class());
      this.id_break[15] = var15;
      rrIm_1 var16 = new rrIm_1("Дистанция удара", 3.0F, 1.0F, 6.0F, 0.1F);
      this.id_break[16] = var16;
      rrIm_1 var17 = new rrIm_1("Дистанция наводки", 0.0F, 0.0F, 32.0F, 0.5F);
      this.id_break[17] = var17;
      rrIk_1 var18 = new rrIk_1("Только криты", true);
      this.id_break[18] = var18;
      rrIk_1 var19 = (rrIk_1)new rrIk_1("Только с пробелом", false).id_class(() -> ((rrIk_1)this.id_break[18]).id_class());
      this.id_break[19] = var19;
      rrIk_1 var20 = new rrIk_1("Останавливать при\nиспользовании предмета", false);
      this.id_break[20] = var20;
      rrIk_1 var21 = (rrIk_1)new rrIk_1("Останавливать при\nоткрытом контейнере", false).id_class(() -> ((rrIk_1)this.id_break[18]).id_class());
      this.id_break[21] = var21;
      rrIk_1 var22 = new rrIk_1("Бить через щит", true);
      this.id_break[22] = var22;
      rrIk_1 var23 = new rrIk_1("Бить через стены", true);
      this.id_break[23] = var23;
      rrIk_1 var24 = (rrIk_1)new rrIk_1("Дистанция под Grim", false)
         .id_class(
            () -> (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
                  && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
               ? true
               : false
         );
      this.id_break[24] = var24;
      rrIk_1 var25 = (rrIk_1)new rrIk_1("Убирать интерполяцию у\nэнтити", false)
         .id_class(
            () -> (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               ? true
               : false
         );
      this.id_break[25] = var25;
      rrIk_1 var26 = new rrIk_1("Убирать взаимодействие с\nблоками и энтити", true);
      this.id_break[26] = var26;
      rrIk_1 var27 = new rrIk_1("Ломать щит", true);
      this.id_break[27] = var27;
      rrIk_1 var28 = new rrIk_1("Таргет-HUD", true);
      this.id_break[28] = var28;
      rrIk_1 var29 = new rrIk_1("ESP", true);
      this.id_break[29] = var29;
      lD_2 var30 = new lD_2(256);
      this.id_break[30] = var30;
      celestial.util.AnimValue var31 = new celestial.util.AnimValue(
         (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[3], 0.5F, false
      );
      this.id_break[33] = var31;
      rrne_3 var32 = new rrne_3();
      this.id_break[35] = var32;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_break((rrne_3)this.id_break[35]);
      celestial.setting.GroupSetting var33;
      this.id_break[34] = new celestial.setting.GroupSetting("Обходы", (rrIQ)this.id_break[10], (rrIQ)this.id_break[11]);
      this.id_class(
         new celestial.setting.GroupSetting("Цели", new rrIc_1("Выбор", ((celestial.setting.CheckGroup)this.id_break[7]).id_byte()), (rrIQ)this.id_break[9]),
         new celestial.setting.GroupSetting("Обходы", (rrIQ)this.id_break[10], (rrIQ)this.id_break[11]),
         new celestial.setting.GroupSetting("Коррекция движения", (rrIQ)this.id_break[12], (rrIk_1)this.id_break[13], (rrIk_1)this.id_break[14], (rrIm_1)this.id_break[15]),
         new celestial.setting.GroupSetting("Дистанции", (rrIm_1)this.id_break[16], (rrIm_1)this.id_break[17]),
         new celestial.setting.GroupSetting("Удары", (rrIk_1)this.id_break[18], (rrIk_1)this.id_break[23], (rrIk_1)this.id_break[27], (rrIk_1)this.id_break[22], (rrIk_1)this.id_break[20], (rrIk_1)this.id_break[21]),
         new celestial.setting.GroupSetting("Криты", (rrIk_1)this.id_break[19]),
         new celestial.setting.GroupSetting("Визуалы", new rrIc_1("Отображать", (rrIk_1)this.id_break[28], (rrIk_1)this.id_break[29])),
         new celestial.setting.GroupSetting("Другие", (rrIk_1)this.id_break[24], (rrIk_1)this.id_break[25], (rrIk_1)this.id_break[26])
      );
      rrCr_1 var34 = new rrCr_1(this);
      this.id_break[0] = var34;
      rrCP var35 = new rrCP(this);
      this.id_break[1] = var35;
      rrna_3 var36 = new rrna_3(this);
      this.id_break[2] = var36;
      rrCs_1 var37 = new rrCs_1(this);
      this.id_break[3] = var37;
      rrna_3 var38 = (rrna_3)this.id_break[2];
      this.id_break[5] = var38;
      ((rrIQ)this.id_break[10]).id_class("change_mode", (var1, var2) -> {
         this.u();
         if ((rrnK_2)this.id_break[5] != null && this.aJ_()) {
            ((rrnK_2)this.id_break[5]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1997372447:
               if (var3.equals("Matrix")) {
                  var4 = 0;
               }
               break;
            case -912404296:
               if (var3.equals("SpookyTime")) {
                  var4 = 3;
               }
               break;
            case 2581482:
               if (var3.equals("Snap")) {
                  var4 = 1;
               }
               break;
            case 1155506348:
               if (var3.equals("Funtime")) {
                  var4 = 2;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCr_1)this.id_break[0];
            case 1 -> (rrCP)this.id_break[1];
            case 2 -> (rrna_3)this.id_break[2];
            case 3 -> (rrCs_1)this.id_break[3];
            default -> null;
         };
         this.id_break[5] = var9x;
         if ((rrnK_2)this.id_break[5] != null && this.aJ_()) {
            ((rrnK_2)this.id_break[5]).aI_();
         }
      });
      ((rrIm_1)this.id_break[17]).id_class(() -> {
         this.u();
         return !this.M() && (rrnK_2)this.id_break[5] != (rrna_3)this.id_break[2] ? true : false;
      });
      ((rrIQ)this.id_break[11]).id_class(() -> {
         this.u();
         return (rrnK_2)this.id_break[5] != (rrCs_1)this.id_break[3] ? true : false;
      });
      ((rrIk_1)this.id_break[23])
         .id_class(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                     && (rrnK_2)this.id_break[5] == (rrCs_1)this.id_break[3]
                  ? false
                  : true;
            }
         );
      ((rrIk_1)this.id_break[20])
         .id_class(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                     && (rrnK_2)this.id_break[5] == (rrCs_1)this.id_break[3]
                  ? false
                  : true;
            }
         );
      ((rrIk_1)this.id_break[21])
         .id_class(
            () -> {
               this.u();
               return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
                     && (rrnK_2)this.id_break[5] == (rrCs_1)this.id_break[3]
                  ? false
                  : true;
            }
         );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(
            new OH(
               celestial.event.RenderEvent.class,
               var1 -> {
                  this.u();
                  ((celestial.util.AnimValue)this.id_break[33])
                     .id_class(
                        (iB_2)this.id_break[31] != null && ((rrIk_1)this.id_break[29]).id_class()
                           ? true
                           : false
                     );
                  if ((iB_2)this.id_break[32] != null && ((celestial.util.AnimValue)this.id_break[33]).id_case()) {
      this.id_class((celestial.event.RenderEvent)var1, (iB_2)this.id_break[32], ((celestial.util.AnimValue)this.id_break[33]).id_byte());
                  }
               }
            )
         );
      this.celestialSilentRotation = new rrIk_1("Silent", true);
      this.id_class(new celestial.setting.Setting[]{this.celestialSilentRotation});
   }

   

   public boolean B() {
      return this.id_else().id_class() && C_throws.id_byte().id_return().id_class() ? false : true;
   }

   

   public rrIQ S() {
      this.u();
      return (rrIQ)this.id_break[11];
   }

   public rrIk_1 id_this() {
      this.u();
      return (rrIk_1)this.id_break[27];
   }

   

   public boolean s() {
      return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4] && this.id_void()
         ? true
         : false;
   }

   

   private void h() {
      this.u();
      if (((rrIk_1)this.id_break[25]).id_class()) {
         for (cG_2 var2 : ((gm_3)id_import.id_class[56]).id_continue()) {
            if (var2 instanceof cM_2 var3) {
               var3.id_else();
            }
         }
      }
   }

   private void l() {
      this.u();
      this.id_break(this.id_long().id_class((celestial.setting.CheckGroup)this.id_break[7]));
   }

   private void d() {
      this.u();
      if (((rrIk_1)this.id_break[25]).id_class()) {
         for (cG_2 var2 : ((gm_3)id_import.id_class[56]).id_continue()) {
            if (var2 instanceof cM_2 var3) {
               var3.id_public();
            }
         }
      }
   }

   public rrIQ id_interface() {
      this.u();
      return (rrIQ)this.id_break[9];
   }

   public void id_class(iB_2 var1) {
      this.u();
      this.id_break[32] = var1;
   }

   public float id_class(rjU_2 var1, rjU_2 var2) {
      return this.P().id_class(var1, var2);
   }

   @celestial.event.EventTarget
   public void id_class(rrAS var1) {
      this.u();
      if ((Integer)((rrnD_2)this.id_break[8]).id_break[5] > 0) {
         var1.id_class(true);
      }
   }

   public List<rrTA> id_class(an_3 var1, rfl_3 var2) {
      return this.P().id_class(var1, var2);
   }

   

   private void id_class(Pair<iM_2, iM_2> var1) {
      this.u();
      if (var1 != null && (iB_2)this.id_break[31] != null) {
         ((cb_3)id_import.id_class[57]).id_class((iM_2)var1.getLeft());
         ((iB_2)this.id_break[31]).id_class((iM_2)var1.getRight());
      }
   }

   public Pair<rrTA, rrTA> id_class(an_3 var1, PX var2) {
      return this.P().id_class(var1, var2);
   }

   @celestial.event.EventTarget
   public void id_class(rrAF var1) {
      this.u();
      if ((Integer)((rrnD_2)this.id_break[8]).id_break[6] > 0) {
         var1.id_class(false);
      }
   }

   public boolean id_class(PX var1) {
      return this.P().id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(rrAM var1) {
      this.id_break((iB_2)null);
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.u();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)((rrnD_2)this.id_break[8]).id_break[5] > 0 && ((cb_3)id_import.id_class[57]).BL()) {
            rrnD_2 var10000 = (rrnD_2)this.id_break[8];
            Integer var7 = (Integer)((rrnD_2)this.id_break[8]).id_break[5] - 1;
            var10000.id_break[5] = var7;
         }

         if ((Integer)((rrnD_2)this.id_break[8]).id_break[6] > 0) {
            rrnD_2 var9 = (rrnD_2)this.id_break[8];
            Integer var8 = (Integer)((rrnD_2)this.id_break[8]).id_break[6] - 1;
            var9.id_break[6] = var8;
         }

         if (((Ax_1)id_import.id_class[55]).id_finally()) {
            this.id_break((iB_2)null);
            return;
         }

         this.h();
         this.l();
         Pair var2 = this.m();
         this.P().id_class(var1);
         this.celestialApplyClientRotation();
      this.id_class(var2);
         this.d();
         ((rrfP_2)this.id_break[6])
            .id_class(System.currentTimeMillis() - ((rrnD_2)this.id_break[8]).id_protected() > 200L ? true : false);
      } else {
         this.P().id_class(var1);
         this.celestialApplyClientRotation();
      }
   }

   

   private void id_class(celestial.event.RenderEvent var1, iB_2 var2, float var3) {
      this.u();
      Ml_1 var4 = var1.id_class();
      float var5 = var1.id_byte();
      double var6 = rrjZ_2.id_protected(var2, var5);
      double var8 = rrjZ_2.id_break(var2, var5);
      double var10 = rrjZ_2.id_byte(var2, var5);
      float var12 = var2.Bm() / 2.0F + 0.2F;
      float var13 = var2.PN();
      int var14 = (int)(255.0F * var3);
      byte var15 = 14;
      double var16 = System.currentTimeMillis() / 1000.0;
      double var18 = var16 * 3.0 % Math.PI * 2;
      double var20 = Math.toRadians(0.0);
      double var22 = Math.toRadians(60.0);
      double var24 = (var22 - var20) / var15;
      RenderSystem.disableCull();
      RenderSystem.disableAlphaTest();
      RenderSystem.disableDepthTest();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
      id_static.id_class((rqO_2)this.id_break[4]);
      id_strictfp.id_class(7, ju_3.id_public);
      rjY_2 var26 = id_void.id_byte();
      double var27 = id_void.id_case();
      double var29 = id_void.id_catch();
      double var31 = id_void.id_private();

      for (int var33 = 0; var33 < 4; var33++) {
         double var34 = var16 + var33 * 15;
         double var36 = var33 * Math.PI / 2;

         for (int var38 = 0; var38 <= var15; var38++) {
            double var39 = var20 + var38 * var24;
            var4.id_class();
            double var41 = var39 + var18 + var36;
            double var43 = var6 + var13 * Math.cos(var41);
            double var45 = var8 + Math.sin(var34 + var39 + var33) * 0.7 + var12;
            double var47 = var10 + var13 * Math.sin(var41);
            float var49 = 0.4F * (0.5F + (float)var38 / var15);
            int var50 = celestial.util.ColorHelper.id_class((float)(var38 * var15), var14);
            var4.id_class(var43 - var27, var45 - var29, var47 - var31);
            var4.id_class(var26);
            var4.id_class(var49, var49, var49);
            rjV_2 var51 = var4.id_byte().id_class();
            id_strictfp.id_class(var51, -0.5F, -0.5F, 0.0F).id_class(0.0F, 0.0F).id_class(var50).id_class();
            id_strictfp.id_class(var51, 0.5F, -0.5F, 0.0F).id_class(1.0F, 0.0F).id_class(var50).id_class();
            id_strictfp.id_class(var51, 0.5F, 0.5F, 0.0F).id_class(1.0F, 1.0F).id_class(var50).id_class();
            id_strictfp.id_class(var51, -0.5F, 0.5F, 0.0F).id_class(0.0F, 1.0F).id_class(var50).id_class();
            var4.id_break();
         }
      }

      id_default.id_break();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableCull();
   }

   @celestial.event.EventTarget
   public void id_class(rrAR var1) {
      this.u();
      if (((rrIk_1)this.id_break[26]).id_class() && (iB_2)this.id_break[31] != null) {
         var1.id_class(true);
      }
   }

   public boolean id_class(xc_3 var1) {
      this.u();
      return ((rrnK_2)this.id_break[5]).id_class(var1);
   }

   @Override
   public void id_class(boolean var1) {
      if (this.P().aI_()) {
         super.id_class(var1);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.u();
      ((rrfP_2)this.id_break[6]).id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(rrLe_1 var1) {
      this.u();
      if (((rrIk_1)this.id_break[26]).id_class() && (iB_2)this.id_break[31] != null) {
         var1.id_class(true);
      }
   }

   private Pair<iM_2, iM_2> m() {
      this.u();
      if (!((rrIk_1)this.id_break[24]).id_class()) {
         return null;
      } else {
         iM_2 var1 = null;
         iM_2 var2 = null;
         if ((iB_2)this.id_break[31] != null) {
            var1 = ((cb_3)id_import.id_class[57]).Pb();
            var2 = ((iB_2)this.id_break[31]).Pb();
            if (((cb_3)id_import.id_class[57])
                  .id_class((iB_2)this.id_break[31], iM_2.STANDING, ((iB_2)this.id_break[31]).Pb())
               > ((cb_3)id_import.id_class[57]).id_class((iB_2)this.id_break[31], iM_2.FALL_FLYING, iM_2.STANDING)) {
               ((cb_3)id_import.id_class[57]).id_class(iM_2.FALL_FLYING);
               ((iB_2)this.id_break[31]).id_class(iM_2.STANDING);
            } else {
               ((cb_3)id_import.id_class[57]).id_class(iM_2.STANDING);
               ((iB_2)this.id_break[31]).id_class(var2);
            }
         }

         return Pair.of(var1, var2);
      }
   }

   public Y id_default() {
      return (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0];
   }

   

   public boolean id_short() {
      return false;
   }

   

   public boolean id_void() {
      this.u();
      return this.P() == (rrCs_1)this.id_break[3] ? true : false;
   }

   private void u() {
      if (this.id_break == null) {
         this.id_break = new Object[36];
      }
   }

   public rrIm_1 r() {
      this.u();
      return (rrIm_1)this.id_break[16];
   }

   public float id_break() {
      return this.P().id_byte();
   }

   public float id_break(rjU_2 var1, rjU_2 var2) {
      return this.P().id_break(var1, var2);
   }

   public void id_break(iB_2 var1) {
      this.u();
      if (var1 == null && (iB_2)this.id_break[31] != null) {
         this.P().id_volatile();
      }

      this.id_break[31] = var1;
      if ((iB_2)this.id_break[31] != null) {
         iB_2 var7 = (iB_2)this.id_break[31];
         this.id_break[32] = var7;
      }
   }

   public boolean id_break(PX var1) {
      return this.P().id_break(var1);
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.u();
      rrnK_2 var2 = this.P();
      if (var2.aK_()) {
         super.id_throws(var1);
         this.id_break((iB_2)null);
      }

      var2.id_throws();
      ((rrnD_2)this.id_break[8]).id_byte();
   }

   private boolean M() {
      return this.P().id_break();
   }

   public rrnK_2 P() {
      this.u();
      return (rrnK_2)this.id_break[5];
   }

   public rrTp_1 id_catch() {
      this.u();
      if (((rrIk_1)this.id_break[13]).id_class() && (iB_2)this.id_break[31] != null) {
         rdn_3[] var1 = rrfH_2.id_class((iB_2)this.id_break[31]);
         int var2 = var1.length;

         for (int var3 = 0; var3 < var2; var3++) {
            rdn_3 var4 = var1[var3];
            if (var4.id_break() == rdy_3.OM || var4.id_break() == rdy_3.kU || var4.id_break() == rdy_3.kY) {
               return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[2];
            }
         }
      }

      String var5 = (String)((rrIQ)this.id_break[12]).id_byte();
      byte var6 = -1;
      switch (var5.hashCode()) {
         case -327231979:
            if (var5.equals("Строгий")) {
               var6 = 1;
            }
            break;
         case 1248365358:
            if (var5.equals("Таргет")) {
               var6 = 2;
            }
            break;
         case 1731698067:
            if (var5.equals("Незаметный")) {
               var6 = 0;
            }
      }
      return switch (var6) {
         case 0 -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
         case 1 -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[1];
         case 2 -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[2];
         default -> (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
      };
   }

   public float G() {
      this.u();
      if (this.id_short()) {
         return Float.MAX_VALUE;
      } else {
         return !this.M() && (rrnK_2)this.id_break[5] != (rrna_3)this.id_break[2]
            ? this.id_try() + (Float)((rrIm_1)this.id_break[17]).id_byte()
            : this.id_try();
      }
   }

   public rrIQ id_goto() {
      this.u();
      return (rrIQ)this.id_break[10];
   }

   public rrfP_2 id_const() {
      this.u();
      return (rrfP_2)this.id_break[6];
   }

   public iB_2 id_continue() {
      this.u();
      return (iB_2)this.id_break[31];
   }

   public rrIk_1 id_else() {
      this.u();
      return (rrIk_1)this.id_break[21];
   }

   public rrne_3 id_for() {
      this.u();
      return (rrne_3)this.id_break[35];
   }

   public rrIk_1 id_import() {
      this.u();
      return (rrIk_1)this.id_break[19];
   }

   public rrIk_1 id_instanceof() {
      this.u();
      return (rrIk_1)this.id_break[20];
   }

   public lD_2 id_new() {
      this.u();
      return (lD_2)this.id_break[30];
   }

   public rrIQ id_return() {
      this.u();
      return (rrIQ)this.id_break[12];
   }

   public rrIk_1 id_super() {
      this.u();
      return (rrIk_1)this.id_break[26];
   }

   public rrIk_1 id_switch() {
      this.u();
      return (rrIk_1)this.id_break[23];
   }

   public boolean id_throw() {
      this.u();
      return ((rrIk_1)this.id_break[24]).id_class();
   }

   public float id_try() {
      this.u();
      return (Float)((rrIm_1)this.id_break[16]).id_byte();
   }

   public rrIm_1 id_while() {
      this.u();
      return (rrIm_1)this.id_break[17];
   }

   public celestial.setting.GroupSetting id_static() {
      this.u();
      return (celestial.setting.GroupSetting)this.id_break[34];
   }

   public rrIk_1 id_public() {
      this.u();
      return (rrIk_1)this.id_break[18];
   }

   public float id_private() {
      return this.P().id_int();
   }

   public rrIk_1 id_abstract() {
      this.u();
      return (rrIk_1)this.id_break[28];
   }

   public rrIk_1 id_transient() {
      this.u();
      return (rrIk_1)this.id_break[25];
   }

   public iB_2 id_native() {
      this.u();
      return !((rrIk_1)this.id_break[28]).id_class() ? null : this.id_continue();
   }

   public rrIk_1 id_strictfp() {
      this.u();
      return (rrIk_1)this.id_break[24];
   }

   public iB_2 E() {
      this.u();
      return (iB_2)this.id_break[32];
   }

   

   

   public boolean az_() {
      this.u();
      return ((rrIk_1)this.id_break[14]).id_class();
   }

   public rrTH aE_() {
      return this.P().id_package();
   }

   public rrTf_1 aL_() {
      return this.P().id_protected();
   }

   public boolean aC_() {
      this.u();
      return !((rrIk_1)this.id_break[23]).id_class() ? true : false;
   }

   public float aD_() {
      this.u();
      return (Float)((rrIm_1)this.id_break[15]).id_byte();
   }

   public rrTq_1 aB_() {
      return this.P().id_case();
   }

   public rrTj_1 aF_() {
      return this.P().id_final();
   }

   public rrTH aA_() {
      return this.P().id_finally();
   }

   public boolean celestialSilentRotation() {
      return this.celestialSilentRotation.id_class();
   }

   private void celestialApplyClientRotation() {
      if (!this.celestialSilentRotation() && this.id_continue() != null) {
         PX var1 = this.P().id_private();
         if (var1 != null) {
            ((cb_3)id_import.id_class[57]).id_case(var1.id_throws(), var1.id_protected());
         }
      }
   }
}
