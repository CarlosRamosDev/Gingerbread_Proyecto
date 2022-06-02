package com.gingerbread.common.interfaces;

public interface User {
    public String getName();
    public void setName(String name);
    public void setPassword(String password);
    public boolean authenticate(String name, String password);
}
