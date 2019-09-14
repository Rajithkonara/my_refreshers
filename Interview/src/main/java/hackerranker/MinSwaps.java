package hackerranker;

/**
 * Created by rajith on 9/13/19.
 */
public class MinSwaps {

    static int minimumSwaps(int[] arr) {

        int n = arr.length - 1;
        int minSwaps = 0;

        for (int i = 0; i < n; i++) {
            if (i < arr[i] - 1) {   //  check the left hand for sorted
                swap(arr, i, Math.min(n, arr[i] - 1));
                minSwaps++;
                i--;
            }
        }
        return minSwaps;
    }


    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void printNums(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.err.print(input[i] + " ");
        }
        System.err.println("\n");
    }


    public static void main(String[] args) {
//        4 3 1 2

        int[] arr = {4, 3, 1, 2};
//        int[] arr = {1 ,2 ,4, 3};
        int x = minimumSwaps(arr);
        System.out.println(x);

    }

}
