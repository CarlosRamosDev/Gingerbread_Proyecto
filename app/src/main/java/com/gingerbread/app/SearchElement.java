package com.gingerbread.app;

import com.gingerbread.app.menu.searchElement;
import com.gingerbread.lib.periodic_table.atom;

import static com.gingerbread.app.common.pause.pauseByEnter;
import static com.gingerbread.lib.periodic_table.searchEngines.*;

import java.util.Scanner;




public class SearchElement {
    public static void mainPage(Scanner scanner) {
        boolean exit = false;
        do {
            searchElement.mainPage();
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
            System.out.println(getResult(atom));
            pauseByEnter(scanner);
        } catch (Exception e) {
            Debug.printError(e);
        }
    }

    private static void searchBySymbol(Scanner scanner) {
        System.out.print("Introduzca el símbolo del elemento: ");
        try {
            scanner.nextLine();
            atom atom = getBySymbol(scanner.nextLine());
            System.out.println(getResult(atom));
            pauseByEnter(scanner);
        } catch (Exception e) {
            Debug.printError(e);
        }
    }

    private static void searchByNumberAtomic(Scanner scanner) {
        System.out.print("Introduzca el número atómico del elemento: ");
        int atomicNumber = inputs.inputIntByRange(scanner, 1, 118);
        try {
            atom atom = getByNumberAtomic(atomicNumber);
            System.out.println(getResult(atom));
            pauseByEnter(scanner, 2);
        } catch (Exception e) {
            Debug.printError(e);
        }
    }

    public static String getResult(atom atom) throws Exception {
        String margin = " ";
        String header = "--- Resultado de la búsqueda ---\n";
        String name = margin + "Nombre: " + atom.getName() + "\n";
        String symbol = margin + "Símbolo: " + atom.getSymbol() + "\n";
        String numberAtomic = margin + "Número atómico: " + atom.getNumberAtomic() + "\n";
        String bottom = "--------------------------------";
        return header+ name + symbol + numberAtomic + bottom;
    }
}
