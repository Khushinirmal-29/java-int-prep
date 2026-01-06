package Inheritance;
class Employyeee{
    void work(){
        System.out.println("Employee is Working ");
    }
}

class Developersss extends Employyeee{
    void work(){
        System.out.println("Developer is writing code ");
    }
}


public class Main_Emp_Inheritance_Polymor {
    public static void main(String[]args){
    // Developersss d=new Developersss();
    // d.work();


    Employyeee emp1=new Developersss(); // runtime polymorphism
    emp1.work();
    }

}
