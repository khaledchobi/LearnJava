package homework.java.khaled.object_oriented_programming.Inheritance;

public class ITDepartment extends Department{

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
