package learn.java.day10.method;

public class Method_05 { // Using Command-Line Arguments...
    public static void main(String args[]) {
        for(int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " +  args[i]);
        }
    }

}
