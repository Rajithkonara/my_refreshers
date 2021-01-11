package util;

import java.util.Scanner;

public class TwoDUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static void insertTo2d(int[][] arr, int rows, int columns) {

        rows = arr.length;
        columns = arr[0].length;

        for (int i = 0; i < rows; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < columns; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int rows = 6;
        int columns = 6;
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


            for (int j = 0; j < columns; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j].replace(" ", ","));
                arr[i][j] = arrItem;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        char[] items = null;
        int[][] arrr = new int[rows][columns];

        String[] inputString = {"1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0"};

        for (int i = 0; i < inputString.length; i++) {
            String[] rowItems = inputString;

            items = rowItems[i].toCharArray();
            System.out.println(items);

        }

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                int arrayItem = Integer.parseInt(String.valueOf(items[y]));
                arrr[x][y] = arrayItem;
                System.out.print(arrr[x][y] + " ");
            }
        }

//
//            for (int j = 0; j < columns; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();


    }


}
