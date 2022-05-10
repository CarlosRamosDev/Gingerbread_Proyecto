package com.gingerbread.lib.table;

import com.gingerbread.lib.element;

public class baseElement implements element {
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
