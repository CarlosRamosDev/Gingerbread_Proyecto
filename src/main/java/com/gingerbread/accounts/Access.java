package com.gingerbread.accounts;

import com.gingerbread.common.User;

import java.util.ArrayList;
import java.util.UUID;

public class Access {
    static Storage storage;

    public Access() {
        storage = new Storage();
    }

    public static void showUsers() {
        try {
            ArrayList<User> users = storage.getUsers();
            System.out.println("Usuarios registrados:");
            System.out.println("UUID\t\t\t\t\t\t\t\t\tNombre\t\tRol");
            for (User user : users) {
                System.out.println(user.getId() + "\t" + user.getName() + "\t\t" + user.getRole());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeUser(String uuid) {
        try {
            removeUser(UUID.fromString(uuid));

        } catch (Exception e) {
            System.out.println("UUID invalido");
        }
    }

    public static void removeUser(UUID userId) {
        try {
            ArrayList<User> users = storage.getUsers();
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getRole() != 0) {
                    if (users.get(i).getId().equals(userId)) {
                        users.remove(i);
                        storage.setUsers(users);
                        System.out.println("Usuario eliminado");
                        return;
                    }
                } else if (users.get(i).getRole() == 0 & users.get(i).getId().equals(userId)) {
                    System.out.println("No se puede eliminar el usuario administrador");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changeName(UUID userId, String name) {
        try {
            ArrayList<User> users = storage.getUsers();
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(userId)) {
                    users.get(i).setName(name);
                    storage.setUsers(users);
                    System.out.println("Nombre cambiado a " + name);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changePassword(UUID userId, String newPassword) {
        try {
            ArrayList<User> users = storage.getUsers();
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(userId)) {
                    users.get(i).setPassword(newPassword);
                    storage.setUsers(users);
                    System.out.println("Contraseña cambiada");
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void signUp(String name, String password) throws userExistsException {
        Storage storage = new Storage();
        ArrayList<User> users;
        try {
            users = storage.getUsers();
            for (User user : users) {
                if (user.getName().equals(name)) {
                    throw new userExistsException();
                }
            }
            users.add(new User(name, password));
            storage.setUsers(users);
        } catch (userExistsException e) {
            throw new userExistsException();
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
}

class userExistsException extends Exception {
    public userExistsException() {
        super("El usuario ya existe");
    }
}