package Multi_Threading;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to access " + paper);
        paper.finishWriting();
    }
    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPenandPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to access " + pen);
        pen.finishWriting();
    }
    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        /*Why don't T1 and T2 run independently if they’re different threads and the objects are different?

          Because they’re both trying to use the same two shared resources — pen and paper — and the order in
          which they acquire locks can lead to a deadlock. */

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // 1sy way to remove deadlock.
                // Give deadlock of paper to instance before the other one gets it.
//                synchronized (paper) {
//                    pen.writeWithPenAndPaper(paper); // Pen → Paper
//                }
                pen.writeWithPenAndPaper(paper); // Pen → Paper
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                paper.writeWithPenandPaper(pen); // Paper → Pen
            }
        };

        Thread T1 = new Thread(r1, "T1");
        Thread T2 = new Thread(r2, "T2");

        T1.start();
        // 2nd way to counter DeadLock.
        // Let one instance complete the work before any other instance gets any lock.
//        try {
//            Thread.sleep(200);
//        } catch (Exception e) {
//            Thread.currentThread().interrupt();
//        }
        T2.start();

    }
}
