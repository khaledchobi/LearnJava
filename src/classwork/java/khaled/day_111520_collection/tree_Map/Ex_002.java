package classwork.java.khaled.day_111520_collection.tree_Map;

import java.util.Map;
import java.util.TreeMap;

public class Ex_002 { // Java TreeMap Example: remove():

    public static void main(String args[]) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();

        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        //map.put(101,"Ajay");
        System.out.println("Before invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(102);
        System.out.println("After invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
