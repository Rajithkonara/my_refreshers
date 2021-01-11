package failed;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedPairs {

    public static void main(String[] args) {

        String input = "aaxyyzhxa";

        char[] chars = input.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {

            Character character = input.charAt(i);

            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }

        }


        System.out.println(map);


        Character mostRepeated = ' ';
        int max = 0;

        for (Map.Entry<Character, Integer> key : map.entrySet()) {
            int currentValue = key.getValue();
            if (currentValue % 2 == 0) {
                max++;
            }

        }

        System.out.println(max);


    }


}
