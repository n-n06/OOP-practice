package lab3.task1;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
	private double balance = 0.0;
	private String name;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = Math.max(balance, 0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	private void givePayment(double amount) throws InvalidPaymentException {
		if (amount < 0) {
			throw new InvalidPaymentException("Cannot process negative payment");
		}
		if (balance - amount < 0) {
			throw new InvalidPaymentException("Cannot process payment due to insufficient balance");
		} else {
			this.balance -= amount;
		}
	}
	
	private void receivePayment(double amount) throws InvalidPaymentException {
		if (amount < 0) {
			throw new InvalidPaymentException("Cannot process negative payment");
		}
		this.balance += amount;
	}
	
	public boolean buy(BankAccount seller, Sellable s) {
		try {
			this.givePayment(s.getPrice());
			seller.receivePayment(s.getPrice());
			s.sell(this);
			return true;
		} catch (InvalidPaymentException ipe) {
			System.err.println(ipe.getMessage());
			return false;
		}
	}
	
	public String toString() {
		return "Bank Account: [name : " + name + ", " + "balance: " + balance;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		BankAccount p = (BankAccount) o;
		return p.balance == this.balance;
			
	}
	
	public int hashCode() {
		return Objects.hash(balance);
	}
	
	public int compareTo(BankAccount p) {
		if (this.name.compareTo(p.name) == 0) {
			return Double.compare(this.balance, p.balance);
		}
		return this.name.compareTo(p.name);
	}
}
