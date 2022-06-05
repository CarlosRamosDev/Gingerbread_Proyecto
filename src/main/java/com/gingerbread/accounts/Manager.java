package com.gingerbread.accounts;

import java.util.Scanner;
import java.util.UUID;

public class Manager {
    public static UUID signUpMenu(Scanner scanner) {
        UUID id = null;
        boolean exit = false;
        do {
            try {
                Access access = new Access();
                String name, password;
                System.out.print("Ingrese el nombre de usuario: ");
                name = scanner.nextLine();
                System.out.print("Ingrese la contraseña: ");
                password = scanner.nextLine();
                access.signUp(name, password);
                id = access.getId(name, password);
                welcome(id);
                exit = true;
            } catch (userExistsException e) {
                System.out.println("El usuario ya existe");
                System.out.println("Ingrese otro nombre de usuario");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!exit);
        return id;
    }

    public static UUID signInMenu(Scanner scanner) {
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
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos");
            }
        } while (!authenticated);
        return id;
    }

    public static void welcome(UUID id) {
        System.out.println("Bienvenido " + Access.getUser(id).getName());
    }
}
