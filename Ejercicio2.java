package deber.java.j;

import java.util.Scanner;

/**
 * Realiza operaciones aritméticas con dos números enteros.
 * @author Jeremy Joel Valladarez Caballero
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Ingrese el primer número entero: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        numero2 = entrada.nextInt();

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicación: " + (numero1 * numero2));
        if (numero2 != 0) {
            System.out.printf("División: %.2f%n", (double) numero1 / numero2);
            System.out.println("Residuo: " + (numero1 % numero2));
        } else {
            System.out.println("División y residuo: no se puede dividir para cero.");
        }
        entrada.close();
    }
}
