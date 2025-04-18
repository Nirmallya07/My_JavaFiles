package Multi_Threading;

class A extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i);
        }
    }
}

public class Demon_Threads {
    public static void main(String[] args) {
        A a = new A();
        a.setDaemon(true);
        // Now as soon as main thread terminates, jvm doesn't wait for thread 'a', 'a' also stops.
        // Thus, demon threads terminates when last user thread terminates. Even though demon thread is running...
        a.start();

        System.out.println("Hello, world!");
    }
}
