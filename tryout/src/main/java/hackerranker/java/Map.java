package hackerranker.java;

import java.util.HashMap;
import java.util.Scanner;


/**
 * Internally use hashtable impl, allow one null key and multiple null values , does not preserve the order
 * How: https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html#axzz6zwSqjXL1
 */
public class Map {

  public static void main(String[] args) {
    // n no of entries in the phone book
    // x - name
    // y - mobileNo

    java.util.Map<String, Integer> phoneBook = new HashMap<>();

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    in.nextLine();
    for (int i = 0; i < n; i++) {
      String name = in.nextLine();
      int phone = in.nextInt();
      phoneBook.put(name, phone);
      in.nextLine();
    }

    while (in.hasNext()) {
      String q = in.nextLine();

      if (phoneBook.containsKey(q)) {

        System.out.println(q + "=" + phoneBook.get(q));
      } else {
        System.out.println("Not found");
      }
    }

    in.close();
  }

}
