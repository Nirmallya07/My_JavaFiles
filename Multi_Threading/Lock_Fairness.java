package Multi_Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* Lock fairness is giving chance to all threads to
access a particular resource. Sometimes, there can be
a scenario where there are many threads trying to access
a particular resource but it may happen that some threads
are not getting any chance to access, so ReentrantLock(true)
gives fair chance to all. May not be in same order as I written
on code but no thread will be left. All threads will get their
chances fairly. */

/* Think of it like so many hungry chindren begging for food from a
Truck in a rush order, but reentrantLock(true) tells them to stand in line.*/
public class Lock_Fairness {
//
    private final Lock lock = new ReentrantLock(true);
//    private final Lock lock = new ReentrantLock();

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " aquired the lock.");
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Lock_Fairness lockFairness = new Lock_Fairness();
        Runnable task = new Runnable() {
            @Override
            public void run(){
                lockFairness.accessResource();
            }
        };
        Thread t1 = new Thread(task,"Thread1");
        Thread t2 = new Thread(task,"Thread2");
        Thread t3 = new Thread(task,"Thread3");
        Thread t4 = new Thread(task,"Thread4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
