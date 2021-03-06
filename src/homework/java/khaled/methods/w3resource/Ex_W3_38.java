package homework.java.khaled.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_38 {
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a program in Java to check whether a number is a palindrome or not.
        palindromeNumber();
    }
    public static int palindromeNumber(){
        int num,r,sum=0,t;
        System.out.println("Input a number: ");
        num = in.nextInt();
        t=num;
        while(num!=0){
            r=num % 10;
            sum=sum*10+r;
            num=num/10;
        }
        if(t==sum)
            System.out.println(t + " is a palindrome number.");
        else
            System.out.println(t + " is not a palindrome number.");
        return t;
    }
}

// Input a number: 121
//121 is a palindrome number.