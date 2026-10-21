package celestial.module.render;

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

public class TimeChanger extends celestial.module.Module {
   public Object[] id_break;

   public TimeChanger() {
      super("Time Changer", "Изменяет время суток", Category.RENDER);
      this.id_public();
      rrIQ var5 = new rrIQ("Режим", "Закат", "Закат", "День", "Ночь");
      this.id_break[0] = var5;
      celestial.util.AnimValue var6 = new celestial.util.AnimValue(0.1F, false);
      this.id_break[1] = var6;
      this.id_class((rrIQ)this.id_break[0]);
   }

   

   

   

   

   @celestial.event.EventTarget
   public void id_class(celestial.event.RenderEvent var1) {
      this.id_public();
      int var2 = this.id_return();
      ((celestial.util.AnimValue)this.id_break[1]).id_break(var2);
      ((gm_3)id_import.id_class[56]).id_break((long)((celestial.util.AnimValue)this.id_break[1]).id_byte());
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rFp_1) {
         var1.id_class(true);
      }
   }

   

   

   

   

   private int id_return() {
      this.id_public();
      String var1 = (String)((rrIQ)this.id_break[0]).id_byte();
      byte var2 = -1;
      switch (var1.hashCode()) {
         case 32171536:
            if (var1.equals("День")) {
               var2 = 1;
            }
            break;
         case 32448614:
            if (var1.equals("Ночь")) {
               var2 = 2;
            }
            break;
         case 999936563:
            if (var1.equals("Закат")) {
               var2 = 0;
            }
      }
      return switch (var2) {
         case 0 -> 13000;
         case 1 -> 1000;
         case 2 -> 18000;
         default -> 0;
      };
   }

   

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }
}
