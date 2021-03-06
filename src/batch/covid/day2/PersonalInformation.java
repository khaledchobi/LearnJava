package batch.covid.day2;

public class PersonalInformation {

    public static void main(String args[]){
        // Step 1: Variable Declaration/instantiation - data_type variable_name. Declare Variable.
        String name, email, address, month_of_birth;
        double expected_salary;
        boolean employed;
        //byte month_of_birth;

        //Step 2: Variable Initialization. Initialize all the variable.
        name = "Khaled";
        email = "khaled_chobi@yahoo.com";
        address = "Waterford, Connecticut";
        expected_salary = 45000.00;
        month_of_birth = "March";
        employed = true;

        // Step 3: Variable Execution/uses. Print all the variable value.
        System.out.println("Printing Information");
        System.out.println("---------------------");
        System.out.println("Name: " + name + ".");
        System.out.println("Email: " + email + ".");
        System.out.println("Address: " + address + ".");
        System.out.println("Month of Birth: " + month_of_birth + ".");
        System.out.println("Expected Salary: $" + expected_salary);
        System.out.println("Employed: " + employed);
        System.out.println("---------------------");
        System.out.println("My name is " + name + ". My email address is " + email + " and my address is " + address + ".");
        System.out.println("I am expecting $" + expected_salary + " in a year.");
        System.out.println("Employed: " + employed);
    }

    // Declare variable Like name, email, address, expected-salary, month_of_birth,
    // employed (boolean)
    //Declaration, initialization, Execution

}
