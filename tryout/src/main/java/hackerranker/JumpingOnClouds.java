package hackerranker;

import java.util.Scanner;

public class JumpingOnClouds {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        int jumps = -1;

        for (int i = 0; i < n; i++, jumps++) {
            if (i < n - 2 && c[i + 2] == 0) i++;
        }

        System.out.println(jumps);

    }

}
