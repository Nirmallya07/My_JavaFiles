package Multi_Threading;


/* Try without Synchronized and you will get less than 200 and
may get 2000 sometimes */

/* The incorrect answer that we were getting without synchronization
where a particular resource (block of clode) that is accesed by many
objects is called Race Condition */

class Counter {
    private int count = 0;

    public void incrementCount() {
        synchronized (this){ // this ==> refers to the instance i.e the partivular obj like t1 or t2.
            count++;
        }
    }
    // Here you can include the particular block of code that needs to be synchronized.
    // This particular block of code is called the critical section.


//    // OR can be done like this.
//    public synchronized void incrementCount() {
//        count++;
//    }

    public int getCount() {
        return count;
    }
}

class MyThreadAtSynchro extends Thread {

    private Counter counter;
    MyThreadAtSynchro(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.incrementCount();
        }
    }
}



public class Synchronized {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadAtSynchro t1 = new MyThreadAtSynchro(counter);
        MyThreadAtSynchro t2 = new MyThreadAtSynchro(counter);
        t1.start();
        t2.start();

//       System.out.println(counter.getCount()); // main method printed the result before even t1 and t2 got finished.
        // wait for t1 and t2 to get finished

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(counter.getCount());

    }
}
