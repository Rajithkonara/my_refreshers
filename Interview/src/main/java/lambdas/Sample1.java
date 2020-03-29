package lambdas;

import java.util.function.Predicate;

public class Sample1 {

    public static void main(String[] args) {

        Sample1 sample = new Sample1();

        // Legal Lambdas

        sample.go(x -> 7 < 5);
        sample.go(x -> adder(2, 1) > 5);

        sample.go((Sample1 x) -> {
            int z = 5;
            return adder(z, 7) > 8;
        });

        sample.go(x -> {
            int w = 5;
            return adder(w, 6) > 8;
        }); //no arg type block

        int a = 5;
        int b = 6;
        sample.go(x -> adder(a, b) > 8); // in scope vars
        sample.go((Sample1 x) -> adder(a, b) > 14);

    }

    private void go(Predicate<Sample1> samplePredicate) {
        Sample1 sample1 = new Sample1();
        System.out.println(samplePredicate.test(sample1) ? "ternary true" : "ternary false");
    }

    private static int adder(int x, int y) {
        return x + y;
    }

}
