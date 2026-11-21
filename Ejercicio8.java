package deber.java.j;

import java.util.Scanner;

/**
 * Solicita una contraseña hasta que el usuario ingrese la correcta.
 * @author Jeremy Joel Valladarez Caballero
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contrasena;
        do {
            System.out.print("Ingrese la contraseña: ");
            contrasena = entrada.nextLine();
            if (!contrasena.equals("java2026")) {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }
        } while (!contrasena.equals("java2026"));
        System.out.println("Acceso concedido.");
        entrada.close();
    }
}
