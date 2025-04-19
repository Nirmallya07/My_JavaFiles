package Lamda_Expressions;

// An interface is called functional interface,
// IF IT ONLY HAS ONE ABSTRACT METHOD.
// doesn't matter how many default or static methods it has.
interface A {
    public void bio();
}


public class LamdaExpression  { // Do not implement when creating an Aannonymous class or lamda expression.
    public static void main(String[] args) {
        String name = "Glenn";
        A a = () -> System.out.println("Hello "  + "!"); // For a single line you don't need {} brackets.
        a.bio();
    }
}