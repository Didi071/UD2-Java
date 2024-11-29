package Relacion8;
import java.util.Scanner;
public class Ejercicio5 {
    // Define la función concatena con la siguiente cabecera:
// public static int[] concatena(int[] a, int[] b)
//Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar
//ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
public static int[] concatena(int[] a, int[] b){
    int[] nuevaLista = new int[a.length + b.length];
    for (int i=0; i<a.length; i++){
        nuevaLista[i]= a[i];
    }
    for (int i=0; i<b.length; i++){
        nuevaLista[a.length+i] = b[i];
    }
    return nuevaLista;
}

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce cuantos elementos tiene el primer array: ");
    int elementos = entrada.nextInt();
    System.out.println("Introduce el primer array:");
    int[] array1 = new int[elementos];
    for (int i=0; i<elementos; i++){
        array1[i] = entrada.nextInt();
    }
    System.out.println("Introduce cuantos elementos tiene el segundo array: ");
    int elementos2 = entrada.nextInt();
    System.out.println("Introduce el segundo array:");
    int[] array2 = new int[elementos2];
    for (int i=0; i<elementos2; i++){
        array2[i] = entrada.nextInt();
    }
    int[] arrayFinal = concatena(array1, array2);
    System.out.println("El array concatenado es: ");
    for (int i=0; i<arrayFinal.length; i++){
        System.out.print(arrayFinal[i] + " ");
    }
    }
    
}
