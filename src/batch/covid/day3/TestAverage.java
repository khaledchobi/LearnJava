package batch.covid.day3;

import java.util.Scanner;

public class TestAverage {
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        double first_score, second_score, third_score;
        double average;

        System.out.println( "Please enter the first Score" );
        first_score = scanner.nextDouble();
        System.out.println( "Please enter the second Score" );
        second_score = scanner.nextDouble();
        System.out.println( "Please enter the third Score" );
        third_score = scanner.nextDouble();
        average = ( first_score + second_score + third_score ) / 3;

        System.out.println( "The average of " + first_score + "," + second_score + " and " + third_score + " is " + average + ".");



    }

}
