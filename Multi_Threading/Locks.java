package Multi_Threading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw.");
        try {

            if (lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
           /* If the thread doesn't get the lock within 1 second, it will giveup.
              If time is not specified, the thread will just check if lock is available.
              If not, the thread will move on and won't execute the code.

              Where as, Lock.lock waits forever until it gets the lock like synchronized keyword.
              But we can manually unlock the lock by Lock.unlock() unlike synchronized. */

                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal...");
                        Thread.sleep(10000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance.");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

/* Tried to same thing by creating a different thread class by my own and worked.

class CreatingThread extends Thread {
    private BankAccount bankAccount;
    CreatingThread(BankAccount bankAccount, String name) {
        super(name); // super(name) sould always be first.
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        bankAccount.withdraw(50);
    }
}*/
public class Locks {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

//***************************************************************************
//        Runnable task = () -> sbi.withdraw(50);
//        Annonymous class new form in lamda expression () ->.
//***************************************************************************

        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread1");
        Thread t2 = new Thread(task, "Thread2");

        /*CreatingThread T1 = new CreatingThread(sbi, "T1");
        CreatingThread T2 = new CreatingThread(sbi, "T2");
        T1.start();
        T2.start();*/

        t1.start();
        t2.start();

    }
}