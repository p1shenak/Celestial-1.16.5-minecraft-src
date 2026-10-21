package celestial.setting;

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
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CheckGroup {
   public Object[] id_class;

   public List<rrIk_1> id_byte() {
      return new ArrayList<>(((Map)this.id_class[0]).values());
   }

   public celestial.setting.CheckGroup id_byte(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3], var1);
   }

   public CheckGroup() {
      this.id_native();
      EnumMap var5 = new EnumMap(rrIA.class);
      this.id_class[0] = var5;
   }

   

   

   public celestial.setting.CheckGroup id_class(rrIA var1, boolean var2) {
      rrIk_1 var3 = new rrIk_1(var1.id_class(), var1.id_break());
      var3.id_class(var2, false, true);
      if (var1 == (rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]) {
         var3.id_class(this::id_throws);
      }

      ((Map)this.id_class[0]).put(var1, var3);
      return this;
   }

   

   

   private boolean id_class(rrIA var1) {
      return Optional.ofNullable((rrIk_1)((Map)this.id_class[0]).get(var1)).<Boolean>map(rrIk_1::id_class).orElse(false);
   }

   public celestial.setting.CheckGroup id_class(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5], var1);
   }

   public boolean id_class() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6]);
   }

   public boolean id_break() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[3]);
   }

   public celestial.setting.CheckGroup id_break(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[6], var1);
   }

   public celestial.setting.CheckGroup id_throws(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2], var1);
   }

   public boolean id_throws() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[0]);
   }

   public boolean id_finally() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1]);
   }

   public boolean id_catch() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[5]);
   }

   public celestial.setting.CheckGroup id_catch(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[0], var1);
   }

   public boolean id_extends() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8]);
   }

   public boolean id_case() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4]);
   }

   public celestial.setting.CheckGroup id_case(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[1], var1);
   }

   public celestial.setting.CheckGroup id_implements(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[4], var1);
   }

   public boolean id_implements() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[2]);
   }

   public celestial.setting.CheckGroup id_protected(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7], var1);
   }

   public Map<rrIA, rrIk_1> id_protected() {
      return (Map<rrIA, rrIk_1>)this.id_class[0];
   }

   public celestial.setting.CheckGroup id_private(boolean var1) {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[8], var1);
   }

   public boolean id_private() {
      return this.id_class((rrIA)rrIA.staticFieldse25fceafd9d23d67b8a30b04e4e147ad[7]);
   }

   

   

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
