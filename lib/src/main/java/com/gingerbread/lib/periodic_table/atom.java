package com.gingerbread.lib.periodic_table;

public class atom implements element {
    private int numberAtomic;
    private String symbol;
    private String name;
    private boolean metal;
    private boolean nonmetal;
    private boolean halogen;
    private boolean nobleGas;
    private boolean transitionMetal;
    private boolean lanthanide;
    private boolean actinide;

    public atom(int numberAtomic, String symbol, String name, boolean metal, boolean nonmetal, boolean halogen, boolean nobleGas, boolean transitionMetal, boolean lanthanide, boolean actinide) throws Exception {
        this.setNumberAtomic(numberAtomic);
        this.setSymbol(symbol);
        this.setName(name);
        this.setMetal(metal);
        this.setNonmetal(nonmetal);
        this.setHalogen(halogen);
        this.setNobleGas(nobleGas);
        this.setTransitionMetal(transitionMetal);
        this.setLanthanide(lanthanide);
        this.setActinide(actinide);
    }

    public atom() {
        this.numberAtomic = 0;
        this.symbol = "";
        this.name = "";
        this.metal = false;
        this.nonmetal = false;
        this.halogen = false;
        this.nobleGas = false;
        this.transitionMetal = false;
        this.lanthanide = false;
        this.actinide = false;
    }

    @Override
    public int getNumberAtomic() throws Exception {
        if ((this.numberAtomic > 0) && (this.numberAtomic <= 118)) {
            return this.numberAtomic;
        }
        throw new Exception("No se encontró el numero atómico");
    }

    @Override
    public void setNumberAtomic(int numberAtomic) throws Exception {
        if ((numberAtomic > 0) && (numberAtomic <= 118)) {
            this.numberAtomic = numberAtomic;
            return;
        }
        throw new Exception("Numero atómico invalido");
    }

    @Override
    public String getSymbol() throws Exception {
        if (this.symbol.length() > 0 && this.symbol.length() <= 3) {
            return this.symbol;
        }
        throw new Exception("No se encontró el símbolo");
    }

    @Override
    public void setSymbol(String symbol) throws Exception {
        if (symbol.length() > 0 && symbol.length() <= 3) {
            this.symbol = symbol;
            return;
        }
        throw new Exception("Símbolo invalido");
    }

    @Override
    public String getName() throws Exception {
        if (this.name.length() > 0) {
            return this.name;
        }
        throw new Exception("No se encontró el nombre");
    }

    @Override
    public void setName(String name) throws Exception {
        if (name.length() > 0) {
            this.name = name;
            return;
        }
        throw new Exception("Nombre invalido");
    }

    @Override
    public boolean isMetal() {
        return this.metal;
    }

    @Override
    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    @Override
    public boolean isNonmetal() {
        return this.nonmetal;
    }

    @Override
    public void setNonmetal(boolean nonmetal) {
        this.nonmetal = nonmetal;
    }

    @Override
    public boolean isHalogen() {
        return this.halogen;
    }

    @Override
    public void setHalogen(boolean halogen) {
        this.halogen = halogen;
    }

    @Override
    public boolean isNobleGas() {
        return this.nobleGas;
    }

    @Override
    public void setNobleGas(boolean nobleGas) {
        this.nobleGas = nobleGas;
    }

    @Override
    public boolean isTransitionMetal() {
        return this.transitionMetal;
    }

    @Override
    public void setTransitionMetal(boolean transitionMetal) {
        this.transitionMetal = transitionMetal;
    }

    @Override
    public boolean isLanthanide() {
        return this.lanthanide;
    }

    @Override
    public void setLanthanide(boolean lanthanide) {
        this.lanthanide = lanthanide;
    }

    @Override
    public boolean isActinide() {
        return this.actinide;
    }

    @Override
    public void setActinide(boolean actinide) {
        this.actinide = actinide;
    }
}

interface element {
    int getNumberAtomic() throws Exception;
    void setNumberAtomic(int numberAtomic) throws Exception;
    String getSymbol() throws Exception;
    void setSymbol(String symbol) throws Exception;
    String getName() throws Exception;
    void setName(String name) throws Exception;
    boolean isMetal();
    void setMetal(boolean metal);
    boolean isNonmetal();
    void setNonmetal(boolean nonmetal);
    boolean isHalogen();
    void setHalogen(boolean halogen);
    boolean isNobleGas();
    void setNobleGas(boolean nobleGas);
    boolean isTransitionMetal();
    void setTransitionMetal(boolean transitionMetal);
    boolean isLanthanide();
    void setLanthanide(boolean lanthanide);
    boolean isActinide();
    void setActinide(boolean actinide);
}
