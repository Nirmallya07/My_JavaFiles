package OOPS;

public class protected_cons {

    public String name;
    public int age;
    private protected_cons(){}
    // can't create am object for this class.
    public static void sayHello(String s){
        System.out.println("Hello " + s + "!");
    }
}
