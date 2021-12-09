package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class ArrayListOne {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // no of arrays
    int n = scanner.nextInt();

      List<List<Integer>> all = new ArrayList<>();

    for (int x = 0; x < n; x++) {

      int size = scanner.nextInt();
      List<Integer> list = new ArrayList<>();

      for (int y = 0; y < size; y++) {
        list.add(scanner.nextInt());
      }

      all.add(list);
    }

    System.out.println(all);

    //no of queries
    int q = scanner.nextInt();

    for (int k = 0; k < q; k++) {

      int x = scanner.nextInt();
      int y = scanner.nextInt();

      try {

        Integer integer = all.get(x - 1).get(y - 1);
        System.out.println(integer);

      } catch (IndexOutOfBoundsException e) {
        System.out.println("ERROR");
      }

    }

    scanner.close();
  }


}
