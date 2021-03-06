package classwork.java.khaled.day_111520_collection.hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex_001 { // Java HashMap Example:
    // Let's see a simple example of HashMap to store key and value pair.

    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
