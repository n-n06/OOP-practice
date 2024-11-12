package lab3.task2;

import java.util.Objects;

public class Helicopter extends Machine implements CanFly {
	private double z = 0;
	
	public Helicopter() {
	}
	
	public Helicopter(String model) {
		super(model);
	}
	
	public Helicopter(String model, double x, double y, double z) {
		super(model, x, y);
		this.z = z;
	}
	
	public Helicopter(String model, int year) {
		super(model, year);
	}
	
	public Helicopter(String model, int year, double x, double y, double z) {
		super(model, year, x, y);
		this.z = z;
	}
	
	public Helicopter(String model, EnergyType energy) {
		super(model, energy);
	}
	
	public Helicopter(String model, EnergyType energy, double x, double y, double z) {
		super(model, energy, x, y);
		this.z = z;
	}
	
	public Helicopter(String model, int year, EnergyType energy) {
		super(model, year, energy);
	}

	public Helicopter(String model, int year, EnergyType energy, double x, double y, double z) {
		super(model, year, energy, x, y);
		this.z = z;
	}
	
	public double getZ() {
		return z;
	}
	
	@Override
	public void fly(double dz) {
		z = Math.max(0, z + dz);
	}
	
	@Override
	public String toString() {
		return "Helicopter: [" + super.toString() + String.format(", altitude: %.2f]", z);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Helicopter h = (Helicopter) o;
		return h.z == this.z;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(z);
	}

}
