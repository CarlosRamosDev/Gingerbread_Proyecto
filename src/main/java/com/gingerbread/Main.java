package com.gingerbread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            try {
                switch (Integer.parseInt(Menus.getMainMenu().printMenu(scanner))) {
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
}