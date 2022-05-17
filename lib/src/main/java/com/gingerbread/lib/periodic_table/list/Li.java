package com.gingerbread.lib.periodic_table.list;

public class Li extends com.gingerbread.lib.periodic_table.atom {

    public Li() {
        super();
        try {
            super.setNumberAtomic(3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Litio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Li");
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
