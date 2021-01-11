package eight;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Created by rajith on 10/19/18.
 */
public class Streams {

    private static void iterateThroughStream(List<String> list) {
        list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> countryList = Arrays.asList("Argentina", "Brasil", "China", "United States");
        iterateThroughStream(countryList);


    }

}
