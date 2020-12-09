package hackerranker.java;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int a = A.length();
        int b = B.length();

        System.out.println(a + b);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1));
        System.out.println(B.substring(0, 1).toUpperCase() + B.substring(1));
    }

}