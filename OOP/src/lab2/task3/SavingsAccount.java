package lab2.task3;

/*
 *1. interest
 *2. toString
 *3. equals
 *4. getters, setters for interst rate 
 * 
 * */
import java.util.Objects;

public class SavingsAccount extends Account {
	private double interestRate = 0.0;
	
	public SavingsAccount(int a, double interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		deposit(getBalance() * (interestRate / 100));
	}
	
	public double getInterest() {
		return interestRate;
	}
	
	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString() {
		return "Savings " + super.toString() + ", interest rate: " + String.format("%.2f", interestRate) + "%";
 	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		SavingsAccount s = (SavingsAccount) o;
		return this.interestRate == s.interestRate;
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(interestRate);
	}
}
