import java.util.*;
import java.io.*;

class LargestWord {

  public static String LongestWord(String sen) {
    // code goes here

    String[] words = sen.split("[^\\w]");
    String maxWord = "";

    for (String word: words) {

      if (word.length() > maxWord.length()) {
        maxWord = word;
      }

    }


    return maxWord;
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine()));
  }

}