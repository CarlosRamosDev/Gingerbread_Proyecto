package com.gingerbread.common;

import java.io.Serializable;
import java.util.UUID;

public class User implements com.gingerbread.common.interfaces.User, Serializable {
    private String name;
    private String password;
    private UUID id;
    private int subscriptionLevel;

    public User(){
        this.name = "";
        this.password = "";
        this.id = null;
        this.subscriptionLevel = 0;
    }
    public User(String name, String password){
        this.name = name;
        this.password = password;
        this.id = UUID.randomUUID();
        this.subscriptionLevel = 0;
    }

    public User(String name, String password, UUID id){
        this.name = name;
        this.password = password;
        this.id = id;
        this.subscriptionLevel = 0;
    }
    public User(String name, String password, UUID id, int subscriptionLevel){
        this.name = name;
        this.password = password;
        this.id = id;
        this.subscriptionLevel = subscriptionLevel;
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
    public void setId(UUID id) {
        this.id = id;
    }
    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public void setSubscriptionLevel(int level) {
        this.subscriptionLevel = level;
    }

    @Override
    public int getSubscriptionLevel() {
        return this.subscriptionLevel;
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
