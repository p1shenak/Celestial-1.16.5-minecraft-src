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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StructureTimer extends celestial.module.Module {
   public Object[] id_break;

   public void id_byte(rryB var1) {
      this.id_protected(var1);
   }

   public StructureTimer() {
      super("Structure Timer", "Отображает время действия\nтрапок и пластов", Category.RENDER);
      this.id_else();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      HashSet var6 = new HashSet();
      this.id_break[1] = var6;
   }

   

   

   public void id_class(List<rryB> var1) {
      this.id_else();
      Iterator var2 = ((Set)this.id_break[1]).iterator();

      while (var2.hasNext()) {
         rryB var3 = (rryB)var2.next();
         if (!var1.contains(var3)) {
            this.id_throws(var3);
            var3.id_class(false);
            var2.remove();
         }
      }

      for (rryB var4 : var1) {
         if (((Set)this.id_break[1]).add(var4)) {
            this.id_byte(var4);
            var4.id_class(true);
         }

      this.id_class(var4);
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrnQ_2 var1) {
      this.id_catch(new rryP(var1.id_class(), var1.id_break()));
   }

   @celestial.event.EventTarget
   public void id_class(rrnE_2 var1) {
      this.id_else();
      if (!((List)this.id_break[0]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         rrZO var3 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_private();
         rjV_2 var4 = ((Hh_1)id_import.id_class[16]).id_volatile();
         int var5 = var3.id_class();
         var2.id_class();

         for (rryB var7 : (List<rryB>)this.id_break[0]) {
            celestial.util.AnimValue var8 = var7.id_finally();
            int var9 = var7.id_implements();
            var8.id_class(var9 > 0 && !var7.id_final() ? true : false);
            float var10 = var8.id_byte();
            if (var8.id_case()) {
               rjU_2 var11 = var7.id_class();
               rji_3 var12 = rrfa_3.id_class(var4, var11);
               float var13 = var12.id_class();
               float var14 = var12.id_break();
               String var15 = var7.id_case() + rgF_2.GRAY + " » " + rgF_2.RED + var9 + " сек.";
               float var16 = var3.id_break(var15) / 2.0F;
               float var17 = 12.0F;
               if (id_class(var13 + var16, var14 - var17, var13 - var16, var5 + var17)) {
                  rrfD_2.id_class(
                     var2,
                     var7.id_break(),
                     var13 - 8.0F,
                     var14 - var17 + (float)(Math.sin(System.currentTimeMillis() / 400.0) * 1.5),
                     var10,
                     0.5F,
                     0.0F,
                     0.0F,
                     0
                  );
                  var3.id_class(var2, var15, var13, var14, celestial.util.ColorHelper.id_break(rrZF.d_, (int)(var10 * 255.0F)), false);
               }
            }
         }

         var2.id_break();
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_return();
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((List)this.id_break[0]).isEmpty()) {
            return;
         }

         ArrayList var2 = new ArrayList();
         rfl_3 var3 = ((cb_3)id_import.id_class[57]).rN().id_class(1.0);

         for (rryB var5 : (List<rryB>)this.id_break[0]) {
            if (var5.id_byte().id_byte(var3)) {
               var2.add(var5);
            }
         }

      this.id_class(var2);
      }
   }

   @celestial.event.EventTarget
   public void id_class(j_1 var1) {
      this.id_else();
      if (!((List)this.id_break[0]).isEmpty()) {
         ((List<rryB>)this.id_break[0]).removeIf(var1x -> {
            var1x.id_native();
            boolean var2 = var1x.id_extends() && !var1x.id_finally().id_case() ? true : false;
            if (var2 && var1x.id_final()) {
               this.id_break(var1x);
            }

            return var2;
         });
      }
   }

   public void id_class(rryB var1) {
      this.id_class(var1, (cd_3)((cq_3)id_import.id_class[19]).id_extends().id_catch().get(var1.id_catch()));
   }

   private static boolean id_class(float var0, float var1, float var2, float var3) {
      return var2 < id_const.id_volatile() && var0 > 0.0F && var1 < id_const.id_final() && var1 > -var3 ? true : false;
   }

   public void id_class(rryB var1, cd_3 var2) {
      if (var2 != null) {
         rgP_2 var3 = var2.id_implements();
         rVi_1 var4 = this.id_private(var1);
         if (!var4.equals(var3)) {
            var2.id_class(1.0F - var1.id_volatile());
         }

         var2.id_class(var4);
         if (var2.id_class() <= 0.0F) {
            this.id_break(var1);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAM var1) {
      this.id_return();
   }

   

   @celestial.event.EventTarget
   public void id_class(rrnN_2 var1) {
      this.id_catch(new rryS(var1.id_class(), var1.id_break()));
   }

   

   public void id_break(rryB var1) {
      ((cq_3)id_import.id_class[19]).id_extends().id_catch().remove(var1.id_catch());
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_return();
   }

   public void id_throws(rryB var1) {
      this.id_break(var1);
   }

   private void id_catch(rryB var1) {
      this.id_else();
      ((List)this.id_break[0]).add(var1);
   }

   

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   

   private void id_return() {
      this.id_try();
      this.id_super();
   }

   private void id_super() {
      this.id_else();
      ((Set)this.id_break[1]).clear();
   }

   private void id_try() {
      this.id_else();

      for (rryB var2 : (List<rryB>)this.id_break[0]) {
         this.id_break(var2);
      }

      ((List)this.id_break[0]).clear();
   }

   

   

   public void id_protected(rryB var1) {
      UUID var2 = var1.id_catch();
      ((cq_3)id_import.id_class[19])
         .id_extends()
         .id_catch()
         .put(
            var2,
            new cd_3(
               var2, this.id_private(var1), rRb_1.WHITE, rRM.PROGRESS, 1.0F - var1.id_volatile(), false, false, false
            )
         );
   }

   private rVi_1 id_private(rryB var1) {
      return new rgN_2(var1.id_case()).id_class(new rgN_2(", исчезнет через " + rgF_2.RED + var1.id_implements() + " сек."));
   }
}
