package Static_Keyword_ImportantFiles;

class Example{
//    static {
//        class A extends static_meth_Blocks{
//            public static void main(String[] args) {
//                System.out.println("I know a this is wild.");
//
//            }
//        }
//    }

    /* A class cannot be defined inside a static block */

    static class A extends static_meth_Blocks{
        public String sayHello1(String str){
            return sayHello(str);
        }
        public static void main(String[] args) {
            System.out.println("I know this is wild.");
            System.out.println(args[0]);
            System.out.println(args[1]);

        }
        // Instance block starts whenever an object of A is created.
        {
            System.out.println("Instantiating block of class A.");
        }

        static {
            for (int i =1; i<=3; i++){
                System.out.println("Static block of class A " + i);
            }
        }

    }

    class B {
        public static void main(String[] args) {
            A obj = new A();
            String a = obj.sayHello("Nirmallya"); // Because you have created the object of class A which inherits sayHello().
            String b = obj.sayHello1("Alicia");
            System.out.println(a);
            System.out.println(b);
        }

        static {
            System.out.println("This is static block of class B.");
        }
    }


    public static int sum(int a, int b){
        return a + b;
    }
}

public class static_meth_Blocks {

    protected String sayHello(String str){
        return "Hello " + str + "!";
    }

    public static void main(String[] args) {

        int s = Example.sum(2, 3);
        System.out.println(s);
        Example.A.main(new String[] {"Java", "is", "fun"}); // CMD arguments.

        Example.B.main(null);

        /* Output Prediction
            5
            Static block of class A 1
            Static block of class A 2
            Static block of class A 3
            I know this is wild.
            Java
            is
            This is static block of class B.
            Instantiating block of class A.
            Hello Nirmallya
            Hello Alicia
         */


    }
}

