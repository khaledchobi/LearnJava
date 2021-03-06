package www.hackerrank.com.java;
import java.util.*;
import java.io.*;

public class Day_08 {
    public static void main(String []args){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println(
                    (phoneNumber != null)
                            ? s + "=" + phoneNumber
                            : "Not found"
            );
        }
        in.close();
    }

    // Another working code
    /*public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(myMap.get(s) == null)
                System.out.println("Not found");
            else {
                System.out.println(s + "=" + myMap.get(s));
            }
        }
        in.close();
    }*/


    /*public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Map addressBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i =1 ; i <= n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            addressBook.put(name, phone);
        }

        while(in.hasNext()){
            String name = in.nextLine();
            if(addressBook.containsKey(name)){
                System.out.println(name + "=" + addressBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }*/
}
