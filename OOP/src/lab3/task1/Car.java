package lab3.task1;

import java.util.Objects;

public abstract class Car implements Comparable<Car> {
	private String brand;
	private String licenseNumber;
	private int yearMade;
	protected double fuel = 0.0;
	
	public Car() {
		
	}
	
	public Car(String brand) {
		this.brand = brand;
	}
	
	public Car(String brand, String licenseNumber) {
		this(brand);
		this.licenseNumber = licenseNumber;
	}
	
	public Car(String brand, int year) {
		this(brand);
		this.yearMade = year;
	}
	
	public Car(String brand, String licenseNumber, int year) {
		this(brand, licenseNumber);
		this.yearMade = year;
	}

	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String b) {
		this.brand = b;
	}
	
	public String getLicenseNumber() {
		return this.licenseNumber;
	}
	
	public void setLicenseNumber(String number) {
		this.licenseNumber = number;
	}
	
	public int getYearMade() {
		return this.yearMade;
	}
	
	public void setYearMade(int year) {
		this.yearMade = year;
	}
	
	public void refuel(double amount) {
		if (amount < 0) {
			System.err.println("Cannot add negative amount of fuel");
		}
		this.fuel += amount;
	}
	
	public double getFuel() {
		return this.fuel;
	}
	
	
	public void drive(double velocity, double time) {
		if (velocity < 0 || time < 0) {
			System.err.println("Velocity or time cannot be negative");
			return;
		}

	};
	
	
	public String toString() {
		return "car: [brand: " + this.brand + ", license number: " + this.licenseNumber + ", year made: " + yearMade;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Car c = (Car) o;
		return (c.brand.equals(this.brand) 
				&& c.licenseNumber.equals(this.licenseNumber) 
				&& this.yearMade == c.yearMade
				&& this.fuel == c.fuel);
			
	}
	
	public int hashCode() {
		return Objects.hash(brand, licenseNumber, yearMade, fuel);
	}
	
	public int compareTo(Car c) {
		if (this.licenseNumber.compareTo(c.licenseNumber) == 0) {
			if (this.brand.compareTo(c.brand) == 0) {
				return Integer.compare(this.yearMade, c.yearMade);
			}
			return this.brand.compareTo(c.brand);
		}
		return this.licenseNumber.compareTo(c.licenseNumber);
	}

 }
