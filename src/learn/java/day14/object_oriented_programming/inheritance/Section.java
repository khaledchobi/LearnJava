package learn.java.day14.object_oriented_programming.inheritance;

public class Section extends Department {
    private String employeeSection;
    private byte employeeWorkingHours;
    private double employeeBonus;

    public Section(){
        super();
        this.employeeSection = "Alfa";
        this.employeeWorkingHours = 40;
        this.employeeBonus = 2000.00;
    }

    public void setEmployeeBonus(double bonus){
        this.employeeBonus = bonus;
    }
    public double getEmployeeBonus(){
        return employeeBonus;
    }

    public void setEmployeeSection(String section){
        this.employeeSection = section;
    }

    public String getEmployeeSection() {
        return employeeSection;
    }

    public void setEmployeeWorkingHours(byte hours){
        this.employeeWorkingHours = hours;
    }

    public byte getEmployeeWorkingHours() {
        return employeeWorkingHours;
    }



    public void printStatement(){
        super.printStatement();
        //System.out.println("Employee Section: "+ this.employeeSection);
        System.out.println("Employee Section: "+ getEmployeeSection());
        System.out.println("Employee Working Hours Per Week: "+ this.employeeWorkingHours);
        //System.out.println("Employee Working Hours Per Week: "+ getEmployeeWorkingHours());
        System.out.println("Employee Yearly Bonus: "+ getEmployeeBonus());

    }
}
