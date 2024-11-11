package lab3.task1;

import java.util.Objects;

public class Pizza extends Food {
	private static double EXTRA_CHEESE_PRICE = 500;
	
	private Flavor flavor;
	private int additionalCheese = 0;
	private double price = 0.0;
	private BankAccount owner;
	
	public Pizza() {
		super();
	}
	
	public Pizza(double cal) {
		super(cal);
	}
	
	public Pizza(double cal, double price) {
		super(cal, price);
	}
	
	public Pizza(double cal, double price, Flavor f) {
		this(cal, price);
		this.flavor = f;
	}
	
	public Pizza(double price, Flavor f) {
		this.setPrice(price);
		this.flavor = f;
	}
	
	public void setFlavor(Flavor f) {
		this.flavor = f;
	}
	
	public Flavor getFlavor() {
		return this.flavor;
	}
	
	public void addCheese() {
		additionalCheese+=1;
	}
	
	public String toString() {
		return "Pizza : [" + super.toString() + ", flavor: " + this.flavor.toString().toLowerCase();
  	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Pizza p = (Pizza) o;
		return this.flavor.equals(p.flavor);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(flavor);
	}
}
