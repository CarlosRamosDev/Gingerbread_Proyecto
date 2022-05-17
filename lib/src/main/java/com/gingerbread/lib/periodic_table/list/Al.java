package com.gingerbread.lib.periodic_table.list;

public class Al extends com.gingerbread.lib.periodic_table.atom {

    public Al() {
        super();
        try {
            super.setNumberAtomic(13);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Aluminio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Al");
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
