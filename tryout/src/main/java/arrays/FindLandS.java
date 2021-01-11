package arrays;

public class FindLandS {

    public static void main(String[] args) {

        int[] arr = {12, 23, 1, 123, 2, 400, 10};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println(largest);
        System.out.println(smallest);

        System.out.println("from the method " + findLargest(arr));

    }


    static int findLargest(int[] arr) {

        int largest = 0;

        for (int num : arr) {
            if (largest < num) {
                largest = num;
            }
        }

        return largest;
    }

}
