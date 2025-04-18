package Interfaces;

public class Test {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sleep();
        System.out.println(Dog.Max_Age);
        System.out.println(Animals.Max_Age); // As in the same package( May be ).
        Animals.info();
//        Dog.info(); // Dog Can't inherit static methods from interfaces.
    }
}
