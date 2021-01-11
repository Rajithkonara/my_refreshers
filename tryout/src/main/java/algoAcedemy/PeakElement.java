package algoAcedemy;

public class PeakElement {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 1, 3, 5, 6, 4};
        int peakElement = findPeakElement(numbers);
        System.out.println(peakElement);
    }

    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
}
