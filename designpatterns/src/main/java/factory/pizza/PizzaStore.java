package factory.pizza;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;



        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;

    }

}
