package threads;

public class Application2 {


  /**
   * Join
   * <p>
   * The join method allows one thread to wait for the completion of another.
   **/


  public static void main(String[] args) throws InterruptedException {

    RunnablePrinter printer = new RunnablePrinter();
    Thread thread = new Thread(printer);
    thread.start();

        thread.join();
//        thread.join(5000);

    for (int i = 0; i < 10; i++) {
      System.out.println("From main thread " + i);
    }

    System.out.println("*******************************************");

  }

}
