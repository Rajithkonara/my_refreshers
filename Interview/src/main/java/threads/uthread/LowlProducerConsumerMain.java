package threads.uthread;

public class LowlProducerConsumerMain {

    public static void main(String[] args) throws InterruptedException {

        final LowlProducerConsumer waitNotify = new LowlProducerConsumer();

        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotify.consumer();
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


