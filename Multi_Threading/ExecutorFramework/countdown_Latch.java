package Multi_Threading.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class countdown_Latch {
    public static void main(String[] args) throws InterruptedException {
        int threads = 3;
        ExecutorService executor = Executors.newFixedThreadPool(threads); // Pool_1
        CountDownLatch countDownLatch = new CountDownLatch(threads * 2);
        executor.submit(new Dependencies(countDownLatch));
        executor.submit(new Dependencies(countDownLatch));
        executor.submit(new Dependencies(countDownLatch));
        executor.shutdown();

        ExecutorService executor1 = Executors.newFixedThreadPool(threads); // Pool_2
        executor1.submit(()-> {
            for (int i = 1; i <= threads; i++) {
                System.out.println(Thread.currentThread().getName() + " services started.");
                countDownLatch.countDown();
            }
        });
        executor1.shutdown();
        System.out.println("Working on all dependencies before proceeding to the main...");

        countDownLatch.await();
        System.out.println("Main method runs.");
    }
}

class Dependencies implements Callable<String> {
    private final CountDownLatch countDownLatch;
    Dependencies(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(2000);
        countDownLatch.countDown();
        return null;
    }
}
