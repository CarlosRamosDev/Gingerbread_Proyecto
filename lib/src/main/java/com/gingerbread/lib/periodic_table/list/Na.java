package com.gingerbread.lib.periodic_table.list;

public class Na extends com.gingerbread.lib.periodic_table.atom {

    public Na() {
        super();
        try {
            super.setNumberAtomic(11);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Sodio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Na");
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
