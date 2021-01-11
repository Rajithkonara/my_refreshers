package threads;

public class Test implements Runnable {

    @Override
    public void run() {
        System.out.println("TURING ");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test());

        thread.run();
//        thread.start();

        System.out.println(thread.getState());
    }

}
