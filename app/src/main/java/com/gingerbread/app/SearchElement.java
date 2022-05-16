package com.gingerbread.app;

import java.util.Scanner;

public class SearchElement {
    public static void mainPage(Scanner scanner) {
        System.out.println("--- Buscador de elementos  ---");
        System.out.println("Seleccione la opción deseada:");
        System.out.println("1. Buscar elemento por número atómico");
        System.out.println("2. Buscar elemento por símbolo");
        System.out.println("3. Buscar elemento por nombre");
        System.out.println("4. Salir");
        int option = inputs.inputIntByRange(scanner, 1, 4);
        if (option == 1) {
            System.out.println("Introduzca el número atómico del elemento:");
            int atomicNumber = inputs.inputIntByRange(scanner, 1, 118);
            System.out.println(atomicNumber);
        } else if (option == 2) {
            System.out.println("Introduzca el símbolo del elemento:");
            String symbol = scanner.nextLine();
            System.out.println(symbol);
        } else if (option == 3) {
            System.out.println("Introduzca el nombre del elemento:");
            String name = scanner.nextLine();
            System.out.println(name);
        } else {
            System.out.println("Gracias por usar el buscador de elementos");
        }
    }
}
