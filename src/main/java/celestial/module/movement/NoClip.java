package celestial.module.movement;

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

public class NoClip extends celestial.module.Module implements rrnZ_2 {

   public NoClip() {
      super("No Clip", "Позволяет проходить сквозь\nблоки", Category.PLAYER);
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrLz_1 var1) {
      if (((cb_3)id_import.id_class[57]).BW()) {
         rjU_2 var2 = var1.id_catch();
         if (var1.id_private()) {
            var1.id_protected(true);
         }

         if (var1.id_catch().id_byte > 0.0 || ((cb_3)id_import.id_class[57]).h()) {
            var1.id_break(true);
         }

         var2.id_byte = Math.min(var2.id_byte, 99999.0);
      }
   }

   public void id_class() {
      this.id_byte(false);
   }

   

   

   

   

   
}
