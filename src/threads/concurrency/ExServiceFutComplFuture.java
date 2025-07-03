package threads.concurrency;

import java.util.concurrent.*;

public class ExServiceFutComplFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task = ()-> {
            var a = 10;
            var b = 20;
//            System.out.println(a*b);
        };
//        executorService.execute(task);
//        System.out.println("Hello"+Thread.currentThread().getName());
//        executorService.shutdown();
//        ===========================

//        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        Callable<String> task1 = ()-> {
            TimeUnit.SECONDS.sleep(2);
            return "Hello Devaraj";
        };

//        Future<String> future = executorService1.submit(task1);
//        System.out.println(future.isDone());
//        String name = future.get(); // blocking the call
//        System.out.println(name);
//        System.out.println("Hello I am blocking until task1 returned");
//        executorService1.shutdown();
//        ==================================
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello from CompletableFuture";
        });

        future.thenAccept(result -> System.out.println("Computed Result: " + result));
        System.out.println("Hello I am main thread");
        try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { }

    }
}
