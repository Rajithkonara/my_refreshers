package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Test {

  public static void main(String[] args) {

    String input = "llzeetcode";

    System.out.println(getUniqueIndex(input));

  }

  private static int getUniqueIndex(String input) {

    Map<Character, Integer> characterIntegerMap = new HashMap<>();

    int length = input.length();

    for (int i = 0; i < length; i++) {

      char c = input.charAt(i);

      characterIntegerMap.put(c,
          characterIntegerMap.get(c) != null ? characterIntegerMap.get(c) + 1 : 1);

    }

    System.out.println(characterIntegerMap);

    for (int j = 0; j < length; j++) {
      if (characterIntegerMap.get(input.charAt(j)) == 1) {
        System.out.println(input.charAt(j));
        return j;
      }
    }
    return -1;


  }


}