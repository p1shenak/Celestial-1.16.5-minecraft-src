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
import java.io.File;
import java.net.ServerSocket;
import java.nio.file.Files;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoBuy extends celestial.module.Module {
   public Object[] id_break;

   private int id_char() {
      this.id_while();
      int var1 = rpu_3.id_class();

      try {
         Files.write(((File)this.id_break[3]).toPath(), String.valueOf(var1).getBytes());
      } catch (Exception var3) {
      }

      return var1;
   }

   

   

   public AutoBuy() {
      super("Auto Buy", "Утилитарный модуль для работы\nс аукционом", Category.UTIL);
      this.id_while();
      rrIQ var6 = (rrIQ)new rrIQ("Процесс", "Покупающий", "Покупающий", "Проверяющий").id_class("process", (var1x, var2) -> {
         if (this.aJ_()) {
            if (this.id_this()) {
               this.id_else();
               this.id_public();
            } else {
               this.id_return();
               this.id_new();
            }
         }
      });
      this.id_break[0] = var6;
      this.id_class(
         (celestial.setting.Setting)((rrIQ)this.id_break[0])
            .id_class(
               () -> (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
                  ? true
                  : false
            )
      );
      rrtB_2 var1 = new rrtB_2();
      rrTo_1 var7 = new rrTo_1(var1, "127.0.0.1");
      this.id_break[1] = var7;
      rrTU var8 = new rrTU(var1, "127.0.0.1");
      this.id_break[2] = var8;
      File var9 = new File((File)id_import.id_class[24], "freeport.celka");
      this.id_break[3] = var9;
   }

   

   public boolean id_this() {
      this.id_while();
      return ((String)((rrIQ)this.id_break[0]).id_byte()).equals("Покупающий");
   }

   

   

   @Override
   public void id_class(boolean var1) {
      if (!this.id_instanceof()) {
         this.id_try();
      } else {
         super.id_class(var1);
         if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            if (this.id_this()) {
               this.id_else();
               this.id_public();
            } else if (this.id_goto()) {
               this.id_return();
               this.id_new();
            }
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !this.id_instanceof()) {
         this.id_byte(false);
      }
   }

   private boolean id_class(int var1) {
      try {
         boolean var3;
         try (ServerSocket var2 = new ServerSocket(var1)) {
            var2.setReuseAddress(true);
            var3 = true;
         }

         return var3;
      } catch (Exception var7) {
         return false;
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLM var1) {
      this.id_byte(false);
   }

   private int id_void() {
      this.id_while();

      try {
         return Integer.parseInt(new String(Files.readAllBytes(((File)this.id_break[3]).toPath())));
      } catch (Exception var2) {
         return -1;
      }
   }

   

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -158910370;
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_else();
      this.id_return();
      ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws().id_catch();
   }

   public boolean id_goto() {
      this.id_while();
      return ((String)((rrIQ)this.id_break[0]).id_byte()).equals("Проверяющий");
   }

   public rrTo_1 id_continue() {
      this.id_while();
      return (rrTo_1)this.id_break[1];
   }

   public void id_else() {
      this.id_while();

      try {
         ((rrTo_1)this.id_break[1]).id_protected();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private boolean id_instanceof() {
      return (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         ? false
         : true;
   }

   public void id_new() {
      this.id_while();

      try {
         int var1 = this.id_void();
         if (var1 != -1 && !this.id_class(var1)) {
            ((rrTo_1)this.id_break[1]).id_class(var1);
         } else {
            rrfu_3.id_byte("Запустите модуль с режимом \"Покупающий\" в этом или другом клиенте");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void id_return() {
      this.id_while();

      try {
         ((rrTU)this.id_break[2]).id_byte();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public rrTU id_super() {
      this.id_while();
      return (rrTU)this.id_break[2];
   }

   

   private void id_try() {
      String var1 = "Этот модуль не поддерживается на этом сервере";
      rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
   }

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   public void id_public() {
      this.id_while();

      try {
         int var1 = this.id_char();
         ((rrTU)this.id_break[2]).id_class(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
