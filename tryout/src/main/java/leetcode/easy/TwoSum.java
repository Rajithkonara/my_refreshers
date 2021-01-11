package leetcode.easy;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int x = i; x < nums.length; x++) {
                if (nums[i] == target - nums[x]) {
                    return new int[]{i, x};
                }
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] nums = {3, 7, 2, 15};
        int target = 9;

        int[] indexes = twoSum(nums, target);

        for (int x : indexes) {
            System.out.println(nums[x]);
        }


    }

}
