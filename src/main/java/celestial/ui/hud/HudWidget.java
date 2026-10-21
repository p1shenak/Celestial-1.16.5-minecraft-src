package celestial.ui.hud;

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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HudWidget extends rrvR_1 {
   public Object[] id_protected;

   

   public HudWidget() {
      super("Staff Viewer", new celestial.util.AnimValue(0.5F, true), new celestial.util.AnimValue(0.5F, true));
      this.B();
      rrFZ var5 = new rrFZ(this);
      this.id_protected[0] = var5;
      Float var6 = this.S();
      this.id_protected[1] = var6;
      this.id_try().id_class((Float)this.id_protected[1]);
   }

   

   private void B() {
      if (this.id_protected == null) {
         this.id_protected = new Object[2];
         Object[] var1 = this.id_protected;
         var1[1] = 0.0F;
      }
   }

   private float S() {
      this.B();
      boolean var1 = false;
      int var2 = 0;

      for (rrqr_3 var4 : ((rrFZ)this.id_protected[0]).id_byte()) {
         int var5 = (int)((rrFZ)this.id_protected[0]).id_class(var4);
         if (!var1 || var5 > var2) {
            var1 = true;
            var2 = var5;
         }
      }

      float var6 = var1 ? var2 : 0.0F;
      return Math.max(
         ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class().id_break(this.id_byte())
            + 47.0F,
         var6
      );
   }

   

   

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      float var8 = this.id_implements();
      float var9 = this.ao_();
      rrvg_1.id_class(this, var1, () -> {
         this.B();
         rrfi_3.id_break();
         rrfD_2.id_protected(var1, var6, var7 + 12.5F, var8, var9, -1);
         rrfi_3.id_class(1);
         ((rrFZ)this.id_protected[0]).id_class(var1, var6, var7);
         rrfi_3.id_class();
      });
   }

   

   

   

   public float id_goto() {
      this.B();
      return (Float)this.id_protected[1];
   }

   public void id_instanceof() {
      this.B();
      super.id_instanceof();
      this.id_break(!((rrFZ)this.id_protected[0]).id_class() && (vm_3)id_import.id_class[73] instanceof FP ? true : false);
      Float var5 = this.S();
      this.id_protected[1] = var5;
      ((rrFZ)this.id_protected[0]).id_throws();
   }

   public boolean id_package() {
      this.B();
      celestial.module.render.StaffViewer var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o();
      if (!var1.aJ_()) {
         return false;
      } else {
         return !this.id_super() && !((rrFZ)this.id_protected[0]).id_class() ? false : true;
      }
   }

   

   public float id_while() {
      this.B();
      return ((rrFZ)this.id_protected[0]).id_finally() - 2.0F;
   }

   public boolean id_protected() {
      return false;
   }

   

   public float ao_() {
      return this.id_while();
   }
}
