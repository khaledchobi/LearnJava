package www.hackerrank.com.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }
        catch(Exception e) {
            System.out.println("Bad String");
        }
    }

    // OR ...
    /*public static void main(String[] args) {
        int no=0;
        Scanner in = new Scanner(System.in);
        String S = in.next();
        parseInt(S);
    }

    public static void parseInt(String S){

        try{
            int no= Integer.parseInt(S);
            System.out.println(no);

        }
        catch(NumberFormatException e){
            System.out.println("Bad String");

        }
    }*/

    // OR ....
    /*static void parseInt(String s){
        try{
            int m = Integer.parseInt(s);
            System.out.println(m);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        parseInt(s);
    }*/
}
