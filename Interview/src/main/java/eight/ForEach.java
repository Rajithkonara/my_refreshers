package eight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by rajith on 10/18/18.
 */
public class ForEach {


    private static void iterateThroughList(List<String> list) {
        list.forEach(System.out::println);
    }

    //explaination
    private static void iterateExp(List<String> list) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        list.forEach(consumer);
    }

    public static void main(String[] args) {

     //test
        List<String> names = Arrays.asList("Rajith", "Supitha", "Iroshan", "Shajee");
        iterateThroughList(names);
        iterateExp(names);
    }
}
