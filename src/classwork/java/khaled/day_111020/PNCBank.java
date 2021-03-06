package classwork.java.khaled.day_111020;

public class PNCBank extends CheckingAccount implements Bank, ServiceCharge, AnnualFee{

    @Override
    public double rateOfInterest() {
        return 0.12;
    }

    @Override
    public double chargeRate() {
        return 10.0;
    }

    @Override
    public double annualFee() {
        return 9.0;
    }
}
