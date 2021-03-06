package learn.java.day8;
import java.util.Scanner;

public class Scan_01 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.println("Please enter First number");
        num1 = reader.nextInt();

        System.out.println("Please enter Second number");
        num2 = reader.nextInt();

        System.out.println("Please enter Third number");
        num3 = reader.nextInt();

        System.out.println("Please enter Fourth number");
        num4 = reader.nextInt();

        System.out.println("Please enter Fifth number");
        num5 = reader.nextInt();
        reader.nextLine();

        System.out.println("Please enter Your Name");
        String name = reader.nextLine();
        System.out.println("Your Name: " + name);



        if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
            System.out.println("Num1 is the largest number.");
        }
        else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
            System.out.println("Num2 is the largest number.");
        }
        else if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
            System.out.println("Num3 is the largest number.");
        }
        else if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
            System.out.println("Num4 is the largest number.");
        }

        else{
            System.out.println("Num5 is the largest number.");
        }

    }
}
