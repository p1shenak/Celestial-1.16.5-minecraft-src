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

public class SrpSpoofer extends celestial.module.Module {
   public Object[] id_break;

   public SrpSpoofer() {
      super("SRP Spoofer", "Убирает ресурспак на серверах\nгде это запрещено", Category.UTIL);
      this.id_new();
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrLZ var1) {
      this.id_new();
      if (var1.id_class() instanceof rZQ var2 && var2.id_break() == rZN.DECLINED) {
         var2.id_class(rZN.ACCEPTED);
         this.id_break[0] = true;
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[0]) {
         this.id_return();
         this.id_continue();
         this.id_break[0] = false;
      }
   }

   

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      this.id_break[0] = false;
   }

   private void id_continue() {
      String var1 = "Ресурспак успешно подменён";
      rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtQ_2(this.id_final(), var1, 3000));
   }

   

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         this.id_break[0] = false;
      }
   }

   private void id_return() {
      ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(rZN.SUCCESSFULLY_LOADED);
   }

   
}
