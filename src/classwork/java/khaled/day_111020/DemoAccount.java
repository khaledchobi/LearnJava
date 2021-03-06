package classwork.java.khaled.day_111020;

public class DemoAccount {

    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setBalance(20.00);
        acc.deposit(100.00);
        acc.withdraw(20.00);
        acc.printStatement();

        acc.printAccountInfo();

        CheckingAccount accKhaled = new CheckingAccount();
        accKhaled.setAccountHolderName("Khaled Hasan");
        accKhaled.setAccountNumber("929-336-8556");
        accKhaled.setBalance(20.00);
        accKhaled.deposit(100.00);
        accKhaled.withdraw(30.00);
        accKhaled.printStatement();

        acc.printAccountInfo2();



        PNCBank pncBank = new PNCBank();
        System.out.println("Interest Rate of PNC Bank : " + pncBank.rateOfInterest());
        System.out.println("Charge Rate of PNC Bank : " + pncBank.chargeRate());
        System.out.println("Annual Fee of PNC Bank : " + pncBank.annualFee());



        CitiBank citiBank = new CitiBank();
        System.out.println("Interest Rate of Citi Bank : " + citiBank.rateOfInterest());
        System.out.println("Charge Rate of Citi Bank : " + citiBank.chargeRate());
        System.out.println("Annual Fee of Citi Bank : " + citiBank.annualFee());

        ChaseBank chaseBank = new ChaseBank();
        System.out.println("Interest Rate of Chase Bank : " + chaseBank.rateOfInterest());
        System.out.println("Charge Rate of Chase Bank : " + chaseBank.chargeRate());
        System.out.println("Annual Fee of Chase Bank : " + chaseBank.annualFee());
    }
}
