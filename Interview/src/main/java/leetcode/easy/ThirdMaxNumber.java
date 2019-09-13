package leetcode.easy;

public class ThirdMaxNumber {


    static int thirdMax(int[] nums) {

        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num: nums) {

            if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == null) {
            return max;
        }

        return thirdMax;
     }


    public static void main(String[] args) {

        int[] arr = {5, 2 ,2};
//        {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};

        System.out.println(thirdMax(arr));

    }


}
