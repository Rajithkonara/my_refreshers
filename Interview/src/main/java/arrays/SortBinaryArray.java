package arrays;

/**
 * Created by rajith on 9/13/19.
 */
public class SortBinaryArray {

    static void sortB(int[] arr) {

        int j = -1;
        int length = arr.length;

        for (int x = 0; x < length; x++) {
            if (arr[x] < 1) {
                j++;
                swap(arr, x, j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] a = { 1, 0, 0, 1, 0, 1, 0, 1, 1, 1,
                1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0 };
        sortB(a);

        for (int anA : a) System.out.print(anA + " ");

    }
}
