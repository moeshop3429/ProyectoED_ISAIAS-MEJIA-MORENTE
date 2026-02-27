# Proyecto Estructura de Datos — Factorial, Fibonacci, Busqueda Lineal y Ordenamiento Burbuja.
**Universidad Da Vinci de Guatemala**
Ing. Brandon Chitay


## Estructura del proyecto

```
ProyectoED_IsaiasMejiaMorente/
├── src/
│   ├── algorithms/
│   │   └── Factorial.java
│   │   └── Fibonacci.java
│   │   └── BusquedaLineal.java
│   │   └── OrdenamientoBurbuja.java
│   ├── benchmark/
│   │   ├── Medidor.java           
│   │   └── Main.java
│   ├── utils/    
│   │   └── GeneradorDatos.java                      
└── README.md
```
## tareas
generame los algoritmos de factorial, fibonacci, busqueda lineal y ordenamiento burbuja, cada uno de estos debes generarlos tanto de forma
recursiva como iterativa, ademas de generarles un benchmark para medir su rendimiento la estructura que debes seguir está en el README.md afjunto arriba.
## contexto
implementación de los algoritmos, el algoritmo de factorial lo debes de generar de forma iterativa y recursiva, este debe de ir en "src/algorithms/Factorial.java", el algoritmo de fibonacci lo debes de generar de forma iterativa y recursiva, este debe de ir en "src/algorithms/Fibonacci.java", el algoritmo de busqueda lineal lo debes de generar de forma iterativa y recursiva, este debe de ir en "src/algorithms/BusquedaLineal.java", el algoritmo de ordenamiento burbuja lo debes de generar de forma iterativa y recursiva, este debe de ir en "src/algorithms/OrdenamientoBurbuja.java"

#### Toda la información detallada, requisitos técnicos y rúbrica están en el documento adjunto.


```md


| 1. Implementación de algoritmos     | Descripción                                                            |
|------------------------------------ |------------------------------------------------------------------------|
| A1 Factorial iterativo              | implementación correcta usando un ciclo                                | 
| A2 Factorial recursivo              | caso base correcto, llamada recursiva bien definida.                   | 
| A3 Fibonacci iterativo              | calcula el n-esimo término del ciclo, sun repetir calculos.            |
| A4 Fibonacci recursivo              | calcula el n-esimo término término recursivamente (sin memorización).  |
| A5 BusquedaLineal iterativo         | recorre el arreglo secuencialmente y retorna el índice correcto.       |
| A6 BusquedaLineal recursivo         | busca recursivamente reduciendo el subproblema en cada llamada.        |
| A7 OrdenamientoBurbuja iterativo    | Ordena correctamente con ciclos anidados                               |
| A8 OrdenamientoBurbuja recursivo    | versión recursica del ordenamiento burbuja que ordena correctamente    |
|------------------------------------ |------------------------------------------------------------------------|
| 2. Medición de tiempos              | Usa System.nanoTime(), para medir el tiempo de ejecución de los        |
|                                     | algoritmos en milisegundos                                             |
|                                     |                                                                        |
|------------------------------------ |------------------------------------------------------------------------|



```

#### Reglas

1. Usa System.nanoTime(), NO System.currentTimeMillis() (mayor precision).
2. No incluyas la inicializacion de datos dentro del bloque medido; solo mide el algoritmo puro.
3. Para Fibonacci y Factorial limita n a 30 en recursivo para no esperar tiempos exagerados.
4. Para la busqueda lineal y de ordenamiento de burbuja limita n a 10000

#### tamaños de datos factorial y fibonacci
```
| n = 5              | n = 10              | n = 15                  | n = 20                  | n = 25             | n = 30             |
|--------------------|---------------------|-------------------------|-------------------------|------------------- |------------------- |
| muy pequeño        | pequeño             | pequeño - mediano       | mediano                 | Grande             | Muy Grande         |
|--------------------|---------------------|-------------------------|-------------------------|------------------- |------------------- |
```
#### tanaños de datos para busqueda lineal y de ordenamiento de burbuja
```
| n = 100            | n = 500             | n = 1000                | n = 5000                | n = 10000          |
|--------------------|---------------------|-------------------------|-------------------------|------------------- |
| muy pequeño        | pequeño             | pequeño - mediano       | mediano                 | Grande             |
|--------------------|---------------------|-------------------------|-------------------------|------------------- |
```
    
#### Medicion de Tiempo
Usa este patron exacto en Java para medir cada algoritmo:    
```
long inicio = System.nanoTime();
// --- llamada al algoritmo ---
long fin = System.nanoTime();
long durNanos = fin - inicio;
double durMs = durNanos / 1_000_000.0;
```
## formato

