import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        String cadenaInvertida = "";
        
        System.out.println("Introduce una cadena: ");
        cadena = entrada.nextLine();
        
        for (int i=cadena.length()-1; i>=0; i--){
            cadenaInvertida += cadena.charAt(i);
        }
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("Tu cadena es un palíndromo");
        } else {
            System.out.println("Tu cadena NO es un palíndromo");
        }
    }   
} 
