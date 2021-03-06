package classwork.java.khaled;

import java.util.Scanner;

public class Arrays {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please Enter How many names you want to store: ");
        int size = reader.nextInt();
        reader.nextLine();

        String names[] = new String[size]; // --> 1

        // Initialize the array
        for(int i=0; i< names.length;i++){  // names.length --> 1
            System.out.println("Please Enter Your Name: ");
            names[i] = reader.nextLine();
        }

        //Traversing array
        // Print the array
        for(int i=0;i<names.length;i++){
            System.out.println( "names[" + i + "]: " + names[i]);
        }

    }
}


/*
 * Java Array is an object which contains elements of a similar data type.
 * Array in java is index-based, the first element of the array is stored at the 0th index.
 *
 * Advantage:
 *   1. Code optimization:
 *   2. random Access
 *
 * Disadvantage:
 *   1. Size limit: Fixed
 *
 *
 * Types:
 *   1. Single Dimensional
 *       Declaration:
 *               a. data_type[] array_name; or --> int[] numbers;
 *               b. data_type []array_name; or --> int []numbers;
 *               c. data_type array_name[]; or --> int numbers[];
 *
 *       Instantiation:
 *                array_name = new data_type[size]; --> numbers = new int[4];
 *
 * --------------------------------------
 * Declaration + Instantiation :
 *       data_type[] array_name = new data_type[size];  --> int[] numbers = new int[4];
 *
 *
 *       Initialization:
 *                  array_name[index] = value;  --> numbers[0] = 10;
 *                                              --> numbers[2] = 30;
 *
 *
 *
 *   2. Multidimensional
 * */
