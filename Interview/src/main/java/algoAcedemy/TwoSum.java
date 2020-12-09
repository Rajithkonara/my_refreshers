package algoAcedemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {


    static int[] twoSumPair(int[] array, int ans) {

        List<Integer> integers = new ArrayList<>();

        for (int value: array) {

            if (integers.contains(value)) {
                System.out.println(integers);
                return new int[]{integers.indexOf(value), integers.size() };
            }
            integers.add(ans - value);

        }

        return new int[]{};

    }

    static int[] twoSum(int[] array, int ans) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                if (array[i]+ array[j] == ans) {
                    System.out.println(array[i] +"  :  "+ array[j]);
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] num = new int[]{8, 7, 15, 2};

        int[] ints = twoSum(num, 9);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = twoSumPair(num, 9);
        System.out.println(Arrays.toString(ints1));

    }

}
