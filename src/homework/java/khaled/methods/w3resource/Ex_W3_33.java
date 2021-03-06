package homework.java.khaled.methods.w3resource;

import java.util.Scanner;

public class Ex_W3_33 {
    static Scanner in = new Scanner(System.in);
    public static void main(String []args) { // Write a Java program to display Pascal's triangle.
        pascalTriangle();
    }
    public static int pascalTriangle(){
        int rows,c=1,blk,i,j;
        System.out.println("Input number of rows: ");
        rows = in.nextInt();
        i=0;
        while(i<rows){
            blk=1;
            while(blk<=rows-i){
                System.out.print("  ");
                blk++;
            }
            j=0;
            while(j<=i){
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.printf("%4d",c);
                j++;
            }
            i++;
            System.out.println("");
        }
        return i;
    }
}

// Input number of rows: 5
//             1
//           1   1
//         1   2   1
//       1   3   3   1
//     1   4   6   4   1