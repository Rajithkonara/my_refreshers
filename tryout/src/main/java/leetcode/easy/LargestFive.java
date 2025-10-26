package leetcode.easy;

public class LargestFive {

    public static void main(String[] args) {

        solution(15958);  //
        solution(-5000); // 0
        solution(-5859);
    }

    public static int solution(int n) {

        String s = Integer.toString(n);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '5') {

                String temp = s.substring(0, i) + s.substring(i + 1);
                int num = Integer.parseInt(temp);

                if (n > 0) {
                    if (num > max) {
                        max = num;
                    }
                } else if (n < 0) {
                    if (num > n) {
                        max = num;
                    }
                }
            }
        }
        return  max;
    }
}
