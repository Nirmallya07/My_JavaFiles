package Multi_Threading.ExecutorFramework;

import java.util.concurrent.*;

public class runnableVscallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable runnable = () -> {
            System.out.println("Hello Runnable");
        };
        Thread T1 = new Thread(runnable);
        T1.start();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> "Hello Callable";
        Future<String> future = executorService.submit(callable);
        executorService.shutdown();
        String res = future.get();
        System.out.println(res);

    }
}