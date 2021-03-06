package classwork.java.khaled.day_111520_collection.array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_003 { // Iterating ArrayList using Iterator:
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Dates");
        list.add(null);
        list.add("Strawberry");
        list.add("Berry");
        list.add("Raspberry");

        list.remove(null);

        //Traversing list through Iterator
        Iterator itr = list.iterator();              //getting the Iterator
        while(itr.hasNext()){                        //check if iterator has the elements
            System.out.println(itr.next());          //printing the element and move to next
        }
    }
}
