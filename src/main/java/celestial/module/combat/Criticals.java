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
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Criticals extends celestial.module.Module {

   public Criticals() {
      super("Criticals", "Позволяет всегда бить\nкритическами ударами", Category.COMBAT);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !this.id_return()) {
         this.id_byte(false);
      }
   }

   @Override
   public void id_class(boolean var1) {
      if (!this.id_return()) {
         this.id_byte(false);
      } else {
         super.id_class(var1);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFj_1 var1) {
      if (!((cb_3)id_import.id_class[57]).BL()) {
         float var2 = (Float)((cb_3)id_import.id_class[57]).id_throws[15] + rrfQ_2.id_byte(-0.0015F, 0.00105F);
         float var3 = (Float)((cb_3)id_import.id_class[57]).id_throws[16] + rrfQ_2.id_byte(-0.0015F, 0.00105F);
         double var4 = ((cb_3)id_import.id_class[57]).re() - rrfQ_2.id_byte(3.5E-5F, 6.5E-5F);
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
            .id_break(new rZX(((cb_3)id_import.id_class[57]).rx(), var4, ((cb_3)id_import.id_class[57]).BO(), var2, var3, false));
      }
   }

   

   

   

   

   

   public boolean id_new() {
      return this.aJ_() && (cb_3)id_import.id_class[57] != null && !((cb_3)id_import.id_class[57]).BL() ? true : false;
   }

   private boolean id_return() {
      if (rrjA_2.id_protected().id_throws().id_throws(ProtocolVersion.v1_17_1)) {
         String var1 = "Необходимо использовать версию 1.17.1 или выше";
         rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
         return false;
      } else {
         return true;
      }
   }

   
}
