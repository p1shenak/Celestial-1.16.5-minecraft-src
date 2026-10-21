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

public class SuperBow extends celestial.module.Module {
   public Object[] id_break;

   public SuperBow() {
      super("Super Bow", "Увеличивает урон с лука", Category.COMBAT);
      this.id_continue();
      rrIm_1 var5 = new rrIm_1("Сила выстрела", 50.0F, 10.0F, 100.0F, 10.0F);
      this.id_break[0] = var5;
      this.id_class((rrIm_1)this.id_break[0]);
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrLZ var1) {
      this.id_continue();
      if (var1.id_class() instanceof rZb_1 var2) {
         if (var2.id_protected() != rZM.RELEASE_USE_ITEM || !((cb_3)id_import.id_class[57]).sR()) {
            return;
         }

         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.START_SPRINTING));

         for (int var4 = 0; var4 < ((Float)((rrIm_1)this.id_break[0]).id_byte()).intValue(); var4++) {
      this.id_class(((cb_3)id_import.id_class[57]).re() + 1.0E-10, false);
      this.id_class(((cb_3)id_import.id_class[57]).re() - 1.0E-10, true);
         }
      }
   }

   private void id_class(double var1, boolean var3) {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
         .id_class(new rZh_1(((cb_3)id_import.id_class[57]).rx(), var1, ((cb_3)id_import.id_class[57]).BO(), var3));
   }

   

   

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   

   

   

   
}
