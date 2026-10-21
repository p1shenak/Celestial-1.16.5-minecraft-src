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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class KeyBind {
   public static Object[] staticFields7d889755b225350f87e436adc34ba83e;
   public static final KeyBind NONE = new KeyBind(-1337, "None");
   public Object[] fields7d889755b225350f87e436adc34ba83e;

   static {
      id_catch();
   }

   public static KeyBind get(int index) {
      if (staticFields7d889755b225350f87e436adc34ba83e == null) {
         id_catch();
      }
      return (KeyBind)staticFields7d889755b225350f87e436adc34ba83e[index];
   }

   public int id_byte() {
      return (Integer)this.fields7d889755b225350f87e436adc34ba83e[0];
   }

   public KeyBind(int var3, String var4) {
      this.id_implements();
      Integer var9 = var3;
      this.fields7d889755b225350f87e436adc34ba83e[0] = var9;
      this.fields7d889755b225350f87e436adc34ba83e[1] = var4;
      ((Map)rrfC_2.id_class[0]).put(var3, this);
   }

   

   public boolean id_class() {
      return this == (celestial.setting.KeyBind)staticFields7d889755b225350f87e436adc34ba83e[0]
         ? true
         : false;
   }

   

   

   

   public String id_break() {
      return (String)this.fields7d889755b225350f87e436adc34ba83e[1];
   }

   

   

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new celestial.setting.KeyBind(-1337, "None"),
         new celestial.setting.KeyBind(0, "LButton"),
         new celestial.setting.KeyBind(1, "RButton"),
         new celestial.setting.KeyBind(2, "MButton"),
         new celestial.setting.KeyBind(3, "Button 4"),
         new celestial.setting.KeyBind(4, "Button 5"),
         new celestial.setting.KeyBind(5, "Button 6"),
         new celestial.setting.KeyBind(6, "Button 7"),
         new celestial.setting.KeyBind(7, "Button 8"),
         new celestial.setting.KeyBind(32, "Space"),
         new celestial.setting.KeyBind(39, "Apostrophe"),
         new celestial.setting.KeyBind(44, "Comma"),
         new celestial.setting.KeyBind(45, "Minus"),
         new celestial.setting.KeyBind(46, "Period"),
         new celestial.setting.KeyBind(47, "Slash"),
         new celestial.setting.KeyBind(48, "0"),
         new celestial.setting.KeyBind(49, "1"),
         new celestial.setting.KeyBind(50, "2"),
         new celestial.setting.KeyBind(51, "3"),
         new celestial.setting.KeyBind(52, "4"),
         new celestial.setting.KeyBind(53, "5"),
         new celestial.setting.KeyBind(54, "6"),
         new celestial.setting.KeyBind(55, "7"),
         new celestial.setting.KeyBind(56, "8"),
         new celestial.setting.KeyBind(57, "9"),
         new celestial.setting.KeyBind(59, "Semicolon"),
         new celestial.setting.KeyBind(61, "Equal"),
         new celestial.setting.KeyBind(65, "A"),
         new celestial.setting.KeyBind(66, "B"),
         new celestial.setting.KeyBind(67, "C"),
         new celestial.setting.KeyBind(68, "D"),
         new celestial.setting.KeyBind(69, "E"),
         new celestial.setting.KeyBind(70, "F"),
         new celestial.setting.KeyBind(71, "G"),
         new celestial.setting.KeyBind(72, "H"),
         new celestial.setting.KeyBind(73, "I"),
         new celestial.setting.KeyBind(74, "J"),
         new celestial.setting.KeyBind(75, "K"),
         new celestial.setting.KeyBind(76, "L"),
         new celestial.setting.KeyBind(77, "M"),
         new celestial.setting.KeyBind(78, "N"),
         new celestial.setting.KeyBind(79, "O"),
         new celestial.setting.KeyBind(80, "P"),
         new celestial.setting.KeyBind(81, "Q"),
         new celestial.setting.KeyBind(82, "R"),
         new celestial.setting.KeyBind(83, "S"),
         new celestial.setting.KeyBind(84, "T"),
         new celestial.setting.KeyBind(85, "U"),
         new celestial.setting.KeyBind(86, "V"),
         new celestial.setting.KeyBind(87, "W"),
         new celestial.setting.KeyBind(88, "X"),
         new celestial.setting.KeyBind(89, "Y"),
         new celestial.setting.KeyBind(90, "Z"),
         new celestial.setting.KeyBind(91, "LBracket"),
         new celestial.setting.KeyBind(92, "Backslash"),
         new celestial.setting.KeyBind(93, "RBracket"),
         new celestial.setting.KeyBind(96, "Grave"),
         new celestial.setting.KeyBind(161, "World 1"),
         new celestial.setting.KeyBind(162, "World 2"),
         new celestial.setting.KeyBind(256, "Escape"),
         new celestial.setting.KeyBind(257, "Enter"),
         new celestial.setting.KeyBind(258, "Tab"),
         new celestial.setting.KeyBind(259, "Backspace"),
         new celestial.setting.KeyBind(260, "Insert"),
         new celestial.setting.KeyBind(261, "Delete"),
         new celestial.setting.KeyBind(262, "Right"),
         new celestial.setting.KeyBind(263, "Left"),
         new celestial.setting.KeyBind(264, "Down"),
         new celestial.setting.KeyBind(265, "Up"),
         new celestial.setting.KeyBind(266, "Page Up"),
         new celestial.setting.KeyBind(267, "Page Down"),
         new celestial.setting.KeyBind(268, "Home"),
         new celestial.setting.KeyBind(269, "End"),
         new celestial.setting.KeyBind(280, "CapsLock"),
         new celestial.setting.KeyBind(281, "ScrollLock"),
         new celestial.setting.KeyBind(282, "NumLock"),
         new celestial.setting.KeyBind(283, "PrintScreen"),
         new celestial.setting.KeyBind(284, "Pause"),
         new celestial.setting.KeyBind(290, "F1"),
         new celestial.setting.KeyBind(291, "F2"),
         new celestial.setting.KeyBind(292, "F3"),
         new celestial.setting.KeyBind(293, "F4"),
         new celestial.setting.KeyBind(294, "F5"),
         new celestial.setting.KeyBind(295, "F6"),
         new celestial.setting.KeyBind(296, "F7"),
         new celestial.setting.KeyBind(297, "F8"),
         new celestial.setting.KeyBind(298, "F9"),
         new celestial.setting.KeyBind(299, "F10"),
         new celestial.setting.KeyBind(300, "F11"),
         new celestial.setting.KeyBind(301, "F12"),
         new celestial.setting.KeyBind(302, "F13"),
         new celestial.setting.KeyBind(303, "F14"),
         new celestial.setting.KeyBind(304, "F15"),
         new celestial.setting.KeyBind(305, "F16"),
         new celestial.setting.KeyBind(306, "F17"),
         new celestial.setting.KeyBind(307, "F18"),
         new celestial.setting.KeyBind(308, "F19"),
         new celestial.setting.KeyBind(309, "F20"),
         new celestial.setting.KeyBind(310, "F21"),
         new celestial.setting.KeyBind(311, "F22"),
         new celestial.setting.KeyBind(312, "F23"),
         new celestial.setting.KeyBind(313, "F24"),
         new celestial.setting.KeyBind(314, "F25"),
         new celestial.setting.KeyBind(320, "Num0"),
         new celestial.setting.KeyBind(321, "Num1"),
         new celestial.setting.KeyBind(322, "Num2"),
         new celestial.setting.KeyBind(323, "Num3"),
         new celestial.setting.KeyBind(324, "Num4"),
         new celestial.setting.KeyBind(325, "Num5"),
         new celestial.setting.KeyBind(326, "Num6"),
         new celestial.setting.KeyBind(327, "Num7"),
         new celestial.setting.KeyBind(328, "Num8"),
         new celestial.setting.KeyBind(329, "Num9"),
         new celestial.setting.KeyBind(330, "NumDecimal"),
         new celestial.setting.KeyBind(331, "NumDivide"),
         new celestial.setting.KeyBind(332, "NumMultiply"),
         new celestial.setting.KeyBind(333, "NumSubtract"),
         new celestial.setting.KeyBind(334, "NumAdd"),
         new celestial.setting.KeyBind(335, "NumEnter"),
         new celestial.setting.KeyBind(336, "NumEqual"),
         new celestial.setting.KeyBind(340, "LShift"),
         new celestial.setting.KeyBind(341, "LControl"),
         new celestial.setting.KeyBind(342, "LAlt"),
         new celestial.setting.KeyBind(343, "LSuper"),
         new celestial.setting.KeyBind(344, "RShift"),
         new celestial.setting.KeyBind(345, "RControl"),
         new celestial.setting.KeyBind(346, "RAlt"),
         new celestial.setting.KeyBind(347, "RSuper"),
         new celestial.setting.KeyBind(348, "Menu"),
         null
      };
      var0[129] = new celestial.setting.KeyBind[]{
         (celestial.setting.KeyBind)var0[0],
         (celestial.setting.KeyBind)var0[1],
         (celestial.setting.KeyBind)var0[2],
         (celestial.setting.KeyBind)var0[3],
         (celestial.setting.KeyBind)var0[4],
         (celestial.setting.KeyBind)var0[5],
         (celestial.setting.KeyBind)var0[6],
         (celestial.setting.KeyBind)var0[7],
         (celestial.setting.KeyBind)var0[8],
         (celestial.setting.KeyBind)var0[9],
         (celestial.setting.KeyBind)var0[10],
         (celestial.setting.KeyBind)var0[11],
         (celestial.setting.KeyBind)var0[12],
         (celestial.setting.KeyBind)var0[13],
         (celestial.setting.KeyBind)var0[14],
         (celestial.setting.KeyBind)var0[15],
         (celestial.setting.KeyBind)var0[16],
         (celestial.setting.KeyBind)var0[17],
         (celestial.setting.KeyBind)var0[18],
         (celestial.setting.KeyBind)var0[19],
         (celestial.setting.KeyBind)var0[20],
         (celestial.setting.KeyBind)var0[21],
         (celestial.setting.KeyBind)var0[22],
         (celestial.setting.KeyBind)var0[23],
         (celestial.setting.KeyBind)var0[24],
         (celestial.setting.KeyBind)var0[25],
         (celestial.setting.KeyBind)var0[26],
         (celestial.setting.KeyBind)var0[27],
         (celestial.setting.KeyBind)var0[28],
         (celestial.setting.KeyBind)var0[29],
         (celestial.setting.KeyBind)var0[30],
         (celestial.setting.KeyBind)var0[31],
         (celestial.setting.KeyBind)var0[32],
         (celestial.setting.KeyBind)var0[33],
         (celestial.setting.KeyBind)var0[34],
         (celestial.setting.KeyBind)var0[35],
         (celestial.setting.KeyBind)var0[36],
         (celestial.setting.KeyBind)var0[37],
         (celestial.setting.KeyBind)var0[38],
         (celestial.setting.KeyBind)var0[39],
         (celestial.setting.KeyBind)var0[40],
         (celestial.setting.KeyBind)var0[41],
         (celestial.setting.KeyBind)var0[42],
         (celestial.setting.KeyBind)var0[43],
         (celestial.setting.KeyBind)var0[44],
         (celestial.setting.KeyBind)var0[45],
         (celestial.setting.KeyBind)var0[46],
         (celestial.setting.KeyBind)var0[47],
         (celestial.setting.KeyBind)var0[48],
         (celestial.setting.KeyBind)var0[49],
         (celestial.setting.KeyBind)var0[50],
         (celestial.setting.KeyBind)var0[51],
         (celestial.setting.KeyBind)var0[52],
         (celestial.setting.KeyBind)var0[53],
         (celestial.setting.KeyBind)var0[54],
         (celestial.setting.KeyBind)var0[55],
         (celestial.setting.KeyBind)var0[56],
         (celestial.setting.KeyBind)var0[57],
         (celestial.setting.KeyBind)var0[58],
         (celestial.setting.KeyBind)var0[59],
         (celestial.setting.KeyBind)var0[60],
         (celestial.setting.KeyBind)var0[61],
         (celestial.setting.KeyBind)var0[62],
         (celestial.setting.KeyBind)var0[63],
         (celestial.setting.KeyBind)var0[64],
         (celestial.setting.KeyBind)var0[65],
         (celestial.setting.KeyBind)var0[66],
         (celestial.setting.KeyBind)var0[67],
         (celestial.setting.KeyBind)var0[68],
         (celestial.setting.KeyBind)var0[69],
         (celestial.setting.KeyBind)var0[70],
         (celestial.setting.KeyBind)var0[71],
         (celestial.setting.KeyBind)var0[72],
         (celestial.setting.KeyBind)var0[73],
         (celestial.setting.KeyBind)var0[74],
         (celestial.setting.KeyBind)var0[75],
         (celestial.setting.KeyBind)var0[76],
         (celestial.setting.KeyBind)var0[77],
         (celestial.setting.KeyBind)var0[78],
         (celestial.setting.KeyBind)var0[79],
         (celestial.setting.KeyBind)var0[80],
         (celestial.setting.KeyBind)var0[81],
         (celestial.setting.KeyBind)var0[82],
         (celestial.setting.KeyBind)var0[83],
         (celestial.setting.KeyBind)var0[84],
         (celestial.setting.KeyBind)var0[85],
         (celestial.setting.KeyBind)var0[86],
         (celestial.setting.KeyBind)var0[87],
         (celestial.setting.KeyBind)var0[88],
         (celestial.setting.KeyBind)var0[89],
         (celestial.setting.KeyBind)var0[90],
         (celestial.setting.KeyBind)var0[91],
         (celestial.setting.KeyBind)var0[92],
         (celestial.setting.KeyBind)var0[93],
         (celestial.setting.KeyBind)var0[94],
         (celestial.setting.KeyBind)var0[95],
         (celestial.setting.KeyBind)var0[96],
         (celestial.setting.KeyBind)var0[97],
         (celestial.setting.KeyBind)var0[98],
         (celestial.setting.KeyBind)var0[99],
         (celestial.setting.KeyBind)var0[100],
         (celestial.setting.KeyBind)var0[101],
         (celestial.setting.KeyBind)var0[102],
         (celestial.setting.KeyBind)var0[103],
         (celestial.setting.KeyBind)var0[104],
         (celestial.setting.KeyBind)var0[105],
         (celestial.setting.KeyBind)var0[106],
         (celestial.setting.KeyBind)var0[107],
         (celestial.setting.KeyBind)var0[108],
         (celestial.setting.KeyBind)var0[109],
         (celestial.setting.KeyBind)var0[110],
         (celestial.setting.KeyBind)var0[111],
         (celestial.setting.KeyBind)var0[112],
         (celestial.setting.KeyBind)var0[113],
         (celestial.setting.KeyBind)var0[114],
         (celestial.setting.KeyBind)var0[115],
         (celestial.setting.KeyBind)var0[116],
         (celestial.setting.KeyBind)var0[117],
         (celestial.setting.KeyBind)var0[118],
         (celestial.setting.KeyBind)var0[119],
         (celestial.setting.KeyBind)var0[120],
         (celestial.setting.KeyBind)var0[121],
         (celestial.setting.KeyBind)var0[122],
         (celestial.setting.KeyBind)var0[123],
         (celestial.setting.KeyBind)var0[124],
         (celestial.setting.KeyBind)var0[125],
         (celestial.setting.KeyBind)var0[126],
         (celestial.setting.KeyBind)var0[127],
         (celestial.setting.KeyBind)var0[128]
      };
      staticFields7d889755b225350f87e436adc34ba83e = var0;
   }

   

   private void id_implements() {
      if (this.fields7d889755b225350f87e436adc34ba83e == null) {
         this.fields7d889755b225350f87e436adc34ba83e = new Object[2];
         this.fields7d889755b225350f87e436adc34ba83e[0] = 0;
      }
   }

   public boolean id_protected() {
      return (Integer)this.fields7d889755b225350f87e436adc34ba83e[0] >= ((celestial.setting.KeyBind)staticFields7d889755b225350f87e436adc34ba83e[1]).id_byte()
            && (Integer)this.fields7d889755b225350f87e436adc34ba83e[0] <= ((celestial.setting.KeyBind)staticFields7d889755b225350f87e436adc34ba83e[8]).id_byte()
         ? true
         : false;
   }

   
}
