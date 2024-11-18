package lab2.task5;

import java.util.Objects;
import java.util.Vector;

public class TaxMan extends Employee {
	private Vector<Person> taxEvaders;
	
	{
		setJob("Tax man");
	}
	
	public Vector<Person> getTaxEvaders() {
		return taxEvaders;
	}
	
	public void setTaxEvaders(Vector<Person> taxEvaders) {
		this.taxEvaders = taxEvaders;
	}

	public TaxMan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public TaxMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public TaxMan() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Tax Man " + super.toString() + ", confiscated pets from: " + this.taxEvaders;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		TaxMan t = (TaxMan) o;
		return this.taxEvaders.equals(t.taxEvaders);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + Objects.hash(taxEvaders);
	}
	
	

}
