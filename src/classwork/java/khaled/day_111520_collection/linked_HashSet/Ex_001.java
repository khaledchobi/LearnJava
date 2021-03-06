package classwork.java.khaled.day_111520_collection.linked_HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex_001 { // Java LinkedHashSet Example:
    // Let's see a simple example of Java LinkedHashSet class. Here you can notice that the elements iterate in insertion order.

    public static void main(String args[]){
        //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet();
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
