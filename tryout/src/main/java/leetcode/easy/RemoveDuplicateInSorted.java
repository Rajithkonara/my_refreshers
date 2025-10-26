package leetcode.easy;

public class RemoveDuplicateInSorted {

    public static int removeDub(int[] input) {

        if (input.length == 0) {
            return 0;
        }

        int x = 0; //slow points

        for (int y = 1; y < input.length; y++) { //fast pointer
            if (input[y] != input[x]) {
                x++; // only increment when condition is met
                input[x] = input[y];
            }

        }
        return x+1;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,5,5};
        System.out.println(arr.length);
        System.out.println(removeDub(arr));

    }

}
