package Exceptions;

// Look at Runtime Console after running this file and see the stack.
public class Error_stackTrace {
    public static void main(String[] args) {
        level1();
    } // main Throw exception.

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    } // Level3 Throw exception.

    public static void level2() {
        level3();
    } // Level2 Throw exception.

    public static void level1() {
        level2();
    } // Level1 Throw exception.
}

