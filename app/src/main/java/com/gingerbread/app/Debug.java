package com.gingerbread.app;

public class Debug {
    static boolean debug = true;

    public static void debug(String message) {
        if (debug) {
            System.out.println("Debug: " + message);
        }
    }

    public static void printError(Exception e) {
        if (debug) {
            e.printStackTrace();
        }
    }
    public static void printError(Exception e, String message) {
        if (debug) {
            System.out.println("Debug: " + message);
            e.printStackTrace();
        }
    }
}
