package lab3.task1;

import java.util.Objects;

public class PassengerCar extends Car {
	private static final double L_PER_KM = 0.093; 
	private double position = 0;
	
	
	public PassengerCar(String brand) {
		super(brand);
	}
	
	public PassengerCar(String brand, String licenseNumber) {
		super(brand, licenseNumber);
	}
	
	public PassengerCar(String brand, int year) {
		super(brand, year);
	}
	
	public PassengerCar(String brand, String licenseNumber, int year) {
		super(brand, licenseNumber, year);
	}
	
	public double getPosition() {
		return position;
	}

	@Override
	public void drive(double velocity, double time) {
		super.drive(velocity, time);
		double dist = velocity * time;
		if (this.fuel - (L_PER_KM * dist) < 0) {
			System.err.println("Not enough fuel in the tank!");
			return;
		}
		this.position = dist;
		this.fuel -= L_PER_KM * dist;
		
	}
	
	public String toString() {
		return "Passenger " + super.toString() + ", position: " + position + ", fuel: " + fuel + "]";
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		PassengerCar p = (PassengerCar) o;
		return this.fuel == p.fuel && this.position == p.position;
	}

	public int hashCode() {
		return super.hashCode() + Objects.hash(fuel, position);
	}
	
	public int compareTo(PassengerCar c) {
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
