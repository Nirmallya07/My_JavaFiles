package Multi_Threading;

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("B-Run" + i);
        }
    }
}

class C implements Runnable {
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("C-Run" + i);
        }
    }
}

public class RunnableInterfaceBasic {
    public static void main(String[] args) {
        C t1 = new C();
        Thread T1 = new Thread(t1);
        T1.start();
        B t2 = new B();
        Thread T2 = new Thread(t2);
        T2.start();
    }
}
