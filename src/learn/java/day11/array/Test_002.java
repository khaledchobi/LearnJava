package learn.java.day11.array;

import java.util.Scanner;

public class Test_002 {
    public static void main(String[] args) { // String in reverse order and find palindrome.
        Scanner in = new Scanner(System.in);
        /*// Using For Loop
        System.out.println("Input a string to reverse : ");
        String s = in.nextLine();
        // convert String to character array
        // by using toCharArray
        char[] t = s.toCharArray();
        System.out.print("Reversed string is : ");
        for (int i = t.length - 1; i >= 0; i--)
            System.out.print(t[i]);
        System.out.println("");*/


        String original = "dad";
        String reverse = "";

        for (int i = original.length()-1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        /*System.out.print("Reversed string is : ");
        System.out.println(reverse);*/

        if (original.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
