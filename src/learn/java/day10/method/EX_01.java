package learn.java.day10.method;

import java.util.Scanner;

public class EX_01 {
    public static void main(String []args) {
        printPyramid();
        addition(10, 20);
        printPyramid();
    }

    public static void printPyramid(){ // Method Header

        // Method body..
        Scanner in = new Scanner(System.in);
        int i,j,rows;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1;i<=rows;i++){ // Outer for loop
            for(j=1;j<=i;j++) // Inner for loop
                System.out.print(j);
            System.out.println("");
        }
        addition(30, 20);
    }

    public static void addition(int num1, int num2){

        System.out.println(num1 + num2);
    }
}

// 1. method declaration
//      a. access modifier
//      b. return/output type
//      c. method name
//      d. input type
// 2. method calling