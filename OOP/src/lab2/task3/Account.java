package lab2.task3;

import java.util.Objects;

/*
 * TODO
 * 1. constructors
 * 2. getters/setters
 * 3. toString, equals
 * 4. transfer
 * 
 * */

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0.0;
		accNumber = Math.abs(a); //this is made so that we do not have accounts with negative IDs
	}
	
	public boolean canWithdraw(double amount) {
		return amount >= 0 && balance - amount >= 0;
	}
	
	public boolean canDeposit(double amount) {
		return amount >= 0;
	}
	
	public boolean deposit(double amount) {
		try {
			if (amount < 0) {
				throw new Exception("Cannot deposit negative values. Try using Account.withdraw() instead");
			}
			balance += amount;
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public boolean withdraw(double amount) {
		try {
			if (amount < 0) {
				throw new Exception("Cannot withdraw negative values. Try using Account.deposit() instead");
			}
			if (balance - amount < 0) {
				throw new Exception("Cannot withdraw over the balance.");
			}
			balance -= amount;
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if (this.equals(other)) {
			System.err.println("Cannot transfer to the same account");
			return;
		}
		
		boolean withdrawOk = this.withdraw(amount);
		
		if (withdrawOk) {
			other.deposit(amount);
		}
		
	}
	
	public String toString() {
		return "Account: number: " + this.accNumber + ", balance: $" + String.format("%.2f", this.balance);
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
//		if (this.getClass() != o.getClass()) return false; if we want to close accounts only using the id we should remove this line
		
		Account a = (Account) o;
		return a.accNumber == this.accNumber; //&& a.balance == this.balance; 
	}
	
	public int hashCode() {
		return Objects.hash(accNumber, balance);
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
}
