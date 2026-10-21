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
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClanUpgrader extends celestial.module.Module implements rrnF_2 {
   public static Object[] id_break;
   public Object[] id_byte;

   public ClanUpgrader() {
      super("Clan Upgrader", "Помогает в улучшении клана на\nFuntime", Category.UTIL);
      this.id_this();
      rrTT var5 = new rrTT(this);
      this.id_byte[0] = var5;
   }

   

   private void id_this() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
      }
   }

   private void id_class(rff_3 var1, rpm_3 var2) {
      ((Ax_1)id_import.id_class[55]).id_package();
      ((Ax_1)id_import.id_class[55])
         .id_break((cb_3)id_import.id_class[57], (gm_3)id_import.id_class[56], var2, var1);
   }

   

   

   @Override
   public void id_class(boolean var1) {
      if (this.id_try() == -1) {
         this.id_new();
      } else {
         super.id_class(var1);
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         int var2 = this.id_try();
         if (var2 == -1) {
            ((rrTT)this.id_byte[0]).id_final();
            return;
         }

         Set var3 = this.id_continue();
         if (!var3.isEmpty()) {
            rfH_2 var4 = (rfH_2)var3.iterator().next();
            ((rrTT)this.id_byte[0]).id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         } else {
            ((rrTT)this.id_byte[0])
               .id_class(((cb_3)id_import.id_class[57]).Bs(), (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         }

         if (((cb_3)id_import.id_class[57]).id_return()) {
            return;
         }

         if (Ph_1.id_class(
               (cb_3)id_import.id_class[57],
               ((rrTT)this.id_byte[0]).id_byte(),
               ((Ax_1)id_import.id_class[55]).id_byte()
            ) instanceof rff_3 var5
            && var5.id_byte() == rjM_2.BLOCK) {
            rpr_3 var6 = var5.id_break();
            if (var6 == rpr_3.UP) {
               rfH_2 var7 = var5.id_class();
               xc_3 var8 = ((gm_3)id_import.id_class[56]).id_byte(var7);
               if (var8.id_catch()) {
                  return;
               }

               boolean var9 = false;
               if (var2 >= 0) {
                  rrfo_3.id_class(var2);
                  var9 = true;
               }

               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
                  .id_break(new rZx_1(var2 == -3 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND, var5));
               ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0])
                  .id_break(new rZb_1(rZM.START_DESTROY_BLOCK, var7.id_final(), var6));
               ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND);
               if (var9) {
                  rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
               }
            }
         }
      }
   }

   

   public float id_break() {
      return -1.0F;
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_this();
      super.id_throws(var1);
      ((rrTT)this.id_byte[0]).id_final();
   }

   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0];
   }

   

   private Set<rfH_2> id_continue() {
      Stream<rjC_2> var1 = ((gm_3)id_import.id_class[56])
         .id_break(
            (cb_3)id_import.id_class[57],
            ((cb_3)id_import.id_class[57]).rN().id_class(1.0),
            (var0, var1x) -> ((Predicate)id_break[0]).test(var0)
         );
      return var1.map(rjC_2::id_class).map(rfH_2::new).collect(Collectors.toSet());
   }

      static {
      Object[] var0 = new Object[]{
         (Predicate<xc_3>)var0x -> var0x.id_catch() || var0x.id_break() != xu_3.rR && var0x.id_break() != xu_3.ra ? false : true
      };
      id_break = var0;
   }

   

   private void id_new() {
      String var1 = "Нет факелов или редстоуна в хотбаре";
      rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
      this.id_byte(false);
   }

   

   

   private int id_try() {
      int var1 = rrfY_2.id_break(rdy_3.Pu);
      int var2 = rrfY_2.id_break(rdy_3.hD);
      if (var1 != -1) {
         return var1;
      } else {
         return var2 != -1 ? var2 : -1;
      }
   }

   

   

   public float id_private() {
      return -1.0F;
   }
}
