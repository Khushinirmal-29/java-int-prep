class Car{
    String color;
    int speed;

    void drive(){
        System.out.println("Car is Driving");
        System.out.println("Color " + color);
        System.out.println("Speed is " + speed);
    }
}
public class Main{
    public static void main(String[] args){
            Car c1= new Car();
            c1.color="White";
            c1.speed= 120;

            c1.drive();
    }
}