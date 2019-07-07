package threads.uthread;

import java.util.Scanner;

public class WaitNotify {

    public void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("Producer thread Running.....");
            wait();  //Release the lock
            System.out.println("Resumed ....");
        }

    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            System.out.println("waiting for return key ");
            scanner.nextLine();
            System.out.println("Pressed ... ");
            notify();
            Thread.sleep(5000);
        }
    }
}
