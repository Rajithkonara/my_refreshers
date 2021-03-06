package hackerranker;

public class JumpingOnClouds2 {

    static int jumpingOnClouds(int[] c) {

        int count = 0;
        int i = 0;
        while (i < c.length - 1) {
            if (i + 2 < c.length && c[i + 2] != 1) {
                count++;
                i = i + 2;
            } else {
                count++;
                i++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int[] a = {0, 0, 0, 0, 1, 0};

        System.out.println(jumpingOnClouds(a));

    }

}
