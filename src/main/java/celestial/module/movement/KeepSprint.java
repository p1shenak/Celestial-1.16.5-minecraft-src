package celestial.module.movement;

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

public class KeepSprint extends celestial.module.Module {
   private static short[] id_throws = new short[4];
   public Object[] id_break;

   public KeepSprint() {
      super("Keep Sprint", "Не дает сбросить спринт при\nударе", Category.MOVEMENT);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Vanilla", "Vanilla", "SpookyTime");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFt_1 var1) {
      this.id_this();
      String var2 = (String)((rrIQ)this.id_break[id_throws[3]]).id_byte();
      if (var2.equals("Vanilla")) {
         var1.id_class(true);
      } else if (var2.equals("SpookyTime")) {
         var1.id_break(true);
      }
   }

   

   

   

   

   

   private static void id_super() {
      id_throws = new short[4];
   }
}
