package classwork.java.khaled.day_110920;

public class BankAccount {
    //Fields
    private String accountNumber; //121-5454-546786  // 123-25-7890
    private String accountHolderName;
    private double balance;

    public BankAccount(){
        this.accountNumber = "Some Account Number";
        this.accountHolderName = "Some Name";
        this.balance = 20.0;
    }


    public void setAccountNumber(String acc){
        this.accountNumber = acc;
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



    //Methods
    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }



    public void printStatement(){
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: $"+ this.balance);
    }
}
