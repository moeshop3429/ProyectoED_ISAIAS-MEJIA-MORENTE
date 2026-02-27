package utils;

import java.util.Random;

public class GeneradorDatos {

    private static final Random random = new Random();

    // Genera un arreglo de enteros aleatorios de tamaño n
    public static int[] generarArreglo(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    // Copia un arreglo para que ambas versiones trabajen con los mismos datos
    public static int[] copiarArreglo(int[] arr) {
        int[] copia = new int[arr.length];
        System.arraycopy(arr, 0, copia, 0, arr.length);
        return copia;
    }
}
