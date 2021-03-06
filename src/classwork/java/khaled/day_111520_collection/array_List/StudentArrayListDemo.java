package classwork.java.khaled.day_111520_collection.array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayListDemo { // User-defined class objects in Java ArrayList:
    public static void main(String args[]) {
        //Creating user-defined class objects
        Student s1 = new Student(101, "David", 23);
        Student s2 = new Student(102, "Kevin", 21);
        Student s3 = new Student(103, "Stacy", 25);
        Student s4 = new Student(104, "Khaled", 24);
        Student s5 = new Student(105, "Hasan", 22);
        //creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);

        al.remove(1);
        al.add(s4);
        al.add(s2);
        //al.add(1,s2);

        //Getting Iterator
        Iterator itr = al.iterator();
        //traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }
    }
}
