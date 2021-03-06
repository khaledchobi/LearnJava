package www.hackerrank.com.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day_07 {
    public static void printRevArray(int[] A){
        for (int i=(A.length-1);i>=0;i--){
            System.out.print(A[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N>=1 && N<=1000){ //constraint 1 satisfied ---> total number of elements
            int[] A = new int[N];
            int i = 0;
            while (i < N){
                int num = scanner.nextInt();
                if (num>=1 && num <=10000){ //constraint 2 satisfied ---> input number range
                    A[i] = num;
                    i++;
                }else{
                    System.out.println("bad number"); //to know if there's an invalid input
                }
            }
            printRevArray(A);
        }
        scanner.close();
    }


    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }*/

    /*private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();

    }*/
}
