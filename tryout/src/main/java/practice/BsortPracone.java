package practice;

public class BsortPracone {

    static void bsort(int[] arr) {

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
            printNumbs(arr);
        }
    }

    static void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printNumbs(int[] input) {
        for (int x = 0; x < input.length; x++) {
            System.err.print(input[x] + ", ");
        }
        System.err.println("\n");
    }

    public static void main(String[] args) {
        int[] input = {4, 2, 2, 6, 23, 12, 34, 0, 1};
        bsort(input);
    }

}
