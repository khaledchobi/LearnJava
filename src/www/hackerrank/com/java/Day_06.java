package www.hackerrank.com.java;
import java.io.*;
import java.util.*;
public class Day_06 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String s;

        for(int i=0;i<T;i++){
            s = scan.next();

            for(int j=0;j<s.length();j++){

                if(j%2 ==0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(" ");
            for(int j=0;j<s.length();j++){
                if(j%2==1){
                    System.out.print(s.charAt(j));
                }

            }
            System.out.println();
        }


       /* // Using charArray..
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int c=0;c<cases;c++) {
            String even, odd;
            even = odd = "";
            String myString = scan.next();
            char[] charArray = myString.toCharArray();
            for (int i = 0; i < charArray.length; i += 2) {
                even += charArray[i];
            }
            for (int j = 1; j < charArray.length; j += 2) {
                odd += charArray[j];
            }
            System.out.println(even + " " + odd);
        }*/


        /*// Using BufferReader..
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str,str1,str2,str3,str4,str5;
            //str=br.readLine();
            //str1=br.readLine();
            char ch,ch1,ch2,ch3;
            int n=Integer.parseInt(br.readLine());
            for(int i=1; i<=n; i++)
            {
                str=br.readLine();
                str1=str;
                //str1=br.readLine();
                for(int j=0; j<=str.length()-1; j+=2)
                {
                    ch=str.charAt(j);
                    str2=Character.toString(ch);
                    System.out.print(str2);
                }
                System.out.print(" ");
                for(int j=1; j<str.length(); j+=2)
                {
                    ch1=str.charAt(j);
                    str2=Character.toString(ch1);
                    System.out.print(str2);
                }
                System.out.println("");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
*/

        // Another solution..
        /*Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String string[] = new String[T];
        for(int i = 0; i<T; i++){
            string[i] = scan.next();
        }
        for(int temp = 0; temp<T; temp++){

            for(int j = 0; j<string[temp].length(); j = j+2)
            {
                System.out.print(string[temp].charAt(j));
            }
            System.out.print(" ");

            for(int j = 1; j<string[temp].length(); j = j+2){
                System.out.print(string[temp].charAt(j));
            }

            System.out.println();

        }
        scan.close();*/

    }

}
