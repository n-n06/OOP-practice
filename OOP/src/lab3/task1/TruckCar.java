package lab3.task1;

import java.util.Objects;
import java.util.TreeSet;

public class TruckCar extends Car {
	private static final double L_PER_KM = 0.3; 
	private double position = 0;
	private TreeSet<Order> orders = new TreeSet<>();
	
	public TruckCar() {
		
	}
	
	public TruckCar(String brand) {
		super(brand);
	}
	
	public TruckCar(String brand, String licenseNumber) {
		super(brand, licenseNumber);
	}
	
	public TruckCar(String brand, int year) {
		super(brand, year);
	}
	
	public TruckCar(String brand, String licenseNumber, int year) {
		super(brand, licenseNumber, year);
	}
	
	
	public double getPosition() {
		return position;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public void giveOrder(Order o) {
		orders.remove(o);
	}
	
	public TreeSet<Order> getOrders() {
		return this.orders;
	}
	
	public void drive(double dist) {
		if (this.fuel - (L_PER_KM * dist) < 0) {
			System.err.println("Not enough fuel in the tank!");
			return;
		}
		this.position = dist;
		this.fuel -= L_PER_KM * dist;
		
		TreeSet<Order> toGive = new TreeSet<>();
		
		for (Order o : orders) {
			if (o.getLocation() <= position) {
				toGive.add(o);
			}
		}
		
		for (Order o : toGive) {
			giveOrder(o);
		}
	}

	@Override
	public void drive(double velocity, double time) {
		super.drive(velocity, time);
		double dist = velocity * time;
		drive(dist);
		
	}

	public String toString() {
		return "Truck " + super.toString() + ", position: " + position + ", fuel: " + fuel + ", orders: " + orders + "]";
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		TruckCar p = (TruckCar) o;
		return this.fuel == p.fuel 
				&& this.position == p.position 
				&& this.orders.equals(p.orders);
	}

	public int hashCode() {
		return super.hashCode() + Objects.hash(fuel, position, orders);
	}
	
	public int compareTo(TruckCar c) {
		int eq = super.compareTo(c);
		if (eq == 0) {
			int fuelEq = Double.compare(this.fuel, c.fuel);
			if (fuelEq == 0) {
				return Double.compare(this.position, c.position);
			}
			return fuelEq;
		}
		return eq;
	}






}
