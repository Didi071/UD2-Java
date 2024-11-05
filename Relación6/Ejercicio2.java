//Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena
//introducida por teclado.

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena;
        String subcadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        cadena = entrada.nextLine();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Escribe una subcadena de texto");
        subcadena = entrada2.nextLine();

        if (cadena.startsWith(subcadena)) {
            System.out.println("Verdadero");
        }else {
            System.out.println("Falso");
        }
    }
}
