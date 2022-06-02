package com.gingerbread;

import com.gingerbread.common.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Acces {
    private final Path path = Paths.get(System.getProperty("user.dir")+"/data/Users.obj");

    protected ArrayList<User> loadUsers() throws AccesException {
        ArrayList<User> users = null;
        if (Files.exists(path)) {
            try {
                ObjectInputStream file = new ObjectInputStream(new FileInputStream(path.toString()));
                users = (ArrayList<User>) file.readObject();
                file.close();
            } catch (Exception e) {
                throw new AccesException();
            }
        } else {
            users = new ArrayList<>();
            users.add(new User("admin", "admin"));
            try {
                Files.createDirectories(Paths.get(System.getProperty("user.dir")+"/data/"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return users;
    }

    protected void saveUsers(ArrayList<User> users) throws AccesException {
        try {
            OutputStream outputStream = Files.newOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new AccesException();
        }
    }

    public void addUser(User user){
        try {
            ArrayList<User> users = loadUsers();
            users.add(user);
            saveUsers(users);
        } catch (AccesException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeUser(User user){
        try {
            ArrayList<User> users = loadUsers();
            if (users != null) {
                users.remove(user);
                saveUsers(users);
            }
        } catch (AccesException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean authenticate(String name, String password){
        try {
            ArrayList<User> users = loadUsers();
            for (User user : users) {
                if (user.authenticate(name, password)) {
                    return true;
                }
            }
        } catch (AccesException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Se ha producido un error al cargar los usuarios");
            throw new RuntimeException();
        }
        return false;
    }
}

class AccesException extends Exception {
    public AccesException(String message) {
        super(message);
    }

    public AccesException() {
        super("Error al acceder a los datos");
    }
}
