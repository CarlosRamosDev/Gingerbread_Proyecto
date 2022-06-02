package com.gingerbread;

import com.gingerbread.common.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Acces acces = new Acces();
        Scanner scanner = new Scanner(System.in);
        String name, password;
        boolean authenticated;
        System.out.println("Bienvenido, por favor ingrese su nombre de usuario y contraseña");
        do {
            System.out.print("Nombre de usuario: ");
            name = scanner.nextLine();
            System.out.print("Contraseña: ");
            password = scanner.nextLine();
            authenticated = acces.authenticate(name, password);
            if (!authenticated) {
                System.out.println("Nombre de usuario o contraseña incorrectos");
            }
        } while (!authenticated);
        System.out.println("Bienvenido " + name);
        boolean exit = false;
        do {
            try {
                switch (Integer.parseInt(Menus.getMainMenu().printMenu(scanner))) {
                    case 7 -> usersMenu(scanner, acces);
                    case 8 -> Menus.getCreditsMenu().printMenu(scanner);
                    case 9 -> exit = true;
                    default -> throw new Exception("Opción no válida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número entero como opción");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!exit);
        System.out.println("Hasta pronto!");
    }

    public static void usersMenu(Scanner scanner, Acces acces) {
        boolean exit = false;
        do {
            try {
                switch (Integer.parseInt(Menus.getUserMenu().printMenu(scanner))) {
                    case 1 -> {
                        System.out.println("Usuarios registrados: ");
                        for (User user : acces.loadUsers()) {
                            System.out.println(user.getName());
                        }
                    }
                    case 2 -> {
                        System.out.print("Introduce el nombre del usuario: ");
                        String name = scanner.nextLine();
                        System.out.print("Introduce la contraseña: ");
                        String password = scanner.nextLine();
                        System.out.println("Añadiendo usuario...");
                        acces.addUser(new User(name, password));
                        System.out.println("Usuario añadido");
                    }
                    case 3 -> {
                        System.out.print("Introduce el nombre del usuario: ");
                        String name = scanner.nextLine();
                        System.out.print("Introduce la contraseña: ");
                        String password = scanner.nextLine();
                        System.out.println("Eliminando usuario...");
                        acces.removeUser(new User(name, password));
                        System.out.println("Usuario eliminado");
                    }
                    case 4 -> exit = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número entero como opción");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!exit);
    }
}