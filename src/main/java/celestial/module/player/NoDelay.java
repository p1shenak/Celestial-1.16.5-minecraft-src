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
import org.apache.commons.lang3.tuple.Pair;

public class NoDelay extends celestial.module.Module {
   public Object[] id_break;

   public NoDelay() {
      super("No Delay", "Убирает задержку на что-либо", Category.PLAYER);
      this.id_public();
      Pair var5 = rrwg_3.id_class(
         new rrIk_1("Прыжок", true), new rrIm_1("Задержка для прыжка", 0.0F, 0.0F, 10.0F, 1.0F)
      );
      this.id_break[0] = var5;
      Pair var6 = rrwg_3.id_class(
         new rrIk_1("ПКМ", false), new rrIm_1("Задержка для ПКМ", 0.0F, 0.0F, 4.0F, 1.0F)
      );
      this.id_break[1] = var6;
      this.id_class(
         new rrIc_1("Убирать на", (rrIk_1)((Pair)this.id_break[0]).getLeft(), (rrIk_1)((Pair)this.id_break[1]).getLeft()),
         (celestial.setting.Setting)((Pair)this.id_break[0]).getRight(),
         (celestial.setting.Setting)((Pair)this.id_break[1]).getRight()
      );
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(rrAu_1 var1) {
      if (this.id_return()) {
         var1.id_class(this.id_super().intValue());
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAS var1) {
      if (this.id_new()) {
         var1.id_class(this.id_goto().intValue());
      }
   }

   

   

   private Float id_goto() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte();
   }

   

   

   private boolean id_new() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class();
   }

   private boolean id_return() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class();
   }

   private Float id_super() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[1]).getRight()).id_byte();
   }

   

   

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }
}
