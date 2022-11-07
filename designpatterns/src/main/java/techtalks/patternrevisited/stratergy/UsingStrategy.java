package techtalks.patternrevisited.stratergy;

import java.util.List;
import java.util.function.Predicate;

public class UsingStrategy {

    public static int totalValues(List<Integer> numbers,
                                  Predicate<Integer> selector) {

        return numbers.stream()
              .filter(selector)
              .mapToInt(e -> e)
              .sum();
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2,3,4);

        System.out.println(totalValues(numbers, ignore -> true));
        System.out.println(totalValues(numbers,
              number -> number % 2 == 0));

        System.out.println(totalValues(numbers, UsingStrategy::isOdd));
    }
}
/*
Strategies are often a single method or function.
So, functional interfaces and lambdas work really well
*/