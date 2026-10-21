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

public class AutoSprint extends celestial.module.Module {
   public Object[] id_break;

   public AutoSprint() {
      super("Auto Sprint", "Автоматически включает спринт", Category.MOVEMENT);
      this.id_try();
      rrIk_1 var5 = new rrIk_1("Голод", false);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Слепоту", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Приседание", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Ползание", true);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Использование предметов", true);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Горизонтальную коллизию", true);
      this.id_break[5] = var10;
      ButtonSetting b1 = new ButtonSetting(this, "SpookyTime", () -> {
         this.id_try();
         ((rrIk_1)this.id_break[0]).id_class(false, false, true);
         ((rrIk_1)this.id_break[1]).id_class(true, false, true);
         ((rrIk_1)this.id_break[2]).id_class(true, false, true);
         ((rrIk_1)this.id_break[3]).id_class(true, false, true);
         ((rrIk_1)this.id_break[4]).id_class(true, false, true);
         ((rrIk_1)this.id_break[5]).id_class(true, false, true);
      });
      ButtonSetting b2 = new ButtonSetting(this, "Funtime", () -> {
         this.id_try();
         ((rrIk_1)this.id_break[0]).id_class(false, false, true);
         ((rrIk_1)this.id_break[1]).id_class(true, false, true);
         ((rrIk_1)this.id_break[2]).id_class(true, false, true);
         ((rrIk_1)this.id_break[3]).id_class(true, false, true);
         ((rrIk_1)this.id_break[4]).id_class(true, false, true);
         ((rrIk_1)this.id_break[5]).id_class(true, false, true);
      });
      ButtonSetting b3 = new ButtonSetting(this, "Grim", () -> {
         this.id_try();
         ((rrIk_1)this.id_break[0]).id_class(false, false, true);
         ((rrIk_1)this.id_break[1]).id_class(false, false, true);
         ((rrIk_1)this.id_break[2]).id_class(false, false, true);
         ((rrIk_1)this.id_break[3]).id_class(false, false, true);
         ((rrIk_1)this.id_break[4]).id_class(false, false, true);
         ((rrIk_1)this.id_break[5]).id_class(false, false, true);
      });
      this.id_class(
         new GroupSetting("Авто. конфигурации", b1, b2, b3),
         new GroupSetting("Игнорировать", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5])
      );
   }

   

   public boolean id_this() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[2]).id_class() ? true : false;
   }

   

   

   @celestial.event.EventTarget
   public void id_class(I var1) {
      var1.id_class(true);
   }

   @celestial.event.EventTarget
   public void id_class(rrLX var1) {
      this.id_try();
      if (((rrIk_1)this.id_break[5]).id_class()) {
         var1.id_break(false);
      }
   }

   

   

   public boolean id_continue() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[1]).id_class() ? true : false;
   }

   public boolean id_else() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[0]).id_class() ? true : false;
   }

   

   public boolean id_new() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[4]).id_class() ? true : false;
   }

   

   public boolean id_super() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[3]).id_class() ? true : false;
   }

   private void id_try() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   
}
