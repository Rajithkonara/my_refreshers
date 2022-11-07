package alogacedemy;

public class SmallestK {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 6, 2, 1, 3, 2, 7, 5};

        int[] bsort = bsort(numbers);

        printNums(bsort);
    }


    private static int[] bsort(int[] arr) {
        int k;
        int length = arr.length;
        boolean isSwapped;
        for (int i = 0; i < length - 1; i++) {

            isSwapped = false;

            for (int j = 0; j < length - 1; j++) {
                k = j + 1;
                if (arr[j] > arr[k]) {
                    swap(j, k, arr);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
        return arr;
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

}
