package hackerranker;

/**
 * Created by rajith on 9/13/19.
 */
public class MinSwaps2 {


    static int minimumSwaps(int[] arr) {
        int swaps = 0;

        for(int current=0; current<arr.length; ) {
            if(!inPlace(arr, current)) {
                ++swaps;
                swapInPlace(arr, current);
            } else {
                ++current;
            }
        }

        return swaps;
    }

    private static void swapInPlace(int[] arr, int index) {
        int newIndex = arr[index] - 1;
        int tmp = arr[newIndex];
        arr[newIndex] = arr[index];
        arr[index] = tmp;
    }

    private static boolean inPlace(int[] arr, int index) {
        return arr[index] == index + 1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 2};
        int x = minimumSwaps(arr);

        System.out.println(x);
    }


}


