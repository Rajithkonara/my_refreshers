package hackerranker.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListProblem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s;
    ArrayList<ArrayList<String>> a = new ArrayList<>(n);

    for (int i = 0; i < n; i++) {
      s = sc.nextLine();
      a.add(i, new ArrayList<>(Arrays.asList(s.split("\\s"))));
    }

    System.out.println("done");

    int m = sc.nextInt();

    for (int j = 0; j < m; j++) {

      int x = sc.nextInt();
      int y = sc.nextInt();

      System.out.println(x  +" "+y);
      if (x <= a.size() && y < a.get(x - 1).size() && y >= 0) {
        System.out.println(a.get(x - 1).get(y));
      } else {
        System.out.println("ERROR!");
      }


    }


  }

}
