package practice;

interface Inteface1 {
    default int dostuff() {
        return 1;
    }
}


interface Inteface2 {
    default int dostuff() {
        return 1;
    }
}

public class Trick implements Inteface1, Inteface2 {
    public static void main(String[] args) {

        new Trick().go();
    }


    private void go() {
        dostuff();
    }

    @Override
    public int dostuff() {
        return 3;
    }

}
