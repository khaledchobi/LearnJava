package classwork.java.khaled;

import java.io.IOException;
import java.util.Scanner;

public class HandleException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the 1st number: ");
        int num1 = input.nextInt();

        try{
            findVoter(num1);
        }catch(ArithmeticException ex){   // ex --> variable name
            System.out.println("Exception Catched");
        }catch(IOException ex){   // ex --> variable name
            System.out.println("Exception");
        }

//        System.out.println("Please Enter the 2nd number: ");
//        int num2 = input.nextInt();


        int data = 0;

        System.out.println("Statement A");
        System.out.println("Statement B");

//        try{
//
//            System.out.println(data);
//
//        }catch(ArithmeticException e){
//
//            System.out.println(data);
//            System.out.println("You cant divide a number by 0");
//        }finally{
//            System.out.println("Execute By Default");
//
//        }




        System.out.println("Statement 2");
        System.out.println("Statement 3");
        System.out.println("Statement 4");
        System.out.println("Statement 5");




    }

    public static void findVoter(int num1) throws ArithmeticException, IOException, IndexOutOfBoundsException {
        int data = num1/0;
        System.out.println(data);

    }


    /*
     *   throw VS throws
     *
     * */


}

/*
 * Statement 1
 * Statement 2
 * Statement 3
 * Statement 4  // Exception occurs   10/0 --> infinity  0/10 --> 0
 * Statement 5
 * Statement 6
 * Statement 7
 *
 *
 * bytecode
 *
 * */


/*
 *   Exception handling
 *
 *       Error:
 *           1. Compile time Error
 *           2. Runtime Error
 *
 *   Exception :
 *       1. Checked Exception
 *       2. unchecked Exception
 *
 *   Keywords:
 *       1. try
 *       2. catch
 *       3. finally
 *       4. throw
 *       5. throws
 *
 *
 * */

