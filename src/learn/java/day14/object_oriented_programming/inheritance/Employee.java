package learn.java.day14.object_oriented_programming.inheritance;

public class Employee {
    //Fields
    private String employeeFName;
    private String employeeLName;
    private String employeeDOB;

    public Employee(){
        this.employeeFName = "Khaled";
        this.employeeLName = "Hasan";
        this.employeeDOB = "03/16/1981";
    }

    public void setEmployeeFName(String fName){
        this.employeeFName = fName;
    }

    public String getEmployeeFName(){
        return employeeFName;
    }

    public void setEmployeeLName(String lName){
        this.employeeLName = lName;
    }

    public String getEmployeeLName(){
        return employeeLName;
    }

    public void setEmployeeDOB(String dob){
        this.employeeDOB = dob;
    }

    public String getEmployeeDOB(){
        return employeeDOB;
    }

    //Methods
    public String printFullName() {
        String fullName = getEmployeeFName() + " " + getEmployeeLName();
        //System.out.println(fullName);
        return fullName;
    }
    public void printFullName_01() {
        System.out.println("Full Name: " + this.employeeFName+ " " +this.employeeLName);

    }

    public void printStatement(){
        System.out.println("Employee Name: " + printFullName());
        System.out.println("DOB: " + getEmployeeDOB());
        //System.out.println(printFullName_01());
    }


}
