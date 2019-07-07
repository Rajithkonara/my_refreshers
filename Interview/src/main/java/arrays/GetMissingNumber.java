package arrays;

public class GetMissingNumber {


    static int getMissingNo(int[] arr, int size) {

        int totle;

        totle = (size+1) * (size+2)/2;

        for (int i = 0; i < size; i++) {
            totle = totle - arr[i];
        }
        return totle;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        int missing = getMissingNo(arr, 4);
        System.out.println(missing);

    }

}
