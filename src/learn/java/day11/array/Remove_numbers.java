package learn.java.day11.array;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_numbers { // Java program to remove an element. from a specific index from an array
    public static void main(String[] args) { // Array to Method.
        //Scanner in = new Scanner(System.in);
        // Get the array
        int arr[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};


        // Print the resultant array
        System.out.print("Resultant Array: [");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
        // Or, System.out.println("Original Array: " + Arrays.toString(arr));

        // Get the specific index
        int index = 1;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arr = removeTheElement(arr, index);

        // Print the resultant array
        System.out.print("Resultant Array: [");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
        // Or, System.out.println("Resultant Array: " + Arrays.toString(arr));

    }

    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index){

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
