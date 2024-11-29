package Relacion8;

public class Ejercicio1 {
    public static String convierteEnPalotes(int num){
        //String numCadena = num+"";
        //String numCadena= Integer.toString(num);
        String numCadena= String.valueOf(num);
        String resultado = "";
        for (int i=0; i<numCadena.length(); i++){
            int numero = numCadena.charAt(i)  - '0';
            for (int j=0; j<numero; j++){
                resultado += "|";
                }
            if (i<numCadena.length()-1){
                resultado += "-";
            }
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println();
        int numero = 1232;
        System.out.println(convierteEnPalotes(numero));
    }
}
