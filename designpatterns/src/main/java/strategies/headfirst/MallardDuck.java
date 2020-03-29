package strategies.headfirst;

public class MallardDuck extends Duck {

    private FlyBehavior flyBehavior;
    private QuackBehaviour quackBehaviour;

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Im a real Mallard duck");
    }

}
