package deber.java.j;

import java.util.Scanner;

/**
 * Solicita diez números y determina el número mayor y el número menor.
 * @author Jeremy Joel Valladarez Caballero
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        double mayor;
        double menor;
        System.out.print("Ingrese el número 1: ");
        numero = entrada.nextDouble();
        mayor = numero;
        menor = numero;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextDouble();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        entrada.close();
    }
}
