package strings;

/**
 * Given a sentence return the largest word
 */
public class ReturnLargeWordP {

    public static String getLargestWord(String sentence) {

        String[] words = sentence.split(" ");

        int max = 0;
        String word = "";

        for (String w : words) {

            if (w.length() > max) {
                max = w.length();
                word = w;
            }
        }

        return word;
    }

    public static void main(String[] args) {
        String sentence = "Now world is suffering from covid19";
        System.out.println(getLargestWord(sentence));

    }

}
