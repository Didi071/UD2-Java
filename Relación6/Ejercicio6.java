import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        String nuevaCadena="";

        System.out.println("Introduce una cadena: ");
        cadena = entrada.nextLine();

        for (int i=cadena.length()-1; i>=0; i--){
            nuevaCadena+=cadena.charAt(i);
        }
        System.out.println(nuevaCadena);
    }
}
