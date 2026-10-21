package celestial.module.util;

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

public class AntiShuffler extends celestial.module.Module {

   public AntiShuffler() {
      super("Anti Shuffler", "Убирает переключение слотов\nантичитом", Category.UTIL);
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvm_3 var2) {
         if ((cb_3)id_import.id_class[57] == null) {
            return;
         }

         uR_2 var4 = ((cq_3)id_import.id_class[19]).id_implements();
         if (var4.id_protected() == null && var4.id_class() == null) {
            return;
         }

         rrfo_3.id_class(var2.id_break());
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         var1.id_class(true);
      }
   }

   

   

   

   

   

   
}
