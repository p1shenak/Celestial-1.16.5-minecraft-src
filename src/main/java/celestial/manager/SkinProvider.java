package celestial.manager;

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
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SkinProvider {
   private final fY_2 id_class;
   private final File id_break;
   private final MinecraftSessionService id_byte;
   private final LoadingCache<String, Map<Type, MinecraftProfileTexture>> id_protected;

   public SkinProvider(fY_2 var1, File var2, MinecraftSessionService var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new jD_2(this, var3));
   }

   private rqO_2 id_class(MinecraftProfileTexture var1, Type var2, jU_2 var3) {
      String var4 = Hashing.sha1().hashUnencodedChars(var1.getHash()).toString();
      rqO_2 var5 = new rqO_2("skins/" + var4);
      ff_3 var6 = this.id_class.id_break(var5);
      if (var6 != null) {
         if (var3 != null) {
            var3.onSkinTextureAvailable(var2, var5, var1);
         }
      } else {
         File var7 = new File(this.id_break, var4.length() > 2 ? var4.substring(0, 2) : "xx");
         File var8 = new File(var7, var4);
         fd_3 var9 = new fd_3(var8, var1.getUrl(), jH_2.id_class(), var2 == Type.SKIN, () -> {
            if (var3 != null) {
               var3.onSkinTextureAvailable(var2, var5, var1);
            }
         });
         this.id_class.id_class(var5, var9);
      }

      return var5;
   }

   public rqO_2 id_class(MinecraftProfileTexture var1, Type var2) {
      return this.id_class(var1, var2, (jU_2)null);
   }

   public void id_class(GameProfile var1, jU_2 var2, boolean var3) {
      Runnable var4 = () -> {
         HashMap var4x = Maps.newHashMap();

         try {
            var4x.putAll(this.id_byte.getTextures(var1, var3));
         } catch (InsecurePublicKeyException var7) {
         }

         if (var4x.isEmpty()) {
            var1.getProperties().clear();
            if (var1.getId().equals(QY.id_instanceof().id_while().id_throws().getId())) {
               var1.getProperties().putAll(QY.id_instanceof().id_byte());
               var4x.putAll(this.id_byte.getTextures(var1, false));
            } else {
               this.id_byte.fillProfileProperties(var1, var3);

               try {
                  var4x.putAll(this.id_byte.getTextures(var1, var3));
               } catch (InsecurePublicKeyException var6) {
               }
            }
         }

         QY.id_instanceof().execute(() -> RenderSystem.recordRenderCall(() -> ImmutableList.of(Type.SKIN, Type.CAPE).forEach(var3xx -> {
            if (var4x.containsKey(var3xx)) {
      this.id_class((MinecraftProfileTexture)var4x.get(var3xx), var3xx, var2);
            }
         })));
      };
      rqR_2.id_case().execute(var4);
   }

   public Map<Type, MinecraftProfileTexture> id_class(GameProfile var1) {
      Property var2 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
      return (Map<Type, MinecraftProfileTexture>)(var2 == null ? ImmutableMap.of() : (Map)this.id_protected.getUnchecked(var2.getValue()));
   }
}
