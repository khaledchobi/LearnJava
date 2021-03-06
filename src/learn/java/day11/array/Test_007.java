package learn.java.day11.array;

import java.util.Scanner;

public class Test_007 {
    public static void main(String[] args) { // Array to Method. Find Minimum Number with Scanner...
        Scanner in = new Scanner(System.in);

        //int numbers[] = {60,20,50,30,40};

        System.out.println("Please Enter How many names you want to store: ");
        int size = in.nextInt();
        in.nextLine();

        int numbers[] = new int[size]; // --> 1

        // Initialize the array
        for(int i=0; i< numbers.length;i++){  // numbers.length --> 1
            System.out.println("Please Enter Your Number: ");
            numbers[i] = in.nextInt();
            in.nextLine();
        }

        printArray(numbers);
        findMin(numbers);
    }

    public static void printArray(int numbers[]){
        // Print the Array
        for(int i=0; i<numbers.length; i++){
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }
    }

    public static void findMin(int[] num){
        int minimum = num[0];
        for(int i=1; i<num.length; i++){
            if(minimum > num[i]){
                minimum = num[i];
            }
        }
        System.out.println("Minimum Number is : " + minimum);
    }
}
