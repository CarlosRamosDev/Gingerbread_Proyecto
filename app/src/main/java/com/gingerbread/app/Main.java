package com.gingerbread.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        System.out.println("Copyright (C) 2022 by Gingerbread Team");
        System.out.println("------------------------------------------------------");
        System.out.println("PRECAUCIÓN: Este programa es una versión de prueba. No se recomienda su uso en un entorno de producción.");
        System.out.println("------------------------------------------------------");
        do {
            System.out.println("--- Herramienta para la resolución de problemas de la materia de Química  ---");
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1. Buscar elemento");
            System.out.println("2-8. Próximamente");
            System.out.println("9. Créditos");
            System.out.println("10. Salir");
            switch (inputs.inputIntByRange(scanner, 1, 10)) {
                case 1 -> {
                    SearchElement.mainPage();
                }
                case 9 -> {
                    Credits.showCredits(scanner);
                }
                case 10 -> {
                    System.out.println("Gracias por usar el programa");
                    exit = false;
                }
                default -> {
                    System.out.println("Próximamente");
                }
            }
            scanner.nextLine();
        } while (exit);
    }
}

