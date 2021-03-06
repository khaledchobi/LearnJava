package www.w3schools.com.javaClasses.exceptions;

public class MyClass {
    public static void main(String[ ] args) {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[2]); // error!

        try {
            int[] Numbers = {1, 2, 3};
            System.out.println(Numbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
