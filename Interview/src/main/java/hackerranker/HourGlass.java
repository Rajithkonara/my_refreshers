package hackerranker;

public class HourGlass {

    private static int hourglassSum(int[][] arr) {

        int size = 5;
        int currentHourGlassSum = 0;
        int maxHourglassSum = Integer.MIN_VALUE;

        for (int i = 0; i < size - 2; i++) {

            for (int j = 0; j < size - 2; j++) {
                currentHourGlassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxHourglassSum = Math.max(maxHourglassSum, currentHourGlassSum);

            }

        }

        return maxHourglassSum;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Max hourglass sum " + hourglassSum(arr));

    }

}
