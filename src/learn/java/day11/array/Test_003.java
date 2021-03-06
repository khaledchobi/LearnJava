package learn.java.day11.array;

import java.util.Scanner;

public class Test_003 {
    public static void main(String[] args) { // Array to Method.
        Scanner in = new Scanner(System.in);

        int numbers[] = {10,20,50,30,40};

        // Print the Array
        for(int i=0; i<numbers.length; i++){
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        numbers[0] = 60;
        //numbers[2] = 70;
        // Print the Array
        System.out.println("After Modification::");
        for(int i=0; i<numbers.length; i++){
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }
    }
}

//