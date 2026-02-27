package algorithms;

public class OrdenamientoBurbuja {

    // Ordenamiento burbuja iterativo O(n^2)
    public static void burbujaIterativo(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Ordenamiento burbuja recursivo O(n^2)
    public static void burbujaRecursivo(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        // Una pasada: burbujear el mayor al final
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        // Llamada recursiva con n-1
        burbujaRecursivo(arr, n - 1);
    }
}
