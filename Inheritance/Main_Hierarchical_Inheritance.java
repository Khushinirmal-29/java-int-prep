package Inheritance;


class Empss{
    String company="AGT";

    void work(){
        System.out.println("Employee is working ");
    }
}

class Devop extends Empss{
    void WritesCode(){
        System.out.println("Developer is writing code");

    }

}

class Tester extends Empss{
    void TestSoftware(){
        System.out.println("Tester is testing software");
    }
}

public class Main_Hierarchical_Inheritance {

    public static void main(String[] args){
            Devop d2=new Devop();
            d2.work();
            d2.WritesCode();


            Tester t=new Tester();
           t.work();
           t.TestSoftware();
    }
    
}
