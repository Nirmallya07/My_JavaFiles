package Interfaces;

interface A {
    default String sayHello(String a) {
        return "Interface A Hello " + a;
    }
}

interface B {
    default String sayHello(String a) {
        return "Interface B Hello " + a;
    }
}

public class Test2 implements A, B {
    @Override
    public String sayHello(String a) {
        /*
           Overridden common default method sayHello()
           to counter diamond ambiguity problem.
         */
        return "Main class Hello " + a;
    }
    public static void main(String[] args) {
        Test2 obj = new Test2();
        String a = obj.sayHello("Nirmallya");
        System.out.println(a);
    }
}
