package com.gingerbread.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputs {
    public static int inputIntByRange(Scanner input, int min, int max) {
        boolean valid = true;
        int number = 0;
        do {
            try {
                number = input.nextInt();
                if (number < min || number > max) {
                    if (number < min) {                                                                                 // If the number is less than the minimum
                        throw new ArithmeticException("El número debe ser mayor a " + min);                             // Throw an exception
                    } else {                                                                                            // If the number is greater than the maximum
                        throw new ArithmeticException("El número debe ser menor a " + max);                             // Throw an exception
                    }
                }
                valid = false;                                                                                          // If the number is valid, set valid to false
            } catch (ArithmeticException e) {
                Debug.debug(number + " is not between " + min + " and " + max);                                         // Debug message
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                Debug.debug("A non-numeric value was entered");                                                         // Debug message
                System.out.println("Debes introducir un número entero");
                input.nextLine();
            }
        } while (valid);
        return number;
    }
}
