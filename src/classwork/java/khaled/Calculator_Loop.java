package classwork.java.khaled;

import java.util.Scanner;

public class Calculator_Loop {

    static Scanner reader = new Scanner(System.in);  //global variable

    public static void main(String[] args) {
        calculator();


    }




    public static void calculator(){
        System.out.println("Press 1 for Addition.\nPress 2 for Deletion.\nPress 3 for Multiplication.\nPress 4 for Division.\nPress 5 for Exit.");

        System.out.println("Please Enter Your Choice: ");
        int choice = reader.nextInt();  // local variable

        switch(choice){
            case 1:
                System.out.println("Welcome to Addition World!!!");

                System.out.println("Please Enter 1st number: ");
                int num1=reader.nextInt();

                System.out.println("Please Enter 2nd number: ");
                int num2=reader.nextInt();

                addition(num1, num2);
                break;

            case 2:
                System.out.println("Welcome to Deletion World!!!");
                break;

            case 3:
                System.out.println("Welcome to Multiplication World!!!");
                break;

            case 4:
                System.out.println("Welcome to Division World!!!");
                break;

            case 5:
                System.out.println("Thank You for using the app!!!");
                System.exit(0);

            default:
                System.out.println("Wrong Choice. Try Again");

        }
    }


    public static void addition(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result:" + result);

    }

}


/*
 *   \n -- new line
 *   \t -- tab
 * */


/*
 * 1. For loop
 * 2. While loop
 * 3. Do While loop
 *
 * */
