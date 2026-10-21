package celestial.ui.hud;

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

public class NotificationStyle {
   public Object[] id_class;

   public celestial.ui.hud.NotificationStyle id_byte() {
      rrfu_3 var10000 = (rrfu_3)this.id_class[0];
      rVa_1 var5 = rVa_1.id_class(celestial.util.ColorHelper.id_class(0.0F));
      var10000.id_break[2] = var5;
      var10000 = (rrfu_3)this.id_class[0];
      rVa_1 var6 = rVa_1.id_class(celestial.util.ColorHelper.id_class(270.0F));
      var10000.id_break[3] = var6;
      return this;
   }

   

   NotificationStyle() {
      this.id_protected();
      rrfu_3 var5 = new rrfu_3();
      this.id_class[0] = var5;
   }

   

   public celestial.ui.hud.NotificationStyle id_class(rVa_1 var1, rVa_1 var2) {
      ((rrfu_3)this.id_class[0]).id_break[2] = var1;
      ((rrfu_3)this.id_class[0]).id_break[3] = var2;
      return this;
   }

   public celestial.ui.hud.NotificationStyle id_class(rVa_1 var1) {
      ((rrfu_3)this.id_class[0]).id_break[4] = var1;
      ((rrfu_3)this.id_class[0]).id_break[5] = var1;
      return this;
   }

   

   

   public celestial.ui.hud.NotificationStyle id_class() {
      rrfu_3 var10000 = (rrfu_3)this.id_class[0];
      rVa_1 var5 = rVa_1.id_class(celestial.util.ColorHelper.id_class(0.0F));
      var10000.id_break[4] = var5;
      var10000 = (rrfu_3)this.id_class[0];
      rVa_1 var6 = rVa_1.id_class(celestial.util.ColorHelper.id_class(270.0F));
      var10000.id_break[5] = var6;
      return this;
   }

   public celestial.ui.hud.NotificationStyle id_class(String var1) {
      ((rrfu_3)this.id_class[0]).id_break[1] = var1;
      return this;
   }

   public rVe_1 id_break() {
      return ((rrfu_3)this.id_class[0]).id_catch();
   }

   public celestial.ui.hud.NotificationStyle id_break(rVa_1 var1, rVa_1 var2) {
      ((rrfu_3)this.id_class[0]).id_break[4] = var1;
      ((rrfu_3)this.id_class[0]).id_break[5] = var2;
      return this;
   }

   public celestial.ui.hud.NotificationStyle id_break(String var1) {
      ((rrfu_3)this.id_class[0]).id_break[0] = var1;
      return this;
   }

   

   

   

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }
}
