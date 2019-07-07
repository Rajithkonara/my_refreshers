package threads.uthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ProcessorTwo implements Runnable {

    private int id;

    public ProcessorTwo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Stating :  " +id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Completed : " +id);
    }
}


public class ThreadPool {

    public static void main(String[] args) {

        //thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            executorService.submit(new ProcessorTwo(i));
        }

        executorService.shutdown();

        System.out.println("All tasks submitted");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks completed ");

    }
}
