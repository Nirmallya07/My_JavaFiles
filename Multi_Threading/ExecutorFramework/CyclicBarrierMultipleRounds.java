package Multi_Threading.ExecutorFramework;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierMultipleRounds {

    public static void main(String[] args) {
        int numberOfFriends = 3;
        int rounds = 3;

        CyclicBarrier barrier = new CyclicBarrier(numberOfFriends, () -> {
            System.out.println("==> All friends are ready. Starting the round!\n");
        });

        ExecutorService executor = Executors.newFixedThreadPool(numberOfFriends);

        for (int i = 1; i <= numberOfFriends; i++) {
            int friendNumber = i;
            executor.submit(() -> {
                try {
                    for (int round = 1; round <= rounds; round++) {
                        System.out.println("Friend " + friendNumber + " is warming up for round " + round);
                        Thread.sleep(1000 * friendNumber); // simulate warm-up time

                        System.out.println("Friend " + friendNumber + " reached the meeting point for round " + round);
                        barrier.await(); // Wait for others

                        System.out.println("Friend " + friendNumber + " starts running for round " + round + "\n");

                        Thread.sleep(5000); // simulate running time
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}
