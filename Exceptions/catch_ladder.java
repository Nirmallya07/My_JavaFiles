package Exceptions;

public class catch_ladder {

    static int divide(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        int a = 0; // It is necessary to initialize 'a' here.
        try {
            a = divide(10, 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
//            return -1; // Baseless claim. as the main function is void, so it doesn't return anything.
        }
        catch (RuntimeException e) { // Throws a RuntimeExceptiom object reference as e.
            System.out.println(e);
        }
//        catch (ArithmeticException e) { // Nonsense, as this exception is subclass of RuntimeEx.. so already that error is catched.
//        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(a);
    }
}
