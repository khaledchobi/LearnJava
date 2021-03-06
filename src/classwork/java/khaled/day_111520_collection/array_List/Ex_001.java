package classwork.java.khaled.day_111520_collection.array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Ex_001 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Khaled");//Adding object in arraylist
        list.add("Saleh");
        list.add("Naim");
        list.add("Kazi");
        list.add("Amdad");
        list.add("Jakir");
        list.add("Kazi"); // It can add duplicate value.
        //Printing the arraylist object
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<String>();//Creating arraylist
        list2.add("K");
        list2.add("S");
        list2.add("N");
        list2.add("K");
        list2.add("A");
        list2.add("J");
        list2.add("K");
        //Printing the arraylist object
        list.addAll(list2);
        //System.out.println(list);
        System.out.println(list.size());

        list.remove(7);
        System.out.println(list);

        list.remove("Kazi"); // Remove value
        System.out.println(list);

//        list.indexOf("Kazi");
//        System.out.println(list.indexOf("Kazi"));

        list.set(1,"Amdad"); // Replace value with Index number
        System.out.println(list);

        System.out.println("Saleh " + list.contains("Saleh"));

//        list2.removeAll(list2); // Remove all values from index 2
//        System.out.println(list2);
//        System.out.println(list2.size()); // Check Index size
//        System.out.println(list2.isEmpty()); // Check Index are empty or not.

//        list2.clear();
//        System.out.println(list2);

        Collections.sort(list);
        System.out.println(list);




    }
}

