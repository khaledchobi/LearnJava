package learn.java.day7.loop;

public class Loop_17 {
    public static void main(String []args) { // Java program to print Fizz Buzz Using For Loop

        int n = 20;

        for (int i = 1; i <= n; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.println("fizz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 3 or 5
        }
    }
}
