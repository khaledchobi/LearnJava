package www.hackerrank.com.java;
import java.util.*;

class Printer <T>{
    public void printArray(T[] array) {

        /**
         *    Method Name: printArray
         *    Print each element of the generic array on a new line. Do not return anything.
         *    @param A generic array
         **/

        // Write your code here

        for (T i : array) {
            System.out.println(i);
        }

        /*for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }*/
    }
}
public class Day_21 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }

}


//Input
//3
//1
//2
//3
//2
//Hello
//World
//
//Your Output (stdout)
//1
//2
//3
//Hello
//World