yo espero por consola el siguiente resultado...
(las mediciones de tiempo en mílisegundos proporcionadas son solo ejemplos, no son reales, ya que varian segun el computador)

```
====================================================================================================================================  
  ESTRUCTURA DE DATOS I
  Universidad Da Vinci de Guatemala
  Tutor:ing. Brandon Chitay
  Estudiante: Isaias Mejia Morente
  Carne: 202503928
  Fecha: 26/02/2026
-------------------------------------------------------------------------------------------------------------------------------------
FACTORIAL ITERATIVO [O(n)]
-------------------------------------------------------------------------------------------------------------------------------------
Algoritmo                           | Versión                 | n                    | tamaño                  | tiempo (ms)   
-------------------------------------------------------------------------------------------------------------------------------------
Factorial                           | iterativo               | n = 5                | muy pequeño             | 0.000342 ms
Factorial                           | iterativo               | n = 10               | pequeño                 | 0.000192 ms 
Factorial                           | iterativo               | n = 15               | pequeño - mediano       | 
Factorial                           | iterativo               | n = 20               | mediano                 |
Factorial                           | iterativo               | n = 25               | grande                  |
Factorial                           | iterativo               | n = 30               | muy grande              |
-------------------------------------------------------------------------------------------------------------------------------------
FACTORIAL RECURSIVO [O(n)]
-------------------------------------------------------------------------------------------------------------------------------------
Algoritmo                           | Versión                 | n                    | tamaño                  | tiempo (ms)   
-------------------------------------------------------------------------------------------------------------------------------------
Factorial                           | recursivo               | n = 5                | muy pequeño             | 0.000579 ms
Factorial                           | recursivo               | n = 10               | pequeño                 | 0.000289 ms
Factorial                           | recursivo               | n = 15               | pequeño - mediano       | 
Factorial                           | recursivo               | n = 20               | mediano                 |
Factorial                           | recursivo               | n = 25               | grande                  |
Factorial                           | recursivo               | n = 30               | muy grande              |
-------------------------------------------------------------------------------------------------------------------------------------
ALGORITMO FACTORIAL COMPARACION (ITERATIVO VS RECURSIVO)
-------------------------------------------------------------------------------------------------------------------------------------
n                                   | iterativo               | recursivo            | comparacion             | velocidad   
-------------------------------------------------------------------------------------------------------------------------------------
n = 5                               | 0.000342 ms             | 0.000579 ms          | 0.1                     | más lento
n = 10                              | 0.000192 ms             | 0.000289 ms          | 0.2                     | más rápido
n = 15                              |                         |                      |                         | 
n = 20                              |                         |                      |                         |
n = 25                              |                         |                      |                         |
n = 30                              |                         |                      |                         |
-------------------------------------------------------------------------------------------------------------------------------------
FIBONACCI ITERATIVO [O(n)]
-------------------------------------------------------------------------------------------------------------------------------------
Algoritmo                           | Versión                 | n                    | tamaño                  | tiempo (ms)   
-------------------------------------------------------------------------------------------------------------------------------------
Fibonacci                           | iterativo               | n = 5                | muy pequeño             | 
Fibonacci                           | iterativo               | n = 10               | pequeño                 | 
Fibonacci                           | iterativo               | n = 15               | pequeño - mediano       | 
Fibonacci                           | iterativo               | n = 20               | mediano                 |
Fibonacci                           | iterativo               | n = 25               | grande                  |
Fibonacci                           | iterativo               | n = 30               | muy grande              |
-------------------------------------------------------------------------------------------------------------------------------------
FIBONACCI RECURSIVO [O(2^n)]
------------------------------------------------------------------------------------------------------------------------------------
Algoritmo                           | Versión                 | n                    | tamaño                  | tiempo (ms)   
------------------------------------------------------------------------------------------------------------------------------------
Fibonacci                           | recursivo               | n = 5                | muy pequeño             | 
Fibonacci                           | recursivo               | n = 10               | pequeño                 | 
Fibonacci                           | recursivo               | n = 15               | pequeño - mediano       | 
Fibonacci                           | recursivo               | n = 20               | mediano                 |
Fibonacci                           | recursivo               | n = 25               | grande                  |
Fibonacci                           | recursivo               | n = 30               | muy grande              |
------------------------------------------------------------------------------------------------------------------------------------
ALGORITMO FIBONACCI COMPARACION (ITERATIVO VS RECURSIVO)
------------------------------------------------------------------------------------------------------------------------------------
n                                   | iterativo               | recursivo            | comparacion             | velocidad   
------------------------------------------------------------------------------------------------------------------------------------
n = 5                               |                         |                      |                         | 
n = 10                              |                         |                      |                         | 
n = 15                              |                         |                      |                         | 
n = 20                              |                         |                      |                         |
n = 25                              |                         |                      |                         |
n = 30                              |                         |                      |                         |
------------------------------------------------------------------------------------------------------------------------------------
BUSQUEDA LINEAL ITERATIVA [O(n)]
------------------------------------------------------------------------------------------------------------------------------------
Algoritmo                           | Versión                 | n                    | tamaño                  | tiempo (ms)   
------------------------------------------------------------------------------------------------------------------------------------
Busqueda Lineal                     | iterativo               | n = 100              | muy pequeño             | 
Busqueda Lineal                     | iterativo               | n = 500              | pequeño                 | 
Busqueda Lineal                     | iterativo               | n = 1000             | pequeño - mediano       | 
Busqueda Lineal                     | iterativo               | n = 5000             | mediano                 | 
Busqueda Lineal                     | iterativo               | n = 10000            | grande                  |
-----------------------------------------------------------------------------------------------------------------------------------
BUSQUEDA LINEAL RECURSIVA [O(n)]
-----------------------------------------------------------------------------------------------------------------------------------
Algoritmo                           | Versión                 | n                    | tamaño                  | tiempo (ms)   
-----------------------------------------------------------------------------------------------------------------------------------
Busqueda Lineal                     | recursivo               | n = 100              | muy pequeño             | 
Busqueda Lineal                     | recursivo               | n = 500              | pequeño                 | 
Busqueda Lineal                     | recursivo               | n = 1000             | pequeño - mediano       | 
Busqueda Lineal                     | recursivo               | n = 5000             | mediano                 |
Busqueda Lineal                     | recursivo               | n = 10000            | grande                  |
-----------------------------------------------------------------------------------------------------------------------------------
ALGORITMO BUSQUEDA LINEAL COMPARACION (ITERATIVO VS RECURSIVO)
-----------------------------------------------------------------------------------------------------------------------------------
n                                  | iterativo                | recursivo            | comparacion             | velocidad   
-----------------------------------------------------------------------------------------------------------------------------------
n = 100                            |                          |                      |                         | 
n = 500                            |                          |                      |                         | 
n = 1000                           |                          |                      |                         | 
n = 5000                           |                          |                      |                         |
n = 10000                          |                          |                      |                         |
----------------------------------------------------------------------------------------------------------------------------------
ORDENAMIENTO BURBUJA ITERATIVO [O(n^2)]
----------------------------------------------------------------------------------------------------------------------------------
Algoritmo                         | Versión                   | n                    | tamaño                  | tiempo (ms)   
----------------------------------------------------------------------------------------------------------------------------------
Ordenamiento Burbuja              | iterativo                 | n = 100              | muy pequeño             | 
Ordenamiento Burbuja              | iterativo                 | n = 500              | pequeño                 | 
Ordenamiento Burbuja              | iterativo                 | n = 1000             | pequeño - mediano       | 
Ordenamiento Burbuja              | iterativo                 | n = 5000             | mediano                 |
Ordenamiento Burbuja              | iterativo                 | n = 10000            | grande                  |
----------------------------------------------------------------------------------------------------------------------------------
ORDENAMIENTO BURBUJA RECURSIVO [O(n^2)]
----------------------------------------------------------------------------------------------------------------------------------
Algoritmo                         | Versión                   | n                    | tamaño                  | tiempo (ms)   
----------------------------------------------------------------------------------------------------------------------------------
Ordenamiento Burbuja              | recursivo                 | n = 100              | muy pequeño             | 
Ordenamiento Burbuja              | recursivo                 | n = 500              | pequeño                 | 
Ordenamiento Burbuja              | recursivo                 | n = 1000             | pequeño - mediano       | 
Ordenamiento Burbuja              | recursivo                 | n = 5000             | mediano                 |
Ordenamiento Burbuja              | recursivo                 | n = 10000            | grande                  |
----------------------------------------------------------------------------------------------------------------------------------
ALGORITMO ORDENAMIENTO BURBUJA COMPARACION (ITERATIVO VS RECURSIVO)
----------------------------------------------------------------------------------------------------------------------------------
n                                 | iterativo                 | recursivo            | comparacion             | velocidad   
----------------------------------------------------------------------------------------------------------------------------------
n = 100                           |                           |                      |                         | 
n = 500                           |                           |                      |                         | 
n = 1000                          |                           |                      |                         | 
n = 5000                          |                           |                      |                         |
n = 10000                         |                           |                      |                         |
----------------------------------------------------------------------------------------------------------------------------------

```