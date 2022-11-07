package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        List<String> anagrams = new ArrayList<>();
        anagrams.add("code");
        anagrams.add("doce");
        anagrams.add("ecod");
        anagrams.add("framer");
        anagrams.add("frame");

//        Collections.sort(anagrams);

        HashSet<String> hashSet = new HashSet<>();
        List<String> remaingin = new ArrayList<>();

        for (int i =0; i < anagrams.size(); i++) {

            String s = anagrams.get(i);
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);

            if (!hashSet.contains(sortedString)) {
                remaingin.add(anagrams.get(i));
                hashSet.add(sortedString);
            }
        }

        Collections.sort(remaingin);
        System.out.println(remaingin);
    }


    static boolean isAnagram(String a, String b) {

        char[] aa = a.toLowerCase().toCharArray();
        char[] bb = b.toLowerCase().toCharArray();
        if (a.length() != b.length()) {
            return false;
        } else {
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            return java.util.Arrays.equals(aa, bb);
        }
    }

}
