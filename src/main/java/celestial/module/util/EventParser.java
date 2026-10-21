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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EventParser extends celestial.module.Module implements rrja_3 {
   public Object[] id_break;

   private void id_byte(rrjD_2 var1, boolean var2) {
      this.id_while();
      boolean var3 = ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_class(var1, var2);
      if (var3) {
         ((Map)this.id_break[0]).put(var1.id_byte(), rqR_2.id_break());
      }
   }

   public EventParser() {
      super("Event Parser", "Отслеживает появление событий\nи устанавливает путь к ним", Category.UTIL);
      this.id_while();
      ConcurrentHashMap var5 = new ConcurrentHashMap();
      this.id_break[0] = var5;
      rrIQ var6 = new rrIQ("Режим", "Автоматический", "Автоматический", "Ручной");
      this.id_break[1] = var6;
      rrIk_1 var7 = (rrIk_1)new rrIk_1("Автоматически удалять\nточку через время", true).id_class("auto_remove", (var1, var2) -> {
         this.id_while();
         ((Map)this.id_break[0]).clear();
      });
      this.id_break[2] = var7;
      rrIm_1 var8 = (rrIm_1)new rrIm_1("Минут для удаления", 10.0F, 1.0F, 30.0F, 1.0F).id_class(() -> {
         this.id_while();
         return ((rrIk_1)this.id_break[2]).id_class();
      });
      this.id_break[3] = var8;
      this.id_class(
         (rrIQ)this.id_break[1],
         (rrIk_1)this.id_break[2],
         (rrIm_1)this.id_break[3]
      );
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_class(this);
   }

   

   

   public void id_class(rrjD_2 var1, boolean var2) {
      this.id_while();
      if (var2) {
         ((Map)this.id_break[0]).remove(var1.id_byte());
      }
   }

   

   private void id_class(Bt_1 var1) {
      if (var1 instanceof Bn_1 var2) {
         String var3 = var2.id_throws();
         String var4 = var2.id_protected();
         Aw_1 var5 = var2.id_byte();
         rja_3 var6 = var2.e_();
         rrjD_2 var7 = new rrjD_2(var3, var6.id_else(), rrfp_3.id_throws());
         if (this.id_continue()) {
            this.id_byte(var7, true);
         } else if (this.id_new()) {
            rgN_2 var8 = new rgN_2("Событие: " + rgF_2.RED + var4);
            if (var2 instanceof By_1 var9) {
               String var10 = var9.id_class();
               if (var10 != null) {
                  var8.id_break("\nУровень лута: " + rgF_2.RED + var10);
               }
            }

            if (var5 != null) {
               var8.id_break("\nПризвал: " + rgF_2.RED + var5.id_class().getName());
            }

            var8.id_break("\nКоординаты: " + rgF_2.RED + var6.b_() + " " + var6.c_() + " " + var6.d_());
            rVi_1 var11 = rgv_3.id_class(
               new rgN_2("Нажмите, чтобы добавить путь к событию " + rgF_2.RED + "'" + var3 + "'"),
               new rgy_3(rgp_3.id_class, var8),
               new rgl_3(() -> this.id_byte(var7.id_class(), true))
            );
            rrfu_3.id_class(var11.id_break(rgF_2.GRAY));
         }
      } else {
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
            .id_class(new rrtd_3(this.id_final(), "Добавлено новое событие '" + var1.id_throws() + "'", 5000));
      }

      celestial.util.MinecraftAccessor.a_(rrfu_3.id_class(this) + "Добавлено новое событие '" + var1.id_throws() + "'", false);
   }

   @celestial.event.EventTarget
   public void id_class(Bp_1 var1) {
      Bt_1 var2 = var1.id_break();
      if (var2 != null) {
         switch (((int[])rrHj_1.id_class[0])[var1.id_class().ordinal()]) {
            case 1:
      this.id_class(var2);
               break;
            case 2:
               this.id_break(var2);
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(j_1 var1) {
      this.id_while();
      if (((rrIk_1)this.id_break[2]).id_class() && !((Map)this.id_break[0]).isEmpty()) {
         int var2 = ((Float)((rrIm_1)this.id_break[3]).id_byte()).intValue();
         long var3 = rqR_2.id_break();
         long var5 = var2 * 60 * 1000L;
         ((Map)this.id_break[0]).entrySet().removeIf(var4 -> {
            long var5x = var3 - (Long)((java.util.Map.Entry)var4).getValue();
            if (var5x >= var5) {
               ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_break((String)((java.util.Map.Entry)var4).getKey(), true);
               return true;
            } else {
               return false;
            }
         });
      }
   }

   

   private void id_break(Bt_1 var1) {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_break(var1.id_throws(), true);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_while();
      super.id_throws(var1);
      ((Map)this.id_break[0]).clear();
   }

   

   public boolean id_continue() {
      this.id_while();
      return ((String)((rrIQ)this.id_break[1]).id_byte()).equals("Автоматический");
   }

   

   public boolean id_new() {
      this.id_while();
      return ((String)((rrIQ)this.id_break[1]).id_byte()).equals("Ручной");
   }

   

   public void id_super() {
      this.id_while();
      ((Map)this.id_break[0]).clear();
   }

   

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   
}
