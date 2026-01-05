class Book{
    private int bookId;
    private String title;
    private String author; 
    private double price;
    private boolean isAvailable;


    public Book (int id, String name, String writer, double amount, boolean stock){
        bookId=id;
        title=name;
        author=writer;
        price=amount;
        isAvailable=stock;
    
}

public void borrowBook(){
    if (isAvailable){
        isAvailable=false;
        System.out.println("Book Borrowed successfully");
    }else{
        System.out.println("Book is not available");
    }
}

    public void returnBook(){
        isAvailable=true;
        System.out.println("Book Returned Successfully");

    }

    public void displayBookDetails(){
        System.out.println("Book Id is : " + bookId);
        System.out.println("Title : " +title);
        System.out.println("Belongs to : " +author);
        System.out.println("Price of Book :  " + price );
        System.out.println("Availability Status :  " + isAvailable);
    }
}



public class Main_Book_Encapsulation {
    public static void main (String[]args){
        Book b1=new Book(1,"Core Java","James Gosling",500,true);
        Book b2=new Book(2, "Advance Java", "Gosling Brother's", 1000, true);

        b1.borrowBook();
        b1.borrowBook();
        b1.returnBook();

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
    
}
