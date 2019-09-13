package practice;

public class NewChaoticTest {

    private static void minimumBribes(int[] arr) {

        int swapped = 0;
        int size = arr.length;

        for (int x = size-1; x >= 0; x--) {
            if (arr[x] - (x+1) > 2) {
                    System.out.println("Too chaotic");
                return;
            }

         for (int j = Math.max(0, arr[x] - 2); j < x; j++) {
             if (arr[j] > arr[x]) {
                 swapped++;
             }
         }
        }

        System.out.println(swapped);

    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 3, 7, 8 ,4, 6};
        minimumBribes(arr);

    }

}
