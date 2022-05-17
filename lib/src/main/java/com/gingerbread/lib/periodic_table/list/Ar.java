package com.gingerbread.lib.periodic_table.list;

public class Ar extends com.gingerbread.lib.periodic_table.atom {

    public Ar() {
        super();
        try {
            super.setNumberAtomic(18);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Argon");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Ar");
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
