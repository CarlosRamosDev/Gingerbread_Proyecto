package com.gingerbread.lib.table;

public class search {
    public static element searchElementByNumberAtomic(int numberAtomic) {
        if ((numberAtomic > 0) && (numberAtomic <= 118)) {
            return list.getElements()[numberAtomic - 1];
        } else {
            System.out.println("Debug: Element not found");
            return null;
        }
    }

    public static element searchElementBySimbol(String symbol) {
        for (element element : list.getElements()) {
            if (element.getSymbol().equals(symbol)) {
                return element;
            }
        }
        System.out.println("Debug: Element not found");
        return null;
    }

    public static element searchElementByName(String name) {
        for (element element : list.getElements()) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        System.out.println("Debug: Element not found");
        return null;
    }
}
