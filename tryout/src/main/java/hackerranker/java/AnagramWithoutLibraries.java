package hackerranker.java;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramWithoutLibraries {

  static boolean isAnagram(String a, String b) {

    if (a.length() != b.length()) {
      return false;
    } else {
      String[] aa = bSort(a.toLowerCase().split(""));
      String[] bb = bSort(b.toLowerCase().split(""));
      return Arrays.equals(aa, bb);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }


  private static String[] bSort(String[] strings) {

    boolean isSwapped;
    int length = strings.length;
    int k;
    for (int i = 0; i < length - 1; i++) {
      isSwapped = false;

      for (int j = 0; j < length - 1; j++) {
        k = i + 1;

        if (strings[j].compareTo(strings[k]) > 0) {
          swap(j, k, strings);
          isSwapped = true;
        }
      }
      if (!isSwapped) {
        return strings;
      }
    }
    return strings;

  }

  private static void swap(int j, int k, String[] arr) {
    String temp;
    temp = arr[j];
    arr[j] = arr[k];
    arr[k] = temp;
  }
}


