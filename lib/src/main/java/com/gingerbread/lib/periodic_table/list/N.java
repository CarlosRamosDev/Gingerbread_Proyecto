package com.gingerbread.lib.periodic_table.list;

public class N extends com.gingerbread.lib.periodic_table.atom {

    public N() {
        super();
        try {
            super.setNumberAtomic(7);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Nitrógeno");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("N");
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
