package arrays;

public class MultiplyTwoMatrices {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8}, {9, 10}, {11, 12}};

        // result in two rows two columns
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int x = 0; x < 2; x++) {

                // this loop for the columns
                for (int y = 0; y < 3; y++) {
                    result[i][x] = result[i][x] + a[i][y] * b[y][x];
                }

                System.out.print(result[i][x] + " ");  //printing matrix element

            }

            System.out.println();
        }

    }

}
