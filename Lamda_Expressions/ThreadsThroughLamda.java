package Lamda_Expressions;

public class ThreadsThroughLamda {
    public static void main(String[] args) {

        // Runnable Lamda Expression.
        Runnable runnable1 = () -> System.out.println("Hello from " + Thread.currentThread().getName());
        Runnable runnable2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "\tfrom " + Thread.currentThread().getName());
            }
        };
        Thread T1 = new Thread(runnable1, "T1:runnable1");
        Thread T2 = new Thread(runnable2, "T2:runnable2");
        T1.start();
        T2.start();

        // Thread Lamda Expression
        // Thread is a class, so new Thread is imp. to write.
        Thread T3 = new Thread(() -> System.out.println("Hello from " + Thread.currentThread().getName()), "T3");
        T3.start();
    }
}
