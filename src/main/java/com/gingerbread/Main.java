package com.gingerbread;

import com.gingerbread.common.Logs;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        UUID id = null;
        Scanner scanner = new Scanner(System.in);
        Logs logs = new Logs();
        System.out.println("-------------------- Work In Progress (WIP) --------------------");
        System.out.println(Menus.copyright);
        do {
            try {
                switch (Integer.parseInt(Menus.getLoginMenu().printMenu(scanner, logs))) {
                    case 1 -> id = com.gingerbread.accounts.Manager.signInMenu(scanner, logs);
                    case 2 -> id = com.gingerbread.accounts.Manager.signUpMenu(scanner, logs);
                    case 3 -> exit = true;
                    default -> System.out.println("Opción inválida");
                }
            } catch (Exception e) {
                logs.newLog("main/ERROR", "Ha ocurrido un error inesperado");
                System.out.println("Ingrese una opción válida");
            }
        } while (id == null & !exit);
        while (!exit) {
            try {
                switch (Integer.parseInt(Menus.getMainMenu().printMenu(scanner, logs))) {
                    case 1 -> com.gingerbread.chemistry.Topic_1_Dev.Dev(scanner);
                    case 7 -> exit = Menus.getAccountMenu(scanner, id, logs);
                    case 8 -> Menus.getCreditsMenu().printMenu(scanner, logs);
                    case 9 -> exit = true;
                    default -> System.out.println("Error: No tienes una suscripción activa");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número entero como opción");
                logs.newLog("main/ERROR", "Se ha introducido una opción no válida");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                logs.newLog("main/ERROR", "Ha ocurrido un error inesperado");
            }
        }
        logs.newLog("main/INFO", "El usuario ha cerrado sesión");
        System.out.println("Hasta pronto!");
        logs.close();
    }
}