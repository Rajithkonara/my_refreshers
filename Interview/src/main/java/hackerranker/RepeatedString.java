package hackerranker;

public class RepeatedString {

    public static long repeatedString(String s, long n) {

    long countS = 0;
    long totalCount = 0;

    // count the 'a' in passed string
    for (int i = 0; i < s.length(); i++ ) {
        if (s.charAt(i) == 'a') {
            countS++;
        }
    }

    // how many substring for given number
    long subStringCount = n/s.length();

    totalCount = totalCount + subStringCount * countS;

    // remaining characters at the end of the substring
    long remainder = n % s.length();

    for (int x = 0; x < remainder; x++) {
        if (s.charAt(x) == 'a') {
            totalCount++;
        }
    }

    return totalCount;

    }

    public static void main(String[] args) {
        String a = "a";
        long n = 1000000000;
        System.out.println(repeatedString(a, n));
    }

}
