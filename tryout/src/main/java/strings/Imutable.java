package strings;

public class Imutable {

    public static void main(String[] args) {

        String s = new String();
        String s1;
        s = "test";

        s1 = s;
        System.out.println(s1.concat("rd"));
    }
}
