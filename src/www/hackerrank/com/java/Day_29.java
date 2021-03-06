package www.hackerrank.com.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day_29 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int max = 0;
            for (int a = 1; a < n; a++)
                for (int b = a + 1; b <= n; b++) {
                    int result = a & b;
                    if (result < k) max = Math.max(max, result);
                    if (max == k-1) break;
                }

            System.out.println(max);
        }

        scanner.close();


    //public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int finalResult = 0;
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b <= n; b++) {
                    int val = a & b;
                    if (val < k && val > finalResult)
                        finalResult = val;
                }
            }
            System.out.println(finalResult);
        }*/

        /*Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int finalResult = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int a = 1; a < n - 1; a++) {
                for (int b = a + 1; b <= n; b++) {
                    int val = a & b;
                    if (val < k && val > finalResult)
                        finalResult = val;
                }
            }
            System.out.println(finalResult);
        }*/

        /*Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            if ((k-1 | k) <= n) {
                System.out.println(k-1);
            } else {
                System.out.println(k-2);
            }
        }*/

        /*Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int max = 0;
            for (int a = 1; a < n; a++)
                for (int b = a + 1; b <= n; b++) {
                    int result = a & b;
                    if (result < k) max = Math.max(max, result);
                    if (max == k-1) break;
                }

            System.out.println(max);
        }*/
    }
}
