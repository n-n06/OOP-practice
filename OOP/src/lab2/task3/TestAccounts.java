package lab2.task3;

public class TestAccounts {

	public static void main(String[] args) {
		Account a = new Account(1);
		
		a.deposit(10);
//		a.deposit(-4); error
		a.withdraw(7);
//		a.withdraw(10); error
		
		a.print();
		
		SavingsAccount s = new SavingsAccount(2, 30);
		System.out.println("\nSavings accounts tests:");
		s.deposit(10);
		s.print();
		s.addInterest();
		s.print();
		s.withdraw(3.5);
		s.print();
		s.withdraw(10); //error
		s.print();
		
		System.out.println("\nChecking accounts tests");
		CheckingAccount c = new CheckingAccount(3);
		c.deposit(2);
		c.deposit(2);
		c.deposit(2);
		c.deposit(2);
		c.deposit(2);
		c.print();
		c.withdraw(10); //error - we do not have enough money for the transaction
		c.print();
		c.deposit(-4); //error - invalid deposit
		c.print();
		c.withdraw(9.97);
		c.print();
		c.deposit(0.01); //not enough money for the transaction even after deposit - so no deposit is made
		c.print();
		
		System.out.println("\nTransferTests:");
		
		Account user1 = new CheckingAccount(4);
		user1.deposit(20);
		user1.deposit(20);
		user1.deposit(20);
		user1.deposit(20);
		user1.deposit(20);
		
		
		Account user2 = new SavingsAccount(5, 20);
		user2.deposit(100);
		
		user1.transfer(100, user2); // at this point, user1 has to pay the fee, but he also want to transfer more money than he can afford
		user1.print();	//hence, the transaction is cancelled and both accounts are in their initial state
		user2.print();	
	}

}
