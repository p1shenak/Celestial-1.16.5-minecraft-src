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

public class TapeMouse extends celestial.module.Module {
   public Object[] id_break;

   public TapeMouse() {
      super("Tape Mouse", "Автоматически нажимает левую\nили правую кнопку мыши", Category.COMBAT);
      this.id_return();
      rrIQ var5 = new rrIQ("Режим", "ЛКМ", "ЛКМ", "ПКМ");
      this.id_break[0] = var5;
      rrIm_1 var6 = new rrIm_1("Задержка в секундах", 0.5F, 0.0F, 60.0F, 0.5F);
      this.id_break[1] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.id_break[2] = var7;
      this.id_class(
         (rrIQ)this.id_break[0],
         (rrIm_1)this.id_break[1]
      );
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrAm_1 var1) {
      var1.id_class(true);
   }

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((rrfw_3)this.id_break[2]).id_class((Float)((rrIm_1)this.id_break[1]).id_byte() * 1000.0F)) {
         if (((String)((rrIQ)this.id_break[0]).id_byte()).equals("ЛКМ")) {
            id_import.z();
         } else {
            id_import.id_for();
         }

         ((rrfw_3)this.id_break[2]).id_class();
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      ((rrfw_3)this.id_break[2]).id_class();
   }

   

   

   

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   
}
