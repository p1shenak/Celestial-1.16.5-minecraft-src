package celestial.util;

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

public interface MinecraftAccessor {
   pg_3 id_void = celestial.util.MinecraftAccessor.id_import.id_case();
   fY_2 id_static = celestial.util.MinecraftAccessor.id_import.A();
   QY id_import = QY.id_instanceof();
   Hz_1 id_short = id_import.id_float();
   yb_3 id_default = yb_3.id_class();
   Qg_1 id_const = id_import.id_else();
   lD_2 id_strictfp = id_default.id_byte();

   default cG_2 O() {
      return (cb_3)id_import.id_class[57];
   }

   static void id_protected(String var0, boolean var1) {
      Pb_1.id_class(var0, var1);
   }

   static void a_(String var0, boolean var1) {
      if (!id_import.id_static()) {
         Pb_1.id_class(var0, var1);
      }
   }
}
