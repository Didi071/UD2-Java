import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena;
        String nuevaCadena = "";

        System.out.println("Introduce tu nombre y apellidos");
        cadena = entrada.nextLine();

        nuevaCadena += Character.toUpperCase(cadena.charAt(0));

        for (int i=1; i < cadena.length(); i++){
            char actual = cadena.charAt(i);
            if (actual==' ' && i+1 < cadena.length()) {
                nuevaCadena += Character.toUpperCase(cadena.charAt(i+1));
            }
        }
        System.out.println(nuevaCadena);
    }
}
