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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FastBreak extends celestial.module.Module {
   public Object[] id_break;

   public FastBreak() {
      super("Fast Break", "Позволяет ломать блоки быстрее", Category.PLAYER);
      this.id_else();
      rrIm_1 var5 = new rrIm_1("Сила", 0.4F, 0.0F, 1.0F, 0.1F);
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Задержка", 0.0F, 0.0F, 5.0F, 1.0F);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Обход Grim", false);
      this.id_break[2] = var7;
      this.id_class(
         (rrIm_1)this.id_break[0],
         (rrIm_1)this.id_break[1],
         (rrIk_1)this.id_break[2]
      );
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrLZ var1) {
      this.id_else();
      if (var1.id_class() instanceof rZb_1 var2 && var2.id_protected() == rZM.STOP_DESTROY_BLOCK && ((rrIk_1)this.id_break[2]).id_class()) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
            .id_break(new rZb_1(rZM.ABORT_DESTROY_BLOCK, rfH_2.id_protected, rpr_3.UP));
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLT var1) {
      this.id_else();
      var1.id_break(1.0F - (Float)((rrIm_1)this.id_break[0]).id_byte());
   }

   @celestial.event.EventTarget
   public void id_class(rrLp_1 var1) {
      this.id_else();
      var1.id_class(((Float)((rrIm_1)this.id_break[1]).id_byte()).intValue());
   }

   

   

   

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   

   

   
}
