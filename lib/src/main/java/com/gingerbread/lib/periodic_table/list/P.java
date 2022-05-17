package com.gingerbread.lib.periodic_table.list;

public class P extends com.gingerbread.lib.periodic_table.atom {

    public P() {
        super();
        try {
            super.setNumberAtomic(15);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Fósforo");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("P");
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
