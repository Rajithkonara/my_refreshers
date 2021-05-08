- The completable future pattern does not work with callables, But it does with suppliers, A
  supplier cannot throw checked exceptions

- By default, the async tasks are run in the Common Fork/ Join Pool

Future<?> future = executorService.submit(() -> System.out.println(('Hello'));

CompletableFuture<?> completableFuture = CompletableFuture.runAsync(
() -> System.out.println("Hello"), executorService);

- Above code do the same

- CompletableFuture is a class that implements 
        - Future
        - CompletionStage
