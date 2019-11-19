package strings;

public class ReturnLargeWord {

    public static String largestWord(String sentence) {

    String[] words = sentence.split(" ");

    int max = 0;
    String word = "";

    for (int i = 0; i < words.length; i++) {
        if (words[i].length() > max) {
            max = words[i].length();
            word = words[i];
        }
    }

    return word;

    }

    public static void main(String[] args) {

        String sentence = "I am waitingssssssssssss for the call patiently";

        System.out.println(largestWord(sentence));

    }



}
