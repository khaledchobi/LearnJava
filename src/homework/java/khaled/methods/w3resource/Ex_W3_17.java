package homework.java.khaled.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_17 {
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
        pyramidRepeatNum();
    }
    public static int pyramidRepeatNum(){
        int i,j,rows,s,k;
        System.out.println("Input number of rows : ");
        rows = in.nextInt();

        s = rows+4-1;
        for(i=1;i<=rows;i++){
            for(k=s;k!=0;k--)
            {
                System.out.print(" ");
            }
            j=1;
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            s--;
        }
        return i;
    }

}
// Input number of rows : 5
//        1
//       2 2
//      3 3 3
//     4 4 4 4
//    5 5 5 5 5
