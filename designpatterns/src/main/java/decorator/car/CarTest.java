package decorator.car;

/**
 * Created by rajith on 7/22/18.
 */
public class CarTest {

    public static void main(String[] args) {
        Car sportsCar = new SporstCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SporstCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
