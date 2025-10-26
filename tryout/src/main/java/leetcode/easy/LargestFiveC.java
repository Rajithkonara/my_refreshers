package leetcode.easy;

public class LargestFiveC {

    public static void main(String[] args) {
//        System.out.println(solution(15958));  // 1958
//        System.out.println(solution(15358));  // 1958
//        System.out.println(solution(-5000)); // 0
        System.out.println(solution(-5859)); // -589
    }

    public static int solution(int n) {
        // Convert the integer to its string representation
        String number = Integer.toString(n);

        // Initialize the maximum possible value
        int maxValue = Integer.MIN_VALUE;

        // Iterate through each character in the number string
        for (int i = 0; i < number.length(); i++) {
            // Skip characters that are not '5'
            if (number.charAt(i) != '5') {
                continue;
            }

            // Remove the current '5' from the string
            StringBuilder modifiedNumber = new StringBuilder(number);
            modifiedNumber.deleteCharAt(i);

            // Parse the modified string to an integer
            int newValue = Integer.parseInt(modifiedNumber.toString());

            // Update the maximum value
            maxValue = Math.max(maxValue, newValue);
        }

        return maxValue;
    }
}
