package eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PerformanceTest {

    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[500000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }

        long startTime = System.nanoTime();
        int[] a = arr;
        int e = arr.length;
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < e; i++)
            if (a[i] > m) m = a[i];
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("normal " + duration);

        long startTime2 = System.nanoTime();
        int x = Arrays.stream(a)
                .reduce(Integer.MIN_VALUE, Math::max);

        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        System.out.println("streams " + duration2);


        //using arraylist
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        int pick;
        for (int j = 0; j < 500000; j++) {
            pick = rand.nextInt();
            al.add(pick);
        }

        long startTime3 = System.nanoTime();
        int minValue = Integer.MIN_VALUE;
        for (int i : al)
            if (i > m) m = i;
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3);
        System.out.println("end time for just   " + duration3);

        long startTime4 = System.nanoTime();

        int max = al.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        long endTime4 = System.nanoTime();
        long duration4 = (endTime4 - startTime4);
        System.out.println("for lambdas   " + duration4);


        long startTime5 = System.nanoTime();

        int max2 = al.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        long endTime5 = System.nanoTime();
        long duration5 = (endTime5 - startTime5);
        System.out.println("for lambdas paralle  " + duration5);


    }

}
