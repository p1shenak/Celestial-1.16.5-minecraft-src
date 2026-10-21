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
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GriefJoiner extends celestial.module.Module {
   public Object[] id_break;

   public GriefJoiner() {
      super("Grief Joiner", "Помогает зайти на гриф сервера\nReallyWorld", Category.UTIL);
      this.id_goto();
      rrIv_1 var5 = new rrIv_1("Режим", rrte_3.id_class((Pattern)rrtR_2.id_class[2]));
      this.id_break[0] = var5;
      this.id_class((rrIv_1)this.id_break[0]);
      rrpH_2 var6 = new rrpH_2(this);
      this.id_break[1] = var6;
   }

   

   

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      if (this.id_continue() && ((rrpl_3)this.id_break[2] == null || ((rrpl_3)this.id_break[2]).aI_())) {
         super.id_class(var1);
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_goto();
      if ((rrpl_3)this.id_break[2] == null || ((rrpl_3)this.id_break[2]).aK_()) {
         super.id_throws(var1);
         Object var6 = null;
         this.id_break[2] = var6;
      }
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   private boolean id_continue() {
      this.id_goto();
      ((rrpH_2)this.id_break[1]).id_class((rrfq_3)rrfp_3.id_class[1]).ifPresentOrElse(var1 -> {
         this.id_goto();
         this.id_break[2] = var1;
         ((rrpl_3)this.id_break[2]).id_class();
      }, () -> {
         this.id_byte(false);
         String var1 = "Не удалось определить сервер";
         rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
      });
      return (rrpl_3)this.id_break[2] != null ? true : false;
   }

   

   public String id_new() {
      this.id_goto();
      return ((rrIv_1)this.id_break[0]).id_extends();
   }

   

   
}
