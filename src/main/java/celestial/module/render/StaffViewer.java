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
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StaffViewer extends celestial.module.Module implements rrqJ_2, rrqO_2 {
   public Object[] id_break;
   public static Object[] id_byte;

   public StaffViewer() {
      super("Staff Viewer", "Отображает активный персонал\nна сервере", Category.RENDER);
      this.id_public();
      HashSet var5 = new HashSet();
      this.id_break[0] = var5;
      Ordering var6 = Ordering.from(new rrqb_3());
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Сообщать об изменении\nстатуса персонала", true);
      this.id_break[2] = var7;
      ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).id_class(this);
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_class(this);
      this.id_class((rrIk_1)this.id_break[2]);
   }

   

   public void id_this() {
      this.id_case(false);
   }

   public void id_class(String var1, boolean var2) {
      this.id_public();
      if (var2) {
         for (rrqr_3 var4 : (Set<rrqr_3>)this.id_break[0]) {
            if (var4 instanceof rrqP_2 var5
               && var5.id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])
               && var5.id_class().id_class().getName().equalsIgnoreCase(var1)) {
               var4.id_class(false);
               break;
            }
         }
      }
   }

   

   private void id_class(Aw_1 var1) {
      this.id_public();
      if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         if (var1 != null) {
            if (var1.id_class().getName().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
               return;
            }

            rnB_2 var2 = var1.id_implements();
            if (var2 == null) {
               return;
            }

            String var3 = var2.id_class();
            if (!var3.contains("-") && var3.startsWith("6") && var3.endsWith("A")) {
               rrqP_2 var4 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3], var1, var2.id_protected().id_byte());
               ((Set)this.id_break[0]).add(var4);
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLL var1) {
      this.id_public();
      if ((gm_3)id_import.id_class[56] != null) {
         Aw_1 var2 = var1.id_break();
         String var3 = var2.id_class().getName();
         String var4 = var1.id_class().id_byte();
         rrqB_2 var5 = rrqB_2.id_class(var2, var3, var4);
      this.id_class(var5, var2);
      this.id_class(var2);
         if (var5 != null) {
            rrqP_2 var6 = new rrqP_2(var5, var2, var4);
            ((Set)this.id_break[0]).add(var6);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFV var1) {
      this.id_public();
      if (((rrIk_1)this.id_break[2]).id_class()) {
         this.id_break(var1);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_public();
      ((Set<rrqr_3>)this.id_break[0]).removeIf(var0 -> !var0.id_throws());
   }

   

   private void id_class(rrqB_2 var1, Aw_1 var2) {
      this.id_public();
      if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         if (var1 == null) {
            rnB_2 var3 = var2.id_implements();
            if (var3 == null) {
               return;
            }

            GameProfile var4 = var2.id_class();
            if (var4.getName().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
               return;
            }

            String var5 = var3.id_class();
            if (!var5.contains("-") && var5.startsWith("V") && var5.endsWith("A")) {
               rrqP_2 var6 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3], var2, var3.id_protected().id_byte());
               ((Set)this.id_break[0]).add(var6);
            }
         }
      }
   }

   public void id_break(String var1, boolean var2) {
      this.id_public();
      if (var2) {
         for (rrqr_3 var4 : (Set<rrqr_3>)this.id_break[0]) {
            if (var4 instanceof rrqP_2 var5
               && var5.id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])
               && var5.id_extends().toLowerCase().contains(var1.toLowerCase())) {
               var5.id_class(false);
            }
         }
      }
   }

   

   private void id_break(rrFV var1) {
      rrqP_2 var2 = var1.id_byte();
      rrqS_2 var3 = var1.id_class();
      rrqS_2 var4 = var1.id_break();

      String var5 = switch (((int[])rrqG_2.id_class[0])[var3.ordinal()]) {
         case 1 -> "зашёл в спек";
         case 2 -> "зашёл в GM3";
         case 3 -> "рядом с вами";
         case 4 -> {
            switch (((int[])rrqG_2.id_class[0])[var4.ordinal()]) {
               case 1:
                  yield "вышел из спека";
               case 2:
                  yield "вышел из GM3";
               case 3:
                  yield "ушёл от вас";
               default:
                  yield "в активном статусе";
            }
         }
         case 5 -> "вышел с сервера";
         default -> null;
      };
      if (var5 != null) {
         rgN_2 var6 = new rgN_2(this.id_final());
         rVi_1 var7 = var2.id_implements().id_break(" " + var5);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(var6, var7, 5000));
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_public();
      super.id_throws(var1);

      for (rrqr_3 var3 : (Set<rrqr_3>)this.id_break[0]) {
         if (!var3.id_throws()) {
            var3.id_class(false);
         }
      }
   }

      static {
      Object[] var0 = new Object[]{rrfu_3.id_class().id_break(rVa_1.id_class("#ff0000"), rVa_1.id_class("#ff7f7f")).id_class("Персонал ").id_break()};
      id_byte = var0;
   }

   private void id_case(boolean var1) {
      this.id_public();

      for (rrqr_3 var3 : (Set<rrqr_3>)this.id_break[0]) {
         if (var3 instanceof rrqP_2 var4 && var4.id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])) {
            var4.id_class(var1);
         }
      }
   }

   public void id_continue() {
      this.id_case(false);
   }

   

   public Set<rrqr_3> id_new() {
      this.id_public();
      return (Set<rrqr_3>)this.id_break[0];
   }

   

   public List<rrqr_3> id_super() {
      this.id_public();
      return ((Ordering)this.id_break[1]).sortedCopy((Set)this.id_break[0]);
   }

   

   

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }
}
