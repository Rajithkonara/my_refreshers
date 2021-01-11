package eightinter;

public class Dinterfaces implements Interface1, Interface2 {


    @Override
    public void method2() {

    }

    @Override
    public void method1(String tesy) {

    }

    @Override
    public void log(String str) {
        System.out.println("MyClass logging::" + str);
        Interface1.print(str);
    }

    public static void main(String[] args) {
        Dinterfaces dinterfaces = new Dinterfaces();
//        dinterfaces.log("test");

        Interface1 il = s -> System.out.println(s);
        il.method1("rajith");
    }
}
