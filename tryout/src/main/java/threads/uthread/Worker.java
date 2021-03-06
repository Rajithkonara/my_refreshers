package threads.uthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    private Random random = new Random();

    private Object lock1 = new Object();
    private Object lock2 = new Object();


    private List<Integer> list = new ArrayList<>();
    private List<Integer> list1 = new ArrayList<>();

    public void stage1() {

        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list.add(random.nextInt(100));
        }
    }

    public void stage2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list1.add(random.nextInt(100));
        }
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stage1();
            stage2();
        }
    }

    public void main() {
        System.out.println("Starting .......");

        long start = System.currentTimeMillis();

//        process();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
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

        long end = System.currentTimeMillis();

        System.out.println("Time Taken :" + (end - start));

        System.out.println("List : " + list.size());
        System.out.println("List1 : " + list1.size());

    }
}
