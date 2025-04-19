package Exceptions;

class Bank {
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance.");
        }

        System.out.println("You have successfully withdrawn.");
        balance -= amount;
    }
}

public class ThrowNewException {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.setBalance(100);
        try {
            obj.withdraw(50);
            obj.withdraw(10);
            obj.withdraw(200);
        } catch (Exception e) {
            System.err.println("e.getMessage: " + e.getMessage());
            System.err.println("e: " + e);
        }
    }
}