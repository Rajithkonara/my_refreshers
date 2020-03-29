package recursion;

public class ReverseString {

    public static void main(String[] args) {

        String word = "rajith";

        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }

        System.out.println(rev);

        System.out.println(recReverse("toot"));
    }

    static String reverse = "";

    public static String recReverse(String word) {

        if (word.length() == 1) {
            return word;
        } else {
            reverse = reverse + word.charAt(word.length() - 1) + recReverse(word.substring(0, word.length() - 1));
            return reverse;
        }

    }

}
