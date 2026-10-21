package celestial.ui.clickgui;

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

public class GuiList extends rrtw_3 {
   public Object[] id_throws;

   

   

   public GuiList(rrtN_2 var1, rrIc_1 var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_instanceof();
      ArrayList var13 = new ArrayList();
      this.id_throws[0] = var13;

      for (rrIk_1 var8 : var2.id_class()) {
         ((List<rrwB_2>)this.id_throws[0]).add(new rrwB_2(var8));
      }
   }

   

   

   public void id_class(Ml_1 var1, rrtI_2 var2, int var3, int var4) {
      this.id_instanceof();
      float var5 = var2.id_break();
      float var6 = var2.id_byte();
      float var7 = var2.id_throws();
      float var8 = var2.id_class();
      celestial.util.AnimValue var9 = this.id_return();
      float var10 = var9.id_byte();
      int var11 = (int)(255.0F * var10);
      id_class(var1, this, var5, var6, var7, var8);
      rrtF_2.id_class(var1, this, var5 + var7 - 4.0F, var6 + 4.5F, 1.0F, 180.0F + var10 * 180.0F, rrZF.d_, 255);
      float var12 = 10.0F * var10 + 3.0F;

      for (rrwB_2 var14 : this.id_while()) {
         float var15 = var5 + 2.0F;
         float var16 = var6 + var12;
         var14.id_throws().id_class(var14.id_case().id_private());
         var14.id_break().id_class(var14.id_protected());
         float var17 = var14.id_throws().id_byte();
         float var18 = var14.id_break().id_byte();
         if (this.id_return().id_case()) {
            int var19 = celestial.util.ColorHelper.id_class(rrZF.n_, rrZF.d_, var18);
            rrZO var20 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally();
            var14.id_class(new rruv_1(var5, var16 - 3.0F, var7, var20.id_class() + 6));
            rrtF_2.id_protected(var1, this, var20, var14.id_byte(), var15, var16, var19, (int)(var11 * var10 * var17));
            var12 += 10.0F * var10 * var17;
            Float var25 = var12;
            this.id_throws[1] = var25;
         }
      }

      this.id_class(var1, var5, var6);
   }

   public boolean id_class(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7) {
      if (!this.id_return().id_case()) {
         return false;
      } else {
         for (rrwB_2 var9 : this.id_while()) {
            if (var7 == 0 && var9.id_class().id_break(var5, var6)) {
               var9.id_case().id_class(!var9.id_protected() ? true : false, false, true);
               return true;
            }
         }

         return false;
      }
   }

   

   private void id_class(Ml_1 var1, float var2, float var3) {
      List var4 = this.id_while()
         .stream()
         .filter(rrwB_2::id_protected)
         .<rrIk_1>map(rrwB_2::id_case)
         .sorted(
            Comparator.comparingInt(
               var0 -> -(
                  (int)((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
                     .id_finally()
                     .id_break(var0.id_throws())
               )
            )
         )
         .toList();
      String var5;
      if (var4.isEmpty()) {
         var5 = "Нету :(";
      } else {
         var5 = ((rrIk_1)var4.get(0)).id_throws();
      }

      rrtF_2.id_class(
         var1,
         ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally(),
         var5,
         var2 + 2.0F,
         var3 + 3.0F,
         rrZF.d_,
      this.id_class(255)
      );
   }

   public float id_class(float var1, float var2) {
      this.id_instanceof();
      return (Float)this.id_throws[1] - 2.0F;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 822310323;
   }

   private void id_instanceof() {
      if (this.id_throws == null) {
         this.id_throws = new Object[2];
         Object[] var1 = this.id_throws;
         var1[1] = 0.0F;
      }
   }

   

   

   public List<rrwB_2> id_while() {
      this.id_instanceof();
      return ((List<rrwB_2>)this.id_throws[0])
         .stream()
         .filter(var0 -> !var0.id_case().id_private() && !var0.id_throws().id_case() ? false : true)
         .toList();
   }

   public float id_public() {
      this.id_instanceof();
      rrZO var1 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally();
      return (float)(
         ((List<rrwB_2>)this.id_throws[0]).stream().mapToDouble(var1x -> var1.id_break(var1x.id_byte())).max().orElse(0.0) + 10.0
      );
   }

   public List<? extends rrtn_3> id_protected() {
      return this.id_while();
   }

   

   
}
