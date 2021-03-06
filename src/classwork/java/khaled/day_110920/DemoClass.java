package classwork.java.khaled.day_110920;

public class DemoClass { // Stand-a-lone class


    public static void main(String[] args) {
        BankAccount objKhaledAccount = new BankAccount();
        objKhaledAccount.setAccountHolderName("Khaled Hassan");
        objKhaledAccount.setAccountNumber("987-65-4321");
        objKhaledAccount.printStatement();

        System.out.println("\n");

        BankAccount objNaimAccount = new BankAccount();
        objNaimAccount.setAccountHolderName("Naim Islam");
        objNaimAccount.setAccountNumber("123-45-6789");
        objNaimAccount.setBalance(100.00);
        objNaimAccount.printStatement();

        System.out.println("\n");

        BankAccount objShamimAccount = new BankAccount();
        objShamimAccount.printStatement();


        CheckingAccount objAmdadAccount = new CheckingAccount();
        objAmdadAccount.printStatement();
//        objAmdadAccount.setAccountNumber("123-45-6789");
//        System.out.println(objAmdadAccount.getAccountNumber());


    }
}
