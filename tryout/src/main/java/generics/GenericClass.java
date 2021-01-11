package generics;

public class GenericClass<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    private T get() {
        return t;
    }

    public static void main(String[] args) {

        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        GenericClass<String> stringGenericClass = new GenericClass<>();

        integerGenericClass.add(10);
        stringGenericClass.add("Added");

        System.out.println("Integer value " + integerGenericClass.get());
        System.out.println("String value " + stringGenericClass.get());

    }
}
