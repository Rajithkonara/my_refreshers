package eight;

import java.util.Arrays;
import java.util.List;

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
