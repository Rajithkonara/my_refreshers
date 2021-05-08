package lessons.plural.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutures {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newSingleThreadExecutor();

    //task is running in pool
    Runnable task = () ->{
      System.out.println("Running async thread: "+ Thread.currentThread().getName());
    };

    CompletableFuture.runAsync(task, executorService);

    executorService.shutdown();

  }

}
