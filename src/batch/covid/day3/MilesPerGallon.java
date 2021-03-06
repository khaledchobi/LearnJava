package batch.covid.day3;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        double user_miles;
        double user_gallons;
        double miles_per_gallon;

        System.out.println( "Please enter the miles: " );
        user_miles = scanner.nextDouble();

        System.out.println( "Please enter the gallons of gas used: " );
        user_gallons = scanner.nextDouble();

        miles_per_gallon = user_miles / user_gallons;
        System.out.println( "Miles per gallon is " + miles_per_gallon );


    }
}
