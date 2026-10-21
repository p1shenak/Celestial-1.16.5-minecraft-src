package celestial.module.render;

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

public class ItemPhysics extends celestial.module.Module {
   public Object[] id_break;

   public ItemPhysics() {
      super("Item Physics", "Реалистичная физика предметов", Category.RENDER);
      this.id_this();
      rrIm_1 var5 = new rrIm_1("Скорость вращения", 5.0F, 2.0F, 7.0F, 0.1F);
      this.id_break[0] = var5;
      this.id_class((rrIm_1)this.id_break[0]);
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   

   

   

   

   

   public float id_new() {
      this.id_this();
      return (Float)((rrIm_1)this.id_break[0]).id_byte();
   }

   

   
}
