package com.gingerbread.lib.periodic_table.list;

public class H extends com.gingerbread.lib.periodic_table.atom {

        public H() {
            super();
            try {
                super.setNumberAtomic(1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                super.setName("Hidrogeno");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                super.setSymbol("H");
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
