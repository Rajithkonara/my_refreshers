package threads;

public class Simple {

    public static void main(String[] args) {
        Printer p = new Printer();
        //if a child thread is daemon thread when main thread ends programme is terminates
        p.setDaemon(true);

        p.start();


        // if we invoke run() without start it won't create a new thread
        //p.run();

        for (int i = 0; i < 10; i++) {
            System.out.println("From main thread " + i);
        }

        System.out.println("*******************************************");


    }

}

class Printer extends Thread {

    /**
     * You have override the start() so you won't able to invoke Thread.start()
     * still you can call super();
     */
//    @Override
//    public void start() {
//        System.out.println("Start ");
//        super.start();
//    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("From thread " + i);
        }
    }
}
