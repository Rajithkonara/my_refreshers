package rajith.practice;

/**
 * Created by rajith on 10/13/18.
 */
public class FibanaciiRec {

    public int fibanacci(int count) {
        if (count <= 1) {
            return count;
        } else {
            return fibanacci(count - 1) + fibanacci(count - 2);
        }
    }

    public static void main(String[] args) {
        int count = 6;
        FibanaciiRec fibanaciiRec = new FibanaciiRec();
        for (int i = 0; i <= count; i++) {
            System.out.println(fibanaciiRec.fibanacci(i));
        }
    }
}
