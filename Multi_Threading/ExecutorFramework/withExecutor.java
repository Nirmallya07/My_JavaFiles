package Multi_Threading.ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class withExecutor {
    public static long factorial(long n) {
    long res = 1;
    for (int i = 1; i <= n; i++) {
        res *= i;
    }
    return res;
}

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ExecutorService executorService_1 = Executors.newFixedThreadPool(3);// 3 THREADS WILL DO THE JOB OF 9 THREADS. (THUS, TAKING MORE TIME).
        for (int i =1; i <= 10; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                long res = factorial(finalI);
                System.out.println(res);
//                return res; // Uncomment for submit( Callable Task ), with comment it is submit( Runnable Task ).
            });
        }
        executorService.shutdown(); // "Hey team, finish your current tasks but don’t start new ones."
//        executorService.shutdownNow(); // "EVERYBODY STOP RIGHT NOW! Drop what you’re doing!"
        try { // Main function will wait for this thread to complete. So it says the time taken correctly.
            while(!executorService.awaitTermination(1, TimeUnit.SECONDS)){ // Every 1 sec. it will check if the thing got finished.
                // Will print "Waiting..." until the thread is not complete.
                System.out.println("Waiting...");
            };
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }
}
