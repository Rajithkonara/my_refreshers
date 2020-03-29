package strategies.headfirst;

public class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void display() {
        System.out.println("display duck");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }


}
