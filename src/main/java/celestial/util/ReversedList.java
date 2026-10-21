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
import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ReversedList<T> extends ArrayList<T> {

   

   @Override
   public void add(int var1, T var2) {
      super.add(this.size() - var1, var2);
   }

   @Override
   public boolean add(T var1) {
      super.add(0, var1);
      return true;
   }

   

   

   

   

   @Override
   public boolean addAll(int var1, Collection<? extends T> var2) {
      return super.addAll(this.size() - var1, new celestial.util.ReversedList<>());
   }

   @Override
   public boolean addAll(Collection<? extends T> var1) {
      return super.addAll(0, new celestial.util.ReversedList<>());
   }
}
