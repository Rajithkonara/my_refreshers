package techtalks.patternrevisited.stratergy;

import java.util.List;

public class Problem {

    public static int totalValues(List<Integer> numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static int totalEvenValues(List<Integer> numbers) {
        int total = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                total += number;
            }
        }

        return total;
    }

    public static int totalOddValues(List<Integer> numbers) {
        int total = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                total += number;
            }
        }

        return total;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(totalValues(numbers));
        System.out.println(totalEvenValues(numbers));
        System.out.println(totalOddValues(numbers));
    }

}
