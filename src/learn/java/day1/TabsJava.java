package learn.java.day1;

public class TabsJava {

    public static void main(String args[]){
        System.out.println("Hello Everyone!!!! From Khaled.......");
        System.out.println("_____________________________________");
        //Newline \n Advances the cursor to the next line for subsequent printing
        //Horizontal Tab \t Causes the cursor to skip over to the next tab stop
        System.out.println("These are our top sellers:\n");
        System.out.println("\tComputer games \n\t\tCoffee \n\t\t\tAspirin");

        // Backspace \b  Causes the cursor to back up, or move left, one position
        System.out.println("\tComputer \bgames \n\t\tCoffee \n\t\t\tAspirin");

        //Return \r Causes the cursor to go to the beginning of the current line, not the next line.
        System.out.println("\tComputer games \n\t\tCoffee \n\t\t\t\rAspirin");

        //Backslash \\ Causes a backslash to be printed
        System.out.println("\tComputer games \n\t\tCoffee \n\t\t\t\rAspirin");



    }
}
