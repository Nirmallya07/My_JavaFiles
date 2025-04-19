package Multi_Threading;

class Task4 extends Thread {
    Task4(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Enters TASK 4..");
        try {
        Thread.sleep(12000);
        } catch (InterruptedException exception) {
            System.out.println("We called this exception: " + exception);
        }
        System.out.println("TASK 4 says Hello..");
    }
}
public class Thread_Interruption {
    public static void main(String[] args) {
        Task4 t4 = new Task4("TASK 4");
        t4.start();
        t4.interrupt(); // This cancels the sleep, and makes the thread start working imediately..
    }
}
