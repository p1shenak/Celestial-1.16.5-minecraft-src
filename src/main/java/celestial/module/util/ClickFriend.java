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

public class ClickFriend extends celestial.module.Module {
   public Object[] id_break;

   public ClickFriend() {
      super("Click Friend", "Добавляет или удаляет игрока из\nдрузей на клавишу", Category.UTIL);
      this.id_new();
      rrIF var5 = new rrIF("Клавиша", KeyBind.get(3));
      this.id_break[0] = var5;
      this.id_class(
         (rrIF)this.id_break[0]
      );
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrLB var1) {
      this.id_new();
      if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte()) {
         if (Ph_1.id_class(
            ((cb_3)id_import.id_class[57]).id_goto(),
            128.0F,
            true,
            var0 -> var0 instanceof rhd_3 var1x && !var1x.sc() && var1x.Pu() ? true : false
         ) instanceof cG_2 var3) {
            if (var3 == this.O()) {
               return;
            }

            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var3)) {
               ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_byte(var3.id_extends());
            } else {
               ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(new rrZk_1(var3.id_extends()), true);
            }
         }
      }
   }

   

   

   

   

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   
}
