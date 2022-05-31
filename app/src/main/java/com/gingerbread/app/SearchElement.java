package com.gingerbread.app;

import com.gingerbread.lib.periodic_table.atom;

import java.util.Scanner;

import static com.gingerbread.lib.periodic_table.searchEngines.*;


public class SearchElement {
    public static void mainPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Buscador de elementos  ---");
        System.out.println("Seleccione la opción deseada:");
        System.out.println("1. Buscar elemento por número atómico");
        System.out.println("2. Buscar elemento por símbolo");
        System.out.println("3. Buscar elemento por nombre");
        System.out.println("4. Salir");
        switch (inputs.inputIntByRange(scanner, 1, 4)) {
            case 1 -> {
                System.out.println("Introduzca el número atómico del elemento:");
                int atomicNumber = inputs.inputIntByRange(scanner, 1, 118);
                try {
                    atom atom = getByNumberAtomic(atomicNumber);
                    System.out.println("Se encontró el elemento " + atom.getName() + " con el número atómico " + atom.getNumberAtomic() + " y el símbolo " + atom.getSymbol());
                } catch (Exception e) {
                    Commons.debug(e.getMessage());
                    System.out.println("A ocurrido un error");
                }
            }
            case 2 -> {
                System.out.println("Introduzca el símbolo del elemento:");
                try {
                    atom atom = getBySymbol(scanner.nextLine());
                    System.out.println("Se encontró el elemento " + atom.getName() + " con el número atómico " + atom.getNumberAtomic() + " y el símbolo " + atom.getSymbol());
                } catch (Exception e) {
                    Commons.debug(e.getMessage());
                    System.out.println("A ocurrido un error");
                }
            }
            case 3 -> {
                System.out.println("Introduzca el nombre del elemento:");
                try {
                    atom atom = getByName(scanner.nextLine());
                    System.out.println("Se encontró el elemento " + atom.getName() + " con el número atómico " + atom.getNumberAtomic() + " y el símbolo " + atom.getSymbol());
                } catch (Exception e) {
                    Commons.debug(e.getMessage());
                    System.out.println("A ocurrido un error");
                }
            }
        }
        scanner.close();
    }
}
