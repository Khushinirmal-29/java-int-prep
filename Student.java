class Details {
    String name;
    int rollNo;
    void displayDetails(){
        System.out.println("Student Details. ");
        System.out.println("Name: "  + name);
        System.out.println("Roll No: " + rollNo);


    }
}
public class Student {
    public static void main (String[]args){

        Details s1=new Details();
        s1.name="Khushi";
        s1.rollNo=34;
        s1.displayDetails();

    }
    
}
