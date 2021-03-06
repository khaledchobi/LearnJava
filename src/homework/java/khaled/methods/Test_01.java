package homework.java.khaled.methods;

import java.util.Scanner;

public class Test_01 {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please Enter How many names you want to store: ");
        int size = reader.nextInt();
        reader.nextLine();

        String names[] = new String[size]; // --> 1

        for(int i=0; i< names.length;i++){  // names.length --> 1
            System.out.println("Please Enter Your Name: ");
            names[i] = fullName_01();
        }
        for(int j = 0; j<names.length; j++){
            System.out.println( "names[" + j + "]: " + names[j]);
        }
    }

    public static String fullName_01(){
        String fName, lName;
        System.out.println("Please Enter Your First Name: ");
        fName = reader.nextLine();
        System.out.println("Please Enter Your Last Name: ");
        lName = reader.nextLine();

        String full_Name = fName + " " + lName;
        //System.out.println("Full Name: " + full_Name);
        return full_Name;

    }
}
