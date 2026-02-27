package benchmark;

import algorithms.Factorial;
import algorithms.Fibonacci;
import algorithms.BusquedaLineal;
import algorithms.OrdenamientoBurbuja;
import utils.GeneradorDatos;

public class Main {

    // Tamaños de prueba para Factorial y Fibonacci
    private static final int[] TAMANOS = { 5, 10, 15, 20, 25, 30 };
    private static final String[] ETIQUETAS = {
            "muy pequeño", "pequeño", "pequeño - mediano", "mediano", "grande", "muy grande"
    };

    // Tamaños de prueba para Búsqueda Lineal y Ordenamiento Burbuja
    private static final int[] TAMANOS_BUSQUEDA = { 100, 500, 1000, 5000, 10000 };
    private static final String[] ETIQUETAS_BUSQUEDA = {
            "muy pequeño", "pequeño", "pequeño - mediano", "mediano", "grande"
    };

    private static final String LINEA = "-------------------------------------------------------------------------------------------------------------------------------------";

    public static void main(String[] args) {

        // Encabezado
        System.out.println(
                "====================================================================================================================================");
        System.out.println("  ESTRUCTURA DE DATOS I");
        System.out.println("  Universidad Da Vinci de Guatemala");
        System.out.println("  Tutor:ing. Brandon Chitay");
        System.out.println("  Estudiante: Isaias Mejia Morente");
        System.out.println("  Carne: 202503928");
        System.out.println("  Fecha: 26/02/2026");
        System.out.println(LINEA);

        // ── FACTORIAL ──
        double[] tiemposFactIter = new double[TAMANOS.length];
        double[] tiemposFactRecu = new double[TAMANOS.length];

        imprimirEncabezadoSeccion("FACTORIAL ITERATIVO [O(n)]");
        for (int i = 0; i < TAMANOS.length; i++) {
            int n = TAMANOS[i];
            tiemposFactIter[i] = Medidor.medir(() -> Factorial.factorialIterativo(n));
            imprimirFila("Factorial", "iterativo", n, ETIQUETAS[i], tiemposFactIter[i]);
        }
        System.out.println(LINEA);

        imprimirEncabezadoSeccion("FACTORIAL RECURSIVO [O(n)]");
        for (int i = 0; i < TAMANOS.length; i++) {
            int n = TAMANOS[i];
            tiemposFactRecu[i] = Medidor.medir(() -> Factorial.factorialRecursivo(n));
            imprimirFila("Factorial", "recursivo", n, ETIQUETAS[i], tiemposFactRecu[i]);
        }
        System.out.println(LINEA);

        imprimirComparacion("ALGORITMO FACTORIAL COMPARACION (ITERATIVO VS RECURSIVO)", TAMANOS,
                tiemposFactIter, tiemposFactRecu);

        // ── FIBONACCI ──
        double[] tiemposFibIter = new double[TAMANOS.length];
        double[] tiemposFibRecu = new double[TAMANOS.length];

        imprimirEncabezadoSeccion("FIBONACCI ITERATIVO [O(n)]");
        for (int i = 0; i < TAMANOS.length; i++) {
            int n = TAMANOS[i];
            tiemposFibIter[i] = Medidor.medir(() -> Fibonacci.fibonacciIterativo(n));
            imprimirFila("Fibonacci", "iterativo", n, ETIQUETAS[i], tiemposFibIter[i]);
        }
        System.out.println(LINEA);

        imprimirEncabezadoSeccion("FIBONACCI RECURSIVO [O(2^n)]");
        for (int i = 0; i < TAMANOS.length; i++) {
            int n = TAMANOS[i];
            tiemposFibRecu[i] = Medidor.medir(() -> Fibonacci.fibonacciRecursivo(n));
            imprimirFila("Fibonacci", "recursivo", n, ETIQUETAS[i], tiemposFibRecu[i]);
        }
        System.out.println(LINEA);

        imprimirComparacion("ALGORITMO FIBONACCI COMPARACION (ITERATIVO VS RECURSIVO)", TAMANOS,
                tiemposFibIter, tiemposFibRecu);

        // ── BUSQUEDA LINEAL ──
        double[] tiemposBusIter = new double[TAMANOS_BUSQUEDA.length];
        double[] tiemposBusRecu = new double[TAMANOS_BUSQUEDA.length];

        imprimirEncabezadoSeccion("BUSQUEDA LINEAL ITERATIVA [O(n)]");
        for (int i = 0; i < TAMANOS_BUSQUEDA.length; i++) {
            int n = TAMANOS_BUSQUEDA[i];
            int[] arr = GeneradorDatos.generarArreglo(n);
            int objetivo = arr[n - 1]; // buscar el último elemento (peor caso)
            tiemposBusIter[i] = Medidor.medir(() -> BusquedaLineal.busquedaLinealIterativa(arr, objetivo));
            imprimirFila("Busqueda Lineal", "iterativo", n, ETIQUETAS_BUSQUEDA[i], tiemposBusIter[i]);
        }
        System.out.println(LINEA);

        imprimirEncabezadoSeccion("BUSQUEDA LINEAL RECURSIVA [O(n)]");
        for (int i = 0; i < TAMANOS_BUSQUEDA.length; i++) {
            int n = TAMANOS_BUSQUEDA[i];
            int[] arr = GeneradorDatos.generarArreglo(n);
            int objetivo = arr[n - 1]; // buscar el último elemento (peor caso)
            tiemposBusRecu[i] = Medidor.medir(() -> BusquedaLineal.busquedaLinealRecursiva(arr, objetivo, 0));
            imprimirFila("Busqueda Lineal", "recursivo", n, ETIQUETAS_BUSQUEDA[i], tiemposBusRecu[i]);
        }
        System.out.println(LINEA);

        imprimirComparacion("ALGORITMO BUSQUEDA LINEAL COMPARACION (ITERATIVO VS RECURSIVO)", TAMANOS_BUSQUEDA,
                tiemposBusIter, tiemposBusRecu);

        // ── ORDENAMIENTO BURBUJA ──
        double[] tiemposOrdIter = new double[TAMANOS_BUSQUEDA.length];
        double[] tiemposOrdRecu = new double[TAMANOS_BUSQUEDA.length];

        imprimirEncabezadoSeccion("ORDENAMIENTO BURBUJA ITERATIVO [O(n^2)]");
        for (int i = 0; i < TAMANOS_BUSQUEDA.length; i++) {
            int n = TAMANOS_BUSQUEDA[i];
            int[] arrBase = GeneradorDatos.generarArreglo(n);
            int[] arrCopia = GeneradorDatos.copiarArreglo(arrBase);
            tiemposOrdIter[i] = Medidor.medir(() -> OrdenamientoBurbuja.burbujaIterativo(arrCopia));
            imprimirFila("Ordenamiento Burbuja", "iterativo", n, ETIQUETAS_BUSQUEDA[i], tiemposOrdIter[i]);
        }
        System.out.println(LINEA);

        imprimirEncabezadoSeccion("ORDENAMIENTO BURBUJA RECURSIVO [O(n^2)]");
        for (int i = 0; i < TAMANOS_BUSQUEDA.length; i++) {
            int n = TAMANOS_BUSQUEDA[i];
            int[] arrBase = GeneradorDatos.generarArreglo(n);
            int[] arrCopia = GeneradorDatos.copiarArreglo(arrBase);
            tiemposOrdRecu[i] = Medidor.medir(() -> OrdenamientoBurbuja.burbujaRecursivo(arrCopia, arrCopia.length));
            imprimirFila("Ordenamiento Burbuja", "recursivo", n, ETIQUETAS_BUSQUEDA[i], tiemposOrdRecu[i]);
        }
        System.out.println(LINEA);

        imprimirComparacion("ALGORITMO ORDENAMIENTO BURBUJA COMPARACION (ITERATIVO VS RECURSIVO)", TAMANOS_BUSQUEDA,
                tiemposOrdIter, tiemposOrdRecu);
    }

