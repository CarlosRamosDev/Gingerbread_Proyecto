package com.gingerbread.common.interfaces;

import java.util.UUID;

public interface User {
    public String getName();
    public void setName(String name);
    public void setId(UUID id);
    public UUID getId();
    public void setRole(int level);
    public int getRole();
    public void setPassword(String password);
    public boolean authenticate(String name, String password);
}
