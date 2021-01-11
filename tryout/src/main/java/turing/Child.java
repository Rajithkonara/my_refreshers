package turing;

class Test6 {

    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

}


public class Child extends Test7 {

    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }

}

