package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MostRepeated {

    public static void main(String[] args) {

        String s = "phonebook";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) + 1);
            } else {
                map.put(currentChar, 1);
            }
        }


        Character mostRepeated = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> key : map.entrySet()) {
            int currentValue = key.getValue();
            if (currentValue > max) {
                mostRepeated = key.getKey();
                max = currentValue;
            }
        }

        System.out.println("Most Repeated " + mostRepeated + " times  " + max);

    }

}
