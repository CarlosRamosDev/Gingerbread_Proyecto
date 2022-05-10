package com.gingerbread.lib;

public interface element {
    public int getNumberAtomic();
    public void setNumberAtomic(int numberAtomic);
    public String getSymbol();
    public void setSymbol(String symbol);
    public String getName();
    public void setName(String name);
    public String getDescription();
    public void setDescription(String description);

    public boolean isMetal();
    public void setMetal(boolean metal);
    public boolean isNonmetal();
    public void setNonmetal(boolean nonmetal);
    public boolean isHalogen();
    public void setHalogen(boolean halogen);
    public boolean isNobleGas();
    public void setNobleGas(boolean nobleGas);
    public boolean isTransitionMetal();
    public void setTransitionMetal(boolean transitionMetal);
    public boolean isLanthanide();
    public void setLanthanide(boolean lanthanide);
    public boolean isActinide();
    public void setActinide(boolean actinide);
}
