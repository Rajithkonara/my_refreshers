package hackerranker.java;

public class SubStringComparison {

    public static void main(String[] args) {

        String s = "welcomeToJava";
        System.out.println(getSmallestAndLargest(s, 3));
    }





    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";


        int length = s.length();

        int subStringSize = (length - k);
        String[] words = new String[subStringSize+1];

        for (int i = 0; i <= length; i++) {
            if (k != length+1) {
                String subString = s.substring(i, k);
                words[i] = subString;
                k++;
            }
        }

        System.out.println(words.length);

        for (int x = 0; x < words.length; x++) {

            if (words[x].compareTo(largest) > 0) {
                largest = words[x];
            } else {
                smallest = words[x];
            }

        }


        return smallest + "\n" + largest;
    }
}
