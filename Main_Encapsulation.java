//Encapsulation:- It binds data and code together means wrapping data and methods together and protecting it from the direct access. 


class Bike {
    private String color;
    private int speed;

    //setter methods
    public void setColor(String color){
        this.color=color;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
 //Getter Method.

 public String getColor(){
    return color;

 }
 public int getSpeed(){
    return speed;
 }

 void ride(){
    System.out.println("Bike is Riding");
    System.out.println("Color : " + color);
    System.out.println("Speed : " + speed);

 }
}

public class Main_Encapsulation {
    public static void main(String[]args){
        Bike c1=new Bike();
     c1.setColor("Black");
     c1.setSpeed(90);
        c1.ride();
    }
    
}
