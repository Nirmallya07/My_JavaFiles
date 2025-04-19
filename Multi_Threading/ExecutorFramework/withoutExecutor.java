package Multi_Threading.ExecutorFramework;

public class withoutExecutor {

    public static long factorial(long n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] thread = new Thread[10];
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            thread[i-1] = new Thread(
                    () -> {
                        long res = factorial(finalI);
                        System.out.println(res);
                    }
            );
            thread[i-1].start();
        }

        for (Thread i : thread) {
            try {
                i.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
    }
}

