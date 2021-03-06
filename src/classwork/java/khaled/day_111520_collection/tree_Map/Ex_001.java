package classwork.java.khaled.day_111520_collection.tree_Map;

import java.util.Map;
import java.util.TreeMap;

public class Ex_001 { // Java TreeMap Example:

    public static void main(String args[]){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
