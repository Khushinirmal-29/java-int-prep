package Inheritance;
// level 1 - Grandparents 
class Vehicle{
    void start(){
        System.out.println("Vehicle is Starting ");
    }

}
//Level 2- Parents 
class Carrs extends Vehicle{
    void drive(){
        System.out.println("Carrs is Driving ");
    }
}

class SportsClassCar extends Carrs{
    void turboOn(){
        System.out.println("Turbo Mode is On ");
    }

}

public class Main_Multilevel_Inheritance {
    public static void main(String[] args){

        SportsClassCar scc=new SportsClassCar();
        scc.start();
        scc.drive();
        scc.turboOn();

    }
}
