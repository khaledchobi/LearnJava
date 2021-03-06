package www.hackerrank.com.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    // instance variables
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements){
        this.elements = elements;
    }

    // Sorts the array. Saves max abs difference between first and last element to maximumDifference.
    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }

    // OR ...
    /*public Difference(int[] a)
    {
        this.elements=a;
    }
    public void computeDifference()
    {
        int min=elements[0];
        int max=elements[0];
        for(int i=0;i<elements.length;i++)
        {
            if(elements[i]<min)
            {
                min=elements[i];
            }
            if(elements[i]>max)
            {
                max=elements[i];
            }
        }
        maximumDifference = Math.abs(max-min);
    }*/

    // OR ...
    /*public void computeDifference () {
        int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();
        maximumDifference = max - min ;
    }*/

    // OR ....
    /*private int[] elements;
    public int maximumDifference;
    Difference (int [] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int min = elements[0];
        int max = elements[0];
        for (int num : elements) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        maximumDifference = max - min;
    }*/

} // End of Difference class

    // OR ....
    /*class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] elements){
            this.elements = elements;
        }

        // Finds max abs difference... Saves it to maximumDifference.
        public void computeDifference(){
            // set max to its minimum possible value set by Constraints
            int max = 1;

            // set min to its maximum possible value set by Constraints
            int min = 100;
            for(int element : elements){
                if(element < min){
                    min = element;
                }
                if(element > max){
                    max = element;
                }
            }
            this.maximumDifference = Math.abs(max - min);
        }

    } // End of Difference class*/

public class Day_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
