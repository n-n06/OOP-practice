package lab2.task3;

import java.util.Vector;

public class TestBank {

	public static void main(String[] args) {
		
		Vector <Account> v = new Vector<>();
		
		Account a1 = new Account(1);
		Account a2 = new SavingsAccount(2, 14);
		Account a3 = new CheckingAccount(3);
		Account a4 = new Account(4);
		
		
		
		a1.deposit(100);
		a2.deposit(100);
		
		for (int i = 0; i < 6; i++ ) {
			a3.deposit(20);
		}
		
		Bank b = new Bank(v);
		
		b.openAccount(a1);
		b.openAccount(a2);
		b.openAccount(a3);
		b.openAccount(a4);

		b.print();
		
		for (Account a : b.getAccounts()) { 
			a.print();
		}
		
		b.update();
		
		for (Account a : b.getAccounts()) { 
			a.print();
		}
		
		b.openAccount(new Account(5));
		
		b.print();
		
		b.closeAccount(1);
		
		b.print();
		
		b.closeAccount(new Account(2));
		
		b.print();

	}

}
