package arrays;

import java.util.Scanner;

public class NegativeSubArray {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // array size
    int size = scanner.nextInt();

    int[] arr = new int[size];
    //fill array

    //hold the negative value
    int count = 0;

    for (int x = 0; x < size; x++) {
      arr[x] = scanner.nextInt();
    }

    for (int x = 0; x < size; x++) {
      int sum = 0;

      for (int y = x; y < size; y++) {
        sum = arr[y] + sum;
        if (sum < 0) {
          count++;
        }
      }
    }

    System.out.println("Count: " + count);

  }
}
