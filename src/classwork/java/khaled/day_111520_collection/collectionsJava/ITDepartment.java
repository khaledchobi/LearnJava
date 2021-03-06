package classwork.java.khaled.day_111520_collection.collectionsJava;

public class ITDepartment extends Department {

    private String employeeDepartmentName;
    private double baseSalary;

    public ITDepartment(){
        //super();
        this.employeeDepartmentName = "IT Department";
        this.baseSalary = 90000.00;
    }
    public void setEmployeeDepartmentName(String depName){
        this.employeeDepartmentName = depName;
    }
    public String getEmployeeDepartmentName(){
        return employeeDepartmentName;
    }

    public void printStatement(){
        super.printStatement();

        System.out.println("Employee Department Name: " + this.employeeDepartmentName);
        System.out.println("Base Salary: $"+ this.baseSalary);

    }
}
