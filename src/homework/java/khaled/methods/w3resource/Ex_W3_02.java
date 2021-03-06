package homework.java.khaled.methods.w3resource;

public class Ex_W3_02 {
    public static void main(String []args) { // Write a Java program to find the sum of first 10 natural numbers.
        sumOfNN();
    }

    public static int sumOfNN(){
        int  i, sum = 0;
        System.out.println("The first 10 natural number is : ");

        for (i = 1; i <= 10; i++){
            sum = sum + i;
            System.out.print(i + " "); // If I want to print odd numbers then set ++ after i..
        }
        System.out.println("\nThe Sum is : " + sum);
        return i;
    }
}

// Expected Output :
//The first 10 natural number is :
//1 2 3 4 5 6 7 8 9 10
//The Sum is : 55