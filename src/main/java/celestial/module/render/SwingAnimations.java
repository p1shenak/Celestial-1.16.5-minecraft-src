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

public class SwingAnimations extends celestial.module.Module {
   public Object[] id_break;

   public SwingAnimations() {
      super("Swing Animations", "Изменяет положение предметов\nв руках", Category.RENDER);
      this.id_new();
      rrIQ var5 = new rrIQ("Режим", "Type 1", "Type 1", "Type 2", "Default");
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Только с AttackAura", false);
      this.id_break[1] = var6;
      rrIm_1 var7 = (rrIm_1)new rrIm_1("Сила", 70.0F, 10.0F, 100.0F, 10.0F).id_class(() -> {
         this.id_new();
         return !((String)((rrIQ)this.id_break[0]).id_byte()).equals("Default") ? true : false;
      });
      this.id_break[2] = var7;
      rrIm_1 var8 = new rrIm_1("Скорость", 7.0F, 1.0F, 10.0F, 1.0F);
      this.id_break[3] = var8;
      rrIm_1 var9 = new rrIm_1("X координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[4] = var9;
      rrIm_1 var10 = new rrIm_1("Y координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[5] = var10;
      rrIm_1 var11 = new rrIm_1("Z координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[6] = var11;
      rrIm_1 var12 = new rrIm_1("X координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[7] = var12;
      rrIm_1 var13 = new rrIm_1("Y координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[8] = var13;
      rrIm_1 var14 = new rrIm_1("Z координата", 0.0F, -1.5F, 1.5F, 0.1F);
      this.id_break[9] = var14;
      this.id_class(
         new celestial.setting.GroupSetting("Анимация", (rrIQ)this.id_break[0], (rrIm_1)this.id_break[2], (rrIm_1)this.id_break[3]),
         new celestial.setting.GroupSetting("Позиция правой руки", (rrIm_1)this.id_break[7], (rrIm_1)this.id_break[8], (rrIm_1)this.id_break[9]),
         new celestial.setting.GroupSetting("Позиция левой руки", (rrIm_1)this.id_break[4], (rrIm_1)this.id_break[5], (rrIm_1)this.id_break[6]),
         new celestial.setting.GroupSetting("Другое", (rrIk_1)this.id_break[1])
      );
   }

   

   

   

   private void id_class(Ml_1 var1, float var2, float var3) {
      this.id_new();
      float var4 = rfU_2.id_byte(var2);
      var1.id_class(rje_3.id_protected.id_byte(var3 * (45.0F + rfU_2.id_class(var2 * var2 * (float) Math.PI) / 4.0F * -20.0F)));
      var1.id_class(rje_3.id_case.id_byte(var3 * rfU_2.id_class(var4 * (float) Math.PI) * -20.0F));
      var1.id_class(rje_3.id_break.id_byte(rfU_2.id_class(var4 * (float) Math.PI) * -(Float)((rrIm_1)this.id_break[2]).id_byte()));
      var1.id_class(rje_3.id_protected.id_byte(var3 * -45.0F));
   }

   @celestial.event.EventTarget
   public void id_class(rrAi_1 var1) {
      this.id_new();
      if (this.id_continue()) {
         Ml_1 var2 = var1.id_break();
         rpZ_2 var3 = var1.id_class();
         float var4 = var1.id_catch();
         byte var5 = (byte)(var3 == rpZ_2.RIGHT ? 1 : -1);
         switch (((int[])rrqj_3.id_class[1])[var1.id_throws().ordinal()]) {
            case 1:
               switch (((int[])rrqj_3.id_class[0])[var3.ordinal()]) {
                  case 1:
                     var2.id_class(
                        ((Float)((rrIm_1)this.id_break[7]).id_byte()).floatValue(),
                        ((Float)((rrIm_1)this.id_break[8]).id_byte()).floatValue(),
                        ((Float)((rrIm_1)this.id_break[9]).id_byte()).floatValue()
                     );
                     return;
                  case 2:
                     var2.id_class(
                        ((Float)((rrIm_1)this.id_break[4]).id_byte()).floatValue(),
                        ((Float)((rrIm_1)this.id_break[5]).id_byte()).floatValue(),
                        ((Float)((rrIm_1)this.id_break[6]).id_byte()).floatValue()
                     );
                     return;
                  default:
                     return;
               }
            case 2:
               if (var3 == ((Qw_1)id_import.id_class[20]).id_continue) {
                  String var6 = (String)((rrIQ)this.id_break[0]).id_byte();
                  byte var7 = -1;
                  switch (var6.hashCode()) {
                     case -1774937877:
                        if (var6.equals("Type 1")) {
                           var7 = 0;
                        }
                        break;
                     case -1774937876:
                        if (var6.equals("Type 2")) {
                           var7 = 1;
                        }
                  }

                  switch (var7) {
                     case 0:
      this.id_class(var1, var2, var5);
      this.id_class(var2, var4, var5);
                        break;
                     case 1:
      this.id_class(var1, var2, var5);
                        this.id_break(var2, var4, var5);
                  }
               }
         }
      }
   }

   private void id_class(rrAi_1 var1, Ml_1 var2, int var3) {
      var1.id_class(true);
      var2.id_class(var3 * 0.56F, -0.52F, -0.72F);
   }

   @celestial.event.EventTarget
   public void id_class(rrLl_1 var1) {
      this.id_new();
      if (this.id_continue()) {
         float var2 = ((rrIm_1)this.id_break[3]).id_native()
            - (Float)((rrIm_1)this.id_break[3]).id_byte()
            + ((rrIm_1)this.id_break[3]).id_class();
         var1.id_class(var2 * 2.0F);
      }
   }

   

   private void id_break(Ml_1 var1, float var2, float var3) {
      this.id_new();
      var1.id_class(rje_3.id_protected.id_byte(var3 * 90.0F));
      var1.id_class(rje_3.id_case.id_byte(var3 * -60.0F));
      var1.id_class(
         rje_3.id_break
            .id_byte(
               -60.0F
                  - 40.0F
                     * (float)Math.sin(var2 * Math.PI / 2 * 2.0)
                     * (Float)((rrIm_1)this.id_break[2]).id_byte()
                     / 50.0F
            )
      );
      var1.id_class(rje_3.id_break.id_byte(var3 * -20.0F));
   }

   

   

   private boolean id_continue() {
      this.id_new();
      return ((rrIk_1)this.id_break[1]).id_class()
            && !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().E().aJ_()
         ? false
         : true;
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[10];
      }
   }

   

   

   

   
}
