package lab2.task3;

import java.util.Vector;

public class Bank {
	private Vector<Account> accounts = new Vector<Account>();
	
	public Bank() {
		
	}
	
	public Bank(Vector <Account> v) {
		accounts = v;
	}
	
	public Vector<Account> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(Vector<Account> v) {
		accounts = v;
	}
	
	public void openAccount(Account a) {
		accounts.add(a);
	}
	
	public void closeAccount(Account a) {
		accounts.remove(a);
	}
	
	public void closeAccount(int accNum) {
		for (Account a : accounts) {
			if (a.getAccountNumber() == accNum) {
				accounts.remove(a);
				return;
			}
		}
	}
	
	public void update() {
		for (Account a : accounts) {
			if (a instanceof SavingsAccount) {
				((SavingsAccount) a).addInterest();
			} else if (a instanceof CheckingAccount) {
				try {
					((CheckingAccount) a).deductFee();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
	
	public String toString() {
		return "Bank: " + accounts;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Bank b = (Bank) o;
		return this.accounts.equals(b.accounts);
	}
}
