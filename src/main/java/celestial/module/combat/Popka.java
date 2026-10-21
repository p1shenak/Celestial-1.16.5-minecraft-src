package celestial.module.combat;

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

public class Popka extends celestial.module.Module {
   public Object[] id_break;

   public Popka() {
      super("Popka", ":D", Category.COMBAT);
      this.id_this();
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         this.id_break[0] = 0;
         this.id_break[1] = false;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAG var1) {
      this.id_this();
      this.id_break[0] = Integer.valueOf(5);
      this.id_break[1] = true;
   }

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[1]) {
         ((cb_3)id_import.id_class[57]).id_protected("/warp huhu");
         this.id_break[1] = false;
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_this();
      super.id_throws(var1);
      this.id_break[0] = Integer.valueOf(0);
      this.id_break[1] = false;
   }

   

   

   

   
}
