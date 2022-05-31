package com.gingerbread.app;

import java.util.Arrays;
import java.util.Scanner;

public class Credits {
    private static final String teamName = "Gingerbread Team";
    private static final String[] teamMembers = {"Carlos Iram Ramos Vasquez", "Diego Gael Martin del Campo", "Alejandro Torres"};

    public String getTeamName() {
        return teamName;
    }

    public String[] getTeamMembers() {
        return teamMembers;
    }

    public static void showCredits(Scanner scanner) {
        System.out.println("--------------------------- Créditos ---------------------------");
        System.out.println("Elaborado por: " + teamName);
        System.out.println("Integrantes: " + Arrays.toString(teamMembers));
        System.out.println("------------------------------------------------------");
    }
}
