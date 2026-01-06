package Inheritance;
class ClassyCar{
    String color;
    int speed;


    void start(){
        System.out.println("ClassyCar is starting");
    }
    void drive(){
        System.out.println("ClassyCar is driving at speed : " + speed);
    }
}

class SportsCar extends ClassyCar{
    void turboon(){
        System.out.println("Turbo Mode ON! ");
    }
}


public class Main_Inheritance {
    public static void main(String[] args){
        SportsCar sc=new SportsCar();
        sc.color="White";
        sc.speed=200;

        sc.start();
        sc.drive();
        sc.turboon();
    }
    
}
