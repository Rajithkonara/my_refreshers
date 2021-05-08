package lessons.plural.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFutureWithSupplier {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    Supplier<String> supplier = () -> {

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return Thread.currentThread().getName();
    };

    CompletableFuture<String> future = CompletableFuture.supplyAsync(supplier, executorService);

    //blocked
    String join = future.join();
    System.out.println("Result = " + join);

    future.obtrudeValue("Too longs ");

    join = future.join();
    System.out.println("Result = " + join);
    //

    System.out.println("Result: " + join);
    executorService.shutdown();
  }

}
