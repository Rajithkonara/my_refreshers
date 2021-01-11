import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWords {

    public static void main(String[] args) {

        String m = "My name is naura my logs in in sj, of whta?";

        System.out.println(findMostRepeatedString(m));

    }

    static String findMostRepeatedString(String s) {

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String lowercase = s.toLowerCase().trim();
        String[] words = lowercase.split("[ \\n\\t\\r.,:!?()]");

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (word.length() > 0) {
                if (wordCountMap.containsKey(word)) {

                    wordCountMap.put(word, wordCountMap.get(word) + 1);

                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }

        //find max
        int max = 0;
        String mostRepeatedString = "";

        for (Map.Entry<String, Integer> val : wordCountMap.entrySet()) {
            int currentVal = val.getValue();
            if (currentVal > max) {
                mostRepeatedString = val.getKey();
                max = currentVal;
            }
        }

        System.out.println(wordCountMap);

        System.out.println("Most Repeated word " + mostRepeatedString + "\nRepeated " + max + " times");

        return mostRepeatedString;

    }


}
