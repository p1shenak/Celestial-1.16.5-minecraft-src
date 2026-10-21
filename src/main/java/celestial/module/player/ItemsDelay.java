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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class ItemsDelay extends celestial.module.Module {
   public Object[] id_break;

   private float id_char() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[3]).getRight()).id_byte();
   }

   private int id_byte(rdn_3 var1) {
      rdb_3 var2 = var1.id_break();
      return !var2.id_super() && var2 != rdy_3.hi && var2 != rdy_3.WF && var2 != rdy_3.JA ? 0 : var2.id_break(var2.id_continue());
   }

   public ItemsDelay() {
      super("Items Delay", "Ставит задержку на предмет после\nего использования", Category.PLAYER);
      this.id_public();
      Pair var5 = rrwg_3.id_class(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 14.0F, 1.5F, 60.0F, 0.5F));
      this.id_break[0] = var5;
      Pair var6 = rrwg_3.id_class(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 0.1F, 60.0F, 0.5F));
      this.id_break[1] = var6;
      Pair var7 = rrwg_3.id_class(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 0.1F, 60.0F, 0.5F));
      this.id_break[2] = var7;
      Pair var8 = rrwg_3.id_class(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 0.1F, 60.0F, 0.5F));
      this.id_break[3] = var8;
      Pair var9 = rrwg_3.id_class(new rrIk_1("Включено", true), new rrIm_1("Задержка в секундах", 5.0F, 1.5F, 60.0F, 0.5F));
      this.id_break[4] = var9;
      rrIk_1 var10 = (rrIk_1)new rrIk_1("Компенсировать задержку", false)
         .id_class(
            () -> (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               ? true
               : false
         );
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Только в ПВП", false);
      this.id_break[6] = var11;
      ButtonSetting b1 = new ButtonSetting(this, "ReallyWorld", () -> {
         this.id_public();
         ((rrIk_1)this.id_break[6]).id_class(true, false, true);
         ((rrIk_1)this.id_break[5]).id_class(false, false, true);
         ((rrIm_1)((Pair)this.id_break[0]).getRight()).id_class(14.0F, false, true);
         ((rrIm_1)((Pair)this.id_break[2]).getRight()).id_class(5.0F, false, true);
      });
      ButtonSetting b2 = new ButtonSetting(this, "Funtime", () -> {
         this.id_public();
         ((rrIk_1)((Pair)this.id_break[3]).getLeft()).id_class(true, false, true);
         ((rrIm_1)((Pair)this.id_break[3]).getRight()).id_class(20.0F, false, true);
         ((rrIk_1)this.id_break[5]).id_class(true, false, true);
         ((rrIk_1)this.id_break[6]).id_class(true, false, true);
         ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class(false, false, true);
         ((rrIk_1)((Pair)this.id_break[2]).getLeft()).id_class(false, false, true);
         ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class(false, false, true);
         ((rrIk_1)((Pair)this.id_break[4]).getLeft()).id_class(false, false, true);
      });
      this.id_class(
         new GroupSetting("Авто. конфигурации", b1, b2),
         new GroupSetting("Эндер жемчуги", (Setting)((Pair)this.id_break[0]).getLeft(), (Setting)((Pair)this.id_break[0]).getRight()),
         new GroupSetting("Зачар. золотые яблоки", (Setting)((Pair)this.id_break[1]).getLeft(), (Setting)((Pair)this.id_break[1]).getRight()),
         new GroupSetting("Золотые яблоки", (Setting)((Pair)this.id_break[2]).getLeft(), (Setting)((Pair)this.id_break[2]).getRight()),
         new GroupSetting("Зелье исцеления", (Setting)((Pair)this.id_break[3]).getLeft(), (Setting)((Pair)this.id_break[3]).getRight()),
         new GroupSetting("Хорус", (Setting)((Pair)this.id_break[4]).getLeft(), (Setting)((Pair)this.id_break[4]).getRight()),
         new GroupSetting("Другое", (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[6])
      );
   }

   

   private boolean id_this() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class();
   }

   private boolean id_interface() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[2]).getLeft()).id_class();
   }

   private rVi_1 id_class(rdn_3 var1, float var2) {
      rVi_1 var3;
      if (var1.id_this()) {
         var3 = var1.id_continue().id_case().id_class(rgF_2.RED);
      } else {
         var3 = new rgN_2(jI_2.id_class("ru_ru", var1.id_finally(), new Object[0])).id_class(rgF_2.RED);
      }

      return rrfu_3.id_break(this)
         .id_class(rgF_2.GRAY)
         .id_break("Задержка компенсирована")
         .id_break("\nТеперь использование ")
         .id_class(var3)
         .id_break(" доступно на " + rgF_2.RED + var2 + "с" + rgF_2.GRAY + " быстрее");
   }

   @celestial.event.EventTarget
   public void id_class(rrAY var1) {
      if (this.id_goto()) {
         rdn_3 var2 = var1.id_break();
         rdb_3 var3 = var2.id_break();
         if (this.id_this() && var3 == rdy_3.Jm) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(true);
            }
         } else if (this.id_interface() && var3 == rdy_3.hy) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(true);
            }
         } else if (this.id_try() && var3 == rdy_3.hp) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(true);
            }
         } else if (this.id_while() && rrfH_2.id_break(var2)) {
            if (rrfo_3.id_class(var2)) {
               var1.id_class(true);
            }
         } else if (this.id_else() && var3 == rdy_3.kO && rrfo_3.id_class(var2)) {
            var1.id_class(true);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLK var1) {
      if (this.id_goto()) {
         rdn_3 var2 = var1.id_class();
         rdb_3 var3 = var2.id_break();
         if (this.id_try() && var3 == rdy_3.hp) {
      this.id_class(var2, var0 -> var0.id_break() == rdy_3.hp ? true : false, this.id_super());
         } else if (this.id_interface() && var3 == rdy_3.hy) {
      this.id_class(var2, var0 -> var0.id_break() == rdy_3.hy ? true : false, this.id_instanceof());
         } else if (this.id_while() && rrfH_2.id_break(var2)) {
      this.id_class(var2, var0 -> rrfH_2.id_break(var0), this.id_char());
         } else if (this.id_else() && var3 == rdy_3.kO) {
      this.id_class(var2, var0 -> var0.id_break() == rdy_3.kO ? true : false, this.id_import());
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLn_1 var1) {
      rvs_3 var2 = var1.id_class();
      rdb_3 var3 = var2.id_break();
      int var4 = var2.id_byte();
      if (var4 != 0) {
         rdn_3 var5 = var3.id_continue();
         if (this.id_goto() && this.id_this() && var3 == rdy_3.Jm) {
      this.id_class(var5, var0 -> var0.id_break() == rdy_3.Jm ? true : false, this.id_continue());
         }

         if (this.id_throws(var5) && !rrfo_3.id_class(var5)) {
            int var6 = this.id_byte(var5);
            if (var6 > 0 && var4 > var6) {
               int var7 = var2.id_byte();
               var2.id_class(var4 - var6);
               float var8 = (var7 - var2.id_byte()) / 20.0F;
               rrfu_3.id_class(this.id_class(var5, var8));
            }
         }
      }
   }

   private void id_class(rdn_3 var1, Predicate<rdn_3> var2, float var3) {
      int var4 = (int)(var3 * 20.0F);
      if (this.id_throws(var1)) {
         int var5 = this.id_byte(var1);
         if (var5 > 0 && var4 > var5) {
            int var6 = var4;
            var4 -= var5;
            float var7 = (var6 - var4) / 20.0F;
            rrfu_3.id_class(this.id_class(var1, var7));
         }
      }

      ((cb_3)id_import.id_class[57]).r().id_class(var1, var2, var4);
   }

   

   

   private void id_class(rdn_3 var1) {
      ((cb_3)id_import.id_class[57]).r().id_break(var1);
   }

   

   private boolean id_throws(rdn_3 var1) {
      this.id_public();
      if (!((rrIk_1)this.id_break[5]).id_class()) {
         return false;
      } else {
         return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               && var1.id_break() == rdy_3.Jd
            ? false
            : true;
      }
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      if ((cb_3)id_import.id_class[57] != null) {
         ((cb_3)id_import.id_class[57]).r().id_break();
      }
   }

   private boolean id_goto() {
      this.id_public();
      return ((rrIk_1)this.id_break[6]).id_class() && !rrfZ_2.id_byte() ? false : true;
   }

   private float id_continue() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte();
   }

   private boolean id_else() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[4]).getLeft()).id_class();
   }

   private float id_import() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[4]).getRight()).id_byte();
   }

   private float id_instanceof() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[2]).getRight()).id_byte();
   }

   

   

   private float id_super() {
      this.id_public();
      return (Float)((rrIm_1)((Pair)this.id_break[1]).getRight()).id_byte();
   }

   

   private boolean id_try() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class();
   }

   private boolean id_while() {
      this.id_public();
      return ((rrIk_1)((Pair)this.id_break[3]).getLeft()).id_class();
   }

   

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   
}
