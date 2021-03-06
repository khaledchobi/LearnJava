package classwork.java.khaled.day_110920;

public class CheckingAccount extends BankAccount{
    private double interestRate;

    public CheckingAccount(){
        super();
        this.interestRate = 0.9;
    }


    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void printStatement(){
        System.out.println("Interest rate: $"+ this.interestRate);
        super.printStatement();
    }
}
