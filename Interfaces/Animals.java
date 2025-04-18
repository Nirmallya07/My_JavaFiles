package Interfaces;

public interface Animals {

    // Interfaces don't have constructors
    // Interfaces can have static and default methods.
    // If the static or default keyword is not used, the method will be assumed abstract and no-body can be made (No implementation).

    public static int Max_Age = 150;
    public void eat(); // correct way
    public abstract void sleep(); // correct way


    public static void info(){  // Classes can't inherit static methods.
        System.out.println("This is Animal Interface");
    }

    public default void run(){
        // Can only be called by the object of the
        // class that inherited this interface.
        System.out.println("Animals default method ");
    }

/*    It is not mandatory for class to override
      default methods, if not overridden, the default
      method will stay as it is.

      When two implemented interfaces have the same
      default method, the class that is implementing
      these interfaces will have to override the default
      method (Shown in Test2.java).
*/

}
