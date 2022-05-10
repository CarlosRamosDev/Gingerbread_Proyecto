package com.gingerbread.lib.table;

import com.gingerbread.lib.table.atoms.*;

public class list {
    public static element[] getElements() {
        element[] element = new element[118];
        element[0] = new H();
        element[1] = new He();
        element[2] = new element(3, "Li", "Lithium", "A soft, silvery-white, post-transition metal", false, false, false, false, false, false, false);
        element[3] = new element(4, "Be", "Beryllium", "A soft, silvery-white, post-transition metal", false, false, false, false, false, false, false);
        element[4] = new element(5, "B", "Boron", "A soft, blue-white, post-transition metal", false, false, false, false, false, false, false);
        element[5] = new element(6, "C", "Carbon", "A soft, post-transition metal", false, false, false, false, false, false, false);
        element[6] = new element(7, "N", "Nitrogen", "A gas, colorless, odorless, tasteless", false, false, false, false, false, false, false);

        return element;
    }
}
