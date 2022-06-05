package com.gingerbread.common;

import java.io.Serializable;
import java.util.UUID;

public class User implements com.gingerbread.common.interfaces.User, Serializable {
    private String name;
    private String password;
    private UUID id;
    private int role;

    public User() {
        this.name = "";
        this.password = "";
        this.id = null;
        this.role = 1;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.id = UUID.randomUUID();
        this.role = 1;
    }

    public User(String name, String password, UUID id) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.role = 1;
    }

    public User(String name, String password, UUID id, int role) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.role = role;
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
    public UUID getId() {
        return this.id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public int getRole() {
        return this.role;
    }

    @Override
    public void setRole(int level) {
        this.role = level;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }
}
