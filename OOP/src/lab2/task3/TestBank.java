package lab2.task3;

import java.util.Vector;

public class TestBank {

	public static void main(String[] args) {
		
		Vector <Account> v = new Vector<>();
		
		Account a1 = new Account(1);
		Account a2 = new SavingsAccount(2, 14);
		Account a3 = new CheckingAccount(3);
		
		v.add(a1);
		v.add(a2);
		v.add(a3);
		
		a1.deposit(100);
		a2.deposit(100);
		
		for (int i = 0; i < 6; i++ ) {
			a3.deposit(20);
		}
		
		Bank b = new Bank(v);
		
		for (Account a : b.getAccounts()) { 
			a.print();
		}
		
		b.update();
		
		for (Account a : b.getAccounts()) { 
			a.print();
		}
		
		b.openAccount(new Account(4));
		
		System.out.println(b);
		
		b.closeAccount(1);
		
		System.out.println(b);

	}

}
