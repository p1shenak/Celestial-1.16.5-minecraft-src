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

public class DeathCoords extends celestial.module.Module {

   public DeathCoords() {
      super("Death Coords", "Отображает координаты вашей\nсмерти", Category.UTIL);
   }

   

   private String id_this() {
      String var1 = "Точка смерти";
      int var2 = 1;

      while (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_protected(var1)) {
         var1 = String.format("Точка смерти %d", ++var2);
      }

      return var1;
   }

   private void id_class(String var1, rja_3 var2) {
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(this.id_final(), var1, 5000));
      rVi_1 var3 = rgv_3.id_class(
         rrfu_3.id_break(this).id_class(rgF_2.GRAY).id_break(var1).id_class(new rgN_2(" (Нажмите, чтобы создать точку)").id_class(rgF_2.RED)), new rgl_3(() -> this.id_class(var2))
      );
      rrfu_3.id_class(var3);
   }

   

   private void id_class(rja_3 var1) {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0])
         .id_class(new rrjD_2(this.id_this(), var1.id_else(), rrfp_3.id_throws()), true);
   }

   

   @celestial.event.EventTarget
   public void id_class(rrAG var1) {
      rja_3 var2 = var1.id_class().id_finally();
      String var3 = String.format("X: %d Y: %d Z: %d", var2.b_(), var2.c_(), var2.d_());
      String var4 = String.format("Ваши координаты смерти: %s", var3);
      this.id_class(var4, var2);
   }

   

   

   

   

   
}
