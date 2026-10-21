package celestial.module;

import celestial.rqO_2;

public enum Category {
    COMBAT("Combat", "combat", "Основные"),
    MOVEMENT("Movement", "movement", "Основные"),
    RENDER("Render", "render", "Основные"),
    PLAYER("Player", "player", "Основные"),
    UTIL("Util", "util", "Основные"),
    CONFIGS("Configs", "configs", "Другие"),
    THEMES("Themes", "themes", "Другие"),
    AUTOBUY_ITEMS("Items", "autobuy_items", "Автоскуп"),
    AUTOBUY_HISTORY("History", "autobuy_history", "Автоскуп");

    public static Object[] staticFieldse67813cd60183787b1de54ac6b91c916;
    public Object[] fieldse67813cd60183787b1de54ac6b91c916;
    private final String name;
    private final String path;
    private final String group;
    private final rqO_2 icon;

    Category(String name, String path, String group) {
        this.name = name;
        this.path = path;
        this.group = group;
        this.icon = new rqO_2("celestial/images/category/" + path + ".png");
    }

    public rqO_2 id_byte() {
        return this.icon;
    }

    public String id_class() {
        return this.group;
    }

    public String id_break() {
        return this.name;
    }
}
