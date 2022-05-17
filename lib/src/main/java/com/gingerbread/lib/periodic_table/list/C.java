package com.gingerbread.lib.periodic_table.list;

public class C extends com.gingerbread.lib.periodic_table.atom {

    public C() {
        super();
        try {
            super.setNumberAtomic(6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Carbono");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("C");
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
