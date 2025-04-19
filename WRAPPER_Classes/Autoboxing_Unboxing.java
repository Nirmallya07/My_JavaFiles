package WRAPPER_Classes;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {

        // AUTOBOXING
        Integer a = Integer.valueOf(1);
        /* The above one is redundant as 1 is directly
        converted from primitive to wrapper class object */

        Integer b = 1; // ( This is called AUTOBOXING ).

        // UNBOXING
        int c = b; // Wrapper object --> Primitive data type.
        int d = a.intValue(); // Redundant method, but still can be done.

        // Can hold null as Integer is object but int can only hold 0;
        Integer x = null;
//        int y = null; // Error

    }
}
