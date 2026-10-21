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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BowSpam extends celestial.module.Module {
   public Object[] id_break;

   public BowSpam() {
      super("Bow Spam", "Позволяет быстро стрелять из лука", Category.COMBAT);
      this.id_else();
      rrIm_1 var5 = new rrIm_1("Задержка", 2.0F, 2.0F, 5.0F, 1.0F);
      this.id_break[0] = var5;
      this.id_class((rrIm_1)this.id_break[0]);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.id_continue()) {
            return;
         }

         if (((cb_3)id_import.id_class[57]).Sw() > (Float)((rrIm_1)this.id_break[0]).id_byte()) {
            ((Ax_1)id_import.id_class[55]).id_break((cb_3)id_import.id_class[57]);
         }
      }
   }

   

   

   

   private boolean id_continue() {
      return ((cb_3)id_import.id_class[57]).sR();
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   

   

   
}
