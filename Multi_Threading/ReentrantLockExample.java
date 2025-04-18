package Multi_Threading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* ReentrantLock is a concrete implementation of the Lock
interface that supports reentrancy (the same thread can
lock it multiple times). */

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock(); // Here, the thread aquiring this lock is the main thread.
        try {
            System.out.println("Outer Method");
            System.out.println(Thread.currentThread().getName() + " is having the lock.");
            innerMethod();
        } finally {
            lock.unlock();
            System.out.println("First lock opened " + Thread.currentThread().getName() + ".");
            lock.unlock();
            // After fully unlocking, the codes below will be uncertain because they will run concurrently (Random).
            // Place the below line above 2nd unlock() and the output will be in order.
            System.out.println("2nd lock opened for " + Thread.currentThread().getName() + ".");
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner Method");
        } finally {
//            lock.unlock();
        }
    }

    class MyThread extends Thread {
        ReentrantLockExample example = new ReentrantLockExample();
        MyThread(String name, ReentrantLockExample example) {
            super(name);
            this.example = example;
        }
        @Override
        public void run() {
            example.outerMethod();
        }
    }


    public static void main(String[] args) {
       ReentrantLockExample example = new ReentrantLockExample();
       MyThread t1 = example.new MyThread("t1", example);
       MyThread t2 = example.new MyThread("t2", example);
       t1.start();
       t2.start();

    }
}
