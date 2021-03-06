package homework.java.khaled.methods.w3resource;

public class Ex_W3_03 {
    public static void main(String []args) { // Write a program in Java to display n terms of natural number and their sum.
        sumOfNNT();
    }

    public static int sumOfNNT(){
        int i, n = 7, sum = 0;
        System.out.println("The first " + n + " natural numbers are : ");

        for (i = 1; i <= n; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe Sum of Natural Number upto 7 terms : " + sum);
        return i;
    }
}

// Test Data : 7
//Expected Output :
//The first 7 natural number is :
//1 2 3 4 5 6 7
//The Sum of Natural Number upto 7 terms : 28