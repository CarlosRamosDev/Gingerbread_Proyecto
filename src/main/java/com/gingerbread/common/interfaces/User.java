package com.gingerbread.common.interfaces;

import java.util.UUID;

public interface User {
    String getName();

    void setName(String name);

    UUID getId();

    void setId(UUID id);

    int getRole();

    void setRole(int level);

    void setPassword(String password);

    boolean authenticate(String name, String password);
}
