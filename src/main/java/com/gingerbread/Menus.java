package com.gingerbread;

import com.gingerbread.common.Menu;

public class Menus {
    public static Menu getMainMenu() {
        Menu menu = new Menu();
        menu.setTitle("Titulo del menu principal");
        String[] options = new String[10];
        options[1] = "opción 1";
        options[2] = "opción 2";
        options[3] = "opción 3";
        options[4] = "opción 4";
        options[5] = "opción 5";
        options[6] = "opción 6";
        options[7] = "opción 7";
        options[8] = "opción 8";
        options[9] = "opción 9";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }
}
