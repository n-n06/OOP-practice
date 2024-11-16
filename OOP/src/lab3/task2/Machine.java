package lab3.task2;

import java.util.Objects;

public abstract class Machine implements Moveable {
	private String model;
	private int yearProduced;
	private EnergyType energy;
	private double x = 0, y = 0;
	
	//constr
	public Machine() {
		
	}
	
	public Machine(String model) {
		this.model = model;
	}
	
	public Machine(String model, double x, double y) {
		this.model = model;
		setPos(x, y);
	}
	
	public Machine(String model, EnergyType energy) {
		this(model);
		setEnergy(energy);
	}
	
	public Machine(String model, EnergyType energy, double x, double y) {
		this(model);
		setEnergy(energy);
		setPos(x, y);
	}
	
	public Machine(String model, int year) {
		this(model);
		this.yearProduced = year;
	}
	
	public Machine(String model, int year, double x, double y) {
		this(model);
		this.yearProduced = year;
		setPos(x, y);
	}
	
	public Machine(String model, int year, EnergyType energy) {
		this(model, year);
		setEnergy(energy);
	}
	
	public Machine(String model, int year, EnergyType energy, double x, double y) {
		this(model, year);
		setEnergy(energy);
		setPos(x, y);
	}
	
	//get set
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYearProduced() {
		return yearProduced;
	}
	
	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}
	
	public EnergyType getEnergy() {
		return energy;
	}
	
	public void setEnergy(EnergyType energy) {
		this.energy = energy;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	private void setPos(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//overrides
	@Override
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	//tostring, equal, hash
	@Override
	public String toString() {
		return "model: " + model 
				+ ", year produces: " + yearProduced 
				+ ", energy source: " + energy.toString().toLowerCase()
				+ String.format(", position: (%.2f, %.2f))", x, y);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Machine m = (Machine) o;
		
		return this.model.equals(o) && this.yearProduced == m.yearProduced;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, yearProduced);
	}
	
	
	
	
}
