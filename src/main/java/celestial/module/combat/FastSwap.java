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
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FastSwap extends celestial.module.Module {
   public Object[] id_break;

   public FastSwap() {
      super("Fast Swap", "Меняет предмет в основной руке", Category.COMBAT);
      this.id_super();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      rrCQ var6 = this.id_class(new rrCQ(this));
      this.id_break[1] = var6;
      rrCl_1 var7 = this.id_class(new rrCl_1(this));
      this.id_break[2] = var7;
      rrCc_1 var8 = this.id_class(new rrCc_1(this));
      this.id_break[3] = var8;
      rrCm_1 var9 = this.id_class(new rrCm_1(this));
      this.id_break[4] = var9;
      rrCL var10 = this.id_class(new rrCL(this));
      this.id_break[5] = var10;
      rrCn_1 var11 = this.id_class(new rrCn_1(this));
      this.id_break[6] = var11;
   }

   

   

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_super();
      super.id_class(var1);

      for (rrTF var3 : (List<rrTF>)this.id_break[0]) {
         var3.aI_();
      }
   }

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_super();
      ((List)this.id_break[0]).add(var1);
      return (T)var1;
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);

      for (rrTF var3 : (List<rrTF>)this.id_break[0]) {
         var3.aK_();
      }
   }

   

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }
}
