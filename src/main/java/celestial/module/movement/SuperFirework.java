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

public class SuperFirework extends celestial.module.Module {
   public Object[] id_break;

   public SuperFirework() {
      super("Super Firework", "Увеличивает скорость при\nиспользовании фейерверка", Category.MOVEMENT);
      this.id_super();
      rrIm_1 var5 = new rrIm_1("Скорость по XZ", 1.6F, 1.5F, 2.0F, 0.01F).id_finally();
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Скорость по Y", 1.6F, 1.5F, 2.0F, 0.01F).id_finally();
      this.id_break[1] = var6;
      this.id_class(
         (rrIm_1)this.id_break[0],
         (rrIm_1)this.id_break[1]
      );
   }

   

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrLJ var1) {
      this.id_super();
      iB_2 var2 = var1.id_class();
      if (var2 == (cb_3)id_import.id_class[57]) {
         float var3 = (Float)((rrIm_1)this.id_break[0]).id_byte();
         float var4 = (Float)((rrIm_1)this.id_break[1]).id_byte();
         var1.id_break(var3);
         var1.id_class(var4);
         var1.id_byte(var3);
      }
   }

   

   

   

   

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }
}
