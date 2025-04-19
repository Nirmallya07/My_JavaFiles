package Multi_Threading;

class Task5 extends Thread {

    Task5(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield(); // Hints JVM that you are allowed to give chances to others threads too.
            // Check the difference by commenting it .. !
            // The results will be more random.
        }
    }
}

public class Yield_Method {
    public static void main(String[] args) {
        Task5 t5A = new Task5("t5A");
        Task5 t5B = new Task5("t5B");
        t5A.start(); t5B.start();
    }
}
