package threads.uthread;

public class ThreadSych {

    private int count = 0;

    public synchronized void increament() {
        count++;
    }

    public static void main(String[] args) {
        ThreadSych threadSych = new ThreadSych();
        threadSych.doWork();
    }

    private void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    increament();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10000; i++) {
                    increament();
                }
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Count is " + count);
    }

}
