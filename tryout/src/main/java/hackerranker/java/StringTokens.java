package hackerranker.java;

import java.util.Scanner;

public class StringTokens {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();

    if (s.trim().length() == 0 || s.trim().length() > 400000) {
      System.out.println(0);
      return;
    }
    String[] split = s.trim().split("[ !,?.\\\\_'@]+");

    System.out.println(split.length);

    for (String cha : split) {
      System.out.println(cha);
    }
    scanner.close();
  }
}
