package leetcode.easy;

import java.util.Arrays;

public class PalindromSpecial {

    private static String solution(String s) {

        int left = 0;
        int right = s.length() - 1;

        char[] newString = s.toCharArray();

        while (left <= right) {
            char leftChar = newString[left];
            char rightChar = newString[right];

            if (leftChar == '?' && rightChar == '?') {
                // Both sides are '?', choose 'a' or any other character
                newString[left] = 'a';
                newString[right] = 'a';
            } else if (leftChar == '?') {
                // Replace the left '?' with the right character
                newString[left] = rightChar;
            } else if (rightChar == '?') {
                // Replace the right '?' with the left character
                newString[right] = leftChar;
            } else if (leftChar != rightChar) {
                // Characters don't match and aren't '?', so it's not a palindrome
                return "NO";
            }

            left++;
            right--;
        }

        return new String(newString);
    }

    public static void main(String[] args) {
        System.out.println(solution("?kayak?")); //c
        System.out.println(solution("bab??a")); // c
        System.out.println(solution("?a?")); // c
        System.out.println(solution("?ab??a")); // w
        System.out.println(solution("kayak")); // c

        System.out.println(checkPalindrome("a?-b=BA"));   // Output: "ab-b=ba"
        System.out.println(checkPalindrome("?+B?b+--a")); // Output: "a+bab+--a"
        System.out.println(checkPalindrome("?+cd+a"));    // Output: "nonono"
    }

    public static String checkPalindrome(String input) {
        // Normalize the string: Remove non-alphanumeric characters and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check if the cleaned string is a palindrome
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            // If it's a palindrome, return the original string in lowercase
            return input.toLowerCase();
        } else {
            // If it's not a palindrome, return a string of the same length filled with "no"
            return "no".repeat(input.length() / 2) + (input.length() % 2 == 0 ? "" : "no".substring(0, 1));
        }
    }
}


