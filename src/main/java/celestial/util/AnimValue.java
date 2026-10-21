package celestial.util;

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

public class AnimValue implements rrNG {
   public Object[] id_class;

   public float id_byte() {
      return (Float)this.id_class[2];
   }

   public float id_byte(float var1) {
      return this.id_byte() + Math.min(1.0F, var1) * (1.0F - this.id_byte());
   }

   public rrNE id_int() {
      return (rrNE)this.id_class[1];
   }

   public AnimValue(float var1, boolean var2) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var1, var2);
   }

   public AnimValue(rrQK var1, float var2, boolean var3) {
      this.id_this();
      rrNE var8 = (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0];
      this.id_class[1] = var8;
      this.id_class[3] = -1.0F;
      this.id_class[4] = true;
      rrNb_1 var11 = new rrNb_1(var1, var2);
      this.id_class[0] = var11;
      if (var3) {
      this.id_class();
      }
   }

   

   private void id_this() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   

   public void id_class(float var1) {
      this.id_class[2] = var1;
      ((rrNb_1)this.id_class[0]).id_class(var1);
   }

   

   public void id_class(rrNE var1, float var2) {
      this.id_class[3] = var2;
      this.id_class[1] = var1;
      if ((Boolean)this.id_class[5] && (Float)this.id_class[2] != var2) {
         this.id_class[5] = false;
      this.id_class(var2);
      } else if (!(Boolean)this.id_class[4] || !this.id_protected()) {
         ((rrNb_1)this.id_class[0]).id_class(var2);
         ((rrNb_1)this.id_class[0]).id_protected();
         this.id_class[2] = (float)((rrNb_1)this.id_class[0]).id_byte();
      }
   }

   

   public void id_class() {
      this.id_class[3] = 1.0F;
      this.id_class[2] = 1.0F;
      ((rrNb_1)this.id_class[0]).id_class(1.0);
      ((rrNb_1)this.id_class[0]).id_break();
   }

   public void id_class(boolean var1) {
      byte var2 = (byte)(var1 ? 1 : 0);
      this.id_class[3] = (float)var2;
      rrNE var8 = var1
         ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0]
         : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1];
      this.id_class[1] = var8;
      if ((Boolean)this.id_class[5] && (Float)this.id_class[2] != var2) {
         this.id_class[5] = false;
      this.id_class((float)var2);
      } else if (!(Boolean)this.id_class[4] || !this.id_protected()) {
         ((rrNb_1)this.id_class[0]).id_class(var2);
         ((rrNb_1)this.id_class[0]).id_protected();
         this.id_class[2] = (float)((rrNb_1)this.id_class[0]).id_byte();
      }
   }

   public rrNb_1 id_break() {
      return (rrNb_1)this.id_class[0];
   }

   public void id_break(float var1) {
      this.id_class((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0], var1);
   }

   public celestial.util.AnimValue id_throws() {
      this.id_class[4] = false;
      return this;
   }

   public boolean id_finally() {
      return (rrNE)this.id_class[1] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0] ? true : false;
   }

   public boolean id_catch() {
      return this.id_new() && this.id_protected() ? true : false;
   }

   public void id_extends() {
      this.id_class[2] = 0.0F;
      ((rrNb_1)this.id_class[0]).id_case();
   }

   public boolean id_case() {
      return this.id_byte() > 0.0F ? true : false;
   }

   public float id_continue() {
      return (Float)(Float)this.id_class[3] > 1.0F ? (Float)this.id_class[3] - this.id_byte() : 1.0F - this.id_byte();
   }

   

   public float id_implements() {
      return (Float)this.id_class[3];
   }

   public boolean id_new() {
      return (rrNE)this.id_class[1] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1] ? true : false;
   }

   public celestial.util.AnimValue id_package() {
      this.id_class[5] = true;
      return this;
   }

   

   

   

   public boolean id_protected() {
      return this.id_byte() == (Float)this.id_class[3] ? true : false;
   }

   public boolean id_private() {
      return (Boolean)this.id_class[5];
   }

   public float id_final() {
      if ((Float)this.id_class[3] < 0.0F) {
      this.id_class((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0], 1.0F);
      } else if (this.id_protected()) {
         boolean var1 = (Float)(Float)this.id_class[3] >= 0.999F ? true : false;
      this.id_class(
            var1
               ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1]
               : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0],
            var1 ? 0.0F : 1.0F
         );
      } else {
      this.id_class((rrNE)this.id_class[1], (Float)this.id_class[3]);
      }

      return (Float)this.id_class[2];
   }

   public boolean id_volatile() {
      return this.id_finally() && this.id_protected() ? true : false;
   }

   

   public boolean id_native() {
      return (Boolean)this.id_class[4];
   }
}
