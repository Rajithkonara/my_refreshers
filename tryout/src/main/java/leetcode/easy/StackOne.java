package leetcode.easy;

public class StackOne {

    public static void main(String[] args) {

        System.out.println(solution("CBACD"));
        System.out.println(solution("CABABD"));
        System.out.println(solution("ACBDACBD"));
    }

    public static String solution(String s) {

        StringBuilder stack = new StringBuilder();

        for (char c: s.toCharArray()) {
            int length = stack.length();
            if (length > 0 &&
                    (( stack.charAt(length-1) == 'A' && c == 'B' ||
                       stack.charAt(length-1) == 'B' && c == 'A' ||
                       stack.charAt(length-1) == 'C' && c == 'D' ||
                       stack.charAt(length-1) == 'D' && c == 'C'
                    ))) {
                stack.deleteCharAt(length-1);
              }else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
