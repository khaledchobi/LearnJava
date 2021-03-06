package homework.java.khaled.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_51 {
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a program in Java to convert an octal number to a decimal without using an array.
        octalToDecimal();
    }
    public static int octalToDecimal(){
        int n, n5, p=1, k, ch=1, dec=0, i=1, j, d;
        System.out.println("Convert Octal to Decimal : ");
        System.out.println("Input an octal number (using digit 0 - 7) : ");
        n = in.nextInt();
        n5=n;

        while(n>0){
            k=n % 10;
            if(k>=8)
            {
                ch=0;
            }
            n=n/10;
        }

        switch(ch)
        {
            case 0 :
                System.out.println("\nThe number is not an octal number. \n\n");
                break;
            case 1:
                n=n5;

                j=n;
                while(j>0){
                    d = j % 10;
                    if(i==1)
                        p=p*1;
                    else
                        p=p*8;

                    dec=dec+(d*p);
                    i++;
                    j=j/10;
                }
                System.out.println("The Octal Number : " + n5 + "." + "\nThe equivalent Decimal Number : " + dec + ".");
                break;
        }
        return n;
    }
}

// Convert Octal to Decimal:
// -------------------------
//Input an octal number (using digit 0 - 7) :745
//
//The Octal Number : 745
//The equivalent Decimal  Number : 485