package eight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by rajith on 10/19/18.
 */
public class Map {


    static void iterateThroughMap(java.util.Map<?,?> map) {
        map.forEach((k,v) -> System.out.println("key: "+k+" Value: "+v));
    }

    public static void main(String[] args) {

        java.util.Map<String,String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("ASS", "Wshington DC");
        countryCapitalMap.put("England", "London");
        countryCapitalMap.put("France", "Paris");
        Map.iterateThroughMap(countryCapitalMap);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


        long startTime = System.nanoTime();
        List<Integer> twoEvenSquares = numbers.stream()
                .filter(n -> {
//                                           System.out.println("filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
//                                           System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)//short circuit
                .collect(toList());

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("stream duration " + duration);


    }

}
