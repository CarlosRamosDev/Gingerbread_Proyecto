package com.gingerbread.app.common;
/**
 * @author Carlos Ramos;
 */

public class copyright {
    private static final String[] authors = {"Diego Gael Martin del Campo", "Carlos Iram Ramos Vasquez", "Jesús Alejandro Torres Ramírez"};
    private static final String copyright = "Copyright © 2022 Gingerbread Team. All rights reserved";

    public static String getCopyright() {
        return copyright;
    }

    public static String[] getAuthors() {
        return authors;
    }

    public static void printAuthors() {
        for (String author : authors) {
            System.out.println(author);
        }
    }

    public static void copyrightAndAuthor() {
        System.out.println("------------------------------------------------------");
        System.out.println(copyright);
        printAuthors();
        System.out.println("------------------------------------------------------");
    }

    public static void printCopyright() {
        System.out.println(copyright);
    }
}
