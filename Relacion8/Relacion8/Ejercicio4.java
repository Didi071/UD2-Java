package Relacion8;
import java.util.Scanner;
public class Ejercicio4 {
public static String convierteArrayEnString(int[] a) {
    String resultado = "";
    for (int i = 0; i < a.length; i++) {
        resultado = resultado + a[i];
    }
    return resultado;
}
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Cuantos elementos tiene el array: ");
    int elementos = entrada.nextInt();
    int[] lista = new int[elementos];
    for (int i = 0; i < lista.length; i++) {
        System.out.println("Ingrese el elemento " + (i + 1) + ": ");
        lista[i] = entrada.nextInt();
    }
    System.out.println(convierteArrayEnString(lista));
    entrada.close();
}
} 
