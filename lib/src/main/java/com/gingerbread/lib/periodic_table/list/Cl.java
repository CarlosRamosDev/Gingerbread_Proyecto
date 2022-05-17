package com.gingerbread.lib.periodic_table.list;

public class Cl extends com.gingerbread.lib.periodic_table.atom {

    public Cl() {
        super();
        try {
            super.setNumberAtomic(17);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Cloro");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Cl");
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
