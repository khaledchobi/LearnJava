package www.hackerrank.com.java;

import java.util.Scanner;

public class Day_04 {
    //Inclusive limits for the defined age ranges
    private static final int YOUNG_MAX = 12;
    private static final int TEEN_MIN = 13;
    // interesting definition of "teen"...
    private static final int TEEN_MAX = 17;

    private int age;

    public Day_04(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, "
                    + "setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        String answer;

        if (age <= YOUNG_MAX) {
            answer = "You are young.";
        } else if (TEEN_MIN <= age && age <= TEEN_MAX) {
            answer = "You are a teenager.";
        } else {
            answer = "You are old.";
        }

        System.out.println(answer);
    }

    public void yearPasses() {
        age++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();

    }

    /*public class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println(*//*Insert correct print statement here*//*);
        }

        public void yearPasses() {
            // Increment this person's age.
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
*/

/*
        private int age;

        public Day_04(int initialAge) {
        // Add some more code to run some checks on initialAge
        this.age=initialAge;
    }
    public void amIOld() {
        if(age<=0){
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
            System.out.println("You are young.");
        }
        else if(age<13){
            System.out.println("You are young.");
        }
        else if(age>=13 && age<18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
    }
    public void yearPasses()
    {
        // Increment this person's age.
        age=age+1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // reader
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
*/



}
