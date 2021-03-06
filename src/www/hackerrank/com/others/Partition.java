package www.hackerrank.com.others;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// not completed yet...
public class Partition {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int[] left= new int[arr.length-1];
        int[] right= new int[arr.length-1];
        int l=0;
        int r=0;
        int mid=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[0]>arr[i]) {
                left[l++]=arr[i];
            } else {
                right[r++]=arr[i];
            }
        }

        for(int i=0;i<l;i++){
            arr[i]=left[i];
        }
        for(int i=0;i<r;i++){
            arr[i+l+1]=right[i];
        }
        arr[l]=mid;
        return arr;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    /*// working using arraylist..
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int p = arr[0];
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == p) {
                equal.add(arr[i]);
            }
            else if (arr[i] < p) {
                left.add(arr[i]);
            }
            else {
                right.add(arr[i]);
            }
        }
        left.addAll(equal);
        left.addAll(right);
        Object[] objects = left.toArray();
        for (Object obj : objects) {
            System.out.print(obj+" ");
        }

        scanner.close();
    }*/

}
