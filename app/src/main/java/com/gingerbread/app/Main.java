package com.gingerbread.app;

import com.gingerbread.app.common.copyright;
import com.gingerbread.app.menu.main;

import java.util.Scanner;
/**
 * @author Carlos Ramos;
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        copyright.printCopyright();
        System.out.println("Herramienta para la resolución de problemas de la materia de Química");
        do {
            main.mainPage();
            switch (inputs.inputIntByRange(scanner, 1, 10)) {
                case 1 -> SearchElement.mainPage(scanner);
                case 9 -> main.Credits();
                case 10 -> exit = true;
                default -> System.out.println("Próximamente");
            }
        } while (!exit);
        System.out.println("Gracias por usar el programa");
    }

}

