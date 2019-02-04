package decorator.car;

/**
 * Created by rajith on 7/22/18.
 */
public class CarDecorator implements Car {
    //Decorator class

    protected Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }

    public void assemble() {
        this.car.assemble();
    }

}
