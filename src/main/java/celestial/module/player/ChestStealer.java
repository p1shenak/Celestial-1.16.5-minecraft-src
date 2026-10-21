package celestial.module.player;

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

public class ChestStealer extends celestial.module.Module {
   public Object[] id_break;

   public ChestStealer() {
      super("Chest Stealer", "Автоматически забирает ресурсы\nиз сундука", Category.PLAYER);
      this.id_else();
      rrlY_2 var5 = new rrlY_2(this);
      this.id_break[1] = var5;
      rrlY_2 var6 = (rrlY_2)this.id_break[1];
      this.id_break[0] = var6;
   }

   

   

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   

   

   

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }
   }

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   public rrTF<celestial.module.player.ChestStealer> id_new() {
      this.id_else();
      return (rrTF<celestial.module.player.ChestStealer>)this.id_break[0];
   }

   
}
