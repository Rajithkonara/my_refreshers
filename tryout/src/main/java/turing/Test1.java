package turing;

public class Test1 {


    public static void main(String[] args) {
        Super s = new SubClass();
        s.foo();
    }

}


class Super {
    void foo() {
        System.out.println("Super");
    }
}

class SubClass extends Super {
// compile time error
//     static void foo() {
//        System.out.println("Subclass");
//    }

}
