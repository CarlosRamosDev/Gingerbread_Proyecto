package com.gingerbread.accounts;

import com.gingerbread.common.StorageManager;
import com.gingerbread.common.User;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.UUID;

public class Storage {
    private static final Path path = Paths.get(System.getProperty("user.dir") + "/data/");
    private static final Path filePhat = Paths.get(path + "/users.dat");

    public Storage() {
        try {
            if (!Files.exists(path)) {
                Files.createDirectories(path);
                generateDefaultUsers();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    ArrayList<User> getUsers() throws Exception {
        return (ArrayList<User>) StorageManager.getObjectFile(filePhat);
    }

    void setUsers(ArrayList<User> users) throws Exception {
        StorageManager.setObjectFile(filePhat, users);
    }

    public static void generateDefaultUsers() throws Exception {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("admin", "admin", UUID.randomUUID(), 9));
        StorageManager.setObjectFile(filePhat, users);
    }
}
