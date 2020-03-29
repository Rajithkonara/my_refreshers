package sorting;

public class BubbleSort {

    private static void bsort(int[] arr) {
        boolean isSwapped;
        int length = arr.length;
        int k;
        for (int m = 0; m < length - 1; m++) {
            isSwapped = false;
            for (int i = 0; i < length - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    swap(i, k, arr);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
            printNums(arr);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printNums(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.err.print(input[i] + ", ");
        }
        System.err.println("\n");
    }

    public static void main(String[] args) {
//        int[] input = {4, 2, 2, 6, 23, 12, 34, 0, 1};
        int[] arr = {1, 2, 4, 3};
        bsort(arr);
    }
}
