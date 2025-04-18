package Exceptions;

class Bank1 {
private int balance;

public void setBalance(int balance) {
    this.balance = balance;
}

public void withdraw(double amount) throws InsufficientFundsException {
    if (amount > balance) {
        throw new InsufficientFundsException();
    }

    System.out.println("You have successfully withdrawn.");
    balance -= amount;
}
    }

public class using_CustomException {
    public static void main(String[] args) {
        Exceptions.Bank1 obj = new Exceptions.Bank1();
        obj.setBalance(100);
        try {
            obj.withdraw(50);
            obj.withdraw(10);
            obj.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.err.println("e.getMessage: " + e.getMessage());
            System.err.println("e: " + e);
        }
    }
}

