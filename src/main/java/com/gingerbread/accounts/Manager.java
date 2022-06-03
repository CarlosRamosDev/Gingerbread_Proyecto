package com.gingerbread.accounts;

import java.util.Scanner;
import java.util.UUID;

public class Manager {
    public static UUID signUpMenu(Scanner scanner) {
        Access access = new Access();
        String name, password;
        System.out.print("Ingrese el nombre de usuario: ");
        name = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        password = scanner.nextLine();
        access.signUp(name, password);
        UUID id = access.getId(name, password);
        welcome(id);
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
