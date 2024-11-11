package lab3.task1;

import java.util.Objects;

public abstract class Food implements Comparable<Food>, Sellable {
	private double calories;
	private double price = 0;
	private BankAccount owner;
	
	public Food() {
		
	}
	
	public Food(double cal) {
		this.calories = cal;
	}
	
	public Food(double cal, double price) {
		this(cal);
		this.price = price;
	}
	
	public void setCalories(double cal) {
		this.calories = cal;
	}
	
	public double getCalories() {
		return this.calories;
	}
	
	public String toString() {
		return "Food: [ nutrition: " + this.calories + ", price: " + price + "]";
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Food f = (Food) o;
		return f.calories == this.calories &&
				f.price == this.price;
	}
	
	public int hashCode() {
		return Objects.hash(calories, price);
	}
	
	public int compareTo(Food f) {
		return Double.compare(this.calories, f.calories);
	}

	public void sell(BankAccount ba) {
		this.owner = ba;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	} 
}

