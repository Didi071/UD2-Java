package Relacion8;
import Relacion8.Arrays;
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] lista = Arrays.generaArrayInt(10, 5, 15);
        for (int i=0; i<lista.length; i++){
            System.out.print(lista[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.minimoArrayInt(lista));
        System.out.println(Arrays.maximoArrayInt(lista));
        System.out.println(Arrays.mediaArrayInt(lista));
        System.out.println(Arrays.estaEnArrayInt(lista, 3));
        System.out.println(Arrays.posicionEnArray(lista, 7));
        int[] listaInvertida = Arrays.volteaArrayInt(lista);
        for (int i=0; i<lista.length; i++){
            System.out.print(listaInvertida[i] + " ");
        }
        int[] listaRotada = Arrays.rotaDerechaArrayInt(lista, 3);
        System.out.println();
        for (int i=0; i<lista.length; i++){
            System.out.print(listaRotada[i] + " ");
        }
    }
}
