package com.gingerbread.lib.periodic_table;

public class searchEngines {
    static atom[] atoms = listLoader.getElements();

    public static atom getByNumberAtomic(int numberAtomic) throws Exception {
        for (atom atom : atoms) {
            if (atom.getNumberAtomic() == numberAtomic) {
                return atom;
            }
        }
        throw new Exception("No se encontró el elemento con el numero atómico " + numberAtomic);
    }

    public static atom getBySymbol(String symbol) throws Exception {
        for (atom atom : atoms) {
            if (atom.getSymbol().equals(symbol)) {
                return atom;
            }
        }
        throw new Exception("No se encontró el elemento con el símbolo " + symbol);
    }

    public static atom getByName(String name) throws Exception {
        for (atom atom : atoms) {
            if (atom.getName().equals(name)) {
                return atom;
            }
        }
        throw new Exception("No se encontró el elemento con el nombre " + name);
    }
}
