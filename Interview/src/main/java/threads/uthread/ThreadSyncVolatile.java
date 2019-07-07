package threads.uthread;


import java.util.Scanner;

class Processor extends Thread {

    //prevent thread caching
    private volatile boolean running = true;


    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void shutdown() {
        running = false;
    }


}


public class ThreadSyncVolatile {

    public static void main(String[] args) {

        Processor processor = new Processor();
        processor.start();

        System.out.println("Press to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        processor.shutdown();


    }

}
