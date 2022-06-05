package com.gingerbread;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        UUID id = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------- Work In Progress (WIP) --------------------");
        System.out.println(Menus.copyright);
        do {
            try {
                switch (Integer.parseInt(Menus.getLoginMenu().printMenu(scanner))) {
                    case 1 -> id = com.gingerbread.accounts.Manager.signInMenu(scanner);
                    case 2 -> id = com.gingerbread.accounts.Manager.signUpMenu(scanner);
                    case 3 -> exit = true;
                    default -> System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                System.out.println("Ingrese una opción válida");
            }
        } while (id == null & !exit);
        while (!exit) {
            try {
                switch (Integer.parseInt(Menus.getMainMenu().printMenu(scanner))) {
                    case 7 -> exit = Menus.getAccountMenu(scanner, id);
                    case 8 -> Menus.getCreditsMenu().printMenu(scanner);
                    case 9 -> exit = true;
                    default -> System.out.println("Error: No tienes una suscripción activa");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número entero como opción");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Hasta pronto!");
    }
}