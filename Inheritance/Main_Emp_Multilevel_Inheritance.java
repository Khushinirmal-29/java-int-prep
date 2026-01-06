package Inheritance;

class Person{
    String name;

    void introduce(){
        System.out.println("I am a person ");
    }
}

class Emp extends Person{
    int empId;

    void work(){
            System.out.println("Employee is working");
    }
}

class Manager extends Emp{
    void manage(){
        System.out.println("Manager is managing the team");
    }
}
public class Main_Emp_Multilevel_Inheritance {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.name="Khushi Nirmal";
        m.empId=3114;

        m.introduce();
        m.work();
        m.manage();
    }
    
}
