package classwork.java.khaled.day_111520_collection.hash_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex_001 { // Java HashSet Example:
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
