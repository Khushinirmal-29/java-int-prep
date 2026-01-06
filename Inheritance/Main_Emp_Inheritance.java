package Inheritance;
class Employee{
    String name;
    int empId;

    void work(){
        System.out.println("Employee is Working");
    }

}

class Developer extends Employee{
    void WriteCode(){
        System.out.println("Developer is writing code");
    }
}


public class Main_Emp_Inheritance {

    public static void main(String[]args){
        Developer dev=new Developer();
        dev.name="Khushi Nirmal";
        dev.empId=3114;

        dev.work();
        dev.WriteCode();
    }
    
}
