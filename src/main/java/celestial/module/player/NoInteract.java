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

public class NoInteract extends celestial.module.Module {
   public Object[] id_break;
   public static Object[] id_byte;

   

      static {
      Object[] var0 = new Object[]{
         new rrIk_1("Все объекты", false),
         ((celestial.setting.Setting)(new rrIk_1("Игроки", false)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Армор стенды", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Сундуки", false)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Бочки", false)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Двери", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Воронки", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Кнопки", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Раздатчики", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Нотные блоки", false)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Верстаки", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Люки", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Печки", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Калитки", true)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Наковальни", false)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false),
         ((celestial.setting.Setting)(new rrIk_1("Рычаги", false)))
            .id_class(() -> !((rrIk_1)id_byte[0]).id_class() ? true : false)
      };
      id_byte = var0;
   }

   public NoInteract() {
      super("No Interact", "Не дает нажимать ПКМ по\nвыбранным объектам", Category.PLAYER);
      this.id_while();
      rrIk_1 var5 = new rrIk_1("Только в ПВП", false);
      this.id_break[0] = var5;
      this.id_class(
         new rrIc_1("Выбор", (rrIk_1)id_byte[0], (rrIk_1)id_byte[1], (rrIk_1)id_byte[2], (rrIk_1)id_byte[3], (rrIk_1)id_byte[4], (rrIk_1)id_byte[5], (rrIk_1)id_byte[6], (rrIk_1)id_byte[7], (rrIk_1)id_byte[8], (rrIk_1)id_byte[9], (rrIk_1)id_byte[10], (rrIk_1)id_byte[11], (rrIk_1)id_byte[12], (rrIk_1)id_byte[13], (rrIk_1)id_byte[14], (rrIk_1)id_byte[15]),
         (rrIk_1)this.id_break[0]
      );
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAR var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[0]).id_class() || rrfZ_2.id_byte()) {
         rdn_3 var2 = var1.id_class();
         rdb_3 var3 = var2.id_break();
         if (var3 != rdy_3.dJ && !(var3 instanceof rxJ_2 var4 && var4.id_catch() instanceof Wp_1)) {
            if (((rrIk_1)id_byte[0]).id_class()) {
               var1.id_class(true);
            } else {
               xd_3 var9 = var1.id_protected();
               rrlA_2[] var5 = rrlA_2.values();
               int var6 = var5.length;

               for (int var7 = 0; var7 < var6; var7++) {
                  rrlA_2 var8 = var5[var7];
                  if ((Boolean)var8.id_class().get() && var8.id_break().isInstance(var9)) {
                     var1.id_class(true);
                     break;
                  }
               }
            }
         }
      }
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrLe_1 var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[0]).id_class() || rrfZ_2.id_byte()) {
         if (((rrIk_1)id_byte[0]).id_class()) {
            var1.id_class(true);
         } else {
            iB_2 var2 = var1.id_break();
            rrln_3[] var3 = rrln_3.values();
            int var4 = var3.length;

            for (int var5 = 0; var5 < var4; var5++) {
               rrln_3 var6 = var3[var5];
               if ((Boolean)var6.id_break().get() && var6.id_class().test(var2)) {
                  var1.id_class(true);
                  break;
               }
            }
         }
      }
   }

   

   

   

   

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
