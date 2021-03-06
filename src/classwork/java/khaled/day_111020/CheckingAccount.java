package classwork.java.khaled.day_111020;

public class CheckingAccount extends Account{

    private String accountNumber; //121-5454-546786  // 123-25-7890
    private String accountHolderName;
    private double balance;
    private final double INTEREST_RATE = 0.01;
    final int TRANSACTION_LIMIT = 10;


    public void setAccountNumber(String accNo){
        this.accountNumber = accNo;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountHolderName(String accName){
        this.accountHolderName = accName;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public void setBalance(double bal){
        this.balance = bal;

    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    void deposit(double amount) {
        this.balance+=  amount; // 100.00

    }

    @Override
    void withdraw(double amount) {
        this.balance -= amount;  //20.00

    }

    public void printStatement(){
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Current Balance: $"+ this.getBalance());
        System.out.println("Fixed Interest Rate: $"+ this.INTEREST_RATE);
        System.out.println("Transaction Limit: $"+ this.TRANSACTION_LIMIT);

    }

    public void printAccountInfo2(){
        super.printAccountInfo2();

    }


}
