package www.hackerrank.com.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String[] str = (Integer.toBinaryString(n)).split("0");
        int max = 0;
        for (String s : str) {
            if (s.length() > max) max = s.length();
        }
        System.out.println(max);
    }



    // OR ...
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int consec1=0;
        String strBinary = Integer.toString(n, 2);
        // above is binary of given in in string
        String[] strparts = strBinary.split("0");
        //above we get all strings of ones, below find max from them
        for(int i=0;i<strparts.length;i++ ){
            if (consec1 < strparts[i].length()) {consec1 = strparts[i].length();}
        }
        System.out.println(consec1);  //result
    }*/

    // OR ...
    /*public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int rem=0,s=0,t=0;


    while(n>0)
    {
        rem=n%2;
        n=n/2;
        if(rem==1)
        {   s++;
            if(s>=t)

                t=s;

        }
        else{

            s=0;
        }
    }

    System.out.println(t);
}*/

    // OR...
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0, max = 0;
        while (n > 0) {
            int rem = n % 2;
            if (rem == 1) counter++;
            else counter = 0;
            max = Math.max(counter, max);
            n /= 2;
        }
        System.out.println(max);

    }*/


    // OR ..
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        int tempCount = 0;
        while (n>0){
            int remainder = n%2;
            n= n/2;
            if(remainder ==1){
                tempCount++;
                if(tempCount>count){
                    count = tempCount;
                }
            }else{
                tempCount = 0;
            }
        }
        System.out.println(count);
    }*/


    // OR ...
    /*public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = Pattern.compile("(1+)")
                .matcher(Integer.toBinaryString(scanner.nextInt()));
        while (matcher.find()) {
            result = Math.max(matcher.group().length(), result);
        }
        System.out.println(result);
    }*/

    // OR ...
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int max= 0;
        String num = Integer.toBinaryString(n);
        for(int i=0;i<num.length();i++){
            if(num.charAt(i) != '0')
                count = count +1;
            else{
                count = 0;
                continue;
            }
            if(count>max)
                max = count;
        }
        System.out.println(max);
    }*/
}
