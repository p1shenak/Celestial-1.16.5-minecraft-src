package celestial.module;

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
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Module extends rrwI_2 implements celestial.util.MinecraftAccessor {
   public Object[] id_class;

   public void id_byte(boolean var1) {
      this.id_goto();
      if ((Boolean)this.id_class[6]) {
         this.id_throws(var1);
         this.id_volatile();
      }
   }

   public void id_byte() {
   }

   public celestial.module.Category id_int() {
      this.id_goto();
      return (celestial.module.Category)this.id_class[3];
   }

   public Module(String var1, celestial.setting.KeyBind var2) {
      this.id_goto();
      ArrayList var7 = new ArrayList();
      this.id_class[8] = var7;
      this.id_class[0] = var1;
      this.id_class[4] = var2;
   }

   public Module(String var1, String var2, celestial.module.Category var3, celestial.setting.KeyBind var4) {
      this.id_goto();
      ArrayList var9 = new ArrayList();
      this.id_class[8] = var9;
      this.id_class[0] = var1;
      this.id_class[1] = var1.toLowerCase();
      this.id_class[4] = var4;
      this.id_class[5] = var4;
      this.id_class[2] = var2;
      this.id_class[3] = var3;
      ((List)this.id_class[8]).add(new rrTL());
      if (this instanceof rrnv_3) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_break(this);
      }
   }

   public Module(String var1, String var2, celestial.module.Category var3) {
      this(var1, var2, var3, KeyBind.NONE);
   }

   

   

   public void id_class(celestial.setting.KeyBind var1, boolean var2) {
      this.id_goto();
      this.id_class[4] = var1;
      if (var2) {
         ((List<rrTv_1>)this.id_class[8]).forEach(var2x -> var2x.id_class(this, var1));
      }
   }

   public void id_class(boolean var1, boolean var2) {
      this.id_goto();
      this.id_class[7] = var1;
      if (var2) {
         ((List<rrTv_1>)this.id_class[8]).forEach(var2x -> var2x.id_class(this, var1));
      }
   }

   public void id_class(boolean var1) {
      this.id_goto();
      if (var1) {
         ((List<rrTv_1>)this.id_class[8]).forEach(var1x -> var1x.id_class(this));
      }
   }

   

   

   public void id_break(boolean var1) {
      this.id_goto();
      if (this instanceof rrnv_3) {
         this.id_byte(false);
      } else if (!(Boolean)this.id_class[6]) {
         this.av_();
      this.id_class(var1);
      }
   }

   public List<rrTv_1> id_throws() {
      this.id_goto();
      return (List<rrTv_1>)this.id_class[8];
   }

   public void id_throws(boolean var1) {
      this.id_goto();
      if (var1) {
         ((List<rrTv_1>)this.id_class[8]).forEach(var1x -> var1x.id_break(this));
      }
   }

   public void id_finally() {
   }

   public String id_extends() {
      this.id_goto();
      return (String)this.id_class[0];
   }

   private void id_goto() {
      if (this.id_class == null) {
         this.id_class = new Object[9];
         this.id_class[6] = false;
         this.id_class[7] = false;
      }
   }

   public rVi_1 id_case() {
      return new rVe_1(this.id_final());
   }

   

   public boolean id_implements() {
      this.id_goto();
      return (Boolean)this.id_class[7];
   }

   public celestial.setting.KeyBind id_package() {
      this.id_goto();
      return (celestial.setting.KeyBind)this.id_class[4];
   }

   

   

   public void id_protected(boolean var1) {
      this.id_goto();
      this.id_class[6] = var1;
   }

   public String id_final() {
      this.id_goto();
      return (String)this.id_class[0];
   }

   public void id_volatile() {
      this.id_goto();
      if ((Boolean)this.id_class[6]) {
         this.id_class[6] = false;
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_byte(this);
      }
   }

   public String id_synchronized() {
      return this.id_final();
   }

   public boolean aJ_() {
      this.id_goto();
      return (Boolean)this.id_class[6];
   }

   public void aw_() {
      this.id_goto();
      if (!(this instanceof rrnv_3)) {
         if ((Boolean)this.id_class[6]) {
            this.id_byte(true);
         } else {
            this.id_break(true);
         }
      }
   }

   public void av_() {
      this.id_goto();
      if (!(Boolean)this.id_class[6]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_break(this);
         this.id_class[6] = true;
      }
   }

   public celestial.setting.KeyBind ax_() {
      this.id_goto();
      return (celestial.setting.KeyBind)this.id_class[5];
   }

   public String ay_() {
      this.id_goto();
      return (String)this.id_class[2];
   }

   public String aH_() {
      this.id_goto();
      return (String)this.id_class[1];
   }
}
