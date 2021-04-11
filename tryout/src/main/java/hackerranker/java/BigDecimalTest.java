package hackerranker.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalTest {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n + 2];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    sc.close();

    // custom comparator
    Comparator<String> comparator = (s1, s2) -> {
      BigDecimal a = new BigDecimal(s1);
      BigDecimal b = new BigDecimal(s2);
      return b.compareTo(a);
    };

    Arrays.sort(s, 0, n, comparator);

    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}

