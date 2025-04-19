package Interfaces;

public class Dog implements Animals {
    @Override
   public void eat() {
       System.out.println("Dog is Eating.");
   }

   @Override
   public void sleep() {
       System.out.println("Dog is sleeping.");
   }

}
