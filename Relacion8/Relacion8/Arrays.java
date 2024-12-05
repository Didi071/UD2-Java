package Relacion8;

public class Arrays {
    public static int[] generaArrayInt(int n, int min, int max){
        int[] lista= new int[n];
        int aleatorio;
        for (int i=0; i<lista.length; i++){
            aleatorio = (int)(Math.floor(Math.random()*(max-min)+min));
            lista[i]=aleatorio;
        }
        return lista; 
    }
        public static int minimoArrayInt(int[] array) {
            int actual;
            int min = array[0];
            for (int i=0; i<array.length; i++){
                actual = array[i];
                if (actual<min) {
                    min = actual;
                }
            }
            return min;
        }

        public static int maximoArrayInt (int[] array){
            int actual;
            int max = array[0];
            for (int i=0; i<array.length; i++){
                actual= array[i];
                if (actual>max) {
                    max=actual;
                }
            }
            return max;
        }
        public static double mediaArrayInt (int[] array){
            int actual;
            double suma= 0;
            double media;
            for (int i=0; i<array.length; i++){
                actual = array[i];
                suma += actual;
            }
            media = suma / array.length;
            return media;
        }
        public static boolean estaEnArrayInt(int[] array, int n){
            int actual; 
            for (int i=0; i<array.length; i++){
                actual = array[i];
                if (actual == n) {
                    System.out.println("Tu numero está en el array");
                    return true;
                }
            }
            System.out.println("Tu número no está en el array.");
            return false;
        }
        public static int posicionEnArray (int[] array, int n){
            for (int i=0; i<array.length; i++){
                if (array[i]==n) {
                    return i;
                } 
            }
            return -1;
        }
        public static int[] volteaArrayInt(int[] array){
            int[] nuevoarray = new int[array.length];
            for (int i=0; i<nuevoarray.length; i++){
                nuevoarray[i]= array[array.length - 1 -i] ;
            }
            return nuevoarray;
        }
        public static int[] rotaDerechaArrayInt (int[] array, int n){
            //1 2 3 4 2
            //2 4 1 2
            int[] nuevoarray = new int[array.length];
            n = n % nuevoarray.length;
            for (int i=0; i<array.length; i++){
                nuevoarray[(i+n) % array.length]=array[i];
            }
            return nuevoarray;
        }
    }



/* 
● rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.*/