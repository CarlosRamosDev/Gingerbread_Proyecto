package com.gingerbread.common;

import java.io.Serializable;

public class User implements com.gingerbread.common.interfaces.User, Serializable {
    private String name;
    private String password;

    public User(){
        this.name = "";
        this.password = "";
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public boolean authenticate(String name, String password){
        return this.name.equals(name) && this.password.equals(password);
    }
}
