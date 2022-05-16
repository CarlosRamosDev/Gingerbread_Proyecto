package com.gingerbread.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Herramienta para la resolución de problemas de la materia de Química  ---");
        System.out.println("Seleccione la opción deseada:");
        System.out.println("1. Buscar elemento");
        System.out.println("2-9. Próximamente");
        System.out.println("10. Salir");
        switch (inputs.inputIntByRange(scanner, 1, 10)) {
            case 1 -> {
                SearchElement.mainPage(scanner);
            }
            case 10 -> {
                System.out.println("Gracias por usar el programa");
            }
            default -> System.out.println("Próximamente");
        }
    }
}