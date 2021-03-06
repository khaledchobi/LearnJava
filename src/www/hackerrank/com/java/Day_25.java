package www.hackerrank.com.java;
import java.util.*;

public class Day_25 {
    static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numOfTests = sc.nextInt();
        for (int i = 0; i < numOfTests; i++) {
            int x = sc.nextInt();
            String s;
            if (x >= 2 && isPrime(x)) {
                s = "Prime";
            } else {
                s = "Not prime";
            }
            System.out.println(s);
        }
    }
}