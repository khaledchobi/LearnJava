package homework.java.khaled.methods;

import java.util.Scanner;

public class Test {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //fullName("Khaled", "Al", "Hasan");
        fullName_01("Khaled", "", "Hasan");

    }

    public static void fullName(String fName, String mName, String lName){
        String full_Name = fName.toUpperCase() + " " + mName.toLowerCase().charAt(0) + " " + lName.toUpperCase();
        System.out.println("Full Name: " + full_Name);


    }

    public static void fullName_01(String fName, String mName, String lName){
        if(mName.equalsIgnoreCase("")){
            String full_Name = fName.toUpperCase() + " " + lName.toUpperCase();
            System.out.println("Full Name: " + full_Name);
        }
        else{
            String full_Name = fName.toUpperCase() + " " + mName.toLowerCase().charAt(0) + " " + lName.toUpperCase();
            System.out.println("Full Name: " + full_Name);
        }


    }

}
