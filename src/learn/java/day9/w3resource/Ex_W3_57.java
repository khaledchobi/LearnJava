package learn.java.day9.w3resource;

import java.util.Scanner;

public class Ex_W3_57 {
    public static void main(String[] args) { // Write a program in Java to print a string in reverse order.
        Scanner in = new Scanner(System.in);
        // Using For Loop
        System.out.println("Input a string to reverse : ");
        String s = in.nextLine();
        // convert String to character array
        // by using toCharArray
        char[] t = s.toCharArray();
        System.out.print("Reversed string is : ");
        for(int i = t.length - 1; i >=0;i--)
            System.out.print(t[i]);
            System.out.println("");

        // Using While Loop
        /*System.out.println("Input a string to reverse : ");
        String s = in.nextLine();
        // convert String to character array
        // by using toCharArray
        char[] t = s.toCharArray();
        System.out.print("Reversed string is : ");

        int i = t.length - 1;
        while(i >= 0){
            System.out.print(t[i]);
            i--;
        }
            System.out.println("");*/


        // Using For Loop
        /*System.out.println("Input a string to reverse : ");
        String str = in.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.print("Reversed string is : ");
        System.out.println(reverse);*/
    }
}

// Print a string in reverse order:
// -------------------------------------
//Input a string to reverse : Welcome
//Reversed string is: emocleW