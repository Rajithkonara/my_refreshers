package lambdas.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        MainGreeting mainGreeting = new MainGreeting();

        //lambda
        Greeting mylambda = () -> System.out.println("Greeting .... ");

        //annonymous
        Greeting innerClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Greeting ....");
            }
        };

        mylambda.perform();
        greeter.greet(mainGreeting);
        System.out.println(innerClass);


    }

}

interface Calculator {
    int add(int a, int b);
}
