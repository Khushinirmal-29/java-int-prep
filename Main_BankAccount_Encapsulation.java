class BankAccount {
private  String accountHolderName;
private int accountNumber;
private double balance; 


public BankAccount(String name, int accNumber, double initialBalance){
    accountHolderName=name;
    accountNumber=accNumber;
    balance=initialBalance;
}
public void deposit(double amount){
    if(amount > 0){
        balance=balance + amount;
        System.out.println("Amount Deposited : " + amount);
    }
    else{
        System.out.println("Invalid deposit amount");
    }
}

public void withdraw(double amount){
    if (amount >0 && amount<=balance){
        balance=balance-amount;
        System.out.println("Amount Withdraw : " + amount);
    }else{
        System.out.println("Insufficient balance or Invalid amount");
    }
}
public double getBalance(){
    return balance;
}

public void displayAccountDetails(){
    System.out.println("Account Holder : " + accountHolderName);
    System.out.println("Account Number : " + accountNumber);
    System.out.println("Balance : " + balance);
}

}



public class Main_BankAccount_Encapsulation {
    public static void main(String[]args){
        BankAccount b1=new BankAccount("Khushi", 1020858, 5000);
        b1.deposit(2000);
        b1.withdraw(1600);


        b1.displayAccountDetails();
    }
    
}
