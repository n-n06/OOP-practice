package lab3.task5;

import java.util.Objects;

public class Chocolate implements Comparable<Chocolate> {
	private String name;
	private double weight;
	
	public Chocolate() {
		
	}
	
	public Chocolate(String name) {
		this.name = name;
	}
	
	public Chocolate(String name, double weight) {
		this(name);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (weight < 0) {
			System.err.println("Provide non-negativa=e values for weight");
		}
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return String.format("Chocolate : [name: %s, weight: %.2f]", name, weight);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		
		Chocolate c = (Chocolate) obj;
		return c.name.equals(this.name) && c.weight == this.weight;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public int compareTo(Chocolate o) {
		return Double.compare(this.weight, o.weight);
	}
	
	
	
}
