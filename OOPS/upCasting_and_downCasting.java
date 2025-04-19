package OOPS;

class Animal{
    public void sayHello(){
        System.out.println("...");
    }
}
class Dog extends Animal{
    @Override
    public void sayHello(){
        System.out.println("Woof");
    }
}

public class upCasting_and_downCasting {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sayHello(); // Ans.--> Woof
        Dog b = (Dog) a; // Downcasting
        b.sayHello(); // Ans.--> Woof
    }
}
