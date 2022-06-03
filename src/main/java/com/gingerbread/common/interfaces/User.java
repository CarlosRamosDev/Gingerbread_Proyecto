package com.gingerbread.common.interfaces;

import java.util.UUID;

public interface User {
    public String getName();
    public void setName(String name);
    public void setId(UUID id);
    public UUID getId();
    public void setSubscriptionLevel(int level);
    public int getSubscriptionLevel();
    public void setPassword(String password);
    public boolean authenticate(String name, String password);
}
