package Exceptions;

class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException() {
        super("You don't have enough money.");
    }
}

