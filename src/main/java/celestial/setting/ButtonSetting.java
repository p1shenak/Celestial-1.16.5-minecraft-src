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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ButtonSetting extends celestial.setting.Setting<Runnable> {
   public Object[] id_break;

   public ButtonSetting(celestial.module.Module var1, String var2, Runnable var3) {
      super(var2, var3);
      this.id_native();
      this.id_break[0] = var1;
      this.id_break[1] = var3;
   }

   

   public celestial.module.Module id_class() {
      this.id_native();
      return (celestial.module.Module)this.id_break[0];
   }

   

   

   public Runnable id_break() {
      this.id_native();
      return (Runnable)this.id_break[1];
   }

   

   

   

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }
}
