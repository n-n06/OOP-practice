package lab2.task3;

public class TestCheckingAccount {
  public static void main(String[] args) {
    CheckingAccount c = new CheckingAccount(1);
  
    c.deposit(5);
    c.deposit(5);
    c.deposit(5);
    c.deposit(5);
    c.deposit(5);
    
    c.print();
    c.deposit(10);
    c.print();
    c.withdraw(30);
    c.print();
    c.deductFee();
    c.print();
    c.withdraw(4.96);
    c.print();
    c.deductFee();
    c.print();
    c.deposit(0);
    c.deposit(0);
    c.deposit(0);
    c.deposit(0);
    c.deposit(0);
    c.print();
    c.deductFee();
    c.print();
    
    c.deposit(100);
    c.print();
    
    Account a = new Account(2);
    
    c.transfer(90, a);
    a.print();
    c.print();
    c.transfer(15, a);
    c.print();
    c.deductFee();
    c.print();
    
    CheckingAccount d = new CheckingAccount(1);
//    d.deposit(0);
    System.out.println(d.equals(c));
  }
}
