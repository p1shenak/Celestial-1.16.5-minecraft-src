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
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RwHelper extends celestial.module.Module {
   public Object[] id_break;

   public RwHelper() {
      super("RW Helper", "Утилитарный модуль для\nReallyWorld", Category.UTIL);
      this.id_super();
      rrIk_1 var5 = new rrIk_1("Флай на драгоне", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Закрытие меню", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Не ставить шары", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Авто. полёт", true);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Авто. починка", true);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Авто. исцеление", true);
      this.id_break[5] = var10;
      CopyOnWriteArrayList var11 = new CopyOnWriteArrayList();
      this.id_break[6] = var11;
      this.id_class(
         new rrIc_1("Утилиты", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2]),
         new rrIc_1("После ПВП", (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[3])
      );
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrFw_1 var1) {
      if (var1.id_class() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]) {
         this.id_while();
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrAR var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[2]).id_class()) {
         rdn_3 var2 = var1.id_class();
         if (rrjQ_2.id_class(var2)) {
            var1.id_class(true);
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((rrIk_1)this.id_break[0]).id_class() && (Boolean)this.id_break[7]) {
            if (!((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
               this.id_break[8] = (Integer)this.id_break[8] + 1;
            }

            if ((Integer)this.id_break[8] > 10) {
               ((cb_3)id_import.id_class[57]).G();
               this.id_new();
            }
         }

         for (rrHa_1 var3 : (List<rrHa_1>)this.id_break[6]) {
            if (System.currentTimeMillis() - ((Ax_1)id_import.id_class[55]).id_byte > 1000L
               && ((cb_3)id_import.id_class[57]).id_protected(var3.id_class())) {
               ((List)this.id_break[6]).remove(var3);
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_super();
      ((List)this.id_break[6]).clear();
   }

   @celestial.event.EventTarget
   public void id_class(rrAt_1 var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[0]).id_class() && var1.id_class() == (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[1]) {
         var1.id_class(true);
         this.id_break[7] = true;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rvp_3 var2
         && ((rrIk_1)this.id_break[1]).id_class()
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         String var4 = var2.id_protected().id_byte();
         if (var4.equals("ꈁꀀꈂꌁꈂꀁꈃꄀ") || var4.equals("Меню")) {
            var1.id_class(true);
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rmj_3(var2.id_break()));
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[0]).id_class() && ((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
         float var2 = rrfj_3.id_class();
         boolean var3 = rrfj_3.id_catch();
         boolean var4 = var2 != 0.0F ? true : false;
         float var5 = var3 && var4 ? 1.061F : 1.199F;
         float var6 = var3 ? 0.56F : 1.199F;
         var1.id_class(var5);
         var1.id_catch().id_byte = var2 * var6;
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   

   

   

   private void id_new() {
      this.id_super();
      this.id_break[7] = false;
      this.id_break[8] = Integer.valueOf(0);
   }

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         this.id_break[7] = false;
         this.id_break[8] = 0;
      }
   }

   private void id_while() {
      this.id_super();
      ((List)this.id_break[6]).clear();
      if (((rrIk_1)this.id_break[3]).id_class()) {
         ((List)this.id_break[6]).add(new rrHa_1("/fly"));
      }

      if (((rrIk_1)this.id_break[4]).id_class()) {
         ((List)this.id_break[6]).add(new rrHa_1("/fix all"));
      }

      if (((rrIk_1)this.id_break[5]).id_class()) {
         ((List)this.id_break[6]).add(new rrHa_1("/heal"));
      }
   }

   
}
