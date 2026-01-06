package Inheritance;


class Vech{
    String brand;
    void start(){
        System.out.println("Vehicle is Starting ");
    }
}
class SimpleCar extends Vech{
    void drive(){
        System.out.println("Simple Car is Driving ");
    }
}

class SimpleBike extends Vech{
    void ride(){
        System.out.println("Simple Bike is Riding ");
    }
}
public class Main_Vehic_Hierarchical {

    public static void main (String[]args){
        SimpleCar simcar=new SimpleCar();
      
        simcar.start();
        simcar.drive();

        SimpleBike simBike=new SimpleBike();
        simBike.brand="Honda";
        simBike.start();
        simBike.ride();
    }
    
}
