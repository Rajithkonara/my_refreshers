package generics;

public class BoxMain {

    public static void main(String[] args) {

        Box<Integer> integerBoxl = new Box<>();
        Box rawBox = new Box();

        integerBoxl.setT(1);

        System.out.println(integerBoxl.getT());

    }

}
