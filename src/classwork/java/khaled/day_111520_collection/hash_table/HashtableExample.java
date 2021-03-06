package classwork.java.khaled.day_111520_collection.hash_table;

import java.util.Hashtable;
import java.util.Map;


public class HashtableExample { // Java Hashtable Example: Book:

    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book> mapBook=new Hashtable<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        Book b4=new Book(105,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        mapBook.put(1,b1);
        mapBook.put(2,b2);
        mapBook.put(3,b3);
        mapBook.put(4,b4);
        //Traversing map
        for(Map.Entry<Integer, Book> entry: mapBook.entrySet()){
            int key = entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
