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

public class GhostHand extends celestial.module.Module {

   public GhostHand() {
      super("Ghost Hand", "Позволяет взаимодействовать с\nконтейнерами сквозь стены", Category.PLAYER);
   }

   

   @celestial.event.EventTarget(
      id_class = -200
   )
   public void id_class(rrAW var1) {
      var1.id_class(true);
   }

   @celestial.event.EventTarget(
      id_class = -200
   )
   public void id_class(rrAk_1 var1) {
      rff_3 var2 = var1.id_break();
      if (var2 != null) {
         xc_3 var3 = var1.id_class();
         rfH_2 var4 = var2.id_class();
         rJZ var5 = var3.id_break().id_class(var3, (gm_3)id_import.id_class[56], var4);
         ryO_2 var6 = ((gm_3)id_import.id_class[56]).id_class(var4);
         if (var5 == null && var6 == null) {
            var1.id_class((rff_3)null);
         }
      }
   }

   

   

   

   

   

   
}
