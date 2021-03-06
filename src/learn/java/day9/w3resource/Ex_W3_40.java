package learn.java.day9.w3resource;

import java.util.Scanner;

public class Ex_W3_40 {
    public static void main(String []args) { // Write a Java Program to display the pattern like pyramid using the alphabet.
        Scanner in = new Scanner(System.in);
        // Using For Loop
        int i, j, alph = 'A', n, blk, ctr = 1;
        System.out.println("Input the number of Letters (less than 26) in the Pyramid : ");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for(blk=1;blk<=n-i;blk++)
                System.out.print("  ");
            for (j = 0; j <= (ctr / 2); j++) {
                System.out.printf(" %c", alph++);
            }
            alph = alph - 2;

            for (j = 0; j < (ctr / 2); j++) {
                System.out.printf(" %c", alph--);
            }
            ctr = ctr + 2;
            alph = 'A';
            System.out.println("");
        }

        // Using While Loop
        /*int i, j, alph = 'A', n, blk, ctr = 1;
        System.out.println("Input the number of Letters (less than 26) in the Pyramid : ");
        n = in.nextInt();

        i = 1;
        while(i <= n){
            blk=1;
            while(blk<=n-i){
                System.out.print("  ");
                blk++;
            }
            j = 0;
            while(j <= (ctr / 2)){
                System.out.printf(" %c", alph++);
                j++;
            }
            alph = alph - 2;

            j = 0;
            while(j < (ctr / 2)){
                System.out.printf(" %c", alph--);
                j++;
            }
            ctr = ctr + 2;
            alph = 'A';
            System.out.println("");
            i++;
        }*/
    }
}

// Input the number of Letters (less than 26) in the Pyramid : 6
//          A
//        A B A
//      A B C B A
//    A B C D C B A
//  A B C D E D C B A
//A B C D E F E D C B A