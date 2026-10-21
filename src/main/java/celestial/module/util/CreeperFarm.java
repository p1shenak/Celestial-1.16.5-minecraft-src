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
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CreeperFarm extends celestial.module.Module {
   public Object[] id_break;

   

   private bO_2 id_long() {
      return C_throws.id_byte().id_break();
   }

   

   public CreeperFarm() {
      super("Creeper Farm", "Baritone для охоты на криперов", Category.UTIL);
      this.id_instanceof();
      ArrayList var5 = new ArrayList();
      this.id_break[1] = var5;
      ArrayList var6 = new ArrayList();
      this.id_break[2] = var6;
      this.id_break[3] = -1L;
      this.id_break[5] = -1L;
      rrIk_1 var9 = new rrIk_1("Автоматический прыжок", true);
      this.id_break[9] = var9;
      rrIk_1 var10 = new rrIk_1("Атаковать одновременно\nнесколько существ", true);
      this.id_break[10] = var10;
      rrIk_1 var11 = new rrIk_1("Отключаться при полном\nинвентаре", true);
      this.id_break[11] = var11;
      rrIk_1 var12 = new rrIk_1("Автоматический перезаход\nна режим", true);
      this.id_break[12] = var12;
      rrIm_1 var13 = (rrIm_1)new rrIm_1("Секунд для перезахода", 60.0F, 10.0F, 600.0F, 5.0F)
         .id_class(() -> ((rrIk_1)this.id_break[12]).id_class());
      this.id_break[13] = var13;
      this.id_class(
         (rrIk_1)this.id_break[9],
         (rrIk_1)this.id_break[10],
         (rrIk_1)this.id_break[11],
         (rrIk_1)this.id_break[12],
         (rrIm_1)this.id_break[13]
      );
   }

   

   

   private void id_interface() {
      this.id_instanceof();
      if ((cb_3)id_import.id_class[57] != null && !((List)this.id_break[1]).isEmpty()) {
         rjU_2 var1 = ((cb_3)id_import.id_class[57]).Ps();
         rY_2 var2 = null;
         double var3 = Double.MAX_VALUE;

         for (int var5 = ((List)this.id_break[1]).size() - 1; var5 >= 0; var5--) {
            rY_2 var6 = (rY_2)((List)this.id_break[1]).get(var5);
            rfl_3 var7 = var6.id_break();
            if (var7.id_case(var1)) {
      this.id_class(var6);
               return;
            }

            double var8 = var1.id_case(var7.id_case());
            if (var8 < var3) {
               var3 = var8;
               var2 = var6;
            }
         }

      this.id_class(var2);
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_instanceof();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         boolean var2 = !this.id_long().id_byte() ? true : false;
         if (var2) {
            if ((Long)this.id_break[5] == -1L) {
               this.id_break[5] = rqR_2.id_break();
            }
         } else if ((Long)this.id_break[5] != -1L) {
            this.id_break[4] = (Long)this.id_break[4] + (rqR_2.id_break() - (Long)this.id_break[5]);
            this.id_break[5] = -1L;
         }

         this.id_else();
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLh_1 var1) {
      this.id_instanceof();
      String var2 = var1.id_class();
      Matcher var3 = ((Pattern)rrjb_3.id_class[7]).matcher(var2);
      if (var3.find()) {
         long var13 = 0L;
         var13 += Long.parseLong(var3.group(1).replaceAll("[^0-9]", ""));
         String var6 = var3.group(2);
         if (var6 != null) {
            var13 += Long.parseLong(var6.replaceAll("[^0-9]", ""));
         }

         this.id_break[8] = (Long)this.id_break[8] + var13;
      } else {
         Matcher var4 = ((Pattern)rrjb_3.id_class[8]).matcher(var2);
         if (var4.find()) {
            long var5 = Long.parseLong(var4.group(2).replaceAll("[^0-9]", ""));
            this.id_break[8] = (Long)this.id_break[8] + var5;
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(false);
   }

   public void id_class(rY_2 var1) {
      this.id_instanceof();
      if (var1 == null) {
         throw new IllegalArgumentException("Selection cannot be null");
      } else {
         this.id_break[0] = var1;
         this.id_long().id_class(var1);
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrnx_3 var1) {
      this.id_instanceof();
      if (var1.id_break().BC() == aI_2.id_volatile) {
         this.id_break[6] = (Long)this.id_break[6] + 1L;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLQ var1) {
      this.id_instanceof();
      if (var1.id_class() instanceof rsE_2 var2) {
         rdn_3 var9 = var2.id_protected();
         if (var9.id_break() == rdy_3.hr
            && var1.id_break().size() > 1
            && (rY_2)this.id_break[0] != null
            && ((rY_2)this.id_break[0]).id_break().id_byte(var2.rN())) {
            this.id_break[7] = (Long)this.id_break[7] + var9.id_char();
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_instanceof();
      if ((List)this.id_break[2] != null && !((List)this.id_break[2]).isEmpty()) {
         Ml_1 var2 = var1.id_class();
         Qg_1 var3 = id_import.id_else();
         rrZO var4 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
         int var5 = (int)(var3.id_volatile() / 2.0F);
         int var6 = (int)(var3.id_final() / 2.0F + 30.0F);

         for (int var7 = 0; var7 < ((List)this.id_break[2]).size(); var7++) {
            rrHt_1 var8 = (rrHt_1)((List)this.id_break[2]).get(var7);
            if (var7 == 0) {
               var4.id_class(var2, (String)var8.id_break(), (double)(var5 - var8.id_class()), (double)var6, 15, 255);
            } else {
               var4.id_break(var2, var8.id_break(), var5 - var8.id_class(), var6, rrZF.d_, false);
            }

            var6 += 10;
         }
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_instanceof();
      this.id_interface();
      if ((rY_2)this.id_break[0] == null) {
         String var10000 = rrfu_3.id_class(this);
         String var10001 = "Необходимо установить область фермы криперов. Используйте команду %scf";
         rrfu_3.id_byte(var10000 + var10001.formatted(new Object[]{C_throws.id_break().id_protected.id_class[0]}));
         this.id_byte(false);
      } else {
         super.id_class(var1);
         this.id_break[3] = rqR_2.id_break();
         this.id_break[4] = 0L;
         this.id_break[5] = -1L;
         Supplier var2 = () -> {
            PI var0 = C_throws.id_byte().id_native().id_protected();
            if (var0 != null) {
               Pf_1 var1x = var0.id_class();
               if (var1x == null || !var1x.id_break()) {
                  return false;
               }
            }

            return true;
         };
         this.id_long()
            .id_class(
               (rY_2)this.id_break[0],
               var2,
               (rrIk_1)this.id_break[9],
               (rrIk_1)this.id_break[10],
               (rrIk_1)this.id_break[11],
               (rrIk_1)this.id_break[12],
               (rrIm_1)this.id_break[13]
            );
         this.id_else();
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_throw();
      this.id_abstract();
   }

   

   public List<rY_2> id_continue() {
      this.id_instanceof();
      return (List<rY_2>)this.id_break[1];
   }

   private void id_else() {
      this.id_instanceof();
      rrZO var1 = ((celestial.manager.FontManager)celestial.manager.FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
      long var2 = rqR_2.id_break();
      long var4 = var2 - (Long)this.id_break[3];
      if ((Long)this.id_break[5] != -1L) {
         var4 -= (Double)this.id_break[4] + (var2 - (Double)this.id_break[5]);
      } else {
         var4 -= (Double)this.id_break[4];
      }

      String var6 = this.id_final();
      rgF_2 var10000 = rgF_2.GRAY;
      Duration var10001 = Duration.ofMillis(Math.max(0L, var4));
      String var7 = "Время работы: " + var10000 + rql_3.id_class(var10001, new rqy_3[]{rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS});
      String var8 = "Убито криперов: " + rgF_2.GRAY + (Long)this.id_break[6];
      long var9 = (Long)this.id_break[7] / rdy_3.hr.id_implements();
      var10000 = rgF_2.GRAY;
      long var20 = (Long)this.id_break[7];
      String var11 = "Выбито пороха: " + var10000 + var20 + " шт. (" + var9 + " " + rql_3.id_class(var9, new String[]{"стак", "стака", "стаков"}) + ")";
      String var12 = "Заработано: " + rgF_2.GRAY + rql_3.id_class((Long)this.id_break[8], (char)32) + "$";
      List var17 = List.of(
         new rrHt_1(var6, var1.id_break(var6) / 2.0F),
         new rrHt_1(var7, var1.id_break(var7) / 2.0F),
         new rrHt_1(var11, var1.id_break(var11) / 2.0F),
         new rrHt_1(var8, var1.id_break(var8) / 2.0F),
         new rrHt_1(var12, var1.id_break(var12) / 2.0F)
      );
      this.id_break[2] = var17;
   }

   private void id_instanceof() {
      if (this.id_break == null) {
         this.id_break = new Object[14];
         this.id_break[3] = 0L;
         this.id_break[4] = 0L;
         this.id_break[5] = 0L;
         this.id_break[6] = 0L;
         this.id_break[7] = 0L;
         this.id_break[8] = 0L;
      }
   }

   public rY_2 id_new() {
      this.id_instanceof();
      return (rY_2)this.id_break[0];
   }

   

   public void id_super() {
      if (this.aJ_()) {
         this.id_byte(true);
      }
   }

   private void id_throw() {
      this.id_instanceof();
      this.id_break[6] = 0L;
      this.id_break[7] = 0L;
      this.id_break[8] = 0L;
      this.id_break[3] = -1L;
      this.id_break[4] = 0L;
      this.id_break[5] = -1L;
   }

   

   

   private void id_abstract() {
      this.id_long().id_protected();
   }
}
