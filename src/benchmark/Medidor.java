package benchmark;

public class Medidor {

    /**
     * Mide el tiempo de ejecución de un Runnable usando System.nanoTime().
     * Retorna el tiempo en milisegundos (double).
     */
    public static double medir(Runnable algoritmo) {
        long inicio = System.nanoTime();
        algoritmo.run();
        long fin = System.nanoTime();
        long durNanos = fin - inicio;
        double durMs = durNanos / 1_000_000.0;
        return durMs;
    }
}
