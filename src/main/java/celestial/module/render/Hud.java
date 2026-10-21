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
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Hud extends celestial.module.Module {
   public static Object[] id_break;
   public Object[] id_byte;

   

   private boolean id_char() {
      this.id_import();
      return ((rrIk_1)this.id_byte[2]).id_class();
   }

      static {
      Object[] var0 = new Object[]{
         celestial.manager.FontManager.id_class("montserrat", 13.0F, false),
         celestial.manager.FontManager.id_class("montserrat", 13.0F, false),
         celestial.manager.FontManager.id_class("montserrat", 13.0F, false),
         8
      };
      id_break = var0;
   }

   public Hud() {
      super("HUD", "Пользовательский интерфейс", Category.RENDER);
      this.id_import();
      rrIk_1 var5 = new rrIk_1("Включено", true);
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Фпс", true);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Бпс", true);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Тпс", true);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Координаты", true);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1("Включено", true);
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1("Включено", true);
      this.id_byte[6] = var11;
      rrIk_1 var12 = new rrIk_1("Включено", true);
      this.id_byte[7] = var12;
      rrIk_1 var13 = new rrIk_1("Включено", true);
      this.id_byte[8] = var13;
      rrIk_1 var14 = new rrIk_1("Включено", true);
      this.id_byte[9] = var14;
      rrIk_1 var15 = new rrIk_1("Включено", false);
      this.id_byte[10] = var15;
      rrIk_1 var16 = new rrIk_1("Оптимизация", false);
      this.id_byte[11] = var16;
      rrIQ var17 = (rrIQ)new rrIQ("Режим", "Плавающий", "Плавающий", "Стандартный").id_class(this::id_this);
      this.id_byte[12] = var17;
      List var18 = List.of(
         new rrqH_2(
            () -> new StringBuilder("Coords: ")
               .append(rgF_2.GRAY)
               .append((int)((cb_3)id_import.id_class[57]).rx())
               .append(" ")
               .append((int)((cb_3)id_import.id_class[57]).re())
               .append(" ")
               .append((int)((cb_3)id_import.id_class[57]).BO()),
            this::id_continue
         ),
         new rrqH_2(() -> new StringBuilder("BPS: ").append(rgF_2.GRAY).append(rrfj_3.id_case()), this::id_char),
         new rrqH_2(() -> new StringBuilder("FPS: ").append(rgF_2.GRAY).append(((Integer)QY.id_break[9]).intValue()), this::id_instanceof),
         new rrqH_2(() -> new StringBuilder("TPS: ").append(rgF_2.GRAY).append(rrfp_3.id_protected()), this::id_interface)
      );
      this.id_byte[13] = var18;
      celestial.util.AnimValue var19 = new celestial.util.AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.5F, false);
      this.id_byte[14] = var19;
      celestial.util.AnimValue var20 = new celestial.util.AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.5F, false);
      this.id_byte[15] = var20;
      this.id_class(
         new celestial.setting.GroupSetting("Ватермарк", (rrIk_1)this.id_byte[0]),
         new celestial.setting.GroupSetting("Бинды модулей", (rrIk_1)this.id_byte[7]),
         new celestial.setting.GroupSetting("Бинды предметов", (rrIk_1)this.id_byte[8]),
         new celestial.setting.GroupSetting("Эффекты", (rrIk_1)this.id_byte[5], (rrIQ)this.id_byte[12]),
         new celestial.setting.GroupSetting("Задержки", (rrIk_1)this.id_byte[9]),
         new celestial.setting.GroupSetting("Расписания", (rrIk_1)this.id_byte[10]),
         new celestial.setting.GroupSetting("Броня", (rrIk_1)this.id_byte[6]),
         new celestial.setting.GroupSetting("Информация", (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[1], (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3]),
         new celestial.setting.GroupSetting("Другое", (rrIk_1)this.id_byte[11])
      );
   }

   

   public boolean id_this() {
      this.id_import();
      return ((rrIk_1)this.id_byte[5]).id_class();
   }

   public boolean id_interface() {
      this.id_import();
      return ((rrIk_1)this.id_byte[3]).id_class();
   }

   private void id_class(Ml_1 var1, rrZO var2, float var3, float var4) {
      this.id_import();
      ((celestial.util.AnimValue)this.id_byte[14]).id_break(this.id_default());
      var4 -= ((celestial.util.AnimValue)this.id_byte[14]).id_byte();

      for (rrqH_2 var6 : (List<rrqH_2>)this.id_byte[13]) {
         var6.id_byte();
         celestial.util.AnimValue var7 = var6.id_throws();
         if (var7.id_case()) {
            float var8 = var7.id_byte();
            var2.id_class(
               var1,
               id_strictfp,
               ((StringBuilder)((Supplier)var6.id_class[0]).get()).toString(),
               var3,
               var4,
               celestial.util.ColorHelper.id_class((float)(((List)this.id_byte[13]).indexOf(var6) * 20), (int)(255.0F * var8))
            );
            var4 -= var6.id_break();
         }
      }
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4) {
      this.id_import();
      if (!((cb_3)id_import.id_class[57]).id_implements()
         && !((cb_3)id_import.id_class[57]).id_native()
         && ((Ax_1)id_import.id_class[55]).id_class()) {
         ((celestial.util.AnimValue)this.id_byte[15]).id_break(((cq_3)id_import.id_class[19]).id_int());
         var4 += ((celestial.util.AnimValue)this.id_byte[15]).id_byte();
         int var5 = (int)(var3 / 2.0F + 8.0F);
         byte var6 = 16;
         rqs_3 var7 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_break;
         int var8 = var7.size();
         int var9 = var8 - 1;

         for (int var10 = 0; var10 < var8; var10++) {
            rXQ var11 = rJT.id_finally[var10];
            rdn_3 var12 = (rdn_3)var7.get(var9 - var10);
            float var13 = var5 + var10 * var6;
            if (var12.id_class()) {
               Pair var14 = Pair.of(rJT.id_class, rJT.id_implements[var11.id_break()]);
               fj_3 var15 = (fj_3)id_import.id_class((rqO_2)var14.getFirst()).apply((rqO_2)var14.getSecond());
               id_import.A().id_class(var15.id_extends().id_protected());
               ch_3.id_class(var1, var13, var4, ((cq_3)id_import.id_class[19]).h_(), 16, 16, var15);
            } else {
               ((cq_3)id_import.id_class[19]).id_class(var13, var4, var2, (cb_3)id_import.id_class[57], var12, false);
               RenderSystem.disableDepthTest();
            }
         }

         RenderSystem.enableDepthTest();
      }
   }

   private void id_class(Ml_1 var1, rrZO var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      this.id_import();
      String var9 = (String)rrQJ.id_class[1];
      rrfD_2.id_class(
         var1, var3, var4, (Float)this.id_byte[17], var2.id_class() + 6.5F, 225, var5, var6, var7, var8, false
      );
      var2.id_byte(var1, var9, var3 + 2.0F, var4 + 4.5F, celestial.util.ColorHelper.id_class(0.0F, 180));
      var2.id_byte(var1, (String)this.id_byte[16], var3 + 2.0F, var4 + 4.0F, rrZF.d_);
   }

   

   private void id_class(Ml_1 var1, Collection<rLY> var2, rrZO var3, float var4, float var5, float var6, float var7) {
      List var8 = Ordering.natural().sortedCopy(var2);

      for (int var9 = 0; var9 < var8.size(); var9++) {
         rLY var10 = (rLY)var8.get(var9);
         int var11 = celestial.util.ColorHelper.id_class((float)(var9 * 20), 225);
         String var12 = "";
         if (var10.id_byte() >= 1 && var10.id_byte() <= 9) {
            var12 = jI_2.id_class("enchantment.level." + (var10.id_byte() + 1), new Object[0]);
         }

         StringBuilder var13 = new StringBuilder()
            .append(var10.id_final())
            .append(" ")
            .append(var12)
            .append("\n")
            .append(rgF_2.GRAY)
            .append(rLK.id_class(var10, 1.0F));
         String var14 = var13.toString();
         String var15 = var10.id_final() + " " + var12;
         float var16 = var7 * var9;
         rrfD_2.id_class(var1, var4, var5 + var16, var3.id_break(var15) + 25.0F, var6, 225, var11, var11, var11, var11, false);
         var3.id_class(var1, var14, var4 + 22.0F, var5 + var16 + 5.0F, rrZF.d_, false, false);
         rrfD_2.id_class(var1, var10.id_class(), var4 + 2.0F, var5 + var16 + 2.0F, 1.0F);
      }
   }

   public void id_class(Ml_1 var1, float var2) {
      this.id_import();
      if (this.aJ_() && ((rrIk_1)this.id_byte[6]).id_class()) {
         float var3 = id_const.id_super();
         float var4 = id_const.id_this();
      this.id_class(var1, var2, var3, var4 - 45.0F);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_import();
      Ml_1 var2 = var1.id_class();
      float var3 = (int)id_const.id_final();
      int var4 = celestial.util.ColorHelper.id_class(0.0F, 225);
      int var5 = celestial.util.ColorHelper.id_class(90.0F, 225);
      int var6 = celestial.util.ColorHelper.id_class(270.0F, 225);
      int var7 = celestial.util.ColorHelper.id_class(180.0F, 225);
      if (((rrIk_1)this.id_byte[0]).id_class() && !((Qw_1)id_import.id_class[20]).R) {
      this.id_class(var2, (rrZO)id_break[1], 5.0F, 5.0F, var4, var5, var6, var7);
      }

      if (((rrIk_1)this.id_byte[5]).id_class() && this.id_public()) {
         this.id_break(var2, (rrZO)id_break[2], 5.0F, var3 / 2.0F);
      }

      var2.id_class();
      ((rrZO)id_break[0]).id_break(id_strictfp);
      this.id_class(var2, (rrZO)id_break[0], 2.0F, var3 - ((List)this.id_byte[13]).size() - 2.0F);
      ((rrZO)id_break[0]).id_byte(id_strictfp);
      var2.id_break();
   }

   @celestial.event.EventTarget
   public void id_class(j_1 var1) {
      this.id_import();
      rrZr_1 var2 = (rrZr_1)rrQJ.id_class[5];
      Object var3 = (String)rrQJ.id_class[1];
      String[] var4 = new String[]{"" + rgF_2.RESET + var3, rgF_2.RESET + var2.id_break(), rgF_2.RESET + "UID: " + var2.id_protected(), rgF_2.RESET + rrfT_2.id_class()};
      String var9 = String.join(rgF_2.GRAY + " » ", var4);
      this.id_byte[16] = var9;
      Float var10 = ((rrZO)id_break[1]).id_break((String)this.id_byte[16]) + 5.0F;
      this.id_byte[17] = var10;
   }

   

   private float id_default() {
      float var1 = 0.0F;
      if ((vm_3)id_import.id_class[73] instanceof FP) {
         var1 += 7.0F;
      }

      return (float)(var1 * id_const.id_return());
   }

   

   

   private void id_break(Ml_1 var1, rrZO var2, float var3, float var4) {
      Collection var5 = ((cb_3)id_import.id_class[57]).So();
      if (!var5.isEmpty()) {
         float var6 = var2.id_class() + 18;
         float var7 = var6 + 7.0F;
      this.id_class(var1, var5, var2, var3, var4 - var5.size() * var7 / 2.0F + 10.0F, var6, var7);
      }
   }

   public boolean id_goto() {
      this.id_import();
      return ((rrIk_1)this.id_byte[11]).id_class();
   }

   

   public boolean id_continue() {
      this.id_import();
      if (!((rrIk_1)this.id_byte[4]).id_class()) {
         return false;
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new()
            ? false
            : true;
      }
   }

   public boolean id_else() {
      this.id_import();
      return ((rrIk_1)this.id_byte[8]).id_class();
   }

   private void id_import() {
      if (this.id_byte == null) {
         this.id_byte = new Object[18];
         this.id_byte[17] = 0.0F;
      }
   }

   public boolean id_instanceof() {
      this.id_import();
      return ((rrIk_1)this.id_byte[1]).id_class();
   }

   public float id_new() {
      this.id_import();
      if (!this.aJ_()) {
         return 0.0F;
      } else {
         return !this.id_instanceof() && !this.id_continue() && !this.id_interface()
            ? 0.0F
            : ((celestial.util.AnimValue)this.id_byte[14]).id_byte();
      }
   }

   public boolean id_return() {
      this.id_import();
      return ((rrIk_1)this.id_byte[9]).id_class();
   }

   public boolean id_super() {
      this.id_import();
      return ((rrIk_1)this.id_byte[10]).id_class();
   }

   public boolean id_throw() {
      this.id_import();
      return ((String)((rrIQ)this.id_byte[12]).id_byte()).equals("Плавающий");
   }

   public boolean id_try() {
      this.id_import();
      return ((rrIk_1)this.id_byte[7]).id_class();
   }

   public float id_while() {
      return 0.0F;
   }

   

   public boolean id_public() {
      this.id_import();
      return ((String)((rrIQ)this.id_byte[12]).id_byte()).equals("Стандартный");
   }

   
}
