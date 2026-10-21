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
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ZipStream extends DeflaterOutputStream {
   public Object[] id_class;

   

   public ZipStream(rrzf_3 var1, rrzY_2 var2, OutputStream var3) {
      super(var3, var1.id_while());
      this.id_protected();
      this.id_class[3] = var1;
      rrzY_2 var9 = Objects.requireNonNull(var2, "Zip entry is null");
      this.id_class[1] = var9;
      CRC32 var10 = new CRC32();
      this.id_class[0] = var10;
   }

   

   

   

   

   

   @Override
   public synchronized void write(byte[] var1, int var2, int var3) throws IOException {
      super.write(var1, var2, var3);
      ((CRC32)this.id_class[0]).update(var1, var2, var3);
   }

   @Override
   public synchronized void close() throws IOException {
      if (!(Boolean)this.id_class[2]) {
         this.id_class[2] = true;
         this.finish();
         rrzY_2 var10000 = (rrzY_2)this.id_class[1];
         Long var8 = this.def.getBytesRead();
         var10000.id_class[12] = var8;
         var10000 = (rrzY_2)this.id_class[1];
         Long var9 = this.def.getBytesWritten();
         var10000.id_class[11] = var9;
         var10000 = (rrzY_2)this.id_class[1];
         Long var10 = ((CRC32)this.id_class[0]).getValue();
         var10000.id_class[10] = var10;
         if (this.out instanceof rrza_3 var1 && (OutputStream)var1.id_class[2] == null) {
            var10000 = (rrzY_2)this.id_class[1];
            byte[] var11 = var1.id_byte();
            var10000.id_class[0] = var11;
         }

         super.close();
         ((rrzf_3)this.id_class[3]).id_class((rrzY_2)this.id_class[1]);
         ((rrzf_3)this.id_class[3]).id_class(this.def);
      }
   }

   

   

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[2] = 0;
      }
   }
}
