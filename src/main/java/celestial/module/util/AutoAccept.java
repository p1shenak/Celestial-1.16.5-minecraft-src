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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoAccept extends celestial.module.Module {
   public Object[] id_break;

   public AutoAccept() {
      super("Auto Accept", "Автоматически принимает\nзапросы на что-либо", Category.UTIL);
      this.id_super();
      ArrayList var5 = new ArrayList();
      this.id_break[0] = var5;
      this.id_class(new rrlt_3(this));
      this.id_class(new rrlq_3(this));
      this.id_class(new rrlp_3(this));
   }

   

   

   

   @Override
   public void id_class(boolean var1) {
      this.id_super();
      super.id_class(var1);

      for (rrTF var3 : (List<rrTF>)this.id_break[0]) {
         var3.aI_();
      }
   }

   public <T extends rrTF<?>> T id_class(T var1) {
      this.id_super();
      ((List)this.id_break[0]).add(var1);
      return (T)var1;
   }

   public boolean id_class(String[] var1) {
      Set var2 = Arrays.stream(var1).map(String::toLowerCase).collect(Collectors.toSet());
      Set var3 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class().keySet();

      for (String var5 : (List<String>)var2) {
         if (var3.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   

   

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);

      for (rrTF var3 : (List<rrTF>)this.id_break[0]) {
         var3.aK_();
      }
   }

   

   

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
      }
   }
}
