package www.hackerrank.com.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day_28 {

    /*private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
        }

        scanner.close();
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> list = new ArrayList();
        for (int i = 0; i < N; i++){
            String firstName = scanner.next();
            String emailID = scanner.next();
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String firstName : list){
            System.out.println(firstName);
        }
    }


    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), k=0;
        String[] names = new String[N];
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);

        for(int i = 0; i < N; i++){
            String firstName = in.next();
            String emailId = in.next();

            Matcher m = p.matcher(emailId);
            if(m.find()) {
                //System.out.println(firstName);
                names[k++] = firstName;
            }
        }
        String[] names2 = new String[k];
        System.arraycopy(names, 0, names2, 0, k);


        Arrays.sort(names2);

        for (int i =0; i<names2.length; i++) {
            System.out.println(names2[i]);
        }
    }*/

    // Using While Loop ...
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        List<String> userlist = new ArrayList<String>();

        while( i-- >0 ){
            String name = scan.next();
            String email = scan.next();

            boolean isnamelength = Pattern.matches("\\w{1,20}", name);
            boolean isname = Pattern.matches("^[a-z]*$", name);

            boolean ismaillength = Pattern.matches("\\D{1,50}", email);
            boolean isgmail = email.endsWith("@gmail.com");

            if(isnamelength && isname && ismaillength && isgmail){
                userlist.add(name);
            }
        }

        String[] arr = userlist.toArray(new String[userlist.size()]);
        Arrays.sort(arr);
        for(int j = 0 ; j<userlist.size(); j++){
            System.out.println(arr[j]);
        }
    }*/
}
