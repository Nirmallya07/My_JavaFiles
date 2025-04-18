package Inner_Classes.AnonymousInnerClasses;

public class Test {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(150);
        CreditCard creditCard = new CreditCard();
        shoppingCart.processPayment(creditCard);
    /*
         Instead of making a separate class than implementing the damn
         interface or a subclass that is inheriting another class
         we can achieve the same thing using anonymous classes
         at the same class.
    */
        shoppingCart.processPayment(new Payment() { // Anonymous Inner class
            @Override
            public void pay(double amount){
                System.out.println("Paid " + amount + " using Anonymous Inner class.");
            }
        });
    }
}
