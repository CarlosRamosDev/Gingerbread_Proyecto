package com.gingerbread.app;

public class Debug {
    static boolean debug = true;

    public static void debug(String message) {
        if (debug) {
            System.out.println("Debug: " + message);
        }
    }
}
