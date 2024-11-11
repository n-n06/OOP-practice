package lab3.task1;

import java.util.Objects;
import java.util.Vector;

public class Order implements Comparable<Order> {
	private double location = 0.0;
	private Vector<Sellable> products = new Vector<>();
	
	public Order() {
		
	}
	
	public Order(double location) {
		this.location = location;
	}
	
	public void setLocation(double location) {
		this.location = location;
	}
	
	public double getLocation() {
		return this.location;
	}
	
	public void addProduct(Sellable s) {
		this.products.add(s);
	}
	
	public String toString() {
		return "Order: [location: " + location + ", products: " + products + "]";
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Order or = (Order) o;
		return this.location == or.location &&
				this.products.equals(or.products);
	}
	
	public int hashCode() {
		return Objects.hash(location, products);
	}

	@Override
	public int compareTo(Order o) {
		return Double.compare(this.location, o.location);
	}
	
	//methods for products and Sellables;
}
