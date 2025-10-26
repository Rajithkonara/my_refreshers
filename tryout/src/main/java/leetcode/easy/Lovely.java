package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lovely {

    public static void main(String[] args) {

        lov(100000,100000);
        lov(0,0);
        lov(1,111);

    }

    public static void lov(int a, int b) {
        int notLovely = 0;
        int lovely = 0;

        for (int i = a; i <= b; i++) {
            Map<Character, Integer> dic = new HashMap<>();
            char[] number = String.valueOf(i).toCharArray();
            boolean isLovely = true;

            for (char c: number) {
                dic.put(c, dic.getOrDefault(c, 0) + 1);

                if (dic.get(c) >= 3) {
                    notLovely++;
                    isLovely = false;
                    break;
                }
            }

            if (isLovely) {
                lovely++;
            }
        }


        System.out.println("Not lovely : "+ notLovely + " -" + " lovely " +lovely);

    }

}

