package hackerranker.java;

import java.util.Scanner;


class DataTypes {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32768) {
                    System.out.println("* short");
                }
                if (x >= Math.pow(-2, 31) && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Math.pow(-2, 63) && x <= (Math.pow(2, 63)-1)) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
