package com.gingerbread.lib.periodic_table.list;

public class Si extends com.gingerbread.lib.periodic_table.atom {

    public Si() {
        super();
        try {
            super.setNumberAtomic(14);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Silicio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Si");
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
