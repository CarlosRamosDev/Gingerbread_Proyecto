package com.gingerbread.app;

import com.gingerbread.lib.periodic_table.atom;

import java.util.Scanner;

import static com.gingerbread.lib.periodic_table.searchEngines.*;


public class SearchElement {
    private static final String[] options = {"Buscador de elementos","Buscar elemento por número atómico", "Buscar elemento por símbolo", "Buscar elemento por nombre", "Salir"};
    public static void mainPage(Scanner scanner) {
        boolean exit = false;
        do {
            common.printMenu(options);
            switch (inputs.inputIntByRange(scanner, 1, 4)) {
                case 1 -> searchByNumberAtomic(scanner);
                case 2 -> searchBySymbol(scanner);
                case 3 -> searchByName(scanner);
                case 4 -> exit = true;
                default -> System.out.println("Próximamente");
            }
        } while (!exit);
    }

    private static void searchByName(Scanner scanner) {
        System.out.print("Introduzca el nombre del elemento: ");
        try {
            scanner.nextLine();
            atom atom = getByName(scanner.nextLine());
            System.out.println("Se encontró el elemento " + atom.getName() + " con el número atómico " + atom.getNumberAtomic() + " y el símbolo " + atom.getSymbol());
            common.pause(scanner, 1);
        } catch (Exception e) {
            Debug.printError(e);
        }
    }

    private static void searchBySymbol(Scanner scanner) {
        System.out.print("Introduzca el símbolo del elemento: ");
        try {
            scanner.nextLine();
            atom atom = getBySymbol(scanner.nextLine());
            System.out.println("Se encontró el elemento " + atom.getName() + " con el número atómico " + atom.getNumberAtomic() + " y el símbolo " + atom.getSymbol());
            common.pause(scanner, 1);
        } catch (Exception e) {
            Debug.printError(e);
        }
    }

    private static void searchByNumberAtomic(Scanner scanner) {
        System.out.print("Introduzca el número atómico del elemento: ");
        int atomicNumber = inputs.inputIntByRange(scanner, 1, 118);
        try {
            atom atom = getByNumberAtomic(atomicNumber);
            System.out.println("Se encontró el elemento " + atom.getName() + " con el número atómico " + atom.getNumberAtomic() + " y el símbolo " + atom.getSymbol());
            common.pause(scanner, 2);
        } catch (Exception e) {
            Debug.printError(e);
        }
    }
}
