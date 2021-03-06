package homework.java.khaled.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_12 {
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a program in Java to make such a pattern like right angle triangle with number increased by 1.

        rTriangleAddNumber();
    }
    public static int rTriangleAddNumber(){
        int i,rows, k = 1;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        for(i=1; i<=rows; i++){

            int j = 1;
            while(i>=j){
                System.out.print(k++ + " ");
                j++;
            }
            System.out.println(" ");
        }
        return i;
    }
}
// Input number of rows : 4
//1
//2 3
//4 5 6
//7 8 9 10