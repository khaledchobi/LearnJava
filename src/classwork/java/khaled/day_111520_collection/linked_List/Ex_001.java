package classwork.java.khaled.day_111520_collection.linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex_001 { // Java LinkedList Example:

    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
