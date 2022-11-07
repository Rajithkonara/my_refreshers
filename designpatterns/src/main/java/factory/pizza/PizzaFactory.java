package factory.pizza;

public class PizzaFactory {

    private PizzaFactory() {}

    public static Pizza getPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("chicken".equals(type)) {
            return new CheesePizza();
        } else if ("veggie".equals(type)) {
            return new VeggiPizza();
        }
        return null;
    }
}
