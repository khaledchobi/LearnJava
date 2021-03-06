package homework.java.khaled.arrays.w3resource;
import java.util.Arrays;
public class Ex_W3_008 { // 08. Write a Java program to copy an array by iterating the array.
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] new_array = new int[10];
        //int[] delete_array = new int[6]; // for delete array

        //System.out.println("Source Array : " +Arrays.toString(array));
        System.out.print("Source Array : [");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");


        System.out.print("New Array : [ ");
        for(int i=0; i < array.length; i++) {
            new_array[i] = array[i];
            System.out.print(new_array[i] + ", ");
        }
        System.out.println("]");

        /*System.out.print("Delete Array : [ ");
        for(int i=0; i < array.length-4; i++) {
            delete_array[i]= array[i];
            System.out.print(new_array[i] + ", ");
        }
        System.out.println("]");*/

        //System.out.println("New Array: "+Arrays.toString(new_array));
    }

}
