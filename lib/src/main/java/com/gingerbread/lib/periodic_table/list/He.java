package com.gingerbread.lib.periodic_table.list;

public class He extends com.gingerbread.lib.periodic_table.atom {

    public He() {
        super();
        try {
            super.setNumberAtomic(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Helio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("He");
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