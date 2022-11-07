package alogacedemy;

public class PeakElement {

    public static void main(String[] args) {
        int[] numbers = {0, 2, 80, 90, 5, 4};
        int peakElement = findPeakElement(numbers);
        System.out.println(peakElement);
    }

    // Iterate over the array and find an element that is greater than to all it's neighbours and return it.
//    public static int findPeakElement(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] > nums[i + 1])
//                return i;
//        }
//        return nums.length - 1;
//    }

    public static int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }

    public static int search(int[] nums, int l, int r) {
        if (l == r) {
            return l;
        }

        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return search(nums, l, mid);
        }

        return search(nums, mid + 1, r);
    }


    public static int findPeakElementsBinary(int[] nums, int left, int right) {

        if (left == right) {
            return left;
        }

        //get the middle element
        int mid = left + (right - left) / 2;

        return 0;
    }


    public static int findPeakElementsBinary(int[] nums) {

        return 0;
    }

}
