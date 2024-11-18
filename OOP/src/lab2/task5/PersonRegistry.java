package lab2.task5;

import java.util.Vector;

public class PersonRegistry {
	private Vector<Person> v;
	private TaxMan taxman;
	
	public PersonRegistry() {
		this.taxman = new TaxMan();
		v = new Vector<>();
	}
	
	public PersonRegistry(Person p) {
		this.taxman = new TaxMan(p.getName(), p.getAge());
		v = new Vector<>();
	}
	
	public PersonRegistry(Vector <Person> people) {
		this();
		v = people;
	}
	
	public Vector<Person> getRegistry() {
		return v;
	}
	
	public void addPerson(Person p) {
		v.add(p);
	}
	
	public void removePerson(Person p) {
		v.remove(p);
	}
	
	public Vector<Person> havePets() {
		Vector<Person> new_v = new Vector<>();
		for (Person p : v) {
			if (p.hasPet()) {
				new_v.add(p);
			}
		}
		return new_v;
	}
	
	public Vector<Person> dontHavePets() {
		Vector<Person> new_v = new Vector<>();
		for (Person p : v) {
			if (!p.hasPet()) {
				new_v.add(p);
			}
		}
		return new_v;
	}
	
	public void collectTaxes() {
		for (Person p : v) {
			p.payTax(taxman);
		}
	}
	
	public void callEveryontOut() {
		Vector<CanBeCalled> c = new Vector<>();
		c.addAll(Animal.getAllAnimals());
		c.addAll(Person.gettAllPeople());
		for (CanBeCalled callable : c) {
			System.out.println("Hey, " + callable.getName());
		}
	}
	
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return v.toString();
	}
}

