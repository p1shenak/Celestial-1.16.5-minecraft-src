package celestial.setting;

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
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GroupSetting extends celestial.setting.Setting<List<celestial.setting.Setting<?>>> {

   public GroupSetting(String var1, celestial.setting.Setting<?>... var2) {
      super(var1, new ArrayList<>(List.of(var2)));
   }

   

   public void id_class(celestial.setting.Setting<?> var1) {
      this.id_byte().add(var1);
   }

   

   

   public void id_class(celestial.setting.Setting<?>... var1) {
      celestial.setting.Setting[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = 0; var4 < var3; var4++) {
         celestial.setting.Setting var5 = var2[var4];
      this.id_class(var5);
      }
   }

   

   

   @Override
   public boolean id_private() {
      List<celestial.setting.Setting<?>> var1 = (List)this.id_byte();
      return !super.id_private() || !var1.isEmpty() && !var1.stream().anyMatch(celestial.setting.Setting::id_private) ? false : true;
   }
}
