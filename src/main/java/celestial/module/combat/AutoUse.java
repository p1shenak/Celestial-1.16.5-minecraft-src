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
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoUse extends celestial.module.Module {
   public Object[] id_break;

   public AutoUse() {
      super("Auto Use", "Автоматически использует\nпредметы в нужный момент", Category.PLAYER);
      this.id_super();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      this.id_break(new rrlV_2(this));
      this.id_break(new rrlf_3(this));
   }

   

   

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_super();

      for (rrlg_3 var3 : (List<rrlg_3>)this.id_break[0]) {
         var3.aI_();
      }

      super.id_class(var1);
   }

   public boolean id_class(rrlg_3 var1) {
      this.id_super();

      for (rrlg_3 var3 : (List<rrlg_3>)this.id_break[0]) {
         if (var1 != var3 && !var3.id_throws()) {
            return true;
         }
      }

      return false;
   }

   @celestial.event.EventTarget
   public void id_class(j_1 var1) {
      this.id_super();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         for (rrlg_3 var3 : (List<rrlg_3>)this.id_break[0]) {
            var3.id_protected();
         }
      }
   }

   

   public <T extends rrlg_3> void id_break(T var1) {
      this.id_super();
      ((List)this.id_break[0]).add(var1);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();

      for (rrlg_3 var3 : (List<rrlg_3>)this.id_break[0]) {
         var3.aK_();
         var3.id_protected();
      }

      super.id_throws(var1);
   }

   

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
