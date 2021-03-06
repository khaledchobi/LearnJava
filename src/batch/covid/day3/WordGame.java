package batch.covid.day3;

import java.util.Scanner;
public class WordGame {
    public static void main(String args[]) {
        Scanner scanner = new Scanner( System.in );
        String name, city, collage, profession, animal, pet_name;
        int age;
        System.out.println( "Please enter your name: " );
        name = scanner.nextLine();
        System.out.println( "Please enter your age: " );
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println( "Please enter your city: " );
        city = scanner.nextLine();
        System.out.println( "Please enter your collage: " );
        collage = scanner.nextLine();
        System.out.println( "Please enter your profession: " );
        profession = scanner.nextLine();
        System.out.println( "Please enter a type of animal: " );
        animal = scanner.nextLine();
        System.out.println( "Please enter the name of your pet: " );
        pet_name = scanner.nextLine();
        System.out.println( "There once was a person named " + name + " who lived in " + city
                + ". At the age of " + age + ", " + name + " went to collage at " + collage + ". "
                + name + " graduated and went to work as a " + profession + ". \nThen, " + name
                + " adopted a(n) " + animal + " named " + pet_name + ". They both lived happily ever after!" );
    }
}
