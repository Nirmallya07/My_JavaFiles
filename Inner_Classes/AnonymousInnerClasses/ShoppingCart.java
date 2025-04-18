package Inner_Classes.AnonymousInnerClasses;

public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment payment) {  // This means this method will take any object that implemets payment interface.
        // reference variable for Payment interface
        payment.pay(totalAmount);
    }
}
