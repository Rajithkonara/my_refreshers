package lessons.plural.async;

import java.util.concurrent.CompletableFuture;

public class SimpleCompletableFuture {

  public static void main(String[] args) {

    CompletableFuture<Void> completableFuture = new CompletableFuture<>();

    Runnable task = () -> {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      completableFuture.complete(null);
    };

    CompletableFuture.runAsync(task);

    Void join = completableFuture.join();
    System.out.println("Completed");


  }

}
