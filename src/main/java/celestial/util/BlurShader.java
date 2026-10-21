package celestial.util;

import celestial.*;
import celestial.manager.ShaderManager;
import celestial.util.MinecraftAccessor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;

public class BlurShader implements MinecraftAccessor {
   public static Object[] id_class = new Object[]{
      new ShaderManager("celestial/shaders/gaussian.frag", false),
      new VC(1, 1, false, false)
   };

   public static VC id_class(VC var0) {
      if (var0 != null && var0.id_byte == id_const.id_extends() && var0.id_protected == id_const.id_native()) {
         return var0;
      } else {
         if (var0 != null) {
            var0.id_class();
         }

         return new VC(id_const.id_extends(), id_const.id_native(), true, (Boolean)QY.id_break[2]);
      }
   }

   public static float id_class(float var0, float var1) {
      double var2 = 3.141592653;
      double var4 = 1.0 / Math.sqrt(6.283185306 * (var1 * var1));
      return (float)(var4 * Math.exp(-(var0 * var0) / (2.0 * (var1 * var1))));
   }

   public static void id_class(float var0, float var1, float var2) {
      ShaderManager var10000 = (ShaderManager)id_class[0];
      var10000.id_class("textureIn", 0);
      ((ShaderManager)id_class[0]).id_break("texelSize", 1.0F / id_const.id_new(), 1.0F / id_const.id_continue());
      ((ShaderManager)id_class[0]).id_break("direction", var0, var1);
      ((ShaderManager)id_class[0]).id_break("radius", var2);
      FloatBuffer var3 = BufferUtils.createFloatBuffer(256);

      for (int var4 = 0; var4 <= var2; var4++) {
         var3.put(id_class(var4, var2 / 2.0F));
      }

      var3.rewind();
      GL20.glUniform1fv(((ShaderManager)id_class[0]).id_class("weights"), var3);
   }

   private static void id_class(Ml_1 var0, float var1) {
      MT.id_package();
      rrfa_3.id_class();
      RenderSystem.blendFuncSeparate(770, 771, 1, 0);
      VC var6 = id_class((VC)id_class[1]);
      id_class[1] = var6;
      ((VC)id_class[1]).id_break((Boolean)QY.id_break[2]);
      ((VC)id_class[1]).id_class(true);
      ((ShaderManager)id_class[0]).id_class();
      id_class(1.0F, 0.0F, var1);
      MT.id_super(id_import.B().id_extends());
      ShaderManager.id_class(var0);
      ((VC)id_class[1]).id_throws();
      ((ShaderManager)id_class[0]).id_break();
      id_import.B().id_class(true);
      ((ShaderManager)id_class[0]).id_class();
      id_class(0.0F, 1.0F, var1);
      MT.id_super(((VC)id_class[1]).id_extends());
      ShaderManager.id_class(var0);
      ((ShaderManager)id_class[0]).id_break();
      rrfa_3.id_class();
      MT.id_super(0);
   }

   public static void id_class(Ml_1 var0, Runnable var1, float var2) {
      rrfi_3.id_break();
      var1.run();
      rrfi_3.id_class(1);
      id_class(var0, var2);
      rrfi_3.id_class();
   }
}
