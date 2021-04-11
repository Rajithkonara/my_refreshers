public class Palindrome {

  public static String Palindrome(String str) {
    // code goes here

    String formattedString = str.replaceAll(" ", "");
    int lenght = formattedString.length();
    String testString = "";

    for (int i = lenght - 1; i >= 0; i--) {
      testString = testString + formattedString.charAt(i);
    }

    if (formattedString.equals(testString)) {
      return "true";
    }
    return "false";
  }


  public static void main(String[] args) {

    String never_odd_or_even = Palindrome("eye");

    System.out.println(never_odd_or_even);
  }


}
