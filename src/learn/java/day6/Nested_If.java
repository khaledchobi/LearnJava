package learn.java.day6;

import java.util.Scanner;

public class Nested_If {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        String validUserName = "KHALED";
        String validPassword = "pass123";

        String uname, pass;

        System.out.println("Please enter Username: ");
        uname = reader.nextLine();

        if (uname.equalsIgnoreCase(validUserName)) {

            System.out.println("Please Enter Password: ");
            pass = reader.nextLine();

            if (pass.equalsIgnoreCase(validPassword)) {
                System.out.println("User Login Successful.....");

            } else {
                System.out.println("Username is Valid but Login Unsuccessful.....");
            }

        } else {
            System.out.println("Username is Not Valid....");
        }
    }
}