package hackerranker;

import java.util.Scanner;

public class CountingValley {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("No of steps \n path");
        String s = scanner.next();

        int valley = 0;
        int curretLevel = 0;

        for (char c : s.toCharArray()) {
            if (c == 'U') ++curretLevel;
            if (c == 'D') --curretLevel;

            if (curretLevel == 0 && c == 'U') {
                ++valley;
            }
        }
        System.out.println(valley);

    }
}
