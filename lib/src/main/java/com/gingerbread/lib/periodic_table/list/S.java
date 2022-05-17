package com.gingerbread.lib.periodic_table.list;

public class S extends com.gingerbread.lib.periodic_table.atom {

    public S() {
        super();
        try {
            super.setNumberAtomic(16);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Azufre");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("S");
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
