package async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AsyncJava {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
//    runAsync();
//    supplyAsync();
//    chainAsync();
    combineAsync();
  }

  public static void runAsync() throws ExecutionException, InterruptedException {

    System.out.println(
        "Invoking first at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
            .currentThread().getName());

    CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(new Runnable() {
      @Override
      public void run() {

        System.out.println(
            "ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
                .currentThread().getName());

        try {
          TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
          throw new IllegalStateException(e);
        }
        System.out.println(
            "ASync task finished at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
                .currentThread().getName());
      }
    });

    System.out.println("Other task : " + Thread.currentThread().getName());
    //
    voidCompletableFuture.get();
  }

  public static void supplyAsync() throws ExecutionException, InterruptedException {

    System.out.println(
        "Invoking first at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
            .currentThread().getName());

    CompletableFuture<String> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {

      System.out.println(
          "ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
              .currentThread().getName());

      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      System.out.println(
          "ASync task finished at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
              .currentThread().getName());
      return "result from async";

    });

    System.out.println("Other task : " + Thread.currentThread().getName());

    //Block and get results
    String s = voidCompletableFuture.get();
    System.out.println(s);
  }

  public static void chainAsync() throws ExecutionException, InterruptedException {

    System.out.println(
        "Invoking first at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
            .currentThread().getName());

    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
      System.out.println(
          "First ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
              .currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return "First";

    }).thenApply(name -> {
      System.out.println(
          "Second ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: "
              + Thread
              .currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return name + " Second";
    }).thenApply(name -> {
      System.out.println(
          "Third ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: "
              + Thread
              .currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return name + " Third";
    });

    System.out.println("Other task : " + Thread.currentThread().getName());

    //Block and get results
    String s = future.get();
    System.out.println("Completed in : " + System.currentTimeMillis() / 1000);
    System.out.println(s);
  }

  public static void combineAsync() throws ExecutionException, InterruptedException {

    System.out.println(
        "Invoking first at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
            .currentThread().getName());

    CompletableFuture<String> firstTask = CompletableFuture.supplyAsync(() -> {
      System.out.println(
          "First ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: " + Thread
              .currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(3);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return "First";

    });

    CompletableFuture<String> secondTask = CompletableFuture.supplyAsync(() -> {
      System.out.println(
          "Second ASync task started at: " + System.currentTimeMillis() / 1000 + " Thread: "
              + Thread
              .currentThread().getName());
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        throw new IllegalStateException(e);
      }
      return " Second";

    });

    //combine
    CompletableFuture<String> future = firstTask.thenCombine(secondTask, (first, second) -> {
      return "concat " + first + second;
    });

    System.out.println("Other task : " + Thread.currentThread().getName());

    //Block and get results
    String s = future.get();
    System.out.println("Completed in : " + System.currentTimeMillis() / 1000);
    System.out.println(s);
  }

}
