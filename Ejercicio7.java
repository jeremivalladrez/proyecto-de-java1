package deber.java.j;

import java.util.Scanner;

/**
 * Cuenta y suma números positivos hasta ingresar un valor negativo.
 * @author Jeremy Valladarez
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cantidad = 0, suma = 0;

        System.out.print("Ingrese un número positivo o uno negativo para terminar: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            suma += numero;
            cantidad++;
            System.out.print("Ingrese otro número positivo o uno negativo para terminar: ");
            numero = entrada.nextInt();
        }

        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
        entrada.close();
    }
}
