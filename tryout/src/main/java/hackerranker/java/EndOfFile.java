package hackerranker.java;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = 1;
        while (sc.hasNext()) {
            String x = sc.nextLine();
            System.out.print(y + " ");
            System.out.println(x);
            ++y;
        }

    }

}
