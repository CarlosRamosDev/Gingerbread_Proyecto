package com.gingerbread.lib.periodic_table.list;

public class F extends com.gingerbread.lib.periodic_table.atom {

    public F() {
        super();
        try {
            super.setNumberAtomic(9);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Flúor");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("F");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        super.setMetal(false);
        super.setNonmetal(false);
        super.setHalogen(false);
        super.setNobleGas(false);
        super.setTransitionMetal(false);
        super.setLanthanide(false);
        super.setActinide(false);
    }
}
