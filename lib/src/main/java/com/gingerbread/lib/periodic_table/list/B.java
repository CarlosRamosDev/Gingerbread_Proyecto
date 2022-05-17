package com.gingerbread.lib.periodic_table.list;

public class B extends com.gingerbread.lib.periodic_table.atom {

    public B() {
        super();
        try {
            super.setNumberAtomic(5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Boro");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("B");
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
