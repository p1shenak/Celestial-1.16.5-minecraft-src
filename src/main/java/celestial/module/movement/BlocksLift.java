package celestial.module.movement;

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

public class BlocksLift extends celestial.module.Module implements rrnZ_2 {
   public Object[] id_break;

   public BlocksLift() {
      super("Blocks Lift", "Позволяет подниматься в блоках", Category.MOVEMENT);
      this.id_super();
      rrIQ var5 = new rrIQ("Режим", "Packet", "Packet", "Glide", "Matrix");
      this.id_break[0] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[1] = var6;
      this.id_class((rrIQ)this.id_break[0]);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         String var2 = (String)((rrIQ)this.id_break[0]).id_byte();
         byte var3 = -1;
         switch (var2.hashCode()) {
            case -1997372447:
               if (var2.equals("Matrix")) {
                  var3 = 2;
               }
               break;
            case -1911998296:
               if (var2.equals("Packet")) {
                  var3 = 1;
               }
               break;
            case 68891525:
               if (var2.equals("Glide")) {
                  var3 = 0;
               }
         }

         switch (var3) {
            case 0:
               if (((cb_3)id_import.id_class[57]).BW()
                  && !((cb_3)id_import.id_class[57]).id_class(QP.id_class)
                  && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
                  if ((Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0) {
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZO(true));
                  }

                  if (((cb_3)id_import.id_class[57]).BL()) {
                     ((cb_3)id_import.id_class[57]).sl();
                  } else {
                     ((cb_3)id_import.id_class[57]).rv().id_break = 0.0;
                     ((cb_3)id_import.id_class[57]).rv().id_protected = 0.0;
                     ((cb_3)id_import.id_class[57]).rv().id_byte = -0.01;
                  }
               }
               break;
            case 1:
               if (((cb_3)id_import.id_class[57]).BW()
                  && !((cb_3)id_import.id_class[57]).BL()
                  && !((cb_3)id_import.id_class[57]).id_class(QP.id_class)
                  && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
                  rrfj_3.id_class(true);
                  if (((rrfw_3)this.id_break[1]).id_class(150.0)) {
                     ((cb_3)id_import.id_class[57]).rv().id_byte = 0.42;
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rZO(true));
                  }

                  if (((rrfw_3)this.id_break[1]).id_class(300.0)) {
                     ((rrfw_3)this.id_break[1]).id_class();
                  }

                  this.id_break[2] = true;
               } else if ((Boolean)this.id_break[2]) {
                  this.id_break[2] = false;
               }
               break;
            case 2:
               if (((cb_3)id_import.id_class[57]).BW() && ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private) {
                  rrIU.id_class();
                  ((cb_3)id_import.id_class[57]).rv().id_byte = 0.42;
                  if ((Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0) {
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rZO(true));
                  }
               }
         }
      }
   }

   

   public void id_class() {
      this.id_byte(false);
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      this.id_break[2] = false;
      ((rrfw_3)this.id_break[1]).id_class();
   }

   

   

   

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[2] = false;
      }
   }
}
