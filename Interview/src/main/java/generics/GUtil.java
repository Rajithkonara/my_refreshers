package generics;

public class GUtil {

    static <K, V> boolean compare(GPair<K, V> p1, GPair<K, V> p2) {

        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        GPair<Integer, String> p1 = new GPair<>(1, "apple");
        GPair<Integer, String> p2 = new GPair<>(2, "pear");

        GPair<Integer, String> p3 = new GPair<>(1, "apple");
        GPair<Integer, String> p4 = new GPair<>(1, "apple");



        boolean same = GUtil.compare(p1, p2);

        boolean same2 = GUtil.compare(p3, p4);

        System.out.println(same);

        System.out.println(same2);


    }


}
