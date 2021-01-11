package hackerranker.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Substrings {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
//
//        System.out.println(getSmallestAndLargest(s, k));

        String s = "welcomeToJava";
        int sub = 3;

        System.out.println(getsum(s, 3));

        List<String> words = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (sub != 14) {
                String substring = s.substring(i, sub);
                words.add(substring);
                sub++;
            }
        }

        //java 8 way
        //words.sort(Comparator.naturalOrder());

        String smallest = "";
        String largest = "";

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).compareTo(largest) > 0 ) {
                largest = words.get(i);
            }
            if (words.get(i).compareTo(largest) < 0) {
                smallest = words.get(i);
            }
        }


            System.out.println(smallest);
        System.out.println(largest);
//        words.forEach(System.out::println);






    }





    public static String getsum(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = ""     ;


        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }
}


