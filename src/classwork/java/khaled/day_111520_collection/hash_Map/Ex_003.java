package classwork.java.khaled.day_111520_collection.hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex_003 {

    public static void main(String args[]){

        HashMap<String,String> object = new HashMap<String,String>();//Creating HashMap

        object.put("400","Khaled"); //Put elements in Map
        object.put("601","Apple");
        object.put("700","Collection");
        object.put("602","Windows");
        object.put("500","Selenium");
        object.put("600","SDET");
        object.put("700","Collection"); //trying duplicate key

        System.out.println("Iterating Hashmap..." + object);

        for(Map.Entry<String, String> data : object.entrySet()){
            System.out.println("Key from MAP is: " + data.getKey() + " and Value is: " + data.getValue());
        }
    }

}
