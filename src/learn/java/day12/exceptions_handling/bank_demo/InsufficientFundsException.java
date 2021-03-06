package learn.java.day12.exceptions_handling.bank_demo;

public class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}

