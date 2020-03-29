package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicateTests {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 3, 3, 4, 6, 6, 5};

        for (int x : arr) {
            System.out.println("Before removing: " + x);
        }

        ArrayList<Integer> x = removeDuplicate(arr);
    }


    static ArrayList<Integer> removeDuplicate(int arr[]) {

        //result array
        int[] result = new int[arr.length];
        ArrayList<Integer> resultB = new ArrayList<>();

        int previous = arr[0];
        result[0] = previous;

        resultB.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int index = arr[i];

            if (previous != index) {
                result[i] = index;
                resultB.add(index);
            }

            previous = index;
//            System.out.println(Arrays.toString(result));

            System.out.println(resultB);
        }

        return resultB;
    }
}
