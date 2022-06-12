package com.gingerbread;

import com.gingerbread.accounts.Access;
import com.gingerbread.common.Logs;
import com.gingerbread.common.menus.Menu;

import java.util.Scanner;
import java.util.UUID;

public class Menus {
    public static final String copyright = "Copyright (c) Equipo Gingerbread. Todos los derechos reservados.";

    public static Menu getMainMenu() {
        Menu menu = new Menu();
        menu.setTitle("Menu principal");
        String[] options = new String[10];
        options[1] = "Información";
        options[2] = "Calcular longitud de onda";
        options[3] = "Calcular frecuencia";
        options[4] = "Calcular energía";
        options[5] = "Calcular frecuencia utilizando la energía";
        options[6] = "Calcular energía utilizando el modelo de Bhor";
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
        String[] options = new String[5];
        options[1] = "Cambiar nombre";
        options[2] = "Cambiar contraseña";
        options[3] = "Eliminar cuenta";
        options[4] = "Salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }

    public static Menu getAdminMenu() {
        Menu menu = new Menu();
        menu.setTitle("Administrador de cuentas");
        String[] options = new String[6];
        options[1] = "Mostrar usuarios";
        options[2] = "Remover usuario";
        options[3] = "Cambiar nombre de cuenta";
        options[4] = "Cambiar contraseña de cuenta";
        options[5] = "Salir";
        menu.setOptions(options);
        menu.setBottomText("Selecciona una opción: ");
        menu.setPauseByEnter(0);
        return menu;
    }

    public static Menu getLoginMenu() {
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

    public static boolean getAccountMenu(Scanner scanner, UUID userId, Logs logs) {
        boolean exit = false;
        do {
            if (Access.getUser(userId).getRole() == 0) {
                switch (Integer.parseInt(getAdminMenu().printMenu(scanner, logs))) {
                    case 1 -> {
                        Access.showUsers();
                        System.out.print("Pulsa enter para continuar...");
                        scanner.nextLine();
                    }
                    case 2 -> {
                        System.out.print("Ingrese el UUID del usuario a eliminar: ");
                        Access.removeUser(scanner.nextLine());
                    }
                    case 3 -> {
                        System.out.print("Ingresa el nuevo nombre de usuario: ");
                        Access.changeName(userId, scanner.nextLine());
                    }
                    case 4 -> {
                        System.out.print("Ingrese la nueva contraseña: ");
                        Access.changePassword(userId, scanner.nextLine());
                    }
                    case 5 -> exit = true;
                }
            } else {
                switch (Integer.parseInt(getUserMenu().printMenu(scanner, logs))) {
                    case 1 -> {
                        System.out.print("Ingrese el nuevo nombre: ");
                        Access.changeName(userId, scanner.nextLine());
                    }
                    case 2 -> {
                        System.out.print("Ingrese la nueva contraseña: ");
                        Access.changePassword(userId, scanner.nextLine());
                    }
                    case 3 -> {
                        System.out.print("Seguro que quieres eliminar tu cuenta? (s/n): ");
                        if (scanner.nextLine().equals("s")) {
                            Access.removeUser(userId);
                            return true;
                        }
                    }
                    case 4 -> exit = true;
                }
            }
        } while (!exit);
        return false;
    }
}
