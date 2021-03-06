package classwork.java.khaled.day_111020;

abstract class Account {

    //Methods
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    final void printAccountInfo(){
        System.out.println("Account Info  1 printed.....");
    }

    void printAccountInfo2(){
        System.out.println("Account Info  2 printed.....");
    }


}
