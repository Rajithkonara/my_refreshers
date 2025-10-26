package leetcode.medium;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};

        int currentSum = arr[0];
        int maxSum =arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > (currentSum + arr[i])) {
                currentSum = arr[i];
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum ) {
                maxSum = currentSum;
            }
        }

        System.out.println(maxSum);

    }

}
