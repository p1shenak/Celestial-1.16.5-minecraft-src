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

public class HitBoxes extends celestial.module.Module {
   public Object[] id_break;

   public HitBoxes() {
      super("Hitboxes", "Увеличивает хитбокс у энтити", Category.COMBAT);
      this.id_else();
      celestial.setting.CheckGroup var5 = new celestial.setting.CheckGroup()
         .id_catch(true)
         .id_case(false)
         .id_throws(false)
         .id_implements(false)
         .id_byte(false)
         .id_protected(false)
         .id_class(true);
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Размер", 0.2F, 0.1F, 2.0F, 0.1F);
      this.id_break[1] = var6;
      this.id_class(
         new rrIc_1("Выбор целей", ((celestial.setting.CheckGroup)this.id_break[0]).id_byte()),
         (rrIm_1)this.id_break[1]
      );
   }

   

   

   

   private boolean id_class(an_3 var1) {
      this.id_else();
      return var1 == (cb_3)id_import.id_class[57] ? false : rrff_3.id_class(var1, (celestial.setting.CheckGroup)this.id_break[0]);
   }

   @celestial.event.EventTarget
   public void id_class(rrnJ_2 var1) {
      this.id_else();
      an_3 var2 = var1.id_class();
      if (this.id_class(var2)) {
         var1.id_class((Float)((rrIm_1)this.id_break[1]).id_byte());
      }
   }

   

   

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   

   

   
}
