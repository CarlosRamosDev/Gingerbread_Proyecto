package com.gingerbread.app;

import com.gingerbread.lib.table.element;
import com.gingerbread.lib.table.search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        String name = scanner.nextLine();
        element element  = search.searchElementByName(name);

        System.out.println("Element: " + element.getSymbol());
        System.out.println("Name: " + element.getName());
        System.out.println("Description: " + element.getDescription());
        System.out.println("Metal: " + element.isMetal());
        System.out.println("Nonmetal: " + element.isNonmetal());
        System.out.println("Halogen: " + element.isHalogen());
        System.out.println("Noble Gas: " + element.isNobleGas());
        System.out.println("Transition Metal: " + element.isTransitionMetal());
        System.out.println("Lanthanide: " + element.isLanthanide());
        System.out.println("Actinide: " + element.isActinide());
    }
}