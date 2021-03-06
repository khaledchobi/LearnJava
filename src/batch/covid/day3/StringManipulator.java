package batch.covid.day3;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        String user_favorite_city;

        System.out.println( "Please enter the name of your favorite city: " );
        user_favorite_city = scanner.nextLine();

        System.out.println( "The number of characters in " + user_favorite_city + " is " +  user_favorite_city.length() + ".");
        System.out.println( user_favorite_city + " converted to upper case is " +  user_favorite_city.toUpperCase() + ".");
        System.out.println( user_favorite_city + " converted to lower case is " +  user_favorite_city.toLowerCase() + ".");
        System.out.println( "The first character in " + user_favorite_city + " is " + user_favorite_city.charAt( 0 ) + ".");

    }

}
