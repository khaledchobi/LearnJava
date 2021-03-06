package www.hackerrank.com.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day_11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int kLowestPossibleNumber = -9;
        int kCellCountInHourGlass = 3+1+3;

        int max = kLowestPossibleNumber * kCellCountInHourGlass;

        int i = 0;
        while (i < 4) {
            int sum;
            int j = 0;
            while (j < 4) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                j++;
                max = sum > max ? sum : max;
            }
            i++;
        }
        scanner.close();
        System.out.println( max );
    }



    /*private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int [][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = s.nextInt();
                if (i > 1 && j > 1) {
                    int sum = arr[i-2][j-2] + arr[i-2][j-1] +arr[i-2][j]
                            + arr[i-1][j-1]
                            + arr[i][j-2] + arr[i][j-1] + arr[i][j];
                    max = sum > max ? sum : max;
                }
            }
        }
        s.close();
        System.out.println(max);
    }*/

    /*private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
    }*/
}
