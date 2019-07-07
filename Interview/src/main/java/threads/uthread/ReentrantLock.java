package threads.uthread;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ReentrantLock {

    private int count = 0;
    private Lock lock = new java.util.concurrent.locks.ReentrantLock();
    private Condition condition = lock.newCondition();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();

        System.out.println("Waiting ..... ");

        // release the lock and goto second thread
        condition.await();

        System.out.println("Woken UP ");

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {

        Thread.sleep(1000);
        lock.lock();

        System.out.println("Press Enter to continue ");
        new Scanner(System.in).nextLine();
        System.out.println("Pressed ");

        //wake up the waiting thread
        condition.signal();

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count is : " + count);
    }
}
