package deber.java.j;

import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número desde 1 hasta 12.
 * @author Jeremy Joel Valladarez Caballero
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número entero: ");
        numero = entrada.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        entrada.close();
    }
}
