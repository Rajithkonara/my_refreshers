package hackerranker.java;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeuProblemArray {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int[] arr = new int[100000001];

    int n = in.nextInt();
    int m = in.nextInt();

    int max = Integer.MIN_VALUE;
    int currentUnique = 0;

    for (int i = 0; i < n; i++) {

      if (i >= m) {
        int old = deque.removeLast();
        if (arr[old] >= 1) {

          arr[old]--;

          if (arr[old] == 0) {
            currentUnique--;
          }

        }
      }

      int num = in.nextInt();

      deque.addFirst(num);

      if (arr[num] == 0) {
        currentUnique++;
        if (currentUnique == m) {
          System.out.println(currentUnique);
          return;
        }
        max = Math.max(max, currentUnique);
      }
      arr[num] = arr[num] + 1;

    }
    System.out.println(max);
  }


}
