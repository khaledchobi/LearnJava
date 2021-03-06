package batch.covid.day3;

import java.util.Scanner;

public class SalesTax {
    public static void main(String args[]) {
        final double state_tax_percentage = 0.04;
        final double county_tax_percentage = 0.02;
        double purchase_amount;
        double county_tax;
        double state_tax;
        double total_sales_tax;
        double total_sale;

        Scanner scanner = new Scanner( System.in );

        System.out.println( "Please enter the purchase amount: " );
        purchase_amount = scanner.nextDouble();
        county_tax = county_tax_percentage * purchase_amount;
        state_tax = state_tax_percentage * purchase_amount;
        total_sales_tax = state_tax + county_tax;
        total_sale = total_sales_tax + purchase_amount;
        System.out.println("Purchase amount: $" + purchase_amount + "\nState sales tax: $"
                + state_tax + "\nCounty sales tax: $" + county_tax + "\nTotal sales tax: $"
                + total_sales_tax + "\nTotal sale: $" + total_sale);

    }
}
