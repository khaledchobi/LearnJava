package www.hackerrank.com.java;

import java.util.Scanner;

public class Day_05 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }

        // We can also use this..
        /*int total = 0;
        for (int i=1; i<=10;i++){
            total = n * i;
            System.out.printf("%d x %d = %d\n",n,i,total);
        }*/

        scanner.close();
    }
}
