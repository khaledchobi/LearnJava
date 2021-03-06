package learn.java.day6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String []args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please Enter a number between 0-5: ");
        int input = reader.nextInt();

        switch(input) {

                case 0:
                    System.out.println("ZERO");
                    break;

                case 1:
                    System.out.println("ONE");
                    break;

                case 2:
                    System.out.println("TWO");
                    break;

                case 3:
                    System.out.println("THREE");
                    break;

                case 4:
                    System.out.println("FOUR");
                    break;

                case 5:
                    System.out.println("FIVE");
                    break;

                default:
                    System.out.println("The number you entered is not matching.. Try Again");
        }
    }
}


/*
 * 1. Switch statement executes one statement from multiple conditions.
 * 2. Its like if-else-if ladder statement.
 * 3. Switch statement works with byte, short, int, long, enum types, String and some wrapper Byte, Short, Int, Long
 *
 * Points to Remember:
 *   a. There can be one or N numbers of case values for a switch expression.
 *   b. The case value must be of switch expression type only.
 *   c. The case values must be unique.
 *   d. Each case statement can have a break statement which is optional.
 *   e. The case value can have a default label.*
 *
 * Syntax:
 *   switch(expression){
 *       case value1:
 *               // code to executed;
 *               break;
 *       case value2:
 *               // code to executed;
 *               break;
 *          ..........
 *
 *      default:
 *               // code to executed;
 *
 *
 *   }
 *
 * */

