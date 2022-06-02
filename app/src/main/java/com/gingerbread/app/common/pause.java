package com.gingerbread.app.common;

import java.util.Scanner;

public class pause {
    public static void pauseByEnter(Scanner scanner) {
        System.out.print("Pulse ENTER para continuar...");
        scanner.nextLine();
    }

    public static void pauseByEnter(Scanner scanner, int Enter) {
        System.out.print("Pulse ENTER para continuar...");
        for (int i = 0; i < Enter; i++) {
            scanner.nextLine();
        }
    }
}
