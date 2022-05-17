package com.gingerbread.lib.periodic_table;

import com.gingerbread.lib.periodic_table.list.*;

public class listLoader {
    public static atom[] getElements() {
        atom[] atoms = new atom[18];
        atoms[0] = new H();
        atoms[1] = new He();
        atoms[2] = new Li();
        atoms[3] = new Be();
        atoms[4] = new B();
        atoms[5] = new C();
        atoms[6] = new N();
        atoms[7] = new O();
        atoms[8] = new F();
        atoms[9] = new Ne();
        atoms[10] = new Na();
        atoms[11] = new Mg();
        atoms[12] = new Al();
        atoms[13] = new Si();
        atoms[14] = new P();
        atoms[15] = new S();
        atoms[16] = new Cl();
        atoms[17] = new Ar();
        return atoms;
    }
}
