package turing;

public class Test7 {

    public static void main(String[] args) {

        Subclass_1 subclass1 = new Subclass_1();

        subclass1.foo();

        Super_1 s = new Subclass_1();


    }

}

class Super_1 {
    private void foo() {
        System.out.println("Super");
    }
}

class Subclass_1 extends Super_1 {
    public void foo() {
        System.out.println("subclass");
    }
}
