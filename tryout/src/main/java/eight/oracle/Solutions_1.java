package eight.oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solutions_1 {

  public static void main(String[] args) {
    exercise1();
  }


  /**
   * Exercise 1
   * <p>
   * Create a string that consists of the first letter of each word in the list of Strings
   * provided.
   */
  private static void exercise1() {
    List<String> list = Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    StringBuilder sb = new StringBuilder();

    list.forEach(character -> sb.append(character.charAt(0)));

    String result = sb.toString();
    System.out.println(result);

  }

  /**
   * Exercise 2
   * <p>
   * Remove the words that have odd lengths from the list.
   */
  private void exercise2() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    list.removeIf(word -> word.length() % 2 != 0);

    list.forEach(System.out::println);
  }

  /**
   * Exercise 3
   * <p>
   * Replace every word in the list with its upper case equivalent.
   */
  private void exercise3() {
    List<String> list = new ArrayList<>(Arrays.asList(
        "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

    list.replaceAll(String::toUpperCase);

  }


  /**
   * Exercise 4
   * <p>
   * Convert every key-value pair of the map into a string and append them all
   * into a single string, in iteration order.
   */
  private void exercise4() {
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);

    StringBuilder sb = new StringBuilder();
    map.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
  }



}
