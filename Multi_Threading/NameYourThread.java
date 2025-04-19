package Multi_Threading;


class Task3 extends Thread {
    Task3(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : Priority : " + Thread.currentThread().getPriority() );
        Thread.currentThread().setPriority(9); // RANGE --> 1 to 10.
        System.out.println(Thread.currentThread().getName() + " : Priority : " + Thread.currentThread().getPriority() );
    }
}
public class NameYourThread {
    public static void main(String[] args) {
        Task3 t3 = new Task3("TASK3");
        t3.start();
    }
}
