package homework.java.khaled.methods;
import java.util.Scanner;
public class Khondokar {
    static Scanner reader = new Scanner(System.in);
    public static void main(String args[]){
        story();
    }
    public static String pName(){
        String fName,mName,lName, fullName;
        System.out.println("Please Enter your first name:  ");
        fName = reader.nextLine();
        System.out.println("Please Enter your middle name:  ");
        mName = reader.nextLine();
        System.out.println("Please Enter your last name:  ");
        lName = reader.nextLine();
        fullName=fName+" "+mName+" "+lName;
        System.out.println(fullName);
        return fullName;
    }
    public static String fullAddress(){
        System.out.println("Please Enter The name of your street ");
        String street =reader.nextLine();
        System.out.println("Please Enter The name of your city name");
        String city =reader.nextLine();
        System.out.println("Please Enter The name of your state name");
        String state =reader.nextLine();
        String address= street+" "+city+" "+state+ " ";
        System.out.println(address);
        return address;
    }
    public static int age(){
        System.out.println("Please Enter your age ");
        int age= reader.nextByte();
        System.out.println(age);
        reader.nextLine();
        return age;
    }
    public static String school() {
        System.out.println("Please Enter The name of your University/College: ");
        String college = reader.nextLine();
        System.out.println(college);
        return college;
    }
    public static String profession() {
        System.out.println("Please Enter Your profession ");
        String profession= reader.nextLine();
        System.out.println(profession);
        return profession;
    }
    public static String pet() {
        System.out.println("Please Enter what kind of animal you have as a pet ");
        String animal = reader.nextLine();
        return animal;
    }
    public static String pet_name(){
        System.out.println("Please enter the name of your animal ");
        String animalName= reader.nextLine();
        return animalName;
    }
    public static void story(){
        System.out.println("Once there was a person name " + pName()+ ". who lived in "+fullAddress()+". At the age of "+age()+                " years "+ pName()+" went to "+school()+ ". "+pName()+ " graduated and went to work as " +profession()+". " +
                "\n" +"Then " +pName()+" adopted a "+ pet()+ " named "+pet_name()+". They both lived happily ever after.");

    }
}
