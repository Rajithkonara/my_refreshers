package hackerranker;

public class NewYearChaos2 {

    private static void minimumBribes(int[] arr) {

        int size = arr.length;
        int count = 0;

        for (int x = size-1; x >= 0; x--) {

            if (arr[x] != (x + 1)) {

                if (((x - 1) >= 0) && arr[x - 1] == (x + 1)) {
                    count++;
                    swap(arr, x, x - 1);
                } else if (((x - 2) >= 0) && arr[x - 2] == (x + 1)) {
                    count += 2;
                    arr[x - 2] = arr[x - 1];
                    arr[x - 1] = arr[x];
                    arr[x] = x + 1;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(count);

    }



    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 3, 7, 8 ,4, 6};
        minimumBribes(arr);

    }

}
