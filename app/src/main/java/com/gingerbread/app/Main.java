package com.gingerbread.app;

import com.gingerbread.lib.periodic_table.atom;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final String[] options = {"Menu de opciones","Buscar elemento", "", "", "", "", "", "", "", "Créditos", "Salir"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println(common.getCopyright());
        System.out.println("Herramienta para la resolución de problemas de la materia de Química");
        do {
            printOptions();
            switch (inputs.inputIntByRange(scanner, 1, 10)) {
                case 1 -> SearchElement.mainPage(scanner);
                case 9 -> common.copyrightAndAuthor(scanner);
                case 10 -> exit = true;
                default -> System.out.println("Próximamente");
            }
        } while (!exit);
        System.out.println("Gracias por usar el programa");
    }
    public static void printOptions() {
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

