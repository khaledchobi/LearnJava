package batch.covid.day3;

public class SalesPrediction {

    public static void main(String args[]){
        int total_sales = 4600000;
        double sales_percent = 0.62;
        double result = (sales_percent * total_sales);

        System.out.println("The East coast sales division will make 62% of 4600000, which is $" + result + "." );

    }
}
