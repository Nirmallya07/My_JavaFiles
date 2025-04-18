package Math_class;

public class math_class_basic {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = -46;
        double d1 = 1.52;
        double d2  = 1.45;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.abs(c));
        System.out.println(Math.round(d1)); //--> 2
        System.out.println(Math.round(d2)); //--> 1
        System.out.println(Math.floor(d1));
        System.out.println(Math.ceil(d1));
        System.out.println(Math.class);

        // Calculating Area..

        int rad = 2;
        System.out.println("Area: " + Math.PI * Math.pow(rad, 2));
        System.out.println(3.14 * 2 * 2);

        // LOG
        System.out.println(Math.log(10));
        System.out.println(Math.log10(10));
        System.out.println(Math.log10(2));

        // Random
        System.out.println(Math.random()); // Anything between 0 and 1.
        System.out.println(Math.random() * 100); // Anything between 0 and 100
        System.out.println((int)(Math.random() * 100)); // Anything between 0 and 100 but in integer form.

        // Degree to Radian
        System.out.println(Math.toRadians(180));

        // NextAfter --> Returns a number just next to the given number in the specified direction in float.
        System.out.println(Math.nextAfter(1,2));
        System.out.println(Math.nextAfter(1,0));
    }
}
