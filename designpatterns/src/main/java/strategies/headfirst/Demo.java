package strategies.headfirst;

public class Demo {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();

        duck.display();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        duck.setQuackBehaviour(new Quack());
        duck.performQuack();
    }

}
