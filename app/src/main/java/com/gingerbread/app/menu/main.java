package com.gingerbread.app.menu;

import com.gingerbread.lib.commons.menu.Menu;

public class main {
    public static void mainPage() {
        Menu menu = new Menu();
        menu.setTitle("Menu Principal");
        // Menu options
        String[] options = new String[11];
        options[1] = "Buscar elemento";
        options[9] = "Créditos";
        options[10] = "Salir";
        menu.setOptions(options);
        menu.print();
    }

    public static void Credits() {
        Menu menu = new Menu();
        menu.setTitle("Créditos");
        menu.print();
        com.gingerbread.app.common.copyright.copyrightAndAuthor();
    }
}
