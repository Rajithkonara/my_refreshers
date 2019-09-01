package arrays;

public class TwoD {

    public static void main(String[] args) {

        //declaring and initializing 2D array
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]+" ");
            }
//            System.out.println();
        }


        //jagged array array with odd number of columns

        int jagged[][] = new int[3][];

        //init the column size of each array
        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        //init adding data jagged array
        int count = 0;

        for (int i = 0; i < jagged.length; i++) {
            for (int x = 0; x < jagged[i].length; x++) {
                jagged[i][x] = count++;
            }
        }

        //print the 2d array

        for (int i = 0; i < jagged.length; i++) {
            for (int x = 0; x < jagged[i].length; x++) {
                System.out.print(jagged[i][x]+ " ");
            }

            System.out.println();
        }

    }

}
