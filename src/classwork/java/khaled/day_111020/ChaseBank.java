package classwork.java.khaled.day_111020;

public class ChaseBank implements Bank, ServiceCharge, AnnualFee{

    @Override
    public double rateOfInterest() {
        return 0.15;
    }

    @Override
    public double chargeRate() {
        return 15.0;
    }

    @Override
    public double annualFee() {
        return 11.0;
    }
}
