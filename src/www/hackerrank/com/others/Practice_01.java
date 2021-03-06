package www.hackerrank.com.others;
//Simple Array Sum

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// not completed yet...
public class Practice_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //read array dimension
        int arr[] = new int[n];//make array with given dimension
        int sum = 0;
        String strSum = "";
        for(int i=1; i < arr.length; i++){
            arr[i] = in.nextInt();
            sum = sum + arr[i];
            if (i + 1 < arr.length ) {
                strSum = strSum + arr[i] + " + ";
            } else {
                strSum = strSum + arr[i];
            }
        }
        strSum = strSum + " = " +  sum;
        System.out.println(strSum);

    }



    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < noOfElements; i++) {
            sum = sum + sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }*/

    /*static int simpleArraySum(int[] ar) {

        int sum = 0;

        for(int count = 0; count < ar.length; count++) {
            sum = sum + ar[count];
        }

        return sum;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }*/

}

