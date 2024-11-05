import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        String nuevaCadena="";
        
        System.out.println("Introduce una cadena: ");
        cadena = entrada.nextLine();
        for (int i =0; i<cadena.length(); i++ ) {
            char actual =cadena.charAt(i);
            if (Character.isUpperCase(actual)) {
                nuevaCadena += Character.toLowerCase(actual);
            } else if (Character.isLowerCase(actual)) {
                nuevaCadena += Character.toUpperCase(actual);
            } else {
                nuevaCadena += actual;
            }
        }
        System.out.println("La nueva cadena es: " + nuevaCadena);

    }
}
