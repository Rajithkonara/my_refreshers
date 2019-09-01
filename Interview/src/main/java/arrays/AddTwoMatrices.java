package arrays;

public class AddTwoMatrices {

    public static void main(String[] args) {

        //create two 2d arrays

        int x[][] = {{1, 3, 4}, {3, 4, 5}};
        int y[][] = {{1, 3, 4}, {3, 4, 5}};

        //array to hold the sum
        int sum[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = x[i][j] + y[i][j];
                System.out.print(sum[i][j]+" ");
            }

            System.out.println();
        }


    }

}
