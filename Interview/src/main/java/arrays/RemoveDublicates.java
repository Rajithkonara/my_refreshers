package arrays;

import java.util.Arrays;

public class RemoveDublicates {

    public static void main(String[] args) {

        int[] input = {1, 1, 2, 2, 3, 4, 5};

        for (int x : input) {
            System.out.println("Array with duplicates : " + x);
        }

        //new array
        int[] result = new int[input.length];
        int prv = input[0];
        result[0] = prv;

        for (int i = 1; i < input.length; i++) {
            int index = input[i];

            if (prv != index) {
                result[i] = index;
            }
            prv = index;
            System.out.println(Arrays.toString(result));
        }

    }


}
