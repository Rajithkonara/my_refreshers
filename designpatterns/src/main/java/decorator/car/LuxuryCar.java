package decorator.car;

/**
 * Created by rajith on 7/22/18.
 */
public class LuxuryCar extends CarDecorator {

    //Concrete Decorators

    public LuxuryCar(Car c) {
        super(c);
    }

    public void assemble () {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
