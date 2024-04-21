
/**
 * Esta clase abstracta `Algoritmos` define métodos estáticos para realizar cálculos matemáticos comunes.
 */
public abstract class Algoritmos {

  /**
   * Calcula el n-ésimo número de la secuencia de Fibonacci. 
   * 
   * La secuencia de Fibonacci es una secuencia de números enteros en la que cada número es la suma de los dos números anteriores, 
   * comenzando por 0 y 1. Por ejemplo, los primeros 10 números de Fibonacci son: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
   * 
   * @param numero El índice del número de Fibonacci que se desea calcular. Debe ser un número entero no negativo.
   * @return El n-ésimo número de Fibonacci.
   * @throws IllegalArgumentException Si el parámetro `numero` es negativo.
   */
  public static int fibonacci(int numero) {
    if (numero < 0) {
      throw new IllegalArgumentException("El número debe ser positivo");
    } else if (numero == 0) {
      return 0;
    } else if (numero == 1) {
      return 1;
    } else {
      return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
  }

  /**
   * Calcula el factorial de un número entero no negativo.
   * 
   * El factorial de un número es el producto de todos los números enteros positivos menores o iguales a ese número. 
   * Por ejemplo, el factorial de 5 es 5! = 5 * 4 * 3 * 2 * 1 = 120.
   * 
   * @param numero El número del que se desea calcular el factorial. Debe ser un número entero no negativo.
   * @return El factorial del número.
   * @throws IllegalArgumentException Si el parámetro `numero` es negativo.
   */
  public static long factorial(int numero) {
    if (numero < 0) {
      throw new IllegalArgumentException("El número debe ser positivo");
    } else if (numero == 0 || numero == 1) {
      return 1;
    } else {
      long resultado = 1;
      for (int i = 2; i <= numero; i++) {
        resultado *= i;
      }
      return resultado;
    }
  }

  /**
   * Determina si un número entero es primo.
   * 
   * Un número primo es un número natural mayor que 1 que tiene exactamente dos divisores positivos distintos: 1 y sí mismo. 
   * Por ejemplo, 2, 3, 5 y 7 son números primos, mientras que 4 (divisible por 1, 2 y 4) y 9 (divisible por 1, 3 y 9) no lo son.
   * 
   * @param numero El número del que se desea comprobar si es primo.
   * @return true si el número es primo, false en caso contrario.
   */
  public static boolean esPrimo(int numero) {
    if (numero < 2) {
      return false;
    }
    for (int i = 2; i * i <= numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }
}

