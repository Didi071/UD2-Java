import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        String cadena;
        int contador=1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        cadena = entrada.nextLine().trim();


        for (int i=0; i<cadena.length(); i++)
        if (cadena.charAt(i) == ' ') {
            contador++;
        };
        System.out.println(contador);
    }   
}
