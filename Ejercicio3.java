package deber.java.j;

import java.util.Scanner;

/**
 * Determina si una persona es mayor de edad.
 * @author Jeremy Valladarez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
        entrada.close();
    }
}
