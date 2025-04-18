package WRAPPER_Classes;

public class wrapper_basic {
    public static void main(String[] args) {
        int a = 1; // No methods available for 'a'.
        // The data will get stored in the stack as it is primitive.

        Integer b = 1; // Methods are available for this.
        // The reference variable b is object so 1 will get stored in the Heap.

        // Testing some of the Integer wrapper class methods just for example...
        System.out.println(b.toString());
        System.out.println(b.getClass().getName());

        Float f = 1.2f;
        Double d = 1.2;
        Character c = 'c';
        Boolean e = false;
        Byte bb = 12;
        Short s = 2;
        Long l = 123l;

        Integer a1 = 3;
        Integer a2 = 3;
        System.out.println(a1 + a2);
        System.out.println(a1 == a2); // true
        System.out.println(a1.equals(a2)); // true .. equals() is used fpr object types mainly.

    }
}

