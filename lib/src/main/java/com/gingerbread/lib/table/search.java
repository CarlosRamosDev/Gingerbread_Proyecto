package com.gingerbread.lib.table;

public class search {
    public static element searchElementByNumberAtomic(int numberAtomic) {
        return list.getElements()[numberAtomic - 1];
    }

    public static element searchElementBySimbol(String symbol) {
        for (element element : list.getElements()) {
            if (element.getSymbol().equals(symbol)) {
                return element;
            }
        }
        return null;
    }

    public static element searchElementByName(String name) {
        for (element element : list.getElements()) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }
}
