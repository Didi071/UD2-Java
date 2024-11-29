package Relacion8;

public class Ejercicio2 {
    public static String convierteEnPalabras (int n){
        String cadena = String.valueOf(n);
        String nuevaCadena = "";
        for (int i=0; i<cadena.length(); i++){
            int digito = cadena.charAt(i) - 48;
            switch (digito){
                case 0: 
                nuevaCadena += "Cero ";
                break;
                case 1: 
                nuevaCadena += "Uno ";
                break;
                case 2: 
                nuevaCadena += "Dos ";
                break;
                case 3: 
                nuevaCadena += "Tres ";
                break;
                case 4: 
                nuevaCadena += "Cuatro ";
                break;
                case 5: 
                nuevaCadena += "Cinco ";
                break;
                case 6: 
                nuevaCadena += "Seis ";
                break;
                case 7: 
                nuevaCadena += "Siete ";
                break;
                case 8: 
                nuevaCadena +="Ocho ";
                break;
                case 9: 
                nuevaCadena +="Nueve ";
                break;
            }
            
            
        }
        return nuevaCadena;
    }
    public static void main(String[] args) {
        int num = 58410;
        System.out.println(convierteEnPalabras(num)); 
    }
}


