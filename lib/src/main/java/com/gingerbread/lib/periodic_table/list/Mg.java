package com.gingerbread.lib.periodic_table.list;

public class Mg extends com.gingerbread.lib.periodic_table.atom {

    public Mg() {
        super();
        try {
            super.setNumberAtomic(12);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Magnesio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Mg");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        super.setMetal(true);
        super.setNonmetal(false);
        super.setHalogen(false);
        super.setNobleGas(false);
        super.setTransitionMetal(false);
        super.setLanthanide(false);
        super.setActinide(false);
    }
}
