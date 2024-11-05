import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena;
        String nuevaCadena="";
        char caracter1;
        char caracter2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserta una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("Inserta un caracter: ");
        caracter1 = entrada.next().charAt(0);

        System.out.println("Inserta el nuevo caracter: ");
        caracter2 = entrada.next().charAt(0);

        for (int i=0; i<cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if (actual == caracter1) {
                nuevaCadena += caracter2;
            } else {
                nuevaCadena += actual;
            }
        }
        System.out.println("La nueva cadena es: " + nuevaCadena);
    }
}
