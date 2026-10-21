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
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoRespawn extends celestial.module.Module {
   public Object[] id_break;

   private boolean id_byte(String var1) {
      return !var1.isEmpty() && !var1.isBlank() ? true : false;
   }

   public AutoRespawn() {
      super("Auto Respawn", "Автоматически респавнит вас\nпосле смерти", Category.PLAYER);
      this.id_new();
      rrIv_1 var5 = new rrIv_1("Сообщение после респавна", rrte_3.id_class((Pattern)rrtR_2.id_class[5]));
      this.id_break[0] = var5;
      this.id_class((rrIv_1)this.id_break[0]);
   }

   

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[1]) {
         if ((vm_3)id_import.id_class[73] instanceof ZS && (Integer)((cb_3)id_import.id_class[57]).id_private[13] == 1) {
            ((cb_3)id_import.id_class[57]).J();
         } else if (((cb_3)id_import.id_class[57]).Pu()) {
            int var10002 = (Integer)this.id_break[2] + 1;
            this.id_break[2] = var10002;
            if (var10002 >= 17) {
               String var2 = ((rrIv_1)this.id_break[0]).id_extends();
               if (this.id_byte(var2)) {
                  ((cb_3)id_import.id_class[57]).id_protected(var2);
               }

               this.id_break[1] = false;
               this.id_break[2] = Integer.valueOf(0);
            }
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAG var1) {
      this.id_new();
      this.id_break[1] = true;
   }

   

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      this.id_break[1] = false;
      this.id_break[2] = Integer.valueOf(0);
   }

   

   

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[1] = false;
         this.id_break[2] = 0;
      }
   }

   
}
