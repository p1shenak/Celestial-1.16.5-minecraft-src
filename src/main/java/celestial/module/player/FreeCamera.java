package celestial.module.player;

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

public class FreeCamera extends celestial.module.Module {
   public Object[] id_break;

   public FreeCamera() {
      super("Free Camera", "Позволяет летать в режиме\nнаблюдателя", Category.PLAYER);
      this.id_return();
      rrIm_1 var5 = new rrIm_1("Скорость", 1.5F, 0.5F, 5.0F, 0.1F);
      this.id_break[1] = var5;
      rrIk_1 var6 = new rrIk_1("Выключать при дамаге", false);
      this.id_break[2] = var6;
      rjU_2 var7 = rjU_2.id_class;
      this.id_break[3] = var7;
      rjU_2 var8 = rjU_2.id_class;
      this.id_break[4] = var8;
      rrlU_2 var9 = (rrlU_2)rrlU_2.id_break[0];
      this.id_break[5] = var9;
      this.id_class(
         (rrIk_1)this.id_break[2],
         (rrIm_1)this.id_break[1]
      );
      rrle_3 var10 = new rrle_3(this);
      this.id_break[0] = var10;
   }

   

   public boolean id_this() {
      return this.aJ_() && ((gm_3)id_import.id_class[56]).E() == rYB.id_protected ? false : true;
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrAX var1) {
      this.id_return();
      if (this.id_continue()) {
         var1.id_class(new PX(((rrlU_2)this.id_break[5]).id_throws(), ((rrlU_2)this.id_break[5]).id_case()));
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAO var1) {
      if (this.id_continue()) {
         var1.id_class(true);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAz_1 var1) {
      an_3 var2 = id_import.id_catch();
      float var3 = var1.id_case();
      double var4 = var1.id_protected();
      ly_3 var6 = ((Hh_1)id_import.id_class[16]).id_finally();
      rjU_2 var7 = var6.id_break();
      rjG_2 var8 = var2.id_class(var7, var2.id_class(var6.id_throws(), var6.id_protected(), var3), var4, false);
      var1.id_class(var8);
      var1.id_class(new PX(var6.id_throws(), var6.id_protected()));
      var1.id_class(var7);
      var1.id_class(var2.rN().id_throws(var2.Ps()).id_protected(var7));
   }

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(false);
   }

   @celestial.event.EventTarget
   public void id_class(rrLw_1 var1) {
      this.id_return();
      if ((VZ)this.id_break[6] != null && var1.id_break() != (VZ)this.id_break[6]) {
         var1.id_class(true);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLt_1 var1) {
      this.id_return();
      var1.id_class((rjU_2)this.id_break[3]);
      var1.id_break((rjU_2)this.id_break[4]);
      var1.id_class(true);
   }

   @celestial.event.EventTarget
   public void id_class(rrAM var1) {
      this.id_byte(false);
   }

   private rjU_2 id_class(rjU_2 var1, int var2) {
      return var1.id_byte(new rjU_2(0.0, 1.0, 0.0)).id_protected().id_class(var2);
   }

   @celestial.event.EventTarget
   public void id_class(rrAh_1 var1) {
      if (this.id_continue()) {
         var1.id_class(true);
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_return();
      super.id_class(var1);
      if ((cb_3)id_import.id_class[57] != null) {
         rrlU_2 var7 = new rrlU_2(
            ((cb_3)id_import.id_class[57]).rx(),
            ((cb_3)id_import.id_class[57]).re(),
            ((cb_3)id_import.id_class[57]).BO(),
            (Float)((cb_3)id_import.id_class[57]).id_throws[15],
            (Float)((cb_3)id_import.id_class[57]).id_throws[16],
            ((cb_3)id_import.id_class[57]).BL()
         );
         this.id_break[5] = var7;
         rjU_2 var8 = ((cb_3)id_import.id_class[57]).Ps();
         this.id_break[3] = var8;
         rjU_2 var9 = (rjU_2)this.id_break[3];
         this.id_break[4] = var9;
         VZ var2 = ((Qw_1)id_import.id_class[20]).id_volatile();
         ((Qw_1)id_import.id_class[20]).id_class(VZ.THIRD_PERSON_BACK);
         this.id_break[6] = var2;
         RenderSystem.recordRenderCall(() -> ((yX_2)id_import.id_class[8]).id_throws());
      }

      this.id_super().aI_();
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)((cb_3)id_import.id_class[57]).id_private[10] > 0 && ((rrIk_1)this.id_break[2]).id_class()) {
            this.id_byte(true);
         }

         rjU_2 var9 = (rjU_2)this.id_break[4];
         this.id_break[3] = var9;
         float var2 = (Float)((rrIm_1)this.id_break[1]).id_byte();
         rjU_2 var3 = ((cb_3)id_import.id_class[57])
            .id_byte(0.0F, (Float)((cb_3)id_import.id_class[57]).id_throws[15])
            .id_class(var2);
         rjU_2 var4 = new rjU_2(0.0, 1.0, 0.0).id_class(var2);
         if (((Qw_1)id_import.id_class[20]).h.id_protected()) {
            rjU_2 var10 = ((rjU_2)this.id_break[4]).id_throws(var3);
            this.id_break[4] = var10;
         }

         if (((Qw_1)id_import.id_class[20]).J.id_protected()) {
            rjU_2 var11 = ((rjU_2)this.id_break[4]).id_protected(var3);
            this.id_break[4] = var11;
         }

         if (((Qw_1)id_import.id_class[20]).X.id_protected()) {
            rjU_2 var12 = ((rjU_2)this.id_break[4]).id_throws(this.id_class(var3, -1).id_class(var2));
            this.id_break[4] = var12;
         }

         if (((Qw_1)id_import.id_class[20]).x.id_protected()) {
            rjU_2 var13 = ((rjU_2)this.id_break[4]).id_throws(this.id_class(var3, 1).id_class(var2));
            this.id_break[4] = var13;
         }

         if (((Qw_1)id_import.id_class[20]).d.id_protected()) {
            rjU_2 var14 = ((rjU_2)this.id_break[4]).id_throws(new rjU_2(0.0, 1.0, 0.0).id_class(var2));
            this.id_break[4] = var14;
         } else if (((Qw_1)id_import.id_class[20]).k.id_protected()) {
            rjU_2 var15 = ((rjU_2)this.id_break[4]).id_protected(var4);
            this.id_break[4] = var15;
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_return();
      Ml_1 var2 = var1.id_class();
      rrZO var3 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
      ly_3 var4 = ((Hh_1)id_import.id_class[16]).id_finally();
      rjU_2 var5 = var4.id_break();
      float var6 = id_const.id_new() / 4.0F;
      float var7 = id_const.id_continue() / 4.0F + 13.0F;
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new()) {
         var3.id_class(
            var2,
            "Camera Pos: " + rgF_2.GRAY + (int)var5.id_class() + " " + (int)var5.id_break() + " " + (int)var5.id_byte(),
            var6,
            var7,
            rrZF.d_,
            false
         );
         var7 += var3.id_class() + 5;
      }

      var3.id_class(
         var2, "vclip: " + rgF_2.GRAY + (int)(var4.id_byte().c_() - ((rrlU_2)this.id_break[5]).id_byte()), var6, var7, rrZF.d_, false
      );
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      rjU_2 var6 = rjU_2.id_class;
      this.id_break[3] = var6;
      rjU_2 var7 = rjU_2.id_class;
      this.id_break[4] = var7;
      rrlU_2 var8 = (rrlU_2)rrlU_2.id_break[0];
      this.id_break[5] = var8;
      if ((VZ)this.id_break[6] != null) {
         ((Qw_1)id_import.id_class[20]).id_class((VZ)this.id_break[6]);
         Object var9 = null;
         this.id_break[6] = var9;
      }

      RenderSystem.recordRenderCall(() -> ((yX_2)id_import.id_class[8]).id_throws());
      this.id_super().aK_();
   }

   

   public boolean id_continue() {
      return rrfZ_2.id_protected() ? false : true;
   }

   public boolean id_else() {
      return this.aJ_() && ((gm_3)id_import.id_class[56]).E() == rYB.id_protected ? true : false;
   }

   public rrlU_2 id_new() {
      this.id_return();
      return (rrlU_2)this.id_break[5];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   public rrTF<celestial.module.player.FreeCamera> id_super() {
      this.id_return();
      return (rrTF<celestial.module.player.FreeCamera>)this.id_break[0];
   }

   

   

   

   
}
