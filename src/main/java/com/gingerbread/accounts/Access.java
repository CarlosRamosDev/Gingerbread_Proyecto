package com.gingerbread.accounts;

import com.gingerbread.common.User;

import java.util.ArrayList;
import java.util.UUID;

public class Access {
    Storage storage;
    public Access() {
        storage = new Storage();
    }
    public void signUp(String name, String password) {
        Storage storage = new Storage();
        ArrayList<User> users;
        try {
            users = storage.getUsers();
            users.add(new User(name, password));
            storage.setUsers(users);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public UUID getId(String name, String password) {
        Storage storage = new Storage();
        ArrayList<User> users;
        try {
            users = storage.getUsers();
            for (User user : users) {
                if (user.authenticate(name, password)) {
                    return user.getId();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean signIn(String name, String password) {
        Storage storage = new Storage();
        ArrayList<User> users;
        try {
            users = storage.getUsers();
            for (User user : users) {
                if (user.authenticate(name, password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static User getUser(UUID id) {
        Storage storage = new Storage();
        ArrayList<User> users;
        try {
            users = storage.getUsers();
            for (User user : users) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

