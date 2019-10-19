package whiteboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SumEquals {


    static boolean returnSum(int[] arr, int ans) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == ans) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return true;
                }
            }

        }
        return false;
    }


    static boolean hasPairWithSum(int[] arr, int ans) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int x = arr[low] + arr[high];
            if (x == ans) {
                System.out.println(low  +" " + high);
                return true;
            } else if (x < ans) {
                low++;
            } else {
                high--;
            }
        }

        return false;
    }




    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 4};
        int[] arr2 = {1, 4, 4, 8};

        int answer = 8;

//        System.out.println(returnSum(arr2, answer));

        System.out.println(hasPairWithSum(arr, answer));

        System.out.println(haspair(arr, answer));
    }



    static boolean haspair(int[] arr, int ans) {
        HashSet<Integer> compl = new HashSet<>();

        List<Integer> c = new ArrayList<>();


        for (int value: arr) {
            if (c.contains(value)) {
                System.out.println(Arrays.toString(arr));
                return true;
            }
            c.add(ans - value);
        }
        return false;
    }

}
