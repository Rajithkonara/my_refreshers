package eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class OracleBlogStreams {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


        long startTime2 = System.nanoTime();
        List<Integer> temp = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                int twosquare = number * number;
                temp.add(twosquare);
            }
        }
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        System.out.println("normal duration " + duration2);


        long startTime = System.nanoTime();
        //                                           System.out.println("filtering " + n);
        //                                           System.out.println("mapping " + n);
        //short circuit
        List<Integer> twoEvenSquares = new ArrayList<>();
        long limit = 2;
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                Integer integer = n * n;
                if (limit-- == 0) break;
                twoEvenSquares.add(integer);
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("stream duration " + duration);



//        System.out.println("forr c" + temp);

        System.out.println(twoEvenSquares);


        // Match

        List<Integer> numbers2 = Arrays.asList(7, 10 , 30 , 34 ,55 ,23, 56 ,77 ,88 ,90 ,100);

        boolean lessThan50  = numbers2.stream()
                                    .allMatch(p -> p > 5);

        System.out.println("all match "  +lessThan50);


        // Map

        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");

        List<Integer> wordLengths =
                words.stream()
                        .map(String::length)
                        .collect(toList());


        System.out.println(wordLengths);

        //replaced by reduce
        //int sum = 0;
        //for (int x : numbers) {
        //sum += x; }

        //reduce
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum of numbers "  +sum);

        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        int product2 = numbers.stream().reduce(1, Integer::max);

        System.out.println(product);
        System.out.println(product2);


        //Numeric streams  primitive specialized stream interfaces

        int streamedInt  = numbers.stream().mapToInt(p -> p).sum();
        System.out.println(streamedInt);

        //Range
        IntStream oddNumbers =
                IntStream.rangeClosed(10, 30)
                        .filter(n -> n % 2 == 1);

        oddNumbers.forEach(System.out::print);

        //create streams

        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        int[] array = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(array);

        /**
         * file stream
         * long numberOfLines =
         * Files.lines(Paths.get(“yourFile.txt”), Charset.defaultCharset())
         *   .count();
         */

        //infinite streams -> streams do not have a fixed size

        Stream<Integer> numbers3 = Stream.iterate(0, n -> n + 10);

        //fixed size by limit
        numbers3.limit(5).forEach(System.out::println); // 0, 10, 20, 30, 40

    }

}
