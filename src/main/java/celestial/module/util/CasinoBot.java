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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CasinoBot extends celestial.module.Module {
   public Object[] id_break;
   public static Object[] id_byte;

   private boolean id_byte(String var1) {
      return var1.startsWith("[$]") && var1.contains("получено от игрока") ? true : false;
   }

   public CasinoBot() {
      super("Casino", "Test", Category.UTIL);
      this.id_this();
      rrfw_3 var5 = new rrfw_3();
      this.id_break[0] = var5;
      CopyOnWriteArrayList var6 = new CopyOnWriteArrayList();
      this.id_break[1] = var6;
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((rrfw_3)this.id_break[0]).id_class(32000.0)) {
            cb_3 var10000 = (cb_3)id_import.id_class[57];
            String var10001 = "!Привет! Я - ваш личный казино бот. Попробуйте свою удачу и отправьте мне деньги %s. Взамен, я отправлю вам сумму, умноженную на случайное число от 0 до 3. Мой текущий баланс - %s монет, количество игр: "
               + (Integer)id_byte[3];
            var10000.id_protected(String.format(var10001, "/pay " + ((cb_3)id_import.id_class[57]).sv().getName() + " сумма", rql_3.id_class(this.id_else(), (char)32)));
            ((rrfw_3)this.id_break[0]).id_class();
         }

         if (((List)this.id_break[1]).isEmpty()) {
            return;
         }

         rrHL var2 = (rrHL)((List)this.id_break[1]).get(0);
         if (var2.id_protected()) {
            ((List)this.id_break[1]).remove(false);
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLO var1) {
      this.id_this();
      String var2 = var1.id_protected();
      if (this.id_byte(var2)) {
         Matcher var3 = ((Pattern)id_byte[1]).matcher(var2);
         Matcher var4 = ((Pattern)id_byte[0]).matcher(var2);
         if (var3.find() && var4.find()) {
            int var5 = Float.valueOf(var3.group(0).replace(",", "").substring(1)).intValue();
            String var6 = var4.group(1);
            if (var5 >= 2000) {
               ((List)this.id_break[1]).add(new rrHL(this, var5, var6, new rrfw_3()));
            } else {
               cb_3 var10000 = (cb_3)id_import.id_class[57];
               String var10001 = "/m %s %s";
               Object[] var10002 = new Object[2];
               var10002[0] = var6;
               byte var10004 = 1;
               String var10005 = "Минимальная ставка от %s$";
               var10002[var10004] = String.format(var10005, Integer.valueOf(2000));
               var10000.id_protected(String.format(var10001, var10002));
            }
         }
      }
   }

   

   

   

   

   long id_else() {
      return C_throws.id_byte().id_native().id_byte();
   }

      static {
      Object[] var0 = new Object[]{Pattern.compile("\\s([a-zA-Z0-9_]+)"), Pattern.compile("\\$[0-9,]+"), 2000, 0};
      id_byte = var0;
   }

   

   

   
}
