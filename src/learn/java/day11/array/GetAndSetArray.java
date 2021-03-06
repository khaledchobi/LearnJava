package learn.java.day11.array;

import java.util.Scanner;

public class GetAndSetArray {
    public static void main(String[] args) {

//        printArray(createArray());
//        findMin(createArray());

        findTeenage(findMin(createArray()));

    }


    public static void printArray(int numbers[]){
        System.out.println("Printing Array: \n");
        for(int i=0; i<numbers.length;i++){
            System.out.println("[" + i +"] == " + numbers[i]);
        }

    }


    public static int[] createArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        int numbers[]= new int[size];

        for(int i=0; i<size;i++){
            System.out.println("Please enter data for [" + i +"]: ");
            numbers[i] = input.nextInt();

        }

        return numbers;

    }


    public static int findMin(int[] num){
        int minimum = num[0];


        printArray(num);

        for(int i=1; i<num.length; i++){
            if(minimum > num[i]){
                minimum = num[i];
            }
        }

        System.out.println("Minimum Number is : " +minimum);

        return minimum;

    }

    public static void findTeenage(int min){
        if(min >=13 && min <= 19){
            System.out.println("Teenage");
        }else{
            System.out.println("Not Teenage");
        }
    }

}
