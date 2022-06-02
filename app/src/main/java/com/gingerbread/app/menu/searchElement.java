package com.gingerbread.app.menu;

import com.gingerbread.lib.commons.menu.Menu;
public class searchElement {
    public static void mainPage() {
        Menu menu = new Menu();
        menu.setTitle("Buscador de elementos");
        // Menu options
        String[] options = new String[11];
        options[1] = "Buscar elemento por número atómico";
        options[2] = "Buscar elemento por símbolo";
        options[3] = "Buscar elemento por nombre";
        options[4] = "Salir";
        menu.setOptions(options);
        menu.print();
    }
}
