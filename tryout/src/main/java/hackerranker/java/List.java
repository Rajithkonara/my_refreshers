package hackerranker.java;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

  private static final String INSERT = "Insert";
  private static final String DELETE = "Delete";

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //get N - number of elements
    int n = scanner.nextInt();

    java.util.List<Integer> list = new ArrayList<>();
    // L get list elements
    for (int x = 0; x < n; x++) {
      list.add(scanner.nextInt());
    }

    // Q get no of queries
    int q = scanner.nextInt();

    for (int j = 0; j < q; j++) {

      String query = scanner.next();
      if (query.equals(INSERT)) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        list.add(x, y);
      } else if (query.equals(DELETE)) {
        int index = scanner.nextInt();
        list.remove(index);
      }

    }

    for (int i : list) {
      System.out.print(i + " ");
    }


  }

}
