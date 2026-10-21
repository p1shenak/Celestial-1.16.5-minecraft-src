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

public class ItemScroller extends celestial.module.Module {
   public Object[] id_break;

   public ItemScroller() {
      super("Item Scroller", "Позволяет быстро забирать или\nперекладывать предметы", Category.UTIL);
      this.id_return();
      rrIm_1 var5 = new rrIm_1("Задержка", 0.0F, 0.0F, 100.0F, 10.0F);
      this.id_break[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[1] = var6;
      this.id_class((rrIm_1)this.id_break[0]);
   }

   

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrns_3 var1) {
      this.id_return();
      Fu_1 var2 = var1.id_class();
      rJY var3 = var2.id_int();
      if (var3 != null && var3.id_break()) {
         if (((rrfw_3)this.id_break[1]).id_class(((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue())) {
            if (vm_3.id_synchronized() && rrfC_2.id_break(0)) {
               var2.id_class(var3, var3.id_protected, 0, rXa_1.QUICK_MOVE);
            } else if (vm_3.id_else() && rrfC_2.id_break(((Qw_1)id_import.id_class[20]).N.id_int().id_break())) {
               var2.id_class(var3, var3.id_protected, 1, rXa_1.THROW);
            }

            ((rrfw_3)this.id_break[1]).id_class();
         }
      }
   }

   

   

   

   

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   
}
