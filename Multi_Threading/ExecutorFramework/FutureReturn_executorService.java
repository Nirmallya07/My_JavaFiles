package Multi_Threading.ExecutorFramework;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class FutureReturn_executorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future1 = executorService.submit(() -> 45);
        Future<String> future2 = executorService.submit(() -> {
            return "Hello";
        });
        executorService.shutdown();
        System.out.println(future1.get());
        System.out.println(future2.isDone());
        Object a = future2.get();
        System.out.println(a);

    }
}
