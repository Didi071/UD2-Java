import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena1;
        String cadena2;

        System.out.println("Introduce una cadena: ");
        cadena1 = entrada.nextLine();

        System.out.println("Introduce una cadena: ");
        cadena2 = entrada.nextLine();

        boolean contiene = cadena1.contains(cadena2);
        System.out.println(contiene);
    }
}
