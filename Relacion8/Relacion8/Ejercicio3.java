package Relacion8;
import java.util.Scanner;
public class Ejercicio3 {
    public static void mostrarFigura(char caracter, int alto) {
        for (int j = alto; j > 0; j--) { 
            for (int i = 0; i < j; i++) { 
                System.out.print(caracter);
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un caracter: ");
        char caracter = entrada.next().charAt(0);
        System.out.println("Ingresa un número: ");
        int alto = entrada.nextInt();
        mostrarFigura(caracter, alto);
        entrada.close();
    }
}
