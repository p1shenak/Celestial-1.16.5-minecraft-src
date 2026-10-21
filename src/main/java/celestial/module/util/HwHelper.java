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
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HwHelper extends celestial.module.Module {
   public Object[] id_break;

   public HwHelper() {
      super("HW Helper", "Утилитарный модуль для\nHolyWorld", Category.UTIL);
      this.id_else();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      rrpt_3 var6 = this.id_class(new rrpt_3(this));
      this.id_break[1] = var6;
      rrpg_3 var7 = this.id_class(new rrpg_3(this));
      this.id_break[2] = var7;
      rrpp_3 var8 = this.id_class(new rrpp_3(this));
      this.id_break[3] = var8;
      rrpf_3 var9 = this.id_class(new rrpf_3(this));
      this.id_break[4] = var9;
      rrpU_2 var10 = this.id_class(new rrpU_2(this));
      this.id_break[5] = var10;
      rrpo_3 var11 = this.id_class(new rrpo_3(this));
      this.id_break[6] = var11;
   }

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_else();
      super.id_class(var1);

      for (rrTF var3 : (List<rrTF>)this.id_break[0]) {
         var3.aI_();
      }
   }

   

   

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_else();
      ((List)this.id_break[0]).add(var1);
      return (T)var1;
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);

      for (rrTF var3 : (List<rrTF>)this.id_break[0]) {
         var3.aK_();
      }
   }

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   public List<rrTF<?>> id_new() {
      this.id_else();
      return (List<rrTF<?>>)this.id_break[0];
   }

   
}
