package threads.uthread;

public class WaitNotifyMain {

    public static void main(String[] args) throws InterruptedException {

        final WaitNotify waitNotify = new WaitNotify();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
