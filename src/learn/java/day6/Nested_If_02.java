package learn.java.day6;

import java.util.Scanner;
public class Nested_If_02 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String username, password;

        System.out.print("Enter username:");//username:user

        username = s.nextLine();

        System.out.print("Enter password:");//password:user

        password = s.nextLine();

        if(username.equals("Khaled") && password.equals("1234"))

        {

            System.out.println("Authentication Successful");

        }

        else

        {

            System.out.println("Login Unsuccessful");

        }

    }

}
