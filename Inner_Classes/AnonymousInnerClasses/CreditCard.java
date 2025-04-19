package Inner_Classes.AnonymousInnerClasses;

public class CreditCard implements Payment{

    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using credit card.");
    }
}
