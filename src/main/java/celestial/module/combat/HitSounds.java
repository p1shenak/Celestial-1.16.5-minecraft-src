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

public class HitSounds extends celestial.module.Module {
   public Object[] id_break;

   public HitSounds() {
      super("Hit Sounds", "Воспроизводит звуки при ударе", Category.COMBAT);
      this.id_goto();
      rrIQ var5 = new rrIQ("Выбор звука", "UwU", "UwU", "Бонк", "Стоны", "Маркер");
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Питч звука", 1.0F, 0.1F, 2.0F, 0.1F);
      this.id_break[1] = var6;
      this.id_class(
         (rrIQ)this.id_break[0],
         (rrIm_1)this.id_break[1]
      );
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_goto();
         if (!(Boolean)var2.getRight()) {
            String var3 = (String)var1.id_byte();
            float var4 = (Float)((rrIm_1)this.id_break[1]).id_byte();
      this.id_class(var3, var4);
         }
      });
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_goto();
      if (var1.id_class() instanceof iB_2) {
      this.id_class((String)((rrIQ)this.id_break[0]).id_byte(), (Float)((rrIm_1)this.id_break[1]).id_byte());
      }
   }

   private void id_class(String var1, float var2) {
      byte var4 = -1;
      switch (var1.hashCode()) {
         case 85459:
            if (var1.equals("UwU")) {
               var4 = 0;
            }
            break;
         case 32090794:
            if (var1.equals("Бонк")) {
               var4 = 1;
            }
            break;
         case 1009712267:
            if (var1.equals("Стоны")) {
               var4 = 3;
            }
            break;
         case 1076597177:
            if (var1.equals("Маркер")) {
               var4 = 2;
            }
      }

      switch (var4) {
         case 0:
            rrIy_1.id_class(rqn_3.zx, 1.0F, var2);
            break;
         case 1:
            rrIy_1.id_class(rqn_3.zd, 1.0F, var2);
            break;
         case 2:
            rrIy_1.id_class(rqn_3.zk, 1.0F, var2);
            break;
         case 3:
            rrIy_1.id_class(this.id_public(), 1.0F, var2);
      }
   }

   

   

   

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   

   

   

   

   

   private rqA_2 id_public() {
      return switch ((int)(Math.random() * 4.0)) {
         case 1 -> rqn_3.zz;
         case 2 -> rqn_3.zQ;
         case 3 -> rqn_3.zN;
         default -> rqn_3.zW;
      };
   }
}
