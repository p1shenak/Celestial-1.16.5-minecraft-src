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

public class FriendProtect extends celestial.module.Module {
   private static short[] id_protected = new short[2];

   public FriendProtect() {
      super("Friend Protect", "Отменяет урон по друзьям", Category.COMBAT);
   }

   

   

   

   @celestial.event.EventTarget(
      id_class = -200
   )
   public void id_class(rrAW var1) {
      rfo_3 var2 = var1.id_class();
      if (var2 != null) {
         if (var2.id_class() instanceof cG_2 var4 && ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_protected[1]]).id_class(var4)) {
            var1.id_class(true);
         }
      }
   }

   

   private static void id_continue() {
      id_protected = new short[2];
   }

   

   
}
