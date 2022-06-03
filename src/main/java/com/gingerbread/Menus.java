package com.gingerbread;

import com.gingerbread.common.menus.Menu;

import java.util.Scanner;

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
        options[7] = "Administrador de Cuenta";
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
        menu.setTitle("Administrar cuenta");
        String[] options = new String[6];
        options[1] = "Mostrar usuario";
        options[2] = "Cambiar nombre";
        options[3] = "Cambiar contraseña";
        options[4] = "Eliminar Cuenta";
        options[5] = "Salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }

    public static Menu getAdminMenu() {
        Menu menu = new Menu();
        menu.setTitle("Administrador de cuentas");
        String[] options = new String[4];
        options[1] = "Mostrar usuarios";
        options[2] = "Remover usuario";
        options[3] = "Salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }

    public static Menu getLoginMenu(Scanner scanner) {
        Menu menu = new Menu();
        menu.setTitle("Por favor, inicia sesión o registrate");
        String[] options = new String[4];
        options[1] = "Iniciar sesión";
        options[2] = "Registrarse";
        options[3] = "Salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }
}
