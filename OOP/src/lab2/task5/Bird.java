package lab2.task5;

import java.util.Objects;

public class Bird extends Animal {
	private int flightHeight = 0; //haikyuu reference))
	
	public Bird() {
		
	}
	
	public Bird(String name) {
		super(name);
	}
	
	public Bird(String name, int age) {
		super(name, age);
	}
	
	public Bird(String name, int age, int flihgtHeight) {
		super(name, age);
		setHeight(flightHeight);
	}
	
	public void setHeight(int h) {
		this.flightHeight = h;
	}
	
	public int getFlightHeight() {
		return this.flightHeight;
	}
	
	@Override
	public String getSound() {
		return "Tweet! Tweet!";
	}
	
	public String toString() {
		return "Bird: " + super.toString() + ", flies up to: " + this.flightHeight;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Bird b = (Bird) o;
		return b.flightHeight == this.flightHeight;
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(flightHeight);
	}

}
