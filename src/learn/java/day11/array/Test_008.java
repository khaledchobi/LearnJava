package learn.java.day11.array;
import java.util.Scanner;
public class Test_008 {
    public static void main(String[] args) {
        /*// create scanner object
        Scanner scanner = new Scanner(System.in);
        // create an array of 10 integers
        int a[] = new int[10];
        for(int i=0;i<10;i++){
            int j = scanner.nextInt();
            // store it in array as incremented by 1.
            a[i]=j+1;
        }
        // Now array of integers have the user input value+1.
        for(int i=0;i<10;i++) {
            System.out.println(" "+ a[i]);
        }*/

            Scanner console = new Scanner(System.in);

            System.out.println("Enter your 5 integers: ");


            int index =0;
            final int SIZE = 5;
            int[] arrayOfSize = new int[SIZE];

            while(index<arrayOfSize.length )
            {
                arrayOfSize[index]=console.nextInt();
                index++;

            }

            System.out.println("Processing each array element...");

            for(int i=0;i<arrayOfSize.length;i++){
                System.out.print((arrayOfSize[i]+1)+" ");//(arrayOfSize[i]+1)this will take current value stored in array and add 1 to it
            }


    }
}