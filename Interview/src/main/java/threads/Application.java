package threads;

public class Application {

    public static void main(String[] args) {
        RunnablePrinter printer = new RunnablePrinter();

        System.out.println("Before Main" + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(1);

        Thread thread = new Thread(printer);

        thread.setPriority(10);

        System.out.println("Main" + Thread.currentThread().getPriority());

        System.out.println("Printer " + thread.getPriority());

        thread.start();

        for (int i =0; i < 10; i ++) {
            System.out.println("From main thread " + i);
        }

        System.out.println("*******************************************");

    }
}
