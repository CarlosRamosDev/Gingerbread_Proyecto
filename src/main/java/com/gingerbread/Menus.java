package com.gingerbread;

import com.gingerbread.common.Menu;

public class Menus {
    public static final String copyright = "Copyright (c) Equipo Gingerbread. Todos los derechos reservados.";
    public static Menu getMainMenu() {
        Menu menu = new Menu();
        menu.setTitle("Menu principal");
        String[] options = new String[10];
        options[1] = "opción 1";
        options[2] = "opción 2";
        options[3] = "opción 3";
        options[4] = "opción 4";
        options[5] = "opción 5";
        options[6] = "opción 6";
        options[7] = "Acceder al sistema de usuarios";
        options[8] = "Creitós";
        options[9] = "salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }

    public static Menu getCreditsMenu() {
        Menu menu = new Menu();
        menu.setTitle("Créditos");
        String credits = copyright + "\n" + """
                Esta es una versión de trabajo en progreso, puede ser inestable.
                -----------------------------------------------------------------
                Diego Gael Martin del Campo
                Carlos Iram Ramos Vasquez
                Jesús Alejandro Torres Ramírez
                -----------------------------------------------------------------
                Pulsa enter para volver al menú principal...""";
        menu.setBottomText(credits);
        menu.setPauseByEnter(0);
        return menu;
    }

    public static Menu getUserMenu() {
        Menu menu = new Menu();
        menu.setTitle("Administración de usuarios");
        String[] options = new String[5];
        options[1] = "Listar usuarios";
        options[2] = "Añadir usuario";
        options[3] = "Eliminar usuario";
        options[4] = "Salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }
}
