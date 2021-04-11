import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Have the function StringScramble(str1,str2) take both parameters being passed and return the
 * string true if a portion of str1 characters can be rearranged to match str2, otherwise return the
 * string false. For example: if str1 is "rkqodlw" and str2 is "world" the output should return
 * true. Punctuation and symbols will not be entered with the parameters. Examples Input: "cdore" &
 * str2= "coder" Output: true Input: "h3llko" & str2 = "hello" Output: false
 */

public class StringScrambler {

  public static String StringScramble(String str1, String str2) {
    // code goes here

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    List<Character> listA = new ArrayList<>();
    for(char c: arr1) {
      listA.add(c);
    }

    List<Character> listB = new ArrayList<>();
    for(char c: arr2) {
      listB.add(c);
    }

    boolean b = listA.containsAll(listB);

    if (b) {
      return "true";
    }

    return "false";

  }

  public static void main(String[] args) {

    // keep this function call here

    String s = StringScramble("h3llko", "hello");
    System.out.println(s);

  }
}
