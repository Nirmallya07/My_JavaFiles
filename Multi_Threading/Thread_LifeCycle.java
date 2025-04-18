package Multi_Threading;

class task2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {}

        System.out.println("Running method run..");

        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {}
    }
}
public class Thread_LifeCycle {
    public static void main(String[] args) throws InterruptedException {
        task2 t2 = new task2();
        task1 t1 = new task1("Task1");
        System.out.println("t2: " + t2.getName());
        System.out.println("t2 state: " + t2.getState());

        t2.start();
        System.out.println("t2: " + t2.getState());
        System.out.println(Thread.currentThread().getName());
        t1.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println("t2: " + t2.getState());

        System.out.println("t2 " + t2.getState()); //--> TIMED WAITING
        System.out.println("t1 " + t1.getState());
//        t1.wait(2000); // should be used with synchronized otherwise error.
        System.out.println("t1 state: " + t1.getState());
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
        System.out.println();

        t2.join(); // main thread should wait for t2 to get finished(terminated).
        System.out.println("t2 " + t2.getState());// --> TERMINATED
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
        Thread.currentThread().join(); // will never go to the next line.
        /*(Thread.currentThread()), it will never proceed to the next line because it is waiting for itself to
         finish. This will cause the program to get stuck and never reach the following lines of code.*/
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
        System.out.println("Hello.");
    }
}
