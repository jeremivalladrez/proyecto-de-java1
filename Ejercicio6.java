package deber.java.j;

import java.util.Scanner;

/**
 * Muestra el día de la semana correspondiente a un número del 1 al 7.
 * @author Jeremy Valladarez
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroDia;

        System.out.print("Ingrese un número del 1 al 7: ");
        numeroDia = entrada.nextInt();

        switch (numeroDia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número fuera del rango permitido.");
        }
        entrada.close();
    }
}
