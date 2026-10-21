package celestial.ui.clickgui;

import celestial.*;
import celestial.module.Category;
import celestial.manager.ThemeType;
import celestial.setting.KeyBind;
import java.util.function.Supplier;

public class ClickGuiTheme extends rrtN_2 {
   public static Object[] id_class = new Object[10];

   static {
      id_class[7] = ThemeType.CLIENT;
      id_class[8] = 7;
   }

   public String id_byte() {
      return "Настройка";
   }

   public ClickGuiTheme(ClickGuiScreen var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      rrIF var8 = new rrIF("Открыть меню", KeyBind.get(124)).id_class(false);
      id_class[0] = var8;
      rrIQ var9 = (rrIQ)new rrIQ("Цвет", "Клиентский", "Клиентский", "Кастомный").id_class("change_mode", (var1x, var2x) -> {
         if (!(Boolean)var2x.getRight() && ((String)var2x.getLeft()).equals("Клиентский") && !((String)var1x.id_byte()).equals("Клиентский")) {
            rrZt_1.id_class(var1, Category.THEMES);
         }

         ThemeType var7 = ThemeType.id_class((String)var1x.id_byte());
         id_class[7] = var7;
      });
      id_class[1] = var9;
      rrIz_1 var10 = (rrIz_1)new rrIz_1("Первый цвет", -4299265)
         .id_break()
         .id_class(() -> ((String)((rrIQ)id_class[1]).id_byte()).equals("Кастомный"));
      id_class[3] = var10;
      rrIz_1 var11 = (rrIz_1)new rrIz_1("Второй цвет", -12708504)
         .id_break()
         .id_class(() -> ((String)((rrIQ)id_class[1]).id_byte()).equals("Кастомный"));
      id_class[4] = var11;
      rrIm_1 var12 = new rrIm_1("Скорость цвета", 3.0F, 1.0F, 5.0F, 1.0F);
      id_class[2] = var12;
      rrIk_1 var13 = new rrIk_1("Смешивание цветов", false);
      id_class[9] = var13;
      ((rrIm_1)id_class[2]).id_class("change_speed", (var0, var1x) -> {
         Integer var6 = (int)(((rrIm_1)id_class[2]).id_native() + 5.0F - (Float)var1x.getLeft());
         id_class[8] = var6;
      });
      rrIk_1 var14 = new rrIk_1("Размытие", true);
      id_class[5] = var14;
      rrIk_1 var15 = new rrIk_1("Свечение", true);
      id_class[6] = var15;
      this.id_class(
         (rrIQ)id_class[1],
         (rrIz_1)id_class[3],
         (rrIz_1)id_class[4],
         (rrIm_1)id_class[2],
         (rrIk_1)id_class[9],
         (rrIk_1)id_class[5],
         (rrIk_1)id_class[6],
         (rrIF)id_class[0]
      );
      this.id_switch();
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.id_class(var1, var2, var3, var4, var5);
      this.id_interface().id_class(var1, () -> {}, var2, var3, var4, false, var5);
   }

   public static boolean id_class() {
      return id_class[6] != null && ((rrIk_1)id_class[6]).id_class();
   }

   public static rrIm_1 id_break() {
      return (rrIm_1)id_class[2];
   }

   public static boolean id_throws() {
      return id_class[5] != null && ((rrIk_1)id_class[5]).id_class();
   }

   public String id_catch() {
      return "GuiSettingPopUp";
   }

   public static String id_case() {
      return id_class[1] != null ? (String)((rrIQ)id_class[1]).id_byte() : "Клиентский";
   }

   public boolean id_protected() {
      return false;
   }
}
