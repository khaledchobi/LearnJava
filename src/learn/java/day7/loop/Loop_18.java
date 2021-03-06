package learn.java.day7.loop;

public class Loop_18 {
    public static void main(String []args) { // Java program to print Fizz Buzz Using While Loop
        int n = 20;
        int i = 1;

        while(i <= n){
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.println("fizz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 3 or 5
            i++;
        }

    }

}



