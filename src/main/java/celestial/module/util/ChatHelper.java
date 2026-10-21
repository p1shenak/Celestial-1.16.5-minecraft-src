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
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ChatHelper extends celestial.module.Module {
   public Object[] id_break;

   public ChatHelper() {
      super("Chat Helper", "Утилитарный модуль для чата", Category.UTIL);
      this.id_this();
      rrIk_1 var5 = new rrIk_1("Call", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Invsee", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Ah", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Duel", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Сохранение истории", false);
      this.id_break[4] = var9;
      rrHH[] var10 = new rrHH[]{new rrHC(this), new rrHy_1(this), new rrHn_1(this), new rrHl_1(this)};
      this.id_break[5] = var10;
      celestial.setting.Setting[] var11 = new celestial.setting.Setting[2];
      byte var10003 = 0;
      String var10006 = "Быстрые действия";
      var11[var10003] = new rrIc_1(var10006, new rrIk_1[]{(rrIk_1)this.id_break[1], (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[2]});
      var11[1] = (rrIk_1)this.id_break[4];
      this.id_class(var11);
   }

   

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFR var1) {
      this.id_this();
      if (((rrIk_1)this.id_break[4]).id_class()) {
         var1.id_class(true);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLh_1 var1) {
      this.id_this();
      rgP_2 var2 = var1.id_throws();
      if (!(var2 instanceof rVe_1)) {
         Aw_1 var3 = var1.id_protected();
         if (var3 != null && !var3.id_class().equals(((cb_3)id_import.id_class[57]).sv())) {
            rgN_2 var4 = new rgN_2("");
            rrHH[] var5 = (rrHH[])this.id_break[5];
            int var6 = var5.length;

            for (int var7 = 0; var7 < var6; var7++) {
               rrHH var8 = var5[var7];
               if (var8.id_class()) {
                  var4.id_class(var8.id_class(var3)).id_break(" ");
               }
            }

            rVi_1 var9 = var2.id_case();
            if (var9.id_protected().isEmpty()) {
               var9 = var4.id_class(var9);
            } else {
               var9.id_class(0, var4);
            }

            var1.id_class(var9);
         }
      }
   }

   

   

   

   

   

   
}
