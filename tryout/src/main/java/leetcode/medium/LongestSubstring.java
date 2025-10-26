package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        String[] input = {"a", "b", "c"};


        String str = "bbbbb";
        System.out.println(str.substring(0, 1));
        int n = str.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
                //
                if (allUnique(str, i, j)) {
                    // j-1 = length of current substring
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }

        System.out.println("max Lenth: " + maxLength);

    }

    private static boolean allUnique(String s, int start, int end) {
        HashSet<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char currentChar = s.charAt(i);
            if (set.contains(currentChar)) {
                return false;
            }
            set.add(currentChar);
        }
        return true;
    }


    private static int longestSub(String input) {


        return 0;
    }

}
