package celestial.manager;

import celestial.*;
import celestial.util.MinecraftAccessor;

public enum FontManager implements MinecraftAccessor {
   INSTANCE;

   public Object[] fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[12];
   public static Object[] staticFields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[]{ INSTANCE, new FontManager[]{ INSTANCE } };
   private static final float[] FLOATS = new float[]{10.0F, 11.0F, 12.0F, 13.0F, 14.0F, 15.0F, 16.0F, 17.0F, 18.0F, 20.0F, 21.0F, 16.0F};

   private FontManager() {
      this.id_else();
   }

   private static rrZO id_class(rrZx_1 var0, String var1, float var2, boolean var3) {
      return new rrZO(rrZb_1.id_class(var1, var2), var0, true, false, var3);
   }

   public static rrZO id_class(String var0, float var1, boolean var2) {
      rrZx_1 var10000 = new rrZx_1();
      var10000 = var10000.id_class(new int[]{248, 249, 250, 9889, 9733});
      rrZx_1[] var4 = new rrZx_1[1];
      var4[0] = (rrZx_1)rrZx_1.id_break[4];
      return id_class(var10000.id_class(var4), var0, var1, var2);
   }

   public rrZO id_implements() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0];
   }

   public rrZO id_private() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1];
   }

   public rrZO id_native() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2];
   }

   public rrZO id_class() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3];
   }

   public rrZO id_finally() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4];
   }

   public rrZO id_throws() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5];
   }

   public rrZO id_extends() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6];
   }

   public rrZO id_catch() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7];
   }

   public rrZO id_case() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8];
   }

   public rrZO id_protected() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9];
   }

   public rrZO id_byte() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10];
   }

   public rrZO id_break() {
      return (rrZO)this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11];
   }

   private void id_else() {
      if (this.fields71d6c26f697c30cf88e2ba2ddc0b4971 == null) {
         this.fields71d6c26f697c30cf88e2ba2ddc0b4971 = new Object[12];
      }
   }

   public void id_volatile() {
      String var1 = "montserrat";
      String var2 = "pixel";
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[0] = id_class(var1, FLOATS[0], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[1] = id_class(var1, FLOATS[1], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[2] = id_class(var1, FLOATS[2], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[3] = id_class(var1, FLOATS[3], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[4] = id_class(var1, FLOATS[4], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[5] = id_class(var1, FLOATS[5], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[6] = id_class(var1, FLOATS[6], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[7] = id_class(var1, FLOATS[7], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[8] = id_class(var1, FLOATS[8], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[9] = id_class(var1, FLOATS[9], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[10] = id_class(var1, FLOATS[10], false);
      this.fields71d6c26f697c30cf88e2ba2ddc0b4971[11] = id_class(var2, FLOATS[11], false);
   }
}
