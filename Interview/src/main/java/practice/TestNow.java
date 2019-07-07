package practice;

public class TestNow {

    public static void main(String[] args) {

        int[] arr = {10, 2, 3, 6, 1};

        int max = arr[0];

        for (int x = 0; x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
            }
        }
        System.out.println(max);


    }

}
