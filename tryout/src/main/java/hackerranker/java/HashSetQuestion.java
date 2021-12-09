package hackerranker.java;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Hashset contains unique elements only , allows null values, non synchronized, no insertion order
 * more: https://www.javatpoint.com/java-hashset
 * How it works: https://javaconceptoftheday.com/how-hashset-works-internally-in-java/
 */
public class HashSetQuestion {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String[] pairLeft = new String[t];
    String[] pairRight = new String[t];

    for (int i = 0; i < t; i++) {
      pairLeft[i] = s.next();
      pairRight[i] = s.next();
    }

    HashSet<String> hashSet = new HashSet<>();

    for (int i = 0; i < t; i++) {
      hashSet.add(pairLeft[i] + " " + pairRight[i]);
      System.out.println(hashSet.size());
    }

      System.out.println(hashSet);
  }

}
