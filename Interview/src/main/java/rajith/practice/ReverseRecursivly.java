package rajith.practice;

/**
 * Created by rajith on 10/11/18.
 */
public class ReverseRecursivly {

    String reverse = "";

    public String reverseString(String str) {

        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1)
                    +reverseString(str.substring(0, str.length()-1));
            return reverse;
        }
    }

    public static void main(String[] args) {
        ReverseRecursivly recursivly = new ReverseRecursivly();
        System.out.println("Result: "+recursivly.reverseString("tesT"));
        String t = "tesT";
        System.out.println(t.substring(0, t.length()-1));
    }
}
