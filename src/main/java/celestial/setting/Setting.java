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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class Setting<T> {
   public Object[] id_class;

   public T id_byte() {
      return (T)this.id_class[3];
   }

   public void id_byte(String var1) {
      this.id_class[0] = var1;
   }

   public Setting(String var1, T var2) {
      this.id_native();
      HashMap var8 = new HashMap();
      this.id_class[4] = var8;
      this.id_class[0] = var1;
      this.id_class[3] = var2;
      Supplier<Boolean> var11 = () -> true;
      this.id_class[5] = var11;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == 10) {
            this.id_class[2] = (Integer)this.id_class[2] + 1;
         }
      }
   }

   

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         celestial.setting.Setting var2 = (celestial.setting.Setting)var1;
         return Objects.equals((String)this.id_class[0], (String)var2.id_class[0]);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode((String)this.id_class[0]);
   }

   public void id_class(T var1, boolean var2, boolean var3) {
      this.id_class[3] = var1;
      if (var3 && !((Map)this.id_class[4]).isEmpty()) {
         for (Map.Entry var5 : ((Map<?, ?>)this.id_class[4]).entrySet()) {
            ((BiConsumer)var5.getValue()).accept(this, Pair.of(var1, var2));
         }
      }
   }

   public <E extends celestial.setting.Setting<E>> E id_class(String var1) {
      this.id_class[1] = var1;
      return (E)this;
   }

   public <E> E id_class(Supplier<Boolean> var1) {
      this.id_class[5] = var1;
      return (E)this;
   }

   public <E> E id_class(String var1, BiConsumer<celestial.setting.Setting<T>, Pair<T, Boolean>> var2) {
      ((Map)this.id_class[4]).put(var1, var2);
      return (E)this;
   }

   

   

   

   

   

   public String id_throws() {
      return (String)this.id_class[0];
   }

   public String id_catch() {
      return (String)this.id_class[1];
   }

   

   public Supplier<Boolean> id_case() {
      return (Supplier<Boolean>)this.id_class[5];
   }

   public int id_implements() {
      return (Integer)this.id_class[2];
   }

   public Map<String, BiConsumer<celestial.setting.Setting<T>, Pair<T, Boolean>>> id_protected() {
      return (Map<String, BiConsumer<celestial.setting.Setting<T>, Pair<T, Boolean>>>)this.id_class[4];
   }

   public boolean id_private() {
      return (Boolean)((Supplier)this.id_class[5]).get();
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[2] = Integer.valueOf(0);
      }
   }
}
