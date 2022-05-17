package com.gingerbread.lib.periodic_table.list;

public class Be extends com.gingerbread.lib.periodic_table.atom {

    public Be() {
        super();
        try {
            super.setNumberAtomic(4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Berilio");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Be");
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
