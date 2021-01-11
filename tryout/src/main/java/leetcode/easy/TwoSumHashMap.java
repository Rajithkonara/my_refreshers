package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

    private static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // key value
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];

            if (map.containsKey(key) && map.get(key) != i) {
                return new int[]{i, map.get(key)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    private static int[] twoSumOneMap(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {
            int key = target - nums[x];

            if (map.containsKey(key) && map.get(key) != x) {
                return new int[]{x, map.get(key)};
            }

            map.put(nums[x], x);
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
