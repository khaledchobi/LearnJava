package learn.java.day11.array;

public class Test_009 {

    public static void main (String[] args){
        printArray(createArray());

    }

    public static void printArray(int numbers[]){
        System.out.println("Printing Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] == " + numbers[i]);
        }
    }

    public static int[] createArray(){
        int numbers[] = {10, 20, 30, 40, 50};
        return numbers;

    }


}
