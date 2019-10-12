import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {

        String sentence = "My name is My ident or or" ;

        countWords(sentence);

    }


    static int countWords(String sentence) {

        String[] splitted = sentence.split(" ");

        HashMap<Integer, String> map = new HashMap<>();

        for (int i =0; i < splitted.length; i++) {
            map.put(i, splitted[i]);
        }

        int count = 0;

        HashMap<String, Integer> newMap = new HashMap<>();


        for (int i = 0; i < splitted.length; i++) {

            String currentVal = splitted[i];

            if (newMap.containsKey(currentVal)) {
                newMap.put(currentVal, newMap.get(currentVal) + 1);
            } else {
                newMap.put(currentVal, 1);
            }

        }

        System.out.println(newMap);


        String rWord = "";
        int max = 0;

        for (Map.Entry<String, Integer> vales: newMap.entrySet()) {
            int currentVal = vales.getValue();
            if (currentVal >  max) {
                rWord =  vales.getKey();
                max = currentVal;
            }
        }

        System.out.println("max word : "+ rWord + " repeated " + max + " times");


        return 0;

    }


}
