package com.gingerbread;

import com.gingerbread.common.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Acces {
    private final Path path = Paths.get(System.getProperty("user.dir")+"/data/Users.obj");

    protected ArrayList<User> loadUsers(){
        ArrayList<User> users = null;
        if (Files.exists(path)) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toString()));
                users = (ArrayList<User>) ois.readObject();
                ois.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

    protected void saveUsers(ArrayList<User> users){
        try {
            OutputStream outputStream = Files.newOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user){
        ArrayList<User> users = loadUsers();
        if (users == null) {
            users = new ArrayList<>();
            try {
                Files.createDirectories(Paths.get(System.getProperty("user.dir")+"/data/"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        users.add(user);
        saveUsers(users);
    }

    public void removeUser(User user){
        ArrayList<User> users = loadUsers();
        users.remove(user);
        saveUsers(users);
    }

    public boolean authenticate(String name, String password){
        ArrayList<User> users = loadUsers();
        for (User user : users) {
            if (user.authenticate(name, password)) {
                return true;
            }
        }
        return false;
    }
}
