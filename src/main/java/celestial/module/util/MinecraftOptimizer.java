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

public class MinecraftOptimizer extends celestial.module.Module {
   public Object[] id_break;
   public static Object[] id_byte;

   public MinecraftOptimizer() {
      super("Minecraft Optimizer", "Оптимизирует майнкрафт", Category.UTIL);
      this.id_return();
      rrIk_1 var5 = new rrIk_1("Баннеры", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Рамки", false);
      this.id_break[1] = var6;
      this.id_class(new rrIc_1("Убирать", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1]));
   }

   

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrAe_1 var1) {
      var1.id_class(true);
   }

   @celestial.event.EventTarget
   public void id_class(rrnb_3 var1) {
      this.id_return();
      ao_3 var2 = var1.id_class();
      if (((rrIk_1)this.id_break[0]).id_class() && var2 instanceof rHb_1) {
         var1.id_class(true);
      } else if (((rrIk_1)this.id_break[1]).id_class() && var2 instanceof rsG_2) {
         var1.id_class(true);
      }
   }

   

   

   

   

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

      static {
      Object[] var0 = new Object[]{"Optimizer"};
      id_byte = var0;
   }

   @Override
   public String id_final() {
      return "Optimizer";
   }
}
