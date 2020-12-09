package turing;

public class Test5 {

    public static void main(String[] args) {
        new newthread();
    }

}

class newthread extends Thread {
    newthread() {
        super("My thread");
        start();
    }

    public void run() {
        System.out.println(this);
    }
}
