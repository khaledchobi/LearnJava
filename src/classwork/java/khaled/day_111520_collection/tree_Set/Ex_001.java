package classwork.java.khaled.day_111520_collection.tree_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex_001 { // Java TreeSet Examples:

    public static void main(String args[]){
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
