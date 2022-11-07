package practice;

import java.util.Scanner;

public class Palindrome {

  public static void main(String args[]) {
    String original;  // Objects of String class

    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to check if it is a palindrome");
    original = in.nextLine();

    int length = original.length();

    StringBuilder reverse = new StringBuilder();
    for (int i = length - 1; i >= 0; i--) {
      reverse.append(original.charAt(i));
    }

    if (reverse.toString().equals(original)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not");
    }


  }
}