package practice;

public class Factorial {

  public static int factorial(int n) {

    if (n == 1) {
      return 1;
    } else {
      return (n * factorial(n - 1));
    }

  }

  static int fib(int n) {

    if (n <= 1) {
      return n;
    }

    return (fib(n-1) + fib(n-2));
  }

  public static void main(String[] args) {

    int[] fib = new int[5];
    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2 ; i < fib.length; i++) {
      fib[i] = fib[i-1] + fib[i-2];
    }

    for (int j = 0; j < fib.length; j++) {
      System.out.println(fib[j]);
    }


    int fact = 1;

    for (int i = 1; i <= 5; i++) {
      fact = fact * i;
    }
    System.out.println(fact);

    System.out.println(factorial(5));

  }

}
