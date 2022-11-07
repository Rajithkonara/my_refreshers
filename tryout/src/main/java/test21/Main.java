package test21;

public class Main {

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 7, 9, 10, 23};
        int[] b = {1, 2, 5, 7, 9, 10, 23};
        int[] c = {1, 2, 5, 7, 9, 10, 23};
        int[] d = {};
        int[] e = {1, 2, 5, 9, 9};


        int solution = solution(b, 1);
        int solution2 = solution(a, 23);
        int solution3 = solution(c, 1);
        int solution4 = solution(e, 5);
        int solution5 = solution(d, 1);

        System.out.println(solution);
        System.out.println(solution2);
        System.out.println(solution3);
        System.out.println(solution4);
        System.out.println(solution5);

    }


    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r +1) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }


}
