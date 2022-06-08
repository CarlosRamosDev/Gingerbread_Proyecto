package com.gingerbread.accounts;

import com.gingerbread.common.Logs;

import java.util.Scanner;
import java.util.UUID;

public class Manager {
    private static Logs logs;

    public static UUID signUpMenu(Scanner scanner, Logs logs) {
        UUID id = null;
        boolean exit = false;
        do {
            String name = null, password;
            try {
                Access access = new Access();
                System.out.print("Ingrese el nombre de usuario: ");
                name = scanner.nextLine();
                System.out.print("Ingrese la contraseña: ");
                password = scanner.nextLine();
                access.signUp(name, password);
                id = access.getId(name, password);
                welcome(id);
                exit = true;
                logs.newLog("main/INFO", "El usuario " + name + " ha creado una cuenta");
            } catch (userExistsException e) {
                System.out.println("El usuario ya existe");
                System.out.println("Ingrese otro nombre de usuario");
                logs.newLog("Accounts/ERROR", "El usuario " + name + " ya existe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!exit);
        return id;
    }

    public static UUID signInMenu(Scanner scanner, Logs logs) {
        Access access = new Access();
        boolean authenticated = false;
        String name, password;
        UUID id = null;
        do {
            System.out.print("Ingrese el nombre de usuario: ");
            name = scanner.nextLine();
            System.out.print("Ingrese la contraseña: ");
            password = scanner.nextLine();
            if (access.signIn(name, password)) {
                id = access.getId(name, password);
                welcome(id);
                authenticated = true;
                logs.newLog("Accounts/INFO", "El usuario " + name + " ha iniciado sesión");
            } else {
                logs.newLog("Accounts/ERROR", "El usuario " + name + " ha intentado iniciar sesión");
                System.out.println("Nombre de usuario o contraseña incorrectos");
            }
        } while (!authenticated);
        return id;
    }

    public static void welcome(UUID id) {
        System.out.println("Bienvenido " + Access.getUser(id).getName());
    }
}
