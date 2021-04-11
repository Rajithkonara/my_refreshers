package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterIndex {

  public static void main(String[] args) {

    String input = "llzeetcode";

    int firstUniqueIndex = getFirstUniqueIndex(input);
    System.out.println(firstUniqueIndex);

  }

  private static int getFirstUniqueIndex(String input) {

    Map<Character, Integer> count = new HashMap<>();

    int length = input.length();

    for (int i = 0; i < length; i++) {

      char c = input.charAt(i);
      //
      //      count.getOrDefault(c, 0) + 1);
      count.put(c,  count.get(c) != null ? count.get(c)+1: 1);


    }

    System.out.println(count);


    for (int j = 0; j < length; j++) {
      if (count.get(input.charAt(j)) == 1) {
        return j;
      }
    }
    return -1;
  }

}
