package classwork.java.khaled.day_111020;

public class CitiBank implements Bank, ServiceCharge, AnnualFee{

    @Override
    public double rateOfInterest() {
        return 0.10;
    }

    @Override
    public double chargeRate() {
        return 5.0;
    }

    @Override
    public double annualFee() {
        return 8.0;
    }
}
