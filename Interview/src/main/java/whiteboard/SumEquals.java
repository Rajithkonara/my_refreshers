package whiteboard;

public class SumEquals {


    static boolean returnSum(int[] arr, int ans) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == ans) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return true;
                }
            }

        }
        return false;
    }


    static boolean hasPairWithSum(int[] arr, int ans) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int x = arr[low] + arr[high];
            if (x == ans) {
                System.out.println(low  +" " + high);
                return true;
            } else if (x < ans) {
                low++;
            } else {
                high--;
            }
        }

        return false;
    }




    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4};
//        int[] arr = {1, 2, 3, 9};

        int answer = 8;

//        System.out.println(returnSum(arr, answer));

        System.out.println(hasPairWithSum(arr, answer));

    }

}
