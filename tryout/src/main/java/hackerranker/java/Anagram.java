package hackerranker.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

  static boolean isAnagram(String a, String b) {

    char[] aa = a.toLowerCase().toCharArray();
    char[] bb = b.toLowerCase().toCharArray();
    if (a.length() != b.length()) {
      return false;
    } else {
      java.util.Arrays.sort(aa);
      java.util.Arrays.sort(bb);
      return java.util.Arrays.equals(aa, bb);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();

    boolean ret = isAnagramMapSolution(a, b);

    System.out.println((ret) ? "Anagrams" : "Not Anagrams");

  }


  static boolean isAnagramMapSolution(String a, String b) {

    if (a.length() != b.length()) {
      return false;
    }

    a = a.toLowerCase();
    b = b.toLowerCase();

    Map<Character, Integer> comparingMap = new HashMap<>();

    for (int x = 0; x < b.length(); x++) {

      char letter = b.charAt(x);

      if (!comparingMap.containsKey(letter)) {
        comparingMap.put(letter, 1);
      } else {
        Integer times = comparingMap.get(letter);
        comparingMap.put(letter, ++times);
      }
    }

    for (int y = 0; y < a.length(); y++) {
      char letter = a.charAt(y);

      if (!comparingMap.containsKey(letter)) {
        return false;
      }

      Integer times = comparingMap.get(letter);

      if (times == 0) {
        return false;
      } else {
        comparingMap.put(letter, --times);
      }

    }
    return true;
  }

}
