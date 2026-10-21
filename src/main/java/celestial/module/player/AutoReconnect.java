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

public class AutoReconnect extends celestial.module.Module {
   public Object[] id_break;
   private static long[] id_throws = new long[2];

   public AutoReconnect() {
      super("Auto Reconnect", "Автоматически перезаходит на\nпоследний игровой режим", Category.PLAYER);
      this.id_continue();
   }

   

   private void id_this() {
      this.id_continue();
      PI var1 = C_throws.id_byte().id_native().id_protected();
      if (var1 != null) {
         Pf_1 var2 = var1.id_class();
         if (var2.id_break()) {
            this.id_break[0] = var2.id_class() + var1.id_break();
         } else if (!rql_3.id_break((String)this.id_break[0])
            && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] != 0
            && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 20 == 0) {
            ((cb_3)id_import.id_class[57]).id_case("/" + (String)this.id_break[0]);
         }
      }
   }

   private void id_class(SL var1) {
      this.id_continue();
      String var2 = C_throws.id_byte().id_final().id_throws();
      if (!rql_3.id_break(var2)) {
         this.id_break[0] = var2;
      } else if (!rql_3.id_break((String)this.id_break[0])) {
         var1.id_class(new SF((String)this.id_break[0], id_throws[1]));
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((rrfq_3)rrfp_3.id_class[1] == null) {
            return;
         }

         SL var2 = C_throws.id_byte().id_default();
         if (var2.id_throws()) {
            return;
         }

         switch (((int[])rrlQ_2.id_class[0])[((rrfq_3)rrfp_3.id_class[1]).ordinal()]) {
            case 1:
            case 2:
               this.id_this();
               break;
            case 3:
               this.id_break(var2);
               break;
            case 4:
      this.id_class(var2);
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFK var1) {
      this.id_continue();
      Object var6 = null;
      this.id_break[0] = var6;
   }

   

   

   private void id_break(SL var1) {
      this.id_continue();
      Po_1 var2 = C_throws.id_byte().P().id_break();
      if (var2 != null) {
         PK var3 = var2.id_break();
         if (var3.id_break()) {
            this.id_break[0] = var3.id_class() + var2.id_class();
         } else if (!rql_3.id_break((String)this.id_break[0])) {
            var1.id_class(new SF((String)this.id_break[0], id_throws[0]));
         }
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_continue();
      super.id_throws(var1);
      Object var6 = null;
      this.id_break[0] = var6;
   }

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }

   private static void id_else() {
      id_throws = new long[2];
   }

   

   

   

   
}
