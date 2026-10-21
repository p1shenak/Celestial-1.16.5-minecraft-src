package celestial.event;

import celestial.C_break;
import celestial.rfH_2;
import celestial.rrQX;
import celestial.xc_3;

public class PacketEvent {
   public Object[] id_class = new Object[]{null, null, Boolean.FALSE};
   public static Object[] id_break = new Object[]{new PacketEvent()};

   public rfH_2 id_byte() {
      return (rfH_2)this.id_class[0];
   }

   public PacketEvent() {
      this.id_protected();
   }

   public static PacketEvent id_class(rfH_2 var0, xc_3 var1, boolean var2) {
      ((PacketEvent)id_break[0]).id_class[0] = var0;
      ((PacketEvent)id_break[0]).id_class[1] = var1;
      ((PacketEvent)id_break[0]).id_class[2] = var2;
      return (PacketEvent)id_break[0];
   }

   public xc_3 id_class() {
      return (xc_3)this.id_class[1];
   }

   public boolean id_break() {
      return (Boolean)this.id_class[2];
   }

   public static PacketEvent id_break(rfH_2 var0, xc_3 var1, boolean var2) {
      PacketEvent var3 = id_class(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var3);
      return var3;
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[2] = Boolean.FALSE;
      }
   }
}
