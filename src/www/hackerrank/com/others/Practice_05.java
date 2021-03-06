package www.hackerrank.com.others;
// Plus Minus...
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Practice_05 {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos=0, neg=0, zero=0;

        for (int i: arr) {
            if (i>0) {
                pos++;
            } else if (i<0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f\n", (float)pos/arr.length);
        System.out.printf("%.6f\n", (float)neg/arr.length);
        System.out.printf("%.6f\n", (float)zero/arr.length);

        // OR ..

        /*double minusCount = 0.0; double plusCount = 0.0; double zeroCount = 0.0;
        int size = arr.length;
        for(int x = 0; x < arr.length; ++x) {
            if(arr[x] < 0) {
                ++minusCount;
            }
            else if(arr[x] > 0) {
                ++plusCount;
            }
            else {
                ++zeroCount;
            }
        }
        System.out.printf("%.6f\n", ((double) (plusCount / size)));
        System.out.printf("%.6f\n", ((double) (minusCount / size)));
        System.out.printf("%.6f\n", ((double) (zeroCount / size)));*/

        // OR ..

        /*double pos = 0;
        double neg = 0;
        double zer = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                pos+=1.0;
            }
            else if(arr[i]<0){
                neg+=1.0;
            }
            else{
                zer+=1.0;
            }
        }
        System.out.format("%.6f", (double)pos/arr.length);
        System.out.println();
        System.out.format("%.6f", (double)neg/arr.length);
        System.out.println();
        System.out.format("%.6f", (double)zer/arr.length);*/

        // OR..

        /*float p = 0f, n = 0f, z = 0f;
        int countP = 0, countN = 0, countZ = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                countP++;
            }else if(arr[i]<0){
                countN++;
            }else if(arr[i]==0){
                countZ++;
            }
        }
        p = (float)countP/arr.length;
        n = (float)countN/arr.length;
        z = (float)countZ/arr.length;
        System.out.printf("%.6f %n", p);
        System.out.printf("%.6f %n", n);
        System.out.printf("%.6f %n", z);*/

    }

    private static final Scanner scanner = new Scanner(System.in);

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

        plusMinus(arr);

        scanner.close();
    }

    /*public static void main(String[] args) { // For Accurate result..
        *//* Get size *//*
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        *//* Count instances of +/-/0 *//*
        double positives = 0;
        double negatives = 0;
        double zeroes    = 0;
        for (int i = 0; i < size; i++) {
            int value = scan.nextInt();
            if (value > 0) {
                positives++;
            } else if (value < 0) {
                negatives++;
            } else {
                zeroes++;
            }
        }
        scan.close();

        *//* Print ratios *//*
        System.out.println(positives / size);
        System.out.println(negatives / size);
        System.out.println(zeroes / size);
    }*/

    /*public static void main(String[] args) { // For Equal .000000 result
        Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        final float[] count = new float[3];

        for (int i=0;i<n;i++) {
            count[1+Integer.signum(in.nextInt())]++;
        }
        System.out.printf("%.6f %n",count[2]/n);
        System.out.printf("%.6f %n",count[0]/n);
        System.out.printf("%.6f %n",count[1]/n);
    }*/

}
