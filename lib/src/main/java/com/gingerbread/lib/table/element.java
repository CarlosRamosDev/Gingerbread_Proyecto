package com.gingerbread.lib.table;

public class element implements com.gingerbread.lib.element {
    private int numberAtomic;
    private String symbol;
    private String name;
    private String description;
    private boolean metal;
    private boolean nonmetal;
    private boolean halogen;
    private boolean nobleGas;
    private boolean transitionMetal;
    private boolean lanthanide;
    private boolean actinide;

    public element(int numberAtomic, String symbol, String name, String description, boolean metal, boolean nonmetal, boolean halogen, boolean nobleGas, boolean transitionMetal, boolean lanthanide, boolean actinide) {
        this.numberAtomic = numberAtomic;
        this.symbol = symbol;
        this.name = name;
        this.description = description;
        this.metal = metal;
        this.nonmetal = nonmetal;
        this.halogen = halogen;
        this.nobleGas = nobleGas;
        this.transitionMetal = transitionMetal;
        this.lanthanide = lanthanide;
        this.actinide = actinide;
    }

    public element() {
        this.numberAtomic = 0;
        this.symbol = "";
        this.name = "";
        this.description = "";
        this.metal = false;
        this.nonmetal = false;
        this.halogen = false;
        this.nobleGas = false;
        this.transitionMetal = false;
        this.lanthanide = false;
        this.actinide = false;
    }

    @Override
    public int getNumberAtomic() {
        return this.numberAtomic;
    }

    @Override
    public void setNumberAtomic(int numberAtomic) {
        this.numberAtomic = numberAtomic;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
