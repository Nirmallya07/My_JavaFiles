package Multi_Threading;

class task1 extends Thread {
    String a;
    task1(String a) {
        this.a = a;
    }
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(a);
        }
    }
}
public class ThreadClassBasic {
    public static void main(String[] args) {
        task1 t1 = new task1("Task through t1.");
        task1 t2 = new task1("Task through t2.");
        t1.start();
//      t1.start(); // Unchecked (RunTime Exception)
        /* IllegalThreadStateException . Occurs when you want to
           start a thread that has only been started.*/
        t2.start();
    }
}
