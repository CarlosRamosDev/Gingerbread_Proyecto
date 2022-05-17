package com.gingerbread.lib.periodic_table.list;

public class Ne extends com.gingerbread.lib.periodic_table.atom {

    public Ne() {
        super();
        try {
            super.setNumberAtomic(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setName("Neon");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            super.setSymbol("Ne");
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
