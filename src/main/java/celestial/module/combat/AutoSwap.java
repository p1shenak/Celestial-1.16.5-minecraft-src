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
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoSwap extends celestial.module.Module {
   public Object[] id_break;
   public static Object[] id_byte;

   private rrCh_1 id_boolean() {
      this.B();
      if (this.id_instanceof()) {
         return (rrCh_1)this.id_break[4];
      } else if (this.id_new()) {
         return (rrCh_1)this.id_break[1];
      } else if (this.id_continue()) {
         return (rrCh_1)this.id_break[2];
      } else if (this.id_else()) {
         return (rrCh_1)this.id_break[3];
      } else if (this.id_this()) {
         return (rrCh_1)this.id_break[5];
      } else {
         return (rrCh_1)(this.id_throw() ? (rrCd_1)this.id_break[6] : (rrCh_1)this.id_break[4]);
      }
   }

   public boolean id_char() {
      this.B();
      return ((String)((rrIQ)this.id_break[9]).id_byte()).equals("Умный");
   }

   private static void id_byte(String var0) {
   }

   private boolean id_byte(rrCh_1 var1) {
      return ((cb_3)id_import.id_class[57]).sK().id_class(var1.id_class());
   }

   

   public AutoSwap() {
      super("Auto Swap", "Автоматически меняет предмет\nв правой руке", Category.COMBAT);
      this.B();
      rrmi_3 var5 = new rrmi_3();
      this.id_break[0] = var5;
      rrCM var6 = new rrCM();
      this.id_break[1] = var6;
      rrCb_1 var7 = new rrCb_1();
      this.id_break[2] = var7;
      rrCx_1 var8 = new rrCx_1();
      this.id_break[3] = var8;
      rrCJ var9 = new rrCJ();
      this.id_break[4] = var9;
      rrCX var10 = new rrCX();
      this.id_break[5] = var10;
      rrCd_1 var11 = new rrCd_1();
      this.id_break[6] = var11;
      rrIQ var12 = (rrIQ)new rrIQ("Режим", "Умный", "Умный", "Бинд").id_class("change_mode", (var1, var2) -> this.id_strictfp());
      this.id_break[9] = var12;
      rrIQ var13 = (rrIQ)new rrIQ("Менять с", "Щит", "Щит", "Гепл", "Шар", "Руна", "Сфера", "Тотем").id_class("change_mode", (var1, var2) -> this.id_strictfp());
      this.id_break[10] = var13;
      rrIQ var14 = (rrIQ)new rrIQ("Менять на", "Гепл", "Гепл", "Щит", "Шар", "Руна", "Сфера", "Тотем").id_class("change_mode", (var1, var2) -> this.id_strictfp());
      this.id_break[11] = var14;
      rrIF var15 = (rrIF)new rrIF("Клавиша свапа", KeyBind.get(3))
         .id_class(() -> this.id_try());
      this.id_break[12] = var15;
      rrIm_1 var16 = (rrIm_1)new rrIm_1("Здоровье", 16.5F, 1.0F, 19.5F, 0.5F).id_class(() -> this.id_char());
      this.id_break[13] = var16;
      rrIk_1 var17 = (rrIk_1)new rrIk_1("Проверять кристалл", true).id_class(() -> this.id_char() && this.id_continue() ? true : false);
      this.id_break[14] = var17;
      this.id_class(
         (rrIQ)this.id_break[9],
         (rrIQ)this.id_break[10],
         (rrIQ)this.id_break[11],
         (rrIF)this.id_break[12],
         (rrIm_1)this.id_break[13],
         (rrIk_1)this.id_break[14]
      );
   }

   

   private void B() {
      if (this.id_break == null) {
         this.id_break = new Object[15];
         this.id_break[7] = 0L;
         this.id_break[8] = 0;
      }
   }

   public boolean id_this() {
      this.B();
      return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("Руна");
   }

   public boolean id_interface() {
      this.B();
      return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("Шар");
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrLa_1 var1) {
      if (this.id_char()) {
         rdn_3 var2 = var1.id_class();
         rrLi_1 var3 = var1.id_break();
         if (this.P()) {
            int var4 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
            rdn_3 var5 = ((cb_3)id_import.id_class[57]).Sn();
            rrCh_1 var6 = this.id_switch();
            rrCh_1 var7 = this.id_boolean();
            Pair var8 = this.id_class(var6);
            Pair var9 = this.id_class(var7);
            Predicate var10 = var6.id_break(this);
            Predicate var11 = var7.id_break(this);
            if (this.id_class(var2, var3)) {
      this.id_class(var8, var10, var9, var5, var4);
            } else if (this.id_class(var10, var2, var3) && this.id_static()) {
      this.id_class(var7, var9, var11, var5, var4, false);
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAM var1) {
      this.id_strictfp();
   }

   private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2, rrLi_1 var3) {
      if (var3 instanceof rrAP && this.id_instanceof() && var2.id_break() == rdy_3.kN) {
         return true;
      } else {
         return var3 instanceof rrAr_1 && var1.test(var2) ? true : false;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLB var1) {
      this.B();
      if (var1.id_break() == ((rrIF)this.id_break[12]).id_finally().id_byte() && this.id_try()) {
         int var2 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
         rrCh_1 var4 = this.id_switch();
         rrCh_1 var5 = this.id_boolean();
         Pair var6 = this.id_class(var4);
         Pair var7 = this.id_class(var5);
         if (!this.P()) {
            return;
         }

         Predicate var8 = var4.id_break(this);
         Predicate var9 = var5.id_break(this);
         if (this.id_class(var8, var3)) {
      this.id_class(var5, var7, var9, var3, var2, true);
         } else {
      this.id_class(var6, var8, var7, var3, var2);
         }
      }
   }

   private boolean id_class(rdn_3 var1, rrLi_1 var2) {
      if (!(var2 instanceof rrAr_1)) {
         return false;
      } else {
         return this.id_instanceof() && var1.id_break() == rdy_3.kN ? true : false;
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.B();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && this.id_char()) {
         int var2 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
         rrCh_1 var4 = this.id_switch();
         rrCh_1 var5 = this.id_boolean();
         Predicate var6 = var4.id_break(this);
         Predicate var7 = var5.id_break(this);
         if (this.id_break(var7, var3)) {
            this.id_break[8] = (Integer)this.id_break[8] + 1;
         } else {
            this.id_break[8] = Integer.valueOf(0);
         }

         if (((cb_3)id_import.id_class[57]).P() == rpm_3.OFF_HAND && this.id_class(var6, ((cb_3)id_import.id_class[57]).sX())) {
            this.id_break[7] = System.currentTimeMillis();
         }

         if (!this.P()) {
            return;
         }

         Pair var8 = this.id_class(var4);
         Pair var9 = this.id_class(var5);
         if (this.id_break(var4)) {
      this.id_class(var8, var6, var9, var3, var2);
         } else if (this.id_static()) {
      this.id_class(var5, var9, var7, var3, var2, false);
         }
      }
   }

   private Pair<rdn_3, Integer> id_class(rrCh_1 var1) {
      Predicate var2 = var1.id_break(this);
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < 36; var4++) {
         rdn_3 var5 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var4);
         if (!var5.id_class() && var2.test(var5)) {
            var3.add(Pair.of(var5, var4));
         }
      }

      Comparator var6 = var1.id_byte(this);
      if (var6 != null) {
         var3.sort(var6);
      }

      return var3.isEmpty() ? null : (Pair)var3.get(0);
   }

   private void id_class(Pair<rdn_3, Integer> var1, Predicate<rdn_3> var2, Pair<rdn_3, Integer> var3, rdn_3 var4, int var5) {
      this.B();
      if (var1 != null) {
         if (!this.id_class(var2, var4)) {
            int var6 = (Integer)var1.getRight();
            if (var6 != -1) {
               int var7 = rrfY_2.id_break(var6);
               if (var3 != null) {
                  rdn_3 var8 = (rdn_3)var3.getLeft();
                  ((rrmi_3)this.id_break[0]).id_class(var8, var7);
                  id_byte("saved swap back item " + var7);
               }

      this.id_class(var5, var7, 40);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
               rVi_1 var9 = rrfu_3.id_class()
                  .id_class("Свапнул ")
                  .id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_))
                  .id_break()
                  .id_class(((cb_3)id_import.id_class[57]).Sn().id_continue());
               ((cq_3)id_import.id_class[19]).id_class(var9, false, true);
            }
         }
      }
   }

   private boolean id_class(rdb_3 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < 36; var3++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3).id_break() == var1) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private int id_class(Pair<rdn_3, Integer> var1) {
      this.B();
      if (this.id_try()) {
         return var1 != null ? (Integer)var1.getValue() : -1;
      } else {
         return ((rrmi_3)this.id_break[0]).id_class(true, new String[0]);
      }
   }

   private void id_class(int var1, int var2, int var3) {
      ((Ax_1)id_import.id_class[55]).id_class(var1, var2, var3, rXa_1.SWAP, false);
   }

   private void id_class(rrCh_1 var1, Pair<rdn_3, Integer> var2, Predicate<rdn_3> var3, rdn_3 var4, int var5, boolean var6) {
      this.B();
      int var7 = this.id_class(var2);
      if (var7 >= 0) {
         int var8 = rrfY_2.id_break(var7);
         if (this.id_break(var3, var4) && (!var1.id_class(this) || !this.id_class(var4.id_break()))) {
            if (!var6 && (Integer)this.id_break[8] > 5) {
               ((rrmi_3)this.id_break[0]).id_throws();
               id_byte("reset swap back item");
            }
         } else {
      this.id_class(var5, var8, 40);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
            rVi_1 var9 = rrfu_3.id_class()
               .id_class("Свапнул ")
               .id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_))
               .id_break()
               .id_class(((cb_3)id_import.id_class[57]).Sn().id_continue());
            ((cq_3)id_import.id_class[19]).id_class(var9, false, true);
         }

         if (var6) {
            ((rrmi_3)this.id_break[0]).id_throws();
            id_byte("reset swap back item");
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_strictfp();
   }

   private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   

      static {
      Object[] var0 = new Object[]{40, -1, false};
      id_byte = var0;
   }

   

   private boolean id_break(rrCh_1 var1) {
      if (this.id_byte(var1)) {
         return false;
      } else {
         return this.id_const() ? false : this.id_abstract();
      }
   }

   private boolean id_break(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_strictfp();
   }

   private boolean P() {
      if (((cb_3)id_import.id_class[57]).id_native()) {
         return false;
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_this().id_new().id_break()
            ? false
            : true;
      }
   }

   public boolean id_goto() {
      this.B();
      return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("Сфера");
   }

   private boolean id_const() {
      this.B();
      return ((rrIk_1)this.id_break[14]).id_class() && this.id_continue()
         ? ((gm_3)id_import.id_class[56])
            .id_return()
            .int2ObjectEntrySet()
            .stream()
            .filter(var0 -> var0.getValue() instanceof rSa_1)
            .anyMatch(
               var0 -> ((an_3)var0.getValue()).id_implements((cb_3)id_import.id_class[57]) <= 6.0F ? true : false
            )
         : false;
   }

   public boolean id_continue() {
      this.B();
      return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("Шар");
   }

   public boolean id_else() {
      this.B();
      return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("Сфера");
   }

   

   

   public boolean id_instanceof() {
      this.B();
      return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("Щит");
   }

   public boolean id_new() {
      this.B();
      return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("Гепл");
   }

   public boolean id_return() {
      this.B();
      return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("Гепл");
   }

   public boolean id_super() {
      this.B();
      return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("Руна");
   }

   private rrCh_1 id_switch() {
      this.B();
      if (this.id_return()) {
         return (rrCh_1)this.id_break[1];
      } else if (this.id_while()) {
         return (rrCh_1)this.id_break[4];
      } else if (this.id_interface()) {
         return (rrCh_1)this.id_break[2];
      } else if (this.id_goto()) {
         return (rrCh_1)this.id_break[3];
      } else if (this.id_super()) {
         return (rrCh_1)this.id_break[5];
      } else {
         return (rrCh_1)(this.id_public() ? (rrCd_1)this.id_break[6] : (rrCh_1)this.id_break[1]);
      }
   }

   public boolean id_throw() {
      this.B();
      return ((String)((rrIQ)this.id_break[10]).id_byte()).equals("Тотем");
   }

   public boolean id_try() {
      this.B();
      return ((String)((rrIQ)this.id_break[9]).id_byte()).equals("Бинд");
   }

   public boolean id_while() {
      this.B();
      return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("Щит");
   }

   private boolean id_static() {
      this.B();
      if (((cb_3)id_import.id_class[57]).sK().id_class(((rrmi_3)this.id_break[0]).id_protected())) {
         return false;
      } else {
         return System.currentTimeMillis() - (Long)this.id_break[7] < 400L ? false : true;
      }
   }

   public boolean id_public() {
      this.B();
      return ((String)((rrIQ)this.id_break[11]).id_byte()).equals("Тотем");
   }

   private boolean id_abstract() {
      this.B();
      float var1 = ((cb_3)id_import.id_class[57]).Ss() + ((cb_3)id_import.id_class[57]).Sd();
      return var1 <= ((rrIm_1)this.id_break[13]).id_byte() ? true : false;
   }

   

   private void id_strictfp() {
      this.B();
      ((rrmi_3)this.id_break[0]).id_throws();
   }
}
