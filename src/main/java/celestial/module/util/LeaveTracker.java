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

public class LeaveTracker extends celestial.module.Module {

   public LeaveTracker() {
      super("Leave Tracker", "Отслеживает позицию телепорта\nигроков", Category.UTIL);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrAQ var1) {
      if (var1.id_class() instanceof cG_2 var3) {
         if (var3 == (cb_3)id_import.id_class[57]
            || var3.sc()
            || ((cb_3)id_import.id_class[57]).id_implements(var3) < 100.0F
            || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var3)) {
            return;
         }

         Object var4 = rrfu_3.id_class(this);
         rgN_2 var5 = new rgN_2("" + rgF_2.GRAY + var4 + var3.id_extends() + " ливнул на " + var3.PG());
         rgN_2 var6 = new rgN_2(rgF_2.GRAY + "Нажмите чтобы скопировать координаты");
         Runnable var7 = () -> {
            ((Qj_1)id_import.id_class[23]).id_class((int)var3.rx() + " " + (int)var3.re() + " " + (int)var3.BO());
            rrfu_3.id_byte(var4 + "Координаты скопированы в буфер обмена");
         };
         rVi_1 var8 = rgv_3.id_class(var5, new rgy_3(rgp_3.id_class, var6), new rgl_3(var7));
         rrfu_3.id_class(var8);
      }
   }

   

   

   

   

   
}