    // ── Métodos auxiliares de impresión ──

    private static void imprimirEncabezadoSeccion(String titulo) {
        System.out.println(titulo);
        System.out.println(LINEA);
        System.out.printf("%-36s| %-24s| %-21s| %-24s| %-14s%n",
                "Algoritmo", "Versión", "n", "tamaño", "tiempo (ms)");
        System.out.println(LINEA);
    }

    private static void imprimirFila(String algoritmo, String version, int n, String tamano, double tiempoMs) {
        System.out.printf("%-36s| %-24s| n = %-17d| %-24s| %.6f ms%n",
                algoritmo, version, n, tamano, tiempoMs);
    }

    private static void imprimirComparacion(String titulo, int[] tamanos, double[] iterativos, double[] recursivos) {
        System.out.println(titulo);
        System.out.println(LINEA);
        System.out.printf("%-36s| %-24s| %-21s| %-24s| %-14s%n",
                "n", "iterativo", "recursivo", "comparacion", "velocidad");
        System.out.println(LINEA);

        for (int i = 0; i < tamanos.length; i++) {
            double iter = iterativos[i];
            double recu = recursivos[i];
            double ratio = (iter != 0) ? recu / iter : 0;
            String masLento = (iter < recu) ? "más lento" : "más rápido";

            String iterStr = String.format("%.6f ms", iter);
            String recuStr = String.format("%.6f ms", recu);
            System.out.printf("n = %-32d| %-24s| %-21s| %-24.1f| %s%n",
                    tamanos[i], iterStr, recuStr, ratio, masLento);
        }
        System.out.println(LINEA);
    }
}
