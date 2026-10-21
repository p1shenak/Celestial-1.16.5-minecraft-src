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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FuntimeEnchantment {
   public Object[] id_class;

   

   public FuntimeEnchantment(String var1, int var2) {
      this.id_throws();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   

   @Override
   public String toString() {
      return "FuntimeCustomEnchantmentWrapper{enchantment='" + (String)this.id_class[0] + "', level=" + (Integer)this.id_class[1] + "}";
   }

   public static celestial.util.FuntimeEnchantment id_class(String var0) {
      return id_class(var0, 1);
   }

   public String id_class() {
      return (String)this.id_class[0];
   }

   public static celestial.util.FuntimeEnchantment id_class(String var0, int var1) {
      return new celestial.util.FuntimeEnchantment(var0, var1);
   }

   

   

   

   public int id_break() {
      return (Integer)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = 0;
      }
   }

   

   
}
