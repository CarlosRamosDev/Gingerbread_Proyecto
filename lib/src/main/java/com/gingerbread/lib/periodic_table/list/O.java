package com.gingerbread.lib.periodic_table.list;

public class O extends com.gingerbread.lib.periodic_table.atom {

    public O() {
        super();
        try {
            super.setNumberAtomic(8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Oxigeno");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("O");
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
