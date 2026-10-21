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

public class TotemTracker extends celestial.module.Module {

   public TotemTracker() {
      super("Totem Tracker", "Отслеживает снос тотемов", Category.UTIL);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrAp_1 var1) {
      rhd_3 var2 = var1.id_break();
      rdn_3 var3 = var1.id_class();
      rVi_1 var4 = new rgN_2("").id_class(rgF_2.GRAY);
      if (var2 == (cb_3)id_import.id_class[57]) {
         var4.id_break("Вы потеряли ");
      } else {
         var4.id_class(rrjZ_2.id_byte((an_3)var2)).id_break(" потерял ");
      }

      var4.id_class(var3.id_continue()).id_break(", зачарован: ").id_break(var3.id_public() ? rgF_2.GREEN + "✔" : rgF_2.RED + "✖");
      rrfu_3.id_class(var4);
   }

   

   

   

   
}
