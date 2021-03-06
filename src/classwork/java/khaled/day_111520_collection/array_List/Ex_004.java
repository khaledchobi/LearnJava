package classwork.java.khaled.day_111520_collection.array_List;

import java.util.ArrayList;

public class Ex_004 { // Iterating ArrayList using For-each loop:

    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Dates");
        list.add("Strawberry");
        list.add("Berry");
        list.add("Raspberry");
        //Traversing list through for-each loop
        for(String fruit: list)
            System.out.println(fruit);

    }

}

