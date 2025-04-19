package Exceptions;

public class ErrorHandled_StackTrace {
    public static void main(String[] args) {
        try {
            level1();
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("----------------------------------");
            // To print the stack trace.
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[i]);
            }
        }
    }
    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
