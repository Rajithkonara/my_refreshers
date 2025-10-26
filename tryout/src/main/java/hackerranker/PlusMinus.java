package hackerranker;

import java.text.DecimalFormat;

public class PlusMinus {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,0,-1,-1};

        int positive =0;
        int negative = 0;
        int zero = 0;

        for (int i: arr) {

            if (i > 0) {
                positive+=1;
            }
            if (i < 0) {
                negative+=1;
            }
            if (i ==0) {
                zero+=1;
            }

        }

        double ratioP = 0;

        int arrLength = arr.length;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00000");


        ratioP = (double) positive/arrLength;

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
        System.out.println(decimalFormat.format(ratioP));



    }

}
