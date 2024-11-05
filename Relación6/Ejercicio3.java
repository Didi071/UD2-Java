
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena;
        char caracter;
        short contador=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        cadena = entrada.nextLine();
        System.out.println("Escribe el carácter");
        caracter = entrada.next().charAt(0);

        int longitud = cadena.length();

        for (int i=0; i<longitud; i++) {
            if (cadena.charAt(i)==caracter) {
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " aparece " + contador + " veces.");
    }
}
