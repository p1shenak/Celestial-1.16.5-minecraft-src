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

public class ElytraSwap extends celestial.module.Module {
   public Object[] id_break;
   private static int[] id_catch = new int[]{Integer.MAX_VALUE};

   private void id_char() {
      this.id_super();
      boolean var1 = rrfY_2.id_class(rdy_3.kc);
      rdn_3 var2 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
      if (var2.id_break() != rdy_3.kc || var1) {
         int var3 = rrfY_2.id_break(rrfY_2.id_class(false, false));
         if (var3 != -1) {
            if (((rrIk_1)this.id_break[7]).id_class() && rrfZ_2.id_byte()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                  .id_class(new rrtx_3(this.id_final(), "Вы находитесь в ПВП режиме", 2000));
            } else {
               ((rrmi_3)this.id_break[10]).id_class(var2, var3);
      this.id_class(var3, 6);
               this.id_break[13] = true;
            }
         }
      }
   }

   public ElytraSwap() {
      super("Elytra Swap", "Автоматически переключает слот\nс нагрудником на элитру", Category.UTIL);
      this.id_super();
      rrIF var5 = new rrIF("Клавиша свапа", KeyBind.NONE);
      this.id_break[0] = var5;
      rrIF var6 = new rrIF("Клавиша\nфейерверка", KeyBind.NONE);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Получил урон", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Приземлился", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Нанёс урон", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Автоматический полёт", true);
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Запускать 1 фейерверк", false);
      this.id_break[6] = var11;
      rrIk_1 var12 = new rrIk_1("Не работать в ПВП", false);
      this.id_break[7] = var12;
      rrfP_2 var13 = new rrfP_2();
      this.id_break[8] = var13;
      rrmi_3 var14 = new rrmi_3();
      this.id_break[10] = var14;
      rrfg_3 var15 = new rrfg_3();
      this.id_break[11] = var15;
      this.id_class(
         new rrIc_1("Перекл. если", (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3]),
         (rrIF)this.id_break[0],
         (rrIF)this.id_break[1],
         (rrIk_1)this.id_break[5],
         (rrIk_1)this.id_break[6],
         (rrIk_1)this.id_break[7]
      );
   }

   

   

   private boolean id_interface() {
      this.id_super();
      if (!(Boolean)this.id_break[13]) {
         return false;
      } else if (((rrIk_1)this.id_break[2]).id_class() && ((rrfg_3)this.id_break[11]).id_class()) {
         return true;
      } else {
         return ((rrIk_1)this.id_break[3]).id_class()
               && ((cb_3)id_import.id_class[57]).BL()
               && (Boolean)((cb_3)id_import.id_class[57]).id_break[40]
            ? true
            : false;
      }
   }

   private void id_class(int var1, int var2) {
      int var3 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
      if (var1 > 36) {
         ((Ax_1)id_import.id_class[55]).id_class(var3, var2, var1 - 36, rXa_1.SWAP, false);
      } else {
         int var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected % 8 + 1;
         ((Ax_1)id_import.id_class[55]).id_class(var3, var1, var4, rXa_1.SWAP, true);
         ((Ax_1)id_import.id_class[55]).id_class(var3, var2, var4, rXa_1.SWAP, true);
         ((Ax_1)id_import.id_class[55]).id_class(var3, var1, var4, rXa_1.SWAP, false);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAg_1 var1) {
      this.id_super();
      rdn_3 var2 = var1.id_byte();
      if ((rdn_3)this.id_break[12] != null) {
         if (rdn_3.id_break(var2, (rdn_3)this.id_break[12])) {
            if (var2.id_break() == rdy_3.kc) {
               this.id_break[13] = false;
            } else {
               ((rrmi_3)this.id_break[10]).id_class(var2, var1.id_class());
               this.id_break[13] = true;
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAK var1) {
      this.id_super();
      rdn_3 var6 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
      this.id_break[12] = var6;
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rhd_3 && ((rrIk_1)this.id_break[4]).id_class() && (Boolean)this.id_break[13]) {
         this.id_continue();
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnh_3 var1) {
      this.id_super();
      ((rrfg_3)this.id_break[11]).id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      ((rrfP_2)this.id_break[8]).id_class(var1);
      ((rrfg_3)this.id_break[11]).id_class(var1);
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_break[8])
            .id_class(rqR_2.id_break() - (Long)this.id_break[9] > 200L ? true : false);
         if (this.id_interface()) {
            this.id_continue();
         }

         if (((cb_3)id_import.id_class[57]).Sy()) {
            rdn_3 var2 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
            if (var2.id_break() == rdy_3.kc) {
               this.id_break[15] = (Integer)this.id_break[15] + 1;
               if (((rrIk_1)this.id_break[6]).id_class() && (Integer)this.id_break[15] < 2) {
                  this.id_try();
               }
            } else {
               this.id_break[15] = Integer.valueOf(0);
            }

            if ((Boolean)this.id_break[14]) {
               this.id_try();
               this.id_break[14] = false;
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLB var1) {
      this.id_super();
      if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte()) {
         this.id_goto();
      } else if (var1.id_break() == ((rrIF)this.id_break[1]).id_finally().id_byte() && ((cb_3)id_import.id_class[57]).Sy()) {
         this.id_break[14] = true;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAL var1) {
      this.id_return();
   }

   

   private int id_break(int var1) {
      this.id_super();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_break[8]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         this.id_break[9] = rqR_2.id_break();
         return var1;
      } else {
         return -1;
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      this.id_while();
      ((rrmi_3)this.id_break[10]).id_throws();
      this.id_break[14] = false;
      this.id_break[15] = Integer.valueOf(0);
   }

   private void id_goto() {
      rdn_3 var1 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
      if (var1.id_break() == rdy_3.kc) {
         this.id_continue();
      } else {
         this.id_char();
      }
   }

   private void id_continue() {
      this.id_super();
      if (((rrmi_3)this.id_break[10]).id_class()) {
         int var1 = ((rrmi_3)this.id_break[10]).id_class(true, new String[0]);
         if (var1 != -1) {
      this.id_class(var1, 6);
            this.id_while();
         }
      }
   }

   

   

   

   private void id_return() {
      this.id_super();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
      if (((rrIk_1)this.id_break[5]).id_class()) {
         if (var1.P().id_super()) {
            cb_3 var10000 = (cb_3)id_import.id_class[57];
            Boolean var6 = true;
            var10000.id_break[38] = var6;
         }
      }
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[16];
         this.id_break[9] = 0L;
         this.id_break[13] = false;
         this.id_break[14] = false;
         this.id_break[15] = 0;
      }
   }

   

   private void id_try() {
      int var1 = this.id_public();
      int var2 = this.id_break(var1);
      if (var2 > 8) {
         ((Ax_1)id_import.id_class[55]).id_class(var2);
      }
   }

   private void id_while() {
      this.id_super();
      ((rrfg_3)this.id_break[11]).id_break();
      this.id_break[15] = Integer.valueOf(0);
      this.id_break[13] = false;
   }

   private int id_public() {
      if (((cb_3)id_import.id_class[57]).ss().id_break() == rdy_3.dc) {
         return -2;
      } else if (((cb_3)id_import.id_class[57]).Sn().id_break() == rdy_3.dc) {
         return -3;
      } else {
         int var1 = id_catch[0];
         int var2 = -1;

         for (int var3 = 0; var3 < 45; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3);
            if (var4.id_break() == rdy_3.dc) {
               int var5 = var4.id_char();
               if (var5 < var1) {
                  var2 = var3;
                  var1 = var5;
               }
            }
         }

         return var2;
      }
   }

   
}
