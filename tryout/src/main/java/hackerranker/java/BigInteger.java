package hackerranker.java;

import java.util.Scanner;

public class BigInteger {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String a = scanner.next();
    String b = scanner.next();

    java.math.BigInteger sum = new java.math.BigInteger(a);

    java.math.BigInteger bigInteger = new java.math.BigInteger(b);

    java.math.BigInteger add = sum.add(bigInteger);

    java.math.BigInteger multiply = sum.multiply(bigInteger);

    System.out.println(add);

    System.out.println(multiply);

  }

}
