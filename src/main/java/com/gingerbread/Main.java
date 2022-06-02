package com.gingerbread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            switch (Integer.parseInt(Menus.getMainMenu().printMenu(scanner))) {
                case 1 -> {
                    Menus.getMainMenu().printMenu(scanner);
                }

                case 8 -> Menus.getCreditsMenu().printMenu(scanner);
                case 9 -> exit = true;
            }
        } while (!exit);
        String a = Menus.getMainMenu().printMenu(scanner);
        System.out.println(a);
        System.out.println("Hello world!");
    }
}