package practice;

import java.util.HashSet;

public class Pairs {

    private static int matchSocks(int[] arr) {

        int pairs = 0;

        HashSet<Integer> colors = new HashSet<>();

        for (int color : arr) {
            if (!colors.add(color)) {
                pairs++;
                colors.remove(color);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20, 10, 10};
        System.out.println(matchSocks(arr));
    }

}
