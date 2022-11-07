package factory.pizza;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheese pizza");
    }
}
