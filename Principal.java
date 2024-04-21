// Import statements
import java.util.Random; // Imports the Random class for generating random numbers
import java.math.BigInteger; // Imports the BigInteger class for handling large numbers

public class Principal {

  public static void main(String[] args) {
    // Generate random numbers
    int[] numeros = new int[5]; // Create an array to store 5 integers
    Random random = new Random(); // Create a Random object to generate random numbers

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = random.nextInt(10) + 1; // Fill the array with random numbers between 1 and 10
    }

    // Print the random numbers
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("numeros[" + i + "]: " + numeros[i]);
    }
  }

  // Calculate Fibonacci sequence (unused method)
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      int a = 0;
      int b = 1;
      int fib = 0;

      for (int i = 2; i <= n; i++) {
        fib = a + b;
        a = b;
        b = fib;
      }

      return fib;
    }
  }

  // Calculate factorial (unused method)
  public static BigInteger factorial(int n) {
    BigInteger fact = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      fact = fact.multiply(BigInteger.valueOf(i));
    }
    return fact;
  }

  // Check if a number is prime
  public static boolean esPrimo(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Test Fibonacci sequence with existing numbers (unused method)
  public static void main1(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5};
    int[] resultadoFibonacci = new int[numeros.length];

    for (int i = 0; i < numeros.length; i++) {
      resultadoFibonacci[i] = fibonacci(numeros[i]);
    }

    for (int i = 0; i < resultadoFibonacci.length; i++) {
      System.out.println("resultadoFibonacci[" + i + "]: " + resultadoFibonacci[i]);
    }
  }

  // Test factorial with existing numbers (unused method)
  public static void main2(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5};
    BigInteger[] resultadoFactorial = new BigInteger[numeros.length];

    for (int i = 0; i < numeros.length; i++) {
      resultadoFactorial[i] = factorial(numeros[i]);
    }

    for (int i = 0; i < resultadoFactorial.length; i++) {
      System.out.println("resultadoFactorial[" + i + "]: " + resultadoFactorial[i]);
    }
  }

  // Test prime numbers with existing numbers
  public static void main3(String[] args) {
    int[] numeros = {2, 3, 4, 5, 7};
    boolean[] resultadoPrimos = new boolean[numeros.length];

    for (int i = 0; i < numeros.length; i++) {
      resultadoPrimos[i] = esPrimo(numeros[i]);
    }

    for (int i = 0; i < resultadoPrimos.length; i++) {
      System.out.println("resultadoPrimos[" + i + "]: " + resultadoPrimos[i]);
    }
  }
}
