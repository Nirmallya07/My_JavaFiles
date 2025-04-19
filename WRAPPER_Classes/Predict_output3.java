package WRAPPER_Classes;

public class Predict_output3 {
    public static void main(String[] args) {
        Integer b = 1;
        fun(b);
        System.out.println(b);
    }
    // Now there's a catch here, 2 and 1 are different object.
    // so " a = 2 " is a new object.

    public static void fun(Integer a) {
        a = 2; // Has different reference that b = 1;
    }
    // Output: 1
}