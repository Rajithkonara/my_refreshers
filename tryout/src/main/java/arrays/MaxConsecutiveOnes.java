package arrays;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 */
public class MaxConsecutiveOnes {

  public static int findMaxConsecutiveOnes(int[] nums) {

    int currentMax = 0;
    int count = 0;

    for (int num : nums) {
      if (num == 1) {
        count++;
      } else {
        currentMax = Math.max(currentMax, count);
        count = 0;
      }
    }

    currentMax = Math.max(currentMax, count);

    return currentMax;
  }

  public static void main(String[] args) {

    int[] arr = {1, 0, 0, 1, 1, 1, 1, 0, 1};
    System.out.println(findMaxConsecutiveOnes(arr));

  }

}
