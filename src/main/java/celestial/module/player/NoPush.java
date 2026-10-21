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

public class NoPush extends celestial.module.Module {
   public Object[] id_break;

   public NoPush() {
      super("No Push", "Игнорирует отталкивание от\\nчего-либо", Category.PLAYER);
      this.id_super();
      rrIk_1 var5 = new rrIk_1("Блоки", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Сущности", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Удочки", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Воду", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Пузыри", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Границу", false);
      this.id_break[5] = var10;
      this.id_class(new rrIc_1("Игнорировать", (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[3], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[5]));
   }

   

   

   @celestial.event.EventTarget
   public void id_class(rrAx_1 var1) {
      this.id_super();
      rrAd_1 var2 = var1.id_class();
      if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[2] && ((rrIk_1)this.id_break[0]).id_class()) {
         var1.id_class(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[1] && ((rrIk_1)this.id_break[1]).id_class()) {
         var1.id_class(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[0] && ((rrIk_1)this.id_break[3]).id_class()) {
         var1.id_class(true);
      } else if (var2 == (rrAd_1)rrAd_1.staticFieldseafc2f5d275533c69a39185d3a872ac0[3] && ((rrIk_1)this.id_break[4]).id_class()) {
         var1.id_class(true);
      }
   }

   

   @celestial.event.EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rvQ_2 var2 && var2.id_break() == 31 && ((rrIk_1)this.id_break[2]).id_class()) {
         var1.id_class(true);
      }
   }

   

   

   

   

   public boolean id_new() {
      this.id_super();
      return this.aJ_() && ((rrIk_1)this.id_break[5]).id_class() ? true : false;
   }

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }
}
