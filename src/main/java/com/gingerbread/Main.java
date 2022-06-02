package com.gingerbread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = Menus.getMainMenu().printMenu(scanner);
        System.out.println(a);
        System.out.println("Hello world!");
    }
}