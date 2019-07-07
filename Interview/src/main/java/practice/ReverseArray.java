package practice;

public class ReverseArray {

    public static void main(String[] args) {

        int[] front = {1,2,3,4,5};

        int[] rev = new int[5];

        int arrlenth = 5;

        for (int i = 0 ; i < front.length; i++) {
             rev[arrlenth-1] = front[i];
             arrlenth = arrlenth-1;
        }


        for (int y: rev) {
            System.out.println(y);
        }


    }
}
