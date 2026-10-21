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

public class NoRender extends celestial.module.Module {
   public Object[] id_break;

   public NoRender() {
      super("No Render", "Убирает некоторые элементы\nигры", Category.RENDER);
      this.id_try();
      rrIk_1 var5 = new rrIk_1("Эффект тотема", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Игроков", false);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Заголовки", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Босс бар", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Скорборд", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = (rrIk_1)new rrIk_1("Лаву/Воду", false).id_class("fluids", (var1, var2) -> {
         if (this.aJ_()) {
            ((yX_2)id_import.id_class[8]).id_throws();
         }
      });
      this.id_break[5] = var10;
      this.id_class(new rrIc_1("Убирать", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[5]));
   }

   

   public boolean id_this() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[4]);
   }

   

   public boolean id_class(rrIk_1 var1) {
      return this.aJ_() && var1.id_class() ? false : true;
   }

   public boolean id_class(an_3 var1) {
      this.id_try();
      if (var1 == (cb_3)id_import.id_class[57]) {
         return true;
      } else {
         return var1.BC() == aI_2.rM && !this.id_class((rrIk_1)this.id_break[1]) ? false : true;
      }
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      ((yX_2)id_import.id_class[8]).id_throws();
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      ((yX_2)id_import.id_class[8]).id_throws();
   }

   

   public boolean id_continue() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[3]);
   }

   public boolean id_else() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[5]);
   }

   public boolean id_new() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[2]);
   }

   

   public boolean id_super() {
      this.id_try();
      return this.id_class((rrIk_1)this.id_break[0]);
   }

   private void id_try() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   

   
}
