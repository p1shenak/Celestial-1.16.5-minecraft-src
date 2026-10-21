package celestial.ui.hud;

import celestial.*;
import celestial.manager.FontManager;
import celestial.module.player.StreamerMode;
import celestial.module.combat.AttackAura;
import celestial.module.combat.TriggerBot;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;

public class TargetHud extends rrvj_1 {
   public Object[] id_byte = new Object[5];
   public static Object[] id_protected = new Object[]{0.0F, 0.0F, 0.0F, 5, 2, 0.0F, 5};

   public TargetHud() {
      super("Target HUD", () -> 100.0F, () -> 33.0F);
      rrFC var5 = new rrFC();
      this.id_byte[0] = var5;
      rrFA var6 = new rrFA();
      this.id_byte[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], 0.4F, false);
      this.id_byte[2] = var7;
      AnimValue var8 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], 0.4F, false);
      this.id_byte[3] = var8;
   }

   private void s() {
      if (this.id_byte == null) {
         this.id_byte = new Object[5];
      }
   }

   private void id_class(Ml_1 var1, iB_2 var2, float var3, float var4, float var5, int var6) {
      boolean var7 = (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2];
      StreamerMode var8 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws();
      String var9 = var8.id_break(var2.id_extends());
      FontManager.INSTANCE.id_case().id_class(var1, var9, var3, var4, var6, var5 * 0.5F + 2.0F);
      FontManager.INSTANCE.id_native().id_break(var1, this.id_class(var2, var7), var3, var4 + 11.0F, var6, false, false);
   }

   public boolean id_class() {
      return true;
   }

   private String id_class(iB_2 var1, boolean var2) {
      this.s();
      if (var2 && var1 != (cb_3)id_import.id_class[57] && var1.Pp()) {
         return "HP: Неизвестно";
      } else {
         StringBuilder var3 = new StringBuilder("HP: ").append(rql_3.id_class(((AnimValue)this.id_byte[2]).id_byte()));
         if (var1.Sd() > 0.0F && !var2) {
            var3.append(rgF_2.GRAY)
               .append(" + ")
               .append(rgF_2.YELLOW)
               .append(rql_3.id_class(((AnimValue)this.id_byte[3]).id_byte()))
               .append(" AB");
         }

         return var3.toString();
      }
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.s();
      super.id_class(var1, var2, var3, var4, var5);
      iB_2 var6 = this.id_while();
      iB_2 var7 = var6 != null ? var6 : (iB_2)this.id_byte[4];
      if (var7 != null) {
         ((rrFA)this.id_byte[1]).id_class(var7);
         ((AnimValue)this.id_byte[2]).id_break(var7.u_());
         ((AnimValue)this.id_byte[3]).id_break(var7.Sd());
         float var8 = this.id_long();
         float var9 = this.id_default() + this.id_implements();
         float var10 = this.id_abstract() - 8.0F - 4.0F;
         ((rrFA)this.id_byte[1]).id_class(var1, var9, var10, var8);
         this.id_class(var1, var7);
      }
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      rrfD_2.id_class(
         var1,
         var2,
         var3,
         var4 - 1.0F,
         5.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         ColorHelper.id_class(35, var10)
      );
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_goto()) {
         rrfD_2.id_class(var1, var2 - 1.0F, var3 - 2.0F, var5 + 1.0F, 10.0F, 2.0F, 4.0F, var6, var7, var8, var9);
      }

      float var11 = !(var5 < 4.0F) && !(var5 > var4 - 2.0F) ? 0.0F : 2.0F;
      rrfD_2.id_break(var1, var2, var3, var5 - 1.0F, 5.0F, 2.0F, var11, var11, 2.0F, var6, var7, var8, var9);
   }

   private void id_class(Ml_1 var1, iB_2 var2) {
      this.s();
      float var3 = this.id_default();
      float var4 = this.id_abstract();
      float var5 = this.id_implements();
      float var6 = this.id_long();
      int var7 = (int)rfU_2.id_class(255.0F * var6, 0.0F, 255.0F);
      int var8 = Math.min(var7, 225);
      int var9 = ColorHelper.id_break(rrZF.d_, var7);
      int var10 = ColorHelper.id_class(0.0F, var8);
      int var11 = ColorHelper.id_class(90.0F, var8);
      int var12 = ColorHelper.id_class(270.0F, var8);
      int var13 = ColorHelper.id_class(180.0F, var8);
      byte var14 = 28;
      float var15 = var3 + var14 + 4.0F;
      float var16 = var4 + 5.0F;
      float var17 = var3 + var14 + 5.0F;
      float var18 = var5 - var14 - 9.0F;
      float var19 = var2.SK();
      float var20 = Math.min(((AnimValue)this.id_byte[2]).id_byte(), var19) / var19 * var18;
      rrfD_2.id_class(var1, var3, var4, var5, 33.0F, var8, var10, var11, var12, var13, false);
      this.id_class(var1, var2, var15, var16, var5, var9);
      ((rrFC)this.id_byte[0])
         .id_class(
            var1,
            var2,
            var3 + 2.0F,
            var4 + 2.5F,
            var14,
            var14,
            2.5F,
            ((Integer)var2.id_private[10]).intValue() / 20.0F,
            var7
         );
      this.id_class(var1, var17, var4 + var14 - 5.0F, var18, var20, var10, var11, var12, var13, var7);
   }

   public boolean id_package() {
      return this.id_while() != null;
   }

   public iB_2 id_while() {
      this.s();
      if ((vm_3)id_import.id_class[73] instanceof FP) {
         cb_3 var9;
         cb_3 var10000 = var9 = (cb_3)id_import.id_class[57];
         this.id_byte[4] = var9;
         return var10000;
      } else {
         rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
         AttackAura var2 = var1.E();
         TriggerBot var3 = var1.id_long();
         iB_2 var4 = var2.id_native();
         if (var4 == null) {
            var4 = var3.id_native();
         }

         if (var4 != null) {
            this.id_byte[4] = var4;
         }

         return var4;
      }
   }

   public boolean id_protected() {
      return false;
   }

   public void ar_() {
      this.s();
      super.ar_();
      ((rrFA)this.id_byte[1]).id_break();
   }

   public float au_() {
      this.s();
      return ((rrFA)this.id_byte[1]).id_class() ? 10.0F : 0.0F;
   }
}
