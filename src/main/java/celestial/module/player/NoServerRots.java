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

public class NoServerRots extends celestial.module.Module {

   public NoServerRots() {
      super("No Server Rots", "Убирает ротацию со стороны\nсервера", Category.UTIL);
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrAl_1 var1) {
      if ((cb_3)id_import.id_class[57] != null) {
         String var2 = ((cb_3)id_import.id_class[57]).id_short();
         if (var2 == null || !var2.contains("BotFilter (https://vk.cc/")) {
            var1.id_byte(true);
         }
      }
   }

   

   

   

   
}
