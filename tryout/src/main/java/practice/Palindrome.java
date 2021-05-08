package practice;

import java.util.Scanner;

public class Palindrome {

  public static void main(String args[]) {
    String original, reverse = ""; // Objects of String class
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to check if it is a palindrome");
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1; i >= 0; i--) {
      reverse = reverse + original.charAt(i);
    }

    if (reverse.equals(original)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not");
    }


  }
}