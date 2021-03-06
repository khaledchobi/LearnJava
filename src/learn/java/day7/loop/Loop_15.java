package learn.java.day7.loop;

import java.util.Scanner;

public class Loop_15 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n<=10){
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
            n++;
        }
    }
}
