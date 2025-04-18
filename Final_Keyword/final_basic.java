package Final_Keyword;

/*
    Note :There is no point of using the final keyword with constructor methods
          because constructor *//*methods don't get override.
*/

class utils {
    public static final double pi = 3.14159;
    public static double vary = 7.145;
    // pi can't be changed by final_basic.pi
    public final void safetyBagsFrontSide() {  // can't Override
        System.out.println("4 Air Bags");
    }
    /* Static methods can't be overridden because
    they are specific to a class and doesn't make
    any sense to override. */
    public static void safetyBagsBackSide() {
        System.out.println("4 bags");
    }

    public void wheelColor() {
        System.out.println("Black"); // Default (Not Hardcoded)
    }
}


class carCompanyXYZ extends utils {

//    public static void safetyBagsFrontSide(){ // Overriding not possible.
//        System.out.println("2 Bags");
//    }

    // Can't override a final method.
    // So greedy company 'XYZ' have to install al 4 bags at front seat.
    public static void safetyBagsBackSide() {
        System.out.println("2 Bags");
    }

    @Override
    public void wheelColor() {
        System.out.println("Blue");
    }
}

final class B { // This class can't be inherited.
    int a = 64;
    String str = "Hello";
    static String str1 = "Hello1";
}

//class C extends B{ can't inherit a final class
//}

public class final_basic {
    public static void main(String[] args) {
//        utils.pi = 45 // Can't change this
        utils.vary = 45;
        System.out.println(utils.vary);
        System.out.println(utils.pi);
        utils obj = new utils();
        obj.safetyBagsFrontSide();
        carCompanyXYZ.safetyBagsBackSide();
        utils.safetyBagsBackSide();
        obj.wheelColor();
        carCompanyXYZ obj2 = new carCompanyXYZ();
        obj2.wheelColor();
        obj2.safetyBagsFrontSide();// Inherited from utils but can't override due to final.
        System.out.println(B.str1);
        B obj3 = new B();
        System.out.println(obj3.str);
        System.out.println(obj3.a);
    }
}
