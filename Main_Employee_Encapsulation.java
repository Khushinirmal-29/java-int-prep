class Employee{
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double da;
    private double totalSalary;

    public  Employee(int id, String name, double salary){
        employeeId=id;
        employeeName=name;
        basicSalary=salary;

    }
    public void calculateSalary(){

        hra=basicSalary*0.20;
        da=basicSalary*0.10;
        totalSalary=basicSalary+hra+da;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : " + employeeName );
        System.out.println("Basic Salary :  " + basicSalary);
        System.out.println("House Rent Allowance : " + hra);
        System.out.println("Dearness Allowance : " + da);
        System.out.println("Total Salary : " + totalSalary);
    }
}
public class Main_Employee_Encapsulation {
    public static void main(String[]args){
        Employee emp1=new Employee(3114, "Khushi", 50000);
        Employee emp2=new Employee(3115, "Ruchita", 150000);
        
        emp1.calculateSalary();
        emp2.calculateSalary();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
