package Exceptions;

public class exception_basic {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 40, 200};
        int[] arr2 = {1, 20, 0, 10};

        for (int i = 0; i < 10; i++) { // i < arr2.length but to show indexOutOfBoundError.
            try {
                System.out.println(divide(arr1[i], arr2[i]));
            } catch (ArrayIndexOutOfBoundsException e) { // Will work, because this exception occurs here at the main loop
                System.out.println("Error: Array index out of bounds.");
//              break;                                   // Exit loop if an index is out of bounds
            }
        }

    }

    private static double divide(double a, double b) { // Will Throw INFINITY instead of error.
        System.out.println(a);
        System.out.println(b);
        return a/b;
    }

    private static double divide(int a, int  b) { // Will throw Arithmetic exception.
//        System.out.println(a);
//        System.out.println(b);

        try {
            return a/b;
        }
        catch (ArithmeticException e) {// Here, e is the reference variable to the ArithmeticException object.
            System.out.println(e);
            return -1;
        }
//        catch (ArrayIndexOutOfBoundsException i) { // Won't work because the exception occurs at the main loop, not inside the divide funtion
//            System.out.println(i);
//            return -1;
//        }
        // Everytime an exception occurs, JVM throws an exception object
    }

}
