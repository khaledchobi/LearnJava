package learn.java.day9.w3resource;

import java.util.Scanner;

public class Ex_W3_11 {
    public static void main(String []args) { // Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
        Scanner in = new Scanner(System.in);
        // Using For loop
        int i,j,rows;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++)
                System.out.print(i);
            System.out.println("");
        }

        // Using While loop
        /*int i,rows;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1; i<=rows; i++){

            int count = 1;
            while(i>=count){
                System.out.print(i + " ");
                count++;
            }
            System.out.println("");
        }*/


    }
}
// Input number of rows : 10
//1
//22
//333
//4444
//55555
//666666
//7777777
//88888888
//999999999
//10101010101010101010