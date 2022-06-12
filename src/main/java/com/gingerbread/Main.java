package com.gingerbread;

import com.gingerbread.chemistry.Formulas;
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
                    case 1 -> com.gingerbread.chemistry.TopicList.topicList(scanner);
                    case 2 -> {
                        try {
                            System.out.print("Ingresa la frecuencia: ");
                            double conv = Formulas.longDeOnda(scanner.nextDouble());
                            System.out.println("La longitud de onda es: " + conv);
                        } catch (Exception e) {
                            System.out.println("Ingrese una frecuencia válida");
                        }
                        scanner.nextLine();
                    }
                    case 3 -> {
                        try {
                            System.out.print("Ingresa la longitud: ");
                            double frec = Formulas.frecuencia(scanner.nextDouble());
                            System.out.println("La frecuencia es: " + frec);
                        } catch (Exception e) {
                            System.out.println("Ingrese una longitud de onda válida");
                        }
                        scanner.nextLine();
                    }
                    case 4 -> {
                        try {
                            System.out.print("Ingresa la frecuencia : ");
                            double energ = Formulas.energia(scanner.nextDouble());
                            System.out.println("La energia es: " + energ);
                        } catch (Exception e) {
                            System.out.println("Ingrese una frecuencia válida");
                        }
                        scanner.nextLine();
                    }
                    case 5 -> {
                        try {
                            System.out.print("Ingresa la energia: ");
                            double frec2 = Formulas.frecuenciaEnergia(scanner.nextDouble());
                            System.out.println("La frecuencia es: " + frec2);
                        } catch (Exception e) {
                            System.out.println("Ingrese una energía válida");
                        }
                        scanner.nextLine();
                    }
                    case 6 -> {
                        try {
                            System.out.print("Ingresa la ni: ");
                            double ni = scanner.nextDouble();
                            System.out.print("Ingresa nf: ");
                            double nf = scanner.nextDouble();
                            double eneB = Formulas.energiaBohr(ni, nf);
                            System.out.println("La energia es: " + eneB);
                        } catch (Exception e) {
                            System.out.println("Ingrese una longitud de onda válida");
                        }
                        scanner.nextLine();
                    }
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