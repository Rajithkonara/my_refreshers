package decorator.car;

/**
 * Created by rajith on 7/22/18.
 */
public class SporstCar extends CarDecorator {

    //Concrete Decorators

    public SporstCar(Car c) {
        super(c);
    }

    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }

}
