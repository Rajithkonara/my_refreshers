package memory;

public class RoleOfHeap {

    public static void main(String[] args) {
        int localValue = 5;
        calculate(5);
        System.out.println(localValue);
    }

    public static void calculate(int cal) {
        cal = cal * 100;
    }

}
