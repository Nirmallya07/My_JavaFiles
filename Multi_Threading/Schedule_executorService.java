package Multi_Threading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* At scheduleAtFixedRate the next task starts after 5(given) seconds
* of the current task starts.
*
* At scheduleWithFixedDelay the next starts after 5 seconds(given) seconds
* of the current task ends. (Think of it like a lazy person who takes rest
* for % seconds after doing every task ) . */

public class Schedule_executorService {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(
                () -> System.out.println("Task executed after 5  seconds period !"), 5,5, TimeUnit.SECONDS
        );

        executor.scheduleWithFixedDelay(
                () -> System.out.println("Task executed after 5  seconds delay !"), 5,5, TimeUnit.SECONDS
        );
        Thread.sleep(20000);
        System.out.println("Shutting down executor...");
        executor.shutdown(); // it tells to no more accept new tasks but complete scheduled tasks.
    }
}
