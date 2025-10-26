import java.util.ArrayList;

public class Codility {

    public static void main(String[] args) {
        System.out.println(solution("CBACD"));
    }

    public static String solution(String s) {

        //two pointer approach

        char[] chars = s.toCharArray();
        int n = chars.length;
        int i = 0; // slow pointer

        for (int j = 0; j < n; j++) { // fast pointer
            chars[i] = chars[j];

            // Check for AB, BA, CD, or DC and adjust the slow pointer
            if (i > 0 && (
                    (chars[i] == 'B' && chars[i - 1] == 'A') ||
                            (chars[i] == 'A' && chars[i - 1] == 'B') ||
                            (chars[i] == 'D' && chars[i - 1] == 'C') ||
                            (chars[i] == 'C' && chars[i - 1] == 'D')
            )) {
                i--; // Remove both characters by stepping back once
            } else {
                i++; // Move slow pointer forward
            }
        }

        return new String(chars, 0, i);
    }

}
