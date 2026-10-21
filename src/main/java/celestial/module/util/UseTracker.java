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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class UseTracker extends celestial.module.Module {
   public Object[] id_break;

   public UseTracker() {
      super("Use Tracker", "Отслеживает использование\nпредметов", Category.UTIL);
      this.id_public();
      HashSet var5 = new HashSet();
      this.id_break[0] = var5;
   }

   

   private void id_this() {
      this.id_public();
      Iterator var1 = ((Set)this.id_break[0]).iterator();
      if (var1.hasNext()) {
         rryO var2 = (rryO)var1.next();
         var2.id_class(true);
      }
   }

   private void id_class(rhd_3 var1, rdn_3 var2) {
      rgN_2 var3 = new rgN_2("");
      var3.id_class(rgF_2.GRAY).id_class(rrjZ_2.id_byte((an_3)var1)).id_break(" использовал ").id_class(this.id_class(var2).id_break(rgF_2.RED));
      rrfu_3.id_class(var3);
   }

   private rVi_1 id_class(rdn_3 var1) {
      if (var1.id_this()) {
         rVi_1 var2 = new rgN_2("(")
            .id_break(rgF_2.GOLD)
            .id_break(jI_2.id_class("ru_ru", var1.id_finally(), new Object[0]))
            .id_break(")");
         return var1.id_continue().id_case().id_break(" ").id_class(var2);
      } else {
         return new rgN_2(jI_2.id_class("ru_ru", var1.id_finally(), new Object[0]));
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvt_3 var3) {
         rqA_2 var4 = var3.id_break();
         if (var4 == rqn_3.hn) {
            this.id_this();
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_public();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         for (cG_2 var3 : ((gm_3)id_import.id_class[56]).id_continue()) {
            if (rrff_3.id_class(var3)) {
               rdn_3 var4 = var3.sX();
               int var5 = var3.SH();
               if (!var4.id_class() && var5 == 2) {
                  if (var4.id_break() == rdy_3.JA) {
                     this.id_break(var3, var4);
                  } else {
                     ((Set)this.id_break[0]).add(new rryO(var3, var4));
                  }
               }
            }
         }

         Iterator var6 = ((Set)this.id_break[0]).iterator();

         while (var6.hasNext()) {
            rryO var7 = (rryO)var6.next();
            rhd_3 var8 = var7.id_protected();
            rdn_3 var9 = var7.id_class();
            if (rqR_2.id_break() - var7.id_break() > 300L) {
               var6.remove();
            } else if (var7.id_byte()) {
      this.id_class(var8, var9);
               var6.remove();
            }
         }
      }
   }

   

   private void id_break(rhd_3 var1, rdn_3 var2) {
      rgN_2 var3 = new rgN_2("");
      rgN_2 var4 = new rgN_2("\n");
      var3.id_class(rgF_2.GRAY).id_class(rrjZ_2.id_byte((an_3)var1)).id_break(" выпил ").id_class(this.id_class(var2).id_break(rgF_2.RED));
      List var5 = rAB.id_class(var2);
      if (!var5.isEmpty()) {
         boolean var6 = false;

         for (int var7 = 0; var7 < var5.size(); var7++) {
            rLY var8 = (rLY)var5.get(var7);
            if (var8.id_break() > 0) {
               var4.id_break(rgF_2.GRAY + " • ").id_break(rgF_2.RED + rAB.id_class(var8, rgF_2.GRAY));
               if (var7 != var5.size() - 1) {
                  var4.id_break("\n");
               }

               var6 = true;
            }
         }

         if (var6) {
            var3.id_class(var4);
         }
      }

      rrfu_3.id_class(var3);
   }

   

   

   

   

   

   

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
