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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GuiMove extends celestial.module.Module {
   public Object[] id_break;
   private static long[] id_catch;

   public GuiMove() {
      super("Gui Move", "Позволяет ходить в открытых\nконтейнерах", Category.PLAYER);
      this.id_while();
      rrIQ var5 = new rrIQ("Режим", "Advanced", "Advanced", "Funtime", "Vanilla");
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Не в текстовых полях", true);
      this.id_break[1] = var6;
      this.id_class(
         (rrIQ)this.id_break[0],
         (rrIk_1)this.id_break[1]
      );
      rrHr_1 var7 = new rrHr_1(this);
      this.id_break[2] = var7;
      rrHB var8 = new rrHB(this);
      this.id_break[3] = var8;
      rrHS var9 = new rrHS(this);
      this.id_break[4] = var9;
      rrHB var10 = (rrHB)this.id_break[3];
      this.id_break[5] = var10;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_while();
         if ((rrli_3)this.id_break[5] != null && this.aJ_()) {
            ((rrli_3)this.id_break[5]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -654193598:
               if (var3.equals("Advanced")) {
                  var4 = 0;
               }
               break;
            case 1155506348:
               if (var3.equals("Funtime")) {
                  var4 = 1;
               }
               break;
            case 1897755483:
               if (var3.equals("Vanilla")) {
                  var4 = 2;
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrHr_1)this.id_break[2];
            case 1 -> (rrHB)this.id_break[3];
            case 2 -> (rrHS)this.id_break[4];
            default -> null;
         };
         this.id_break[5] = var9x;
         if ((rrli_3)this.id_break[5] != null && this.aJ_()) {
            ((rrli_3)this.id_break[5]).aI_();
         }
      });
   }

   

   

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.id_super()) {
            this.id_break[6] = System.currentTimeMillis();
         }

         if ((vm_3)id_import.id_class[73] == null) {
            return;
         }

         if (this.id_class((vm_3)id_import.id_class[73])) {
      this.id_class((Function<Vu_1, Boolean>)(var0 -> false));
            return;
         }

      this.id_class((Function<Vu_1, Boolean>)(var0 -> rrfC_2.id_break(var0.id_int().id_break())));
         if (((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break && !((cb_3)id_import.id_class[57]).BL()) {
            ((Qw_1)id_import.id_class[20]).k.id_class(rrfC_2.id_break(((Qw_1)id_import.id_class[20]).k.id_int().id_break()));
         }
      }
   }

   

   private void id_class(Function<Vu_1, Boolean> var1) {
      Vu_1[] var2 = ((Qw_1)id_import.id_class[20]).Pj;
      int var3 = var2.length;

      for (int var4 = 0; var4 < var3; var4++) {
         Vu_1 var5 = var2[var4];
         var5.id_class((Boolean)var1.apply(var5));
      }
   }

   private boolean id_class(vm_3 var1) {
      this.id_while();
      if (!((rrIk_1)this.id_break[1]).id_class()
         || !((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).id_break() && !vs_3.INSTANCE.id_break()) {
         return ((rrli_3)this.id_break[5]).id_class(var1) ? true : false;
      } else {
         return true;
      }
   }

   

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }

      this.id_class((Function<Vu_1, Boolean>)(var0 -> false));
   }

   

   public long id_continue() {
      this.id_while();
      return (Long)this.id_break[6];
   }

   private static void id_else() {
      id_catch = new long[1];
   }

   public rrTF<celestial.module.movement.GuiMove> id_new() {
      this.id_while();
      return (rrli_3)this.id_break[5];
   }

   

   public boolean id_super() {
      this.id_while();
      if ((rrli_3)this.id_break[5] == (rrHB)this.id_break[3]) {
         return ((rrHB)this.id_break[3]).id_class();
      } else {
         return (rrli_3)this.id_break[5] == (rrHr_1)this.id_break[2] ? ((rrHr_1)this.id_break[2]).id_class() : true;
      }
   }

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         this.id_break[6] = 0L;
      }
   }

   
}
