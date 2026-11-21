package deber.java.j;

import java.util.Scanner;

/**
 * Calcula la suma y el promedio de diez números enteros.
 * @author Jeremy Joel Valladarez Caballero
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        double promedio;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = entrada.nextInt();
            suma += numero;
        }
        promedio = suma / 10.0;
        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
        entrada.close();
    }
}
