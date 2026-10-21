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
import com.mojang.authlib.GameProfile;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class Notifications extends celestial.module.Module implements rrnv_3 {
   public static Object[] id_break;
   public Object[] id_byte;

   public Notifications() {
      super("Notifications", "Откладка о каких либо действиях", Category.RENDER);
      this.id_return();
      rrIk_1 var5 = new rrIk_1("Включено", true);
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Включено", false);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Вас", false);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Друзей", false);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Включено", false);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1("Включено", false);
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1("Включено", false);
      this.id_byte[6] = var11;
      rrIk_1 var12 = new rrIk_1("Включено", false);
      this.id_byte[7] = var12;
      rrIk_1 var13 = new rrIk_1("Уведомлять об окончании\nважных эффектов", true);
      this.id_byte[8] = var13;
      Pair var14 = rrwg_3.id_class(
         new rrIk_1("Воспроизводить звук", true), new rrIm_1("Питч звука", 1.0F, 0.1F, 2.0F, 0.1F)
      );
      this.id_byte[9] = var14;
      this.id_class(
         new celestial.setting.GroupSetting("Переключение модулей", (rrIk_1)this.id_byte[0]),
         new celestial.setting.GroupSetting("Упоминание в чате", (rrIk_1)this.id_byte[1], (celestial.setting.Setting)new rrIc_1("Упоминание кого", (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3]).id_class(() -> ((rrIk_1)this.id_byte[1]).id_class())),
         new celestial.setting.GroupSetting("Спек в чате", (rrIk_1)this.id_byte[4]),
         new celestial.setting.GroupSetting("Варп в чате", (rrIk_1)this.id_byte[5]),
         new celestial.setting.GroupSetting("/pvp в чате", (rrIk_1)this.id_byte[6]),
         new celestial.setting.GroupSetting("Снос щита", (rrIk_1)this.id_byte[7]),
         new celestial.setting.GroupSetting("Другое", (rrIk_1)this.id_byte[8]),
         new celestial.setting.GroupSetting("Общие настройки", (celestial.setting.Setting)((Pair)this.id_byte[9]).getLeft(), (celestial.setting.Setting)((Pair)this.id_byte[9]).getRight())
      );
   }

   

   

   @celestial.event.EventTarget
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && ((rrIk_1)this.id_byte[8]).id_class()) {
         for (rLY var4 : ((cb_3)id_import.id_class[57]).So()) {
            int var5 = var4.id_break();
            if (var5 == 200 && ((Set)id_break[0]).contains(var4.id_class())) {
               String var6 = jI_2.id_class("ru_ru", var4.id_class().id_byte(), new Object[0]);
               int var7 = var4.id_byte() + 1;
               if (var7 > 1) {
                  var6 = var6 + " " + var7;
               }

               rVi_1 var8 = new rgN_2("Эффект '")
                  .id_break(var6)
                  .id_class(rgF_2.GRAY)
                  .id_break("' закончится через ")
                  .id_class(new rgN_2("10 секунд").id_class(rgF_2.RED));
               rrfu_3.id_class(var8);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                  .id_class(new rrtd_3(this.id_case(), var8.id_class(rgF_2.WHITE), 4000));
            }
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrFy_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[1]).id_class()) {
         Aw_1 var2 = var1.id_class();
         Set var3 = var1.id_break();
         String var4 = ((cb_3)id_import.id_class[57]).sv().getName();
         rgN_2 var5 = new rgN_2(this.id_final());
         rgP_2 var6 = uR_2.id_break(var2, new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME});
         boolean var7 = ((rrIk_1)this.id_byte[2]).id_class() && var3.contains(var4) ? true : false;
         boolean var8 = ((rrIk_1)this.id_byte[3]).id_class() && var3.size() > (var7 ? 1 : 0)
            ? true
            : false;
         if (var7) {
            rVi_1 var9 = new rgN_2("Игрок '").id_class(var6).id_break("' упомянул ").id_class(new rgN_2("вас").id_class(rgF_2.RED));
            rrtd_3 var10 = new rrtd_3(var5, var9.id_case(), 4000);
            rrfu_3.id_class(var9.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var10);
            celestial.util.MinecraftAccessor.a_(var9.id_byte(), false);
         }

         if (var8) {
            var3.remove(var4);
            rVi_1 var11 = new rgN_2("Игрок '")
               .id_class(var6)
               .id_break("' упомянул друзей: ")
               .id_class(new rgN_2(String.join(", ", var3)).id_class(rgF_2.RED));
            rrtd_3 var12 = new rrtd_3(var5, var11.id_case(), 4000);
            rrfu_3.id_class(var11.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var12);
            celestial.util.MinecraftAccessor.a_(var11.id_byte(), false);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFp_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[6]).id_class()) {
         rgN_2 var2 = new rgN_2(this.id_final());
         Aw_1 var3 = var1.id_class();
         rgP_2 var4 = uR_2.id_break(var3, new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME});
         rVi_1 var5 = new rgN_2("Игрок '").id_class(var4).id_break("' зовёт на ").id_class(new rgN_2("/pvp").id_class(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var2, var5.id_case(), 4000);
         rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var6);
         celestial.util.MinecraftAccessor.a_(var5.id_byte(), false);
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFq_1 var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[4]).id_class()) {
         rgN_2 var2 = new rgN_2(this.id_final());
         Aw_1 var3 = var1.id_class();
         GameProfile var4 = var3.id_class();
         UUID var5 = var4.getId();
         rgP_2 var6 = uR_2.id_break(var3, new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME});
         rVi_1 var7 = new rgN_2("Игрок '").id_class(var6).id_break("' зовёт ").id_class(new rgN_2("спекать").id_class(rgF_2.RED));
         rrtJ_2 var8 = new rrtJ_2(var2, var7.id_case(), 4000);
         rhd_3 var9 = ((gm_3)id_import.id_class[56]).id_class(var5);
         if (var9 != null) {
            rrfu_3.id_class(var7.id_class(rgF_2.GRAY));
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var8);
            celestial.util.MinecraftAccessor.a_(var7.id_byte(), false);
         }
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_return();
      if (var1.id_class() instanceof rvQ_2 var2 && var2.id_break() == 30 && ((rrIk_1)this.id_byte[7]).id_class()) {
         an_3 var7 = var2.id_class((gm_3)id_import.id_class[56]);
         if (var7 != (cb_3)id_import.id_class[57] && var7 instanceof cG_2 var4) {
            rgN_2 var5 = new rgN_2(this.id_final());
            rgN_2 var10000 = new rgN_2("Щит игрока '");
            Aw_1 var10001 = var4.id_continue();
            rVi_1 var6 = var10000.id_class(uR_2.id_break(var10001, new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME})).id_break("' сломан");
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(var5, var6, 2000));
         }
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLr_1 var1) {
      this.id_return();
      rrtO_2 var2 = var1.id_class();
      if (((rrIk_1)((Pair)this.id_byte[9]).getLeft()).id_class() && var2.id_class()) {
         rrIy_1.id_class(var2.id_throws(), 1.0F, (Float)((rrIm_1)((Pair)this.id_byte[9]).getRight()).id_byte());
      }
   }

   @celestial.event.EventTarget
   public void id_class(rrFT var1) {
      this.id_return();
      if (((rrIk_1)this.id_byte[5]).id_class()) {
         Aw_1 var2 = var1.id_class();
         rgN_2 var3 = new rgN_2(this.id_final());
         rgP_2 var4 = uR_2.id_break(var2, new rnO_2[]{rnO_2.PREFIX, rnO_2.NAME});
         rVi_1 var5 = new rgN_2("Игрок '").id_class(var4).id_break("' зовёт на варп ").id_class(new rgN_2("'" + var1.id_break() + "'").id_class(rgF_2.RED));
         rrtd_3 var6 = new rrtd_3(var3, var5.id_case(), 4000);
         rrfu_3.id_class(var5.id_class(rgF_2.GRAY));
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(var6);
         celestial.util.MinecraftAccessor.a_(var5.id_byte(), false);
      }
   }

   

      static {
      Object[] var0 = new Object[]{Set.of((rLR)rLD.id_throws, (rLR)rLD.id_class, (rLR)rLD.id_final)};
      id_break = var0;
   }

   

   

   public boolean id_new() {
      this.id_return();
      return ((rrIk_1)this.id_byte[0]).id_class();
   }

   private void id_return() {
      if (this.id_byte == null) {
         this.id_byte = new Object[10];
      }
   }

   

   
}
