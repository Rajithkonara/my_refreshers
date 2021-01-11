package turing;

public class Test3 {

    public static void main(String[] args) {
        String a = "1";
        String b = "2";
        String c = new String("3");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println("In the first main()");
    }

    public static void main(char[] args) {
        System.out.println("a");
    }

}
