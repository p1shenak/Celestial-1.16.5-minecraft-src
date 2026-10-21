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
import org.apache.commons.lang3.tuple.Pair;

public class AutoTool extends celestial.module.Module {
   public Object[] id_break;
   private static float[] id_private = new float[2];

   public AutoTool() {
      super("Auto Tool", "Автоматически берет лучший\nинструмент для ломания блока", Category.PLAYER);
      this.id_else();
      this.id_break[0] = Integer.valueOf(-1);
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrLH var1) {
      this.id_else();
      if (var1.id_protected() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]) {
         if (var1.id_byte() || ((cb_3)id_import.id_class[57]).id_native()) {
            return;
         }

         if ((Integer)this.id_break[0] != -1) {
            ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_break[0];
         }

         Pair var2 = this.id_class(var1.id_class(), var1.id_break());
         if (var2 == null) {
            return;
         }

         int var3 = (Integer)var2.getRight();
         if (var3 == -1 || var3 == ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected) {
            return;
         }

         this.id_break[0] = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected;
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var3;
      } else if (var1.id_protected() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1]
         && (Integer)this.id_break[0] != -1) {
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_break[0];
         this.id_break[0] = Integer.valueOf(-1);
      }
   }

   

   public Pair<rdn_3, Integer> id_class(xc_3 var1, rfH_2 var2) {
      rdn_3 var3 = rdn_3.id_break;
      int var4 = -1;
      float var5 = id_private[0];

      for (int var6 = 0; var6 < 9; var6++) {
         rdn_3 var7 = (rdn_3)((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_class.get(var6);
         if (!var7.id_class() && var7.id_break().id_class(var1, (gm_3)id_import.id_class[56], var2, (cb_3)id_import.id_class[57])) {
            float var8 = var1.id_class((cb_3)id_import.id_class[57], var7, (gm_3)id_import.id_class[56], var2);
            if (!(var8 <= id_private[1]) && var8 > var5) {
               var5 = var8;
               var4 = var6;
               var3 = var7;
            }
         }
      }

      return Pair.of(var3, var4);
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_else();
      super.id_throws(var1);
      this.id_break[0] = Integer.valueOf(-1);
   }

   

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         this.id_break[0] = 0;
      }
   }

   private static void id_new() {
      id_private = new float[2];
   }

   

   
}
