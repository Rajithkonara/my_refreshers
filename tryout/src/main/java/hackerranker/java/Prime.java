package hackerranker.java;

import java.util.Scanner;

public class Prime {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String n = scanner.nextLine();

    int i = Integer.parseInt(n);

    if (i != 1 && i < 100 && i % 2 == 1) {
      System.out.println("prime");
    }

    scanner.close();
  }
}
