package com.gingerbread.app;

import java.util.Scanner;

public class common {
    private static final String[] authors = {"Diego Gael Martin del Campo", "Carlos Iram Ramos Vasquez", "Jesús Alejandro Torres Ramírez"};
    private static final String copyright = "Copyright © 2022 Gingerbread Team. All rights reserved";

    public static String getCopyright() {
        return copyright;
    }

    public static String[] getAuthors() {
        return authors;
    }

    public static void printAuthors() {
        for (String author : authors) {
            System.out.println(author);
        }
    }

    public static void copyrightAndAuthor() {
        System.out.println("------------------------------------------------------");
        System.out.println(copyright);
        printAuthors();
        System.out.println("------------------------------------------------------");
    }

    public static void copyrightAndAuthor(Scanner scanner) {
        copyrightAndAuthor();
        pause(scanner, 2);
    }

    public static void pause(Scanner scanner, int enters) {
        System.out.print("Presione enter para continuar...");
        for (int i = 0; i < enters; i++) {
            scanner.nextLine();
        }
    }

    public static void printMenu(String[] options) {
        for (int i = 0; i < options.length; i++) {
            if (i == 0) {
                System.out.println("-------- " + options[i] + " --------");
            } else {
                if (options[i] != "") {
                    System.out.println(i + ". " + options[i]);
                }
            }
        }
        System.out.print("Seleccione una opción: ");
    }
}
