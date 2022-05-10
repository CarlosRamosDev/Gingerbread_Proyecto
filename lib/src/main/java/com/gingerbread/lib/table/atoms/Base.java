package com.gingerbread.lib.table.atoms;

import com.gingerbread.lib.table.element;

public class Base extends element {
    public Base() {
        super.setNumberAtomic(0);
        super.setName("");
        super.setSymbol("");
        super.setDescription("");
        super.setMetal(false);
        super.setNonmetal(false);
        super.setHalogen(false);
        super.setNobleGas(false);
        super.setTransitionMetal(false);
        super.setLanthanide(false);
        super.setActinide(false);
    }
}
