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
import java.util.HashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoPotion extends celestial.module.Module implements rrnF_2 {
   public static Object[] id_break;
   public Object[] id_byte;

   public AutoPotion() {
      super("Auto Pot", "Автоматически кидает зелья", Category.COMBAT);
      this.id_return();
      rrIk_1 var5 = new rrIk_1("Только в ПВП", false);
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Авто. выключение", false);
      this.id_byte[1] = var6;
      rrTT var7 = new rrTT(this);
      this.id_byte[2] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.id_byte[3] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.id_byte[4] = var9;
      this.id_class(
         new rrIc_1("Кидать", (rrIk_1)id_break[2], (rrIk_1)id_break[1], (rrIk_1)id_break[0]),
         (rrIk_1)this.id_byte[0],
         (rrIk_1)this.id_byte[1]
      );
   }

   

   

   @celestial.event.EventTarget(
      id_class = 100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.id_goto()) {
            this.id_super();
            return;
         }

         HashMap var2 = new HashMap();
         rrnH_2[] var3 = rrnH_2.values();
         int var4 = var3.length;

         for (int var5 = 0; var5 < var4; var5++) {
            rrnH_2 var6 = var3[var5];
            if ((Boolean)var6.id_break().get() && ((rrfw_3)this.id_byte[4]).id_class(600.0) && !this.id_break(var6)) {
               int var7 = this.id_class(var6);
               if (var7 != -1) {
                  var2.put(var7, var6);
               }
            }
         }

         boolean var9 = var2.isEmpty();
         ((rrfP_2)this.id_byte[3]).id_class(var9);
         if (var9) {
            this.id_super();
            return;
         }

         rrTg_1 var10 = () -> ((cb_3)id_import.id_class[57]).id_goto().id_case(90.0F);
         ((rrTT)this.id_byte[2]).id_class(var10, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (!((cb_3)id_import.id_class[57]).z().id_break(var10.getNeedRotation(), 0.05F)) {
            return;
         }

         for (java.util.Map.Entry var12 : ((java.util.Map<?, ?>)var2).entrySet()) {
            int var13 = (Integer)var12.getKey();
            int var8 = this.id_break(var13);
            if (var8 != -1) {
               ((rrfw_3)this.id_byte[4]).id_class();
            }

            if (var8 > 8) {
               ((Ax_1)id_import.id_class[55]).id_class(var8);
            }
         }

         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         if (((rrIk_1)this.id_byte[1]).id_class()) {
            this.id_byte(false);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_return();
      ((rrfP_2)this.id_byte[3]).id_class(var1);
   }

   

   

   private int id_class(rrnH_2 var1) {
      rdn_3 var2 = ((cb_3)id_import.id_class[57]).ss();
      rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
      if (rrfH_2.id_break(var2.id_break())) {
         for (rLY var5 : rAB.id_class(var2)) {
            if (var5.id_class() == var1.id_byte()) {
               return -2;
            }
         }
      }

      if (rrfH_2.id_break(var3.id_break())) {
         for (rLY var11 : rAB.id_class(var3)) {
            if (var11.id_class() == var1.id_byte()) {
               return -3;
            }
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         rdn_3 var12 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var9);
         if (rrfH_2.id_break(var12.id_break())) {
            for (rLY var7 : rAB.id_class(var12)) {
               if (var7.id_class() == var1.id_byte()) {
                  return var9;
               }
            }
         }
      }

      for (int var10 = 9; var10 < 36; var10++) {
         rdn_3 var13 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var10);
         if (rrfH_2.id_break(var13.id_break())) {
            for (rLY var15 : rAB.id_class(var13)) {
               if (var15.id_class() == var1.id_byte()) {
                  return var10;
               }
            }
         }
      }

      return -1;
   }

   public float id_break() {
      return -1.0F;
   }

   private int id_break(int var1) {
      this.id_return();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         ((rrfP_2)this.id_byte[3]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_byte[3]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else {
         return -1;
      }
   }

   

   private boolean id_break(rrnH_2 var1) {
      rLR var2 = var1.id_byte();
      byte var3 = 10;
      return ((cb_3)id_import.id_class[57]).id_break(var2)
            && ((cb_3)id_import.id_class[57]).id_byte(var2).id_break() > 20 * var3
         ? true
         : false;
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_super();
   }

   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private boolean id_goto() {
      this.id_return();
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K().aJ_()) {
         return false;
      } else if (((rrIk_1)this.id_byte[0]).id_class() && !rrfZ_2.id_byte()) {
         return false;
      } else if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
         && ((cq_3)id_import.id_class[19]).id_volatile().matches("\\d+")) {
         return false;
      } else if ((!rrjc_3.id_break(0.5F) || ((cb_3)id_import.id_class[57]).BL()) && !rrjc_3.id_class(2.0F)) {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().E().id_long().id_break() < 150L
            ? false
            : true;
      } else {
         return false;
      }
   }

      static {
      Object[] var0 = new Object[]{new rrIk_1("Силу", true), new rrIk_1("Скорость", true), new rrIk_1("Защиту от огня", true)};
      id_break = var0;
   }

   

   

   

   private void id_return() {
      if (this.id_byte == null) {
         this.id_byte = new Object[5];
      }
   }

   private void id_super() {
      this.id_return();
      ((rrTT)this.id_byte[2]).id_final();
   }

   

   

   

   public float id_private() {
      return -1.0F;
   }

   public rrTq_1 aB_() {
      return new rrTq_1(rjG_2.id_catch(), ((cb_3)id_import.id_class[57]).id_goto());
   }
}
