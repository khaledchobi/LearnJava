package batch.covid.day3;

import java.util.Scanner;

public class RestaurantBill {
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        double meal_cost, tax, total_cost, tip, total_bill;

        System.out.println( "Please enter the cost of the meal: " );
        meal_cost = scanner.nextDouble();

        tax = 0.0675 * meal_cost;
        total_cost = meal_cost + tax;
        tip = 0.15 * total_cost;
        total_bill = total_cost + tip;

        System.out.println( "Cost of meal: $" + meal_cost );
        System.out.println( "Tax: $" + tax );
        System.out.println( "Tip: $" + tip );
        System.out.println( "Total Bill: $" + total_bill );

    }


}